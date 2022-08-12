package com.shoekream.www.controller;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.shoekream.www.domain.filterVO.FilterSizeVO;
import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.service.itemsService.ItemsService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/items/*")
public class ItemsController {
	@Inject
	private ItemsService itemsService;
	
	@GetMapping("/detail")
	public void detail(@RequestParam("pno") int pno, Model model) {
		int min = 999999999;
		model.addAttribute("pdto", itemsService.selectProduct(pno));
		model.addAttribute("recentAndSellPrice", itemsService.recentandSellPrice(pno, 0));
		List<ItemsDTO> priceList = itemsService.getBuyItemPriceList(pno);
		model.addAttribute("list", priceList);
		for (ItemsDTO p : priceList) {
			if(p.getPrice()!=null) {
				if(p.getPrice()<min) {
					min = p.getPrice();
				}
			}
		}
		model.addAttribute("min", (min==999999999 ? "-&nbsp" : min));
	}

	@GetMapping(value = "/{pno}/{shoeSize}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Map<String, Integer>> recentPrice(@PathVariable("pno") int pno, @PathVariable("shoeSize") int shoeSize) {
		return new ResponseEntity<Map<String, Integer>>(itemsService.recentandSellPrice(pno, shoeSize), HttpStatus.OK);
	}
	
	@GetMapping("/buySelect")
	public void buy(@RequestParam("pno") int pno, Model model) {
		model.addAttribute("pdto", itemsService.selectProduct(pno));
		model.addAttribute("list", itemsService.getBuyItemPriceList(pno));
	}
	
	@GetMapping("/sellSelect")
	public void sell(@RequestParam("pno") int pno, Model model) {
		model.addAttribute("pdto", itemsService.selectProduct(pno));
		model.addAttribute("list", itemsService.getSellItemPriceList(pno));
	}

	@GetMapping("/buyItem")
	public void buyItem(ItemsVO itemsVO, Model model) {
		model.addAttribute("productVO", itemsService.selectProductVO(itemsVO.getPno()));
		model.addAttribute("size", new FilterSizeVO(itemsVO.getShoeSize(), itemsService.selectSize(itemsVO.getShoeSize())));
		model.addAttribute("itemsVO", itemsService.selectbuyItem(itemsVO));
		model.addAttribute("price", itemsService.selectBuySell(itemsVO));
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
