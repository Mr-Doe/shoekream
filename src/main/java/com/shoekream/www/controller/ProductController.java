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
import com.shoekream.www.domain.filterVO.FilterBrandVO;
import com.shoekream.www.domain.filterVO.FilterDTO;
import com.shoekream.www.domain.productVO.ProductVO;
import com.shoekream.www.domain.shopVO.ShopVO;
import com.shoekream.www.handler.PagingHandler;
import com.shoekream.www.service.filterService.FilterBrandService;
import com.shoekream.www.service.filterService.FilterCategoryService;
import com.shoekream.www.service.productService.ProductService;
import com.shoekream.www.service.shopService.ShopService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/product/*")
@Controller
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private ProductService psv;
	@Inject
	private FilterCategoryService fcService;
	
	@Inject
	private FilterBrandService fbService;
	
	@GetMapping("/listPage")
	public void list(Model model, PagingVO pgvo) {
		
	}

	@ResponseBody
	@GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Map<String, Object>> searchList(Model model, PagingVO pgvo) {
		Map<String, Object> map = new HashMap();
		map.put("pageHandler", new PagingHandler(pgvo, psv.getTotalCount(pgvo)));
		map.put("voList", psv.getList(pgvo));
		return new ResponseEntity<Map<String, Object>>(map, HttpStatus.OK);
	}
	@GetMapping("/originalList")
	public void originalList(Model model, PagingVO pgvo) {
		List<Map<String, String>> map = psv.getList(pgvo);
		PagingHandler pgn = new PagingHandler(pgvo, psv.getTotalCount(pgvo));
		model.addAttribute("map", map);
		model.addAttribute("pgn", pgn);
	}
	@GetMapping("/register")
	public void registerPage(Model model) {
		FilterDTO filterDTO = new FilterDTO();
		filterDTO.setObjectList1(fbService.getBrandList());
        filterDTO.setObjectList2(fcService.getCategoryList());
		model.addAttribute("FilterDTO", filterDTO);
	}
	
//	@PostMapping("/register")
//	public void register(ProductVO pvo, @RequestParam(name = "fileAttached") MultipartFile[] files) {
//		try {
//            return String.valueOf(psv.register(pvo, files)); // retrun = INSERT한 쿼리 ID
//        }catch (Exception e) {
//            System.err.println(e.getMessage());
//            return "0";
//        }
//   }
}
