package com.InventoryManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.InventoryManagement.dto.Items;

import service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	private Items items;
	
	@Autowired
	private ItemsService itemsService;
	
	@GetMapping("/")
	public String index(Model model)
	{
		model.addAttribute("items");
		return "registerview";
		
	}
	
	@PostMapping("/register")
	public String handleLogin(Items items,Model model)
	{
		String msg = itemsService.saveItems(items);

		model.addAttribute("msg", msg);

		return "registerview";
	}
	
	

}
