package com.shoekream.www.service.blogService;

import com.shoekream.www.domain.blogVO.BlogVO;
import com.shoekream.www.domain.blogVO.ImageVO;
import com.shoekream.www.handler.FTPhandler;
import com.shoekream.www.repository.blogDAO.ImageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired private ImageDAO imageDAO;

    @Override
    public List<ImageVO> getImageeList(String imageId) {
        return null;
    }

    @Override
    public List<ImageVO> postImages(MultipartFile[] files) throws Exception {
        FTPhandler ftp = new FTPhandler();

        ArrayList<String> urlList = new ArrayList<>();
        boolean ftpUploadFailed = true;
        for (MultipartFile file : files) {
            String fileUrl = ftp.upload(file);
            if(fileUrl != null) {
                urlList.add(fileUrl);
                ftpUploadFailed = false;
            }else {
                ftpUploadFailed = true;
                break;
            }
        }

        if(ftpUploadFailed == true) {
            ftp.deleteUnfinishedFiles();
            ftp.disconnect();
            throw new Exception("FTP 파일 업로드 실패");
        }

        ftp.disconnect();
        List<String> PKlist = new ArrayList<>();
        for (String url : urlList) {
            ImageVO VO = new ImageVO();
            VO.setImageUrl(url);
            imageDAO.insertBlogImage(VO);
            if(PKlist.size() == 0) {
                PKlist.add(String.valueOf(VO.getImageId()));
            } else {
                PKlist.add("," + String.valueOf(VO.getImageId()));
            }
        }
        return imageDAO.getImagesListWithIDsList(PKlist);
    }

    @Override
    public boolean putImages(BlogVO blogVO, MultipartFile[] files) {
        return false;
    }

    @Override
    public boolean delImages(BlogVO blogVO) {
        return false;
    }
}
