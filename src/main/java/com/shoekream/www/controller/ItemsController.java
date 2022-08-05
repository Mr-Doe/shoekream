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
	private ItemsService isv;
	
//	@Inject
//	private ProductService psv;
	
	@GetMapping("/detail")
	public void detail(@RequestParam("pno") int pno, Model model) {
//		model.addAttribute("pdto", psv.selectProduct(pno));
		model.addAttribute("recentPrice", isv.recentDealPrice(pno, 0));
		model.addAttribute("list", isv.getBuyItemPriceList(pno));
	}
	
	@GetMapping(value = "/{pno}/{shoeSize}", produces= {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<Integer> recentPrice(@PathVariable("pno") int pno, @PathVariable("shoeSize") int shoeSize) {
		return new ResponseEntity<Integer>(isv.recentDealPrice(pno, shoeSize), HttpStatus.OK);
	}
	
	@GetMapping("/buy")
	public void buy(@RequestParam("pno") int pno, Model model) {
//		model.addAttribute("pdto", psv.selectProduct(pno));
		model.addAttribute("list", isv.getBuyItemPriceList(pno));
	}

	@GetMapping("/buyItem")
	public void buyItem(ItemsVO itemsVO, Model model) {
		model.addAttribute("itemsVO", itemsVO);
	}

	@PostMapping("/buyBid")
	public String buyBid(ItemsVO itemsVO, RedirectAttributes rttr) {
		isv.registerBuyItem(itemsVO);
		return "redirect:/";
	}
	
	@PostMapping("/buyItem")
	public String buyItem(ItemsVO itemsVO, RedirectAttributes rttr) {
		isv.buyEnd(itemsVO);
		return "redirect:/";
	}
}
