package com.shoekream.www.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.handler.PagingHandler;
import com.shoekream.www.service.productService.ProductService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/product/*")
@Controller
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private ProductService psv;
	
	@GetMapping("/list")
	public void list(Model model, PagingVO pgvo) {
		log.info("지금 보내온 pgvo : {}", pgvo.toString());
		List<Map<String, String>> map = psv.getList(pgvo);
		log.info(map.toString());
		model.addAttribute("map", map);
		model.addAttribute("minPrice", psv.getMinPrice(pgvo));
		model.addAttribute("pgn", new PagingHandler(pgvo, psv.getTotalCount(pgvo)));
	}
	
	@GetMapping("/register")
	public void register(Model model) {
		List<Map<String, String>> brandList= psv.getBrandList();
		List<Map<String, String>> categoryList = psv.getCategoryList();
		model.addAttribute("brandList", brandList);
		model.addAttribute("categoryList", categoryList);
	}
	@GetMapping("/home")
	public void homepage() {
		
	}
	
}

// 예상 url : www.shoekream.com/list?shoe_brand=31,33,41&shoe_size=55,60&pageNo=1&qty=10