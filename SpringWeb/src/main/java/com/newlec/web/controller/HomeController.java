package com.newlec.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping("/index")
	public String index() {
		return "home.index";
	}
	
	@GetMapping("/help")
	public String help() {
		return "home.help";
	}
	
 }
