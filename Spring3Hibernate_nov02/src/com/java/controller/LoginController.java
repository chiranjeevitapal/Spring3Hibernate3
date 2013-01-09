package com.java.controller;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.java.model.Login;
import com.java.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@Autowired
	private LoginService loginService;

	  @RequestMapping(method = RequestMethod.GET)
	  public ModelAndView getLoginPage(@ModelAttribute("login") Login login,
	      BindingResult result) {
	    return new ModelAndView("login");
	  }
	  
	  @RequestMapping(method = RequestMethod.POST)
	  public String listIDs(@ModelAttribute("login") Login login,
		      BindingResult result, HttpSession session, ModelMap model) {
	    List<Login> checkList = loginService.checkLogin(login);
	    if(checkList.isEmpty()){
	    	session.setAttribute("errorMsg", "some message");
	    	return ("redirect:login.html");
	    }
	    else
	    {
	    	//model.put("details",  checkList);
	    	String username = "";
	    	Iterator<Login> itr = checkList.iterator();
	    	if(itr.hasNext())
	    	{
	    		username = itr.next().getLoginid();
	    	}
	    	session.setAttribute("username", username);
	    	return "home";
	    }
	  }
}
