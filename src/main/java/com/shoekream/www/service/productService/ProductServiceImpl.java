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
import com.shoekream.www.domain.productVO.ProductVO;
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

	public int getTotalCount(PagingVO pgvo) {
		return productDAO.totalCount(pgvo);
	}

	@Transactional
	@Override
	public int register(ProductVO productVO, MultipartFile[] files) throws Exception {
		if(productDAO.checkModelDuple(productVO.getModel()) > 0) {
			throw new Exception("[ERROR - POST] 이미 존재하는 모델번호");
		}
		
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

	@Override
	public List<FilterBrandVO> getBrandList() {
		return brandService.getBrandList();
	}

	@Override
	public List<FilterCategoryVO> getCategoryList() {
		return categoryService.getCategoryList();
	
	}
}
