package com.shoekream.www.service.productService;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import com.shoekream.www.controller.HomeController;
import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.domain.productVO.ProductDTO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.domain.shopVO.ShopVO;
import com.shoekream.www.handler.FTPhandler;
import com.shoekream.www.repository.searchDAO.productDAO.ProductDAO;
import com.shoekream.www.service.filterService.FilterBrandService;
import com.shoekream.www.service.filterService.FilterCategoryService;

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	@Inject
	private ProductDAO productDAO;
	@Inject
	private FilterBrandService brandService;
	@Inject
	private FilterCategoryService categoryService;
	
	@Transactional
	@Override 
	public List<ProductVO> getList(PagingVO pgvo) {
		// min_price제외 productVO list
		List<ProductVO> productVO = productDAO.selectList(pgvo);
		// min_price전용 productVO list
		List<ProductVO> onlyPrice = productDAO.selectMinPrice(pgvo);
		// list 합체
		for (ProductVO prodVO : productVO) {
			for (ProductVO priceVO : onlyPrice) {
				if(prodVO.getPno() == priceVO.getPno()) {
					prodVO.setMinPrice(priceVO.getMinPrice());
				}
			}
		}
		return productVO;
	}
	@Transactional
	@Override
	public ProductDTO getModifyProductVO(int pno) {
		ProductVO productVO = productDAO.selectProductVO(pno);
		List<ProductVO> list= productDAO.selectImageIdAndUrl(productVO.getModel());
		return new ProductDTO(list, productVO);
	}
//	@Override
//	public List<ProductVO> getImageList(String modelNumber) {
//		return productDAO.selectImageIdAndUrl(modelNumber);
//	}
//	@Override
//	public ProductVO getProductVO(int pno) {
//		return productDAO.selectProductVO(pno);
//	}
	@Override
	public List<ProductVO> getAdminList(PagingVO pgvo) {
		return productDAO.selectAdminList(pgvo);
	}
	@Override
	public int getTotalCount(PagingVO pgvo) {
		return productDAO.totalCount(pgvo);
	}
	@Override
	public int getActiveCount(PagingVO pgvo) {
		return productDAO.activeCount(pgvo);
	}
	@Override
	public int getNonActiveCount(PagingVO pgvo) {
		return productDAO.nonActiveCount(pgvo);
	}
	@Transactional
	@Override
	public int register(ProductVO productVO, MultipartFile[] files) throws Exception {
		if(productVO == null) {
            throw new Exception("[ERROR - POST] ProductVO = Null");
        }
		if(productDAO.checkModelDuple(productVO.getModel()) > 0) {
			throw new Exception("[ERROR - POST] 이미 존재하는 모델번호");
		}
		this.toCheckFileLengthValidation(productVO.getModel(), 500);
		this.toCheckImageFileValidation(files);
		FTPhandler ftp = new FTPhandler();
		// FTP 서버에 이미지 업로드 후 리스트에 경로 넣기
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
        // 이미지 업로드 도중 실패했을 경우 앞에서 업로드 된 파일 삭제 로직
        if(ftpUploadFailed == true) {
            ftp.deleteUnfinishedFiles();
            ftp.disconnect();
            return 0;
        }
        ftp.disconnect();
        
        productVO.setPno(productDAO.selectLastPno() + 1);
		productDAO.insert(productVO);
		for (String url : urlList) {
            ProductVO tmp = new ProductVO();
            tmp.setModel(productVO.getModel());
            tmp.setFileName(url);
            productDAO.insertImage(tmp);
        }
        return productVO.getPno();
	}
	@Transactional
	@Override
	public int putProduct(ProductVO productVO, MultipartFile[] files) throws Exception {
		// data validation
        if (productVO == null) {
            throw new Exception("[ERROR - PUT] ProductVO = Null");
        }

        FTPhandler ftp = new FTPhandler();
        ArrayList<String> urlList = new ArrayList<>(); // 새로운 이미지 url
        List<Long> list = new ArrayList<>(); // 삭제될 이미지 ID
        
        if (productVO.getDeleteImagesId() != null) {
            String[] arr = productVO.getDeleteImagesId().split(",");	// 가져온 productVO 안의 deleteImageId
            for (String idx : arr) {
                list.add(Long.parseLong(idx));
            }
        }
        // 수정된 페이지에서 새로 업로드된 이미지 파일 ftp 전송 로직
        if (files != null) {
            this.toCheckImageFileValidation(files);

            boolean ftpUploadFailed = true;
            for (MultipartFile file : files) {
                String fileUrl = ftp.upload(file);
                if (fileUrl != null) {
                    urlList.add(fileUrl);
                    ftpUploadFailed = false;
                } else {
                    ftpUploadFailed = true;
                    break;
                }
            }
            // 이미지 업로드 도중 실패했을 경우 앞에서 업로드 된 파일 삭제 로직
            if (ftpUploadFailed == true) {
                ftp.deleteUnfinishedFiles();
                ftp.disconnect();
                return 0;
            }

            if (productDAO.deleteImageWithImageId(list) > 0) { // 이미지 url 디비 이미지_테이블에서 삭제
                ftp.disconnect();
                for (String url : urlList) {
                    ProductVO tmp = new ProductVO();
                    tmp.setModel(productVO.getModel());
                    tmp.setFileName(url);
                    productDAO.insertImage(tmp);
                }
            }
        }
        productDAO.updateProduct(productVO);
        return productVO.getPno();
	}
	@Transactional
	@Override
	public int removeProduct(int pno) throws Exception {
		
        // data validation
        if(productDAO.selectItemsCount(pno) > 0){
            throw new Exception("거래 내역이 있는 Product");
        }

        // 프로덕트 삭제시 서버에 저장된 이미지 + 디비 url 동시 삭제
        FTPhandler ftp = new FTPhandler();
        String model = productDAO.selectModelNumber(pno);
        if(model != null) {
        	// 먼저 존재하는 image_id 와 image_url을 리스트로 받기
            List<ProductVO> imageList = productDAO.selectImageIdAndUrl(model);
            if(imageList.size() > 0) {
                if(ftp.deleteImageFile(imageList)) {
                    if(productDAO.deleteImageWithModelNumber(imageList) > 0) {
                        return productDAO.deleteProduct(pno);
                    }
                }
            }
        }
        return 0;
    }

	@Override
	public List<FilterBrandVO> getBrandList() {
		return brandService.getBrandList();
	}
	@Override
	public List<FilterCategoryVO> getCategoryList() {
		return categoryService.getCategoryList();
	}
	@Override
	public void toCheckImageFileValidation(MultipartFile[] files) throws Exception {
		for (MultipartFile file : files) {
            if(!file.getContentType().contains("image/")) {
                throw new Exception("[ERROR] 이미지 파일이 아님");
            }
        }
	}
	@Override
	public void toCheckFileLengthValidation(String value, int maxLength) throws Exception {
    	if(value != null && value.length() > maxLength) {
            throw new Exception();
        }
    }
	
}
