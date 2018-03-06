package com.naveenl.atmlist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String viewHome() {
		return "index";
	}
	
	@RequestMapping("/list")
	public String listATM() {
		return "list";
	}
}
