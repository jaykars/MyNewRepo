package com.csi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")

public class ApplicationController {

	@RequestMapping(value="/saywelcome",method = RequestMethod.GET)
	public String SayWelcome(ModelMap modelmap) {

		modelmap.addAttribute("message", "welcome to pune");
		return "welcome";
}
	

	@RequestMapping(value="/saybi",method = RequestMethod.GET)
	public String Sayby(ModelMap modelmap) {

		modelmap.addAttribute("message", "Byy to pune");
		return "welcome";
}

	@RequestMapping(value="/sayhi",method = RequestMethod.GET)
	public String Sayhi(ModelMap modelmap) {

		modelmap.addAttribute("message", "Hii to pune");
		return "welcome";
}
}
