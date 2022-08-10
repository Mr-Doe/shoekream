package com.shoekream.www.service.productService;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.repository.productDAO.ProductDAO;

@Service
public class ProductServiceImpl implements ProductService {

	@Inject
	private ProductDAO pdao;
	
	// 트랜잭션화 하기 (두개의 리스트를 for문 돌려서 같은 pno이면 배열안의 map에 k : v 추가하기)
	@Override
	public List<Map<String, String>> getList(PagingVO pgvo) {
		return pdao.selectList(pgvo);
	}

	@Override
	public List<Map<String, String>> getMinPrice(PagingVO pgvo) {
		return pdao.selectMinPrice(pgvo);
	}
	
	public int getTotalCount(PagingVO pgvo) {
		return pdao.totalCount(pgvo);
	}

	@Override
	public int register(ProductVO pvo) {
		return pdao.insert(pvo);
	}

	@Override
	public List<Map<String, String>> getBrandList() {
		
		return pdao.selectBrandList();
	}

	@Override
	public List<Map<String, String>> getCategoryList() {
		
		return pdao.selectCategoryList();
	}
}