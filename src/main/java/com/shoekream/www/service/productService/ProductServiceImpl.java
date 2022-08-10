package com.shoekream.www.service.productService;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.shoekream.www.controller.HomeController;
import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.repository.searchDAO.productDAO.ProductDAO;

import lombok.extern.slf4j.Slf4j;

@Service
public class ProductServiceImpl implements ProductService {
	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private ProductDAO pdao;
	
	@Transactional
	@Override
	public List<Map<String, String>> getList(PagingVO pgvo) {
		List<Map<String, String>> withoutPrice = pdao.selectList(pgvo);
		List<Map<String, String>> onlyPrice = pdao.selectMinPrice(pgvo);
		
		for (Map<String, String> pricelessMap : withoutPrice) {
			for (Map<String, String> priceMap: onlyPrice) {
				if(priceMap.get("pno") == pricelessMap.get("pno")) {
					pricelessMap.put("min_price", String.valueOf(priceMap.get("min_price")));
				}
			}
		}
		
		log.info("보낼 리스트 맵! : "+withoutPrice.toString());
		
		return withoutPrice;
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