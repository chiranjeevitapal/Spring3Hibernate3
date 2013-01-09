package com.java.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.mail.SendMailTLS;
import com.java.model.Login;
import com.java.service.RegisterService;

@Controller
@RequestMapping("/register")
public class RegisterController {
	@Autowired
	RegisterService registerService;
	
	SendMailTLS mail = new SendMailTLS();
	
	@RequestMapping(value="/signup", method = RequestMethod.POST)
	public ModelAndView registerUser(@ModelAttribute("register")Login login, BindingResult result, HttpSession session, ModelMap model){
		registerService.register(login);
		model.addAttribute("registered", "registered");
		mail.sendMail(login.getEmail());
	    return new ModelAndView("registerSuccess", model);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registerForm(@ModelAttribute("register")Login login, BindingResult result){
		//registerService.register(login);
	    return new ModelAndView("register");
	}
}
