package com.shoekream.www.controller;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoekream.www.domain.PagingVO.PagingVO;
import com.shoekream.www.domain.filterVO.FilterDTO;
import com.shoekream.www.domain.productVO.ProductDTO;
import com.shoekream.www.domain.productVO.ProductVO;

import com.shoekream.www.handler.PagingHandler;
import com.shoekream.www.service.filterService.FilterBrandService;
import com.shoekream.www.service.filterService.FilterCategoryService;
import com.shoekream.www.service.productService.ProductService;



import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@RequestMapping("/product/*")
@Controller
public class ProductController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);
	
	@Inject
	private ProductService productService;
	@Inject
	private FilterCategoryService categoryService;
	@Inject
	private FilterBrandService brandService;
	
	@GetMapping("/listPage")
	public void list(Model model, PagingVO pgvo) {
		
	}
	
	@ResponseBody
	@GetMapping(value = "list", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductDTO> searchList(Model model, PagingVO pgvo) {
		ProductDTO productDTO = new ProductDTO(new PagingHandler(pgvo, productService.getActiveCount(pgvo), 5), productService.getList(pgvo));
		return new ResponseEntity<ProductDTO>(productDTO, HttpStatus.OK);
	}
	
	@GetMapping("/adminList")
	public void getAdminList(Model model, PagingVO pgvo) {
		ProductDTO productDTO = new ProductDTO(new PagingHandler(productService.getTotalCount(pgvo), pgvo, 10), 
												new PagingHandler(pgvo, productService.getActiveCount(pgvo), 10), 
												new PagingHandler(productService.getNonActiveCount(pgvo), 10, pgvo), 
												productService.getAdminList(pgvo));
		model.addAttribute("productDTO", productDTO);
	}
	
	@GetMapping("/register")
	public void registerPage(Model model) {
		FilterDTO filterDTO = new FilterDTO();
		filterDTO.setObjectList1(brandService.getBrandList());
        filterDTO.setObjectList2(categoryService.getCategoryList());
		model.addAttribute("FilterDTO", filterDTO);
	}
	
	@PostMapping("/register")
	public String register(ProductVO productVO, @RequestParam(name = "fileAttached") MultipartFile[] files) {
		try {
			return "redirect:/items/detail?pno="+productService.register(productVO, files);
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return "redirect:/product/adminList";
		}
	}
	
	@GetMapping("/modify")
	public void modify(@RequestParam("pno")int pno, Model model) {
		FilterDTO filterDTO = new FilterDTO();
		filterDTO.setObjectList1(brandService.getBrandList());
        filterDTO.setObjectList2(categoryService.getCategoryList());
		model.addAttribute("FilterDTO", filterDTO);
		ProductDTO productDTO = productService.getModifyProductVO(pno);
		model.addAttribute("productDTO", productDTO);
	}
	
	@PostMapping("/modify")
	public String put(ProductVO productVO, @RequestParam(name="fileAttached", required = false) MultipartFile[] files) {
		log.info(">>> modify POST > productVO : {}", productVO);
		log.info(">>> modify POST > fileVO : {}", files.toString());
		try {
			int isUp = productService.putProduct(productVO, files);
			if(isUp > 0) {
				return "redirect:/product/adminList";				
			}
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return "redirect:/product/adminList";
		}
		return "redirect:/product/adminList";
	}
	
	@DeleteMapping(value = "/{pno}", produces = {MediaType.TEXT_PLAIN_VALUE})
    public ResponseEntity<String> erase(@PathVariable("pno") int pno){
            try {
				return productService.removeProduct(pno) > 0 ?
						new ResponseEntity<String>("1", HttpStatus.OK)
						: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
			} catch (Exception e) {
				return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
			}
    }
    
}