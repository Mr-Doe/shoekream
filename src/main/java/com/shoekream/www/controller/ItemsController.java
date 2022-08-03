package com.shoekream.www.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shoekream.www.service.itemsService.ItemsService;

@Controller
@RequestMapping("/items/*")
public class ItemsController {
	@Inject
	private ItemsService isv;
}
