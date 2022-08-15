package com.shoekream.www.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.handler.PagingHandler;
import com.shoekream.www.service.productService.ProductService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/product/*")
@Controller
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private ProductService psv;
	
	@GetMapping("/listPage")
	public void list(Model model, PagingVO pgvo) {
		
	}
	
	@ResponseBody
	@GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> searchList(Model model, PagingVO pgvo) {
		log.info("기본 pgvo : {}", pgvo);
		List<Map<String, String>> voList = psv.getList(pgvo);
		log.info("voList 확인 : {}", voList);
		PagingHandler pageHandler = new PagingHandler(pgvo, psv.getTotalCount(pgvo));
		log.info("pgHdr 확인 : {} " , pageHandler);
		Map<String, Object> map = new HashMap();
		map.put("pageHandler", pageHandler);
		map.put("voList", voList);
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
	@GetMapping("/originalList")
	public void originalList(Model model, PagingVO pgvo) {
		log.info("기본 pgvo : {}", pgvo);
		List<Map<String, String>> map = psv.getList(pgvo);
		log.info("map 확인 : {}", map);
		PagingHandler pgn = new PagingHandler(pgvo, psv.getTotalCount(pgvo));
		log.info("pgn 확인 : {} " , pgn);
		model.addAttribute("map", map);
		model.addAttribute("pgn", pgn);
	}
}

// 미구현 밑 맵 대신 카테고리와 합쳐지면 vo사용하기
//	@GetMapping("/register")
//	public void register(Model model) {
//		List<Map<String, String>> brandList= psv.getBrandList();
//		List<Map<String, String>> categoryList = psv.getCategoryList();
//		model.addAttribute("brandList", brandList);
//		model.addAttribute("categoryList", categoryList);
//	}
//	
//	@PostMapping("/register")
//	public String register (ProductVO pvo) {
//		log.info("생성된 프로덕트 : {}", pvo);
//		return "redirect:/product/list";
//	}


// 예상 url : www.shoekream.com/list?shoe_brand=31,33,41&shoe_size=55,60&pageNo=1&qty=10