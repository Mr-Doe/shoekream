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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.shoekream.www.domain.itemsDomain.ItemsDTO;
import com.shoekream.www.domain.itemsDomain.ItemsVO;
import com.shoekream.www.service.itemsService.ItemsService;

@Controller
@RequestMapping("/items/*")
public class ItemsController {
	@Inject
	private ItemsService itemsService;
	
	@GetMapping("/detail")
	public void detail(@RequestParam("pno") int pno, Model model) {
		model.addAttribute("idto", itemsService.selectPdto(pno));
	}
	
	@GetMapping(value = "/{pno}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<ItemsDTO>> buyPrice(@PathVariable("pno") int pno) {
		return new ResponseEntity<List<ItemsDTO>>(itemsService.getBuyItemPriceList(pno, null), HttpStatus.OK);
	}

	@GetMapping(value = "/{pno}/{shoeSize}", produces= {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Map<String, Integer>> recentPrice(@PathVariable("pno") int pno, @PathVariable("shoeSize") int shoeSize) {
		return new ResponseEntity<Map<String, Integer>>(itemsService.recentandSellPrice(pno, shoeSize), HttpStatus.OK);
	}
	
	@GetMapping("/buySelect")
	public void buy(@RequestParam("pno") int pno, Model model, @RequestParam("email") String email) {
		model.addAttribute("idto", itemsService.selectProduct(pno));
		model.addAttribute("list", itemsService.getBuyItemPriceList(pno, email));
	}
	
	@GetMapping("/sellSelect")
	public void sell(@RequestParam("pno") int pno, Model model, @RequestParam("email") String email) {
		model.addAttribute("idto", itemsService.selectProduct(pno));
		model.addAttribute("list", itemsService.getSellItemPriceList(pno, email));
	}

	@GetMapping("/buyItem")
	public void buyItem(ItemsVO itemsVO, Model model, @RequestParam("email") String email) {
		model.addAttribute("idto", itemsService.selectBuyIdto(itemsVO, email));
	}
	
	@GetMapping("/sellItem")
	public void sellItem(ItemsVO itemsVO, Model model, @RequestParam("email") String email) {
		model.addAttribute("idto", itemsService.selectSellIdto(itemsVO, email));
	}

	@PostMapping("/buyBid")
	public String buyBid(ItemsVO itemsVO) {
		itemsService.registerBuyItem(itemsVO);
		return "redirect:/member/mypage?email="+itemsVO.getBuyerEmail();
	}
	
	@PostMapping("/sellBid")
	public String sellBid(ItemsVO itemsVO) {
		itemsService.registerSellItem(itemsVO);
		return "redirect:/member/mypage?email="+itemsVO.getSellerEmail();
	}
	
	@PostMapping("/buyItem")
	public String buyItem(ItemsVO itemsVO) {
		itemsService.buyEnd(itemsVO);
		return "redirect:/member/mypage?email="+itemsVO.getBuyerEmail();
	}
	
	@PostMapping("/sellItem")
	public String sellItem(ItemsVO itemsVO) {
		itemsService.sellEnd(itemsVO);
		return "redirect:/member/mypage?email="+itemsVO.getSellerEmail();
	}
	
	@PostMapping("removeItem")
	public String deleteItem(@RequestParam("itemNo") int itemNo, @RequestParam("email") String email) {
		itemsService.removeItem(itemNo);
		return "redirect:/member/mypage?email="+email;
	}
}
