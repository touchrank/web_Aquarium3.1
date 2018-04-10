package com.TsugaruInfo.controller;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

	@RequestMapping(value = "/top", method = RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("top");
		
		return mv;
	}
}