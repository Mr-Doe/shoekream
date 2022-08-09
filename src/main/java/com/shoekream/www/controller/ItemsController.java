package com.shoekream.www.controller;

import javax.inject.Inject;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.service.itemsService.ItemsService;

@Controller
@RequestMapping("/items/*")
public class ItemsController {
	@Inject
	private ItemsService itemsService;
	
//	@Inject
//	private ProductService productService;
	
	@GetMapping("/detail")
	public void detail(@RequestParam("pno") int pno, Model model) {
//		model.addAttribute("productDTO", productService.selectProduct(pno));
		model.addAttribute("recentPrice", itemsService.recentDealPrice(pno, 0));
		model.addAttribute("list", itemsService.getBuyItemPriceList(pno));
	}
	
	@GetMapping(value = "/{pno}/{shoeSize}", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<Integer> recentPrice(@PathVariable("pno") int pno, @PathVariable("shoeSize") int shoeSize) {
		return new ResponseEntity<Integer>(itemsService.recentDealPrice(pno, shoeSize), HttpStatus.OK);
	}
	
	@GetMapping("/buy")
	public void buy(@RequestParam("pno") int pno, Model model) {
//		model.addAttribute("productDTO", productService.selectProduct(pno));
		model.addAttribute("list", itemsService.getBuyItemPriceList(pno));
	}
	
	@GetMapping("/sell")
	public void sell(@RequestParam("pno") int pno, Model model) {
//		model.addAttribute("productDTO", productSercvice.selectProduct(pno));
		model.addAttribute("list", itemsService.getSellItemPriceList(pno));
	}

	@GetMapping("/buyItem")
	public void buyItem(ItemsVO itemsVO, Model model) {
		model.addAttribute("itemsVO", itemsVO);
	}
	
	@GetMapping("/sellItem")
	public void sellItem(ItemsVO itemsVO, Model model) {
		model.addAttribute("itemsVO", itemsVO);
	}

	@PostMapping("/buyBid")
	public String buyBid(ItemsVO itemsVO, RedirectAttributes rttr) {
		itemsService.registerBuyItem(itemsVO);
		return "/member/mypage";
	}
	
	@PostMapping("/sellBid")
	public String sellBid(ItemsVO itemsVO, RedirectAttributes rttr) {
		itemsService.registerSellItem(itemsVO);
		return "/member/mypage";
	}
	
	@PostMapping("/buyItem")
	public String buyItem(ItemsVO itemsVO, RedirectAttributes rttr) {
		itemsService.buyEnd(itemsVO);
		return "/member/mypage";
	}
	
	@PostMapping("/sellItem")
	public String sellItem(ItemsVO itemsVO, RedirectAttributes rttr) {
		itemsService.buyEnd(itemsVO);
		return "/member/mypage";
	}
}
