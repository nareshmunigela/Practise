package com.ergossoft.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InventoryController {

	@RequestMapping("/inventory")
	public ModelAndView inventory() {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("inventory");
		return mv;
	}
}
