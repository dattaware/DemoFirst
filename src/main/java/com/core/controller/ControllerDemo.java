package com.core.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.InternalResourceViewResolver ;

@Controller
public class ControllerDemo {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homePage() {
		
		return "home";
	}

}