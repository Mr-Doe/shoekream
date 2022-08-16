package com.shoekream.www.service.productService;


import java.util.List;
import java.util.Map;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterCategoryVO;
import com.shoekream.www.domain.productVO.ProductVO;

public interface ProductService {

	List<Map<String, String>> getList(PagingVO pgvo);
	int getTotalCount(PagingVO pgvo);
	int register(ProductVO pvo);
	List<FilterBrandVO> getBrandList();
	List<FilterCategoryVO> getCategoryList();
}
