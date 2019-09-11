package com.ergossoft.serviceorder.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ergossoft.serviceorder.model.Users;
import com.ergossoft.serviceorder.repository.UserRepository;

@Controller
public class LoginController {
	
	@Autowired
	UserRepository userRepo;
	@Autowired
	SendEmail mailservice;

	@RequestMapping("ergossoft/login")
	public String login() {

			return   "redirect:/sitesList";
	}
	
	
	@RequestMapping("/logout")
	public String logout() {
		 
		return "index";
	}
	
	@RequestMapping("/signup")
	public String signup() {
		 
		return "signup";
	}
	
	@RequestMapping("/signupAction")
	public ModelAndView signupUser(Users user) {
		 
	 List<Users> use=userRepo.findUserExist(user.getEmail());
	 ModelAndView view=new ModelAndView();
	 if(use.size()==0) {
		 user.setCreatedDate(LocalDateTime.now());
			user.setStatus(true);
			 Users user1=userRepo.save(user);
			 String msg="Dear "+user.getFirstName()+""+user.getLastName()+"<br/>";
			 String msg1="Please complete your signup process by clicking the below link:<br/><br/><br/>";
			 String msg2="Thank You,<br/> Ergos Software Team";
			 mailservice.sendEmail(user.getEmail(), "Thanks For Register", msg+msg1+msg2);
			 
			  
			 view.addObject("msg", "Thank you. Your submission has been received.\r\n" + 
			 		"Please check your email and verify your email address to be approved in to the ERGOS Enterprise Service Software for the Field Service Industry.");
			 view.setViewName("index");
	 }else {
		 
		 view.addObject("msg", "EMAIL ALREADY EXISTS");
		 view.setViewName("signup");
	 }
		
		return view;
	}
	
	
	
	
	@RequestMapping("/loginAction")
	public String loginAct() {
		 
		return "index";
	}
	
}
