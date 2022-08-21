package com.shoekream.www.service.productService;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.domain.productVO.ProductDTO;
import com.shoekream.www.domain.productVO.ProductVO;

public interface ProductService {

	List<ProductVO> getList(PagingVO pgvo);
	List<ProductVO> getAdminList(PagingVO pgvo);
	// List<ProductVO> getImageList(String modelNumber);
	// ProductVO getProductVO(int pno);
	ProductDTO getModifyProductVO(int pno);
	int getTotalCount(PagingVO pgvo);
	int getActiveCount(PagingVO pgvo);
	int getNonActiveCount(PagingVO pgvo);
	int register(ProductVO productVO, MultipartFile[] files) throws Exception;
	int putProduct(ProductVO productVO, MultipartFile[] files) throws Exception;
	List<FilterBrandVO> getBrandList();
	List<FilterCategoryVO> getCategoryList();
	int removeProduct(int pno) throws Exception;
	void toCheckImageFileValidation(MultipartFile[] files) throws Exception;
	void toCheckFileLengthValidation(String value, int maxLength) throws Exception;
}