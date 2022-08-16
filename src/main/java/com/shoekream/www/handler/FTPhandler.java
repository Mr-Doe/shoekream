package com.shoekream.www.handler;

import com.shoekream.www.domain.shopVO.ShopVO;
import com.shoekream.www.repository.shopDAO.ShopDAO;
import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPReply;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class FTPhandler {
    private final FTPClient ftpClient;

//    private String ip = "192.168.35.20";
    private String ip = "mrdoe.ddns.net";
    private int port = 2121;
    private String id = "shoekream";
    private String pw = "shoekream_p@ss";

    private List<String> ftpFileList = new ArrayList<>();

    public FTPhandler() {
        this.ftpClient = new FTPClient();
        this.connect("/shoekream_img");
    }

    // FTP 연결 및 설정
    public void connect(String dir){
        boolean result = false;
        try {
            ftpClient.connect(ip, port);			//FTP 연결
            ftpClient.setControlEncoding("UTF-8");	//FTP 인코딩 설정
            int reply = ftpClient.getReplyCode();	//응답코드 받기

            System.err.println("접속 : " + (ftpClient.isConnected() ? "FTP 접속 성공" : "FTP 접속 실패"));

            if( FTPReply.isPositiveCompletion(reply)    // 서버 접속 검증
                    && ftpClient.login(id, pw)) {       // 로그인 검증
                ftpClient.setSoTimeout(1000 * 10);		//Timeout 설정
                ftpClient.login(id, pw);				//FTP 로그인
                ftpClient.setFileType(FTP.BINARY_FILE_TYPE);	//파일타입설정
                ftpClient.enterLocalPassiveMode();			//Active 모드 설정
                result = ftpClient.changeWorkingDirectory(dir);	//저장파일경로

                if(result == false){	// result = False 는 저장파일경로가 존재하지 않음
                    ftpClient.makeDirectory(dir);	//저장파일경로 생성
                    ftpClient.changeWorkingDirectory(dir);
                }
            }
        }catch (Exception e) {
            System.err.println("FTP 접속 실패");
            System.err.println(e.getMessage());
        }
    }

    // FTP 연결해제
    public void disconnect() throws Exception {
        if(ftpClient.isConnected()){
            ftpClient.disconnect();
        }
    }


    /**
     * 이미지 업로드
     * @param file
     * @return 업로드 성공시 이미지 URL / 실패시 null
     */
    public String upload(MultipartFile file) throws Exception{
        UUID uuid = UUID.randomUUID();
        String fileName = uuid + ".png";
        InputStream inputStream = file.getInputStream();
        if(this.storeFTP(fileName, inputStream)) {
            inputStream.close();
            ftpFileList.add("/shoekream_img/" + fileName);
            return "http://mrdoe.ddns.net:62121/shoekream_img/" + fileName;
        };
        return null;
    }

    /**
     * FTP 파일 업로드
     * @param saveFileNm
     * @param inputStream
     * @return
     */
    public boolean storeFTP(String saveFileNm, InputStream inputStream) throws Exception {
        return ftpClient.storeFile(saveFileNm, inputStream);

    }

    /**
     * FTP 파일 업로드 실패시 삭제 메소드
     * @throws Exception
     */
    public void deleteUnfinishedFiles() throws Exception {
        for (String filePath: ftpFileList) {
            ftpClient.deleteFile(filePath);
        }
    }

    public boolean deleteImageFiles(List<ShopVO> list) throws Exception {
        boolean result = false;
        if(list.size() > 0) {
            for (ShopVO idx : list) {
                String url = idx.getImageUrl();
                if(url.contains("https://")) {
                    result = true;
                } else if(url.contains("http://")) {
                    String ftpFilePath = url.replace("http://mrdoe.ddns.net:62121", "");
                    result = ftpClient.deleteFile(ftpFilePath);
                } else {
                    return false;
                }
            }
        }
        return result;
    }
}
