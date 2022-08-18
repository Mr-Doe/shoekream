package com.shoekream.www.service.productService;


import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.domain.productVO.ProductVO;

public interface ProductService {

	List<ProductVO> getList(PagingVO pgvo);
	int getTotalCount(PagingVO pgvo);
	int register(ProductVO productVO, MultipartFile[] files) throws Exception;
	List<FilterBrandVO> getBrandList();
	List<FilterCategoryVO> getCategoryList();
	int removeProduct(int pno) throws Exception;
	void toCheckImageFileValidation(MultipartFile[] files) throws Exception;
	void toCheckFileLengthValidation(String value, int maxLength) throws Exception;
}