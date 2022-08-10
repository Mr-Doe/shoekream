package com.shoekream.www.repository.productDAO;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.productVO.ProductVO;

@Repository
public interface ProductDAO {
	
	List<Map<String, String>> selectList(PagingVO pgvo);
	List<Map<String, String>> selectMinPrice(PagingVO pgvo);
	int totalCount(PagingVO pgvo);
	int insert(ProductVO pvo);
	List<Map<String, String>> selectBrandList();	
	List<Map<String, String>> selectCategoryList();
	
}