package com.ergossoft.inventory.controller;

import java.sql.Timestamp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TaskController {

	@RequestMapping("/newTask")
	public ModelAndView newMaterial(HttpSession httpSession) {
		ModelAndView modelView = new ModelAndView();
 

		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		String TIMESTAMP = timestamp.getTime() + "";

		modelView.addObject("TIMESTAMP", TIMESTAMP);
	 
		modelView.setViewName("task-new");

		return modelView;
	}

	
}
