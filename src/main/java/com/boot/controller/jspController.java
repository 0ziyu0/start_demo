package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jspController {

	@RequestMapping("jsp")
	public String index() {
		
		return "index";
	}
	
}
