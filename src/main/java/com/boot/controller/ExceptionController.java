package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExceptionController {

	@RequestMapping("/exception")
	public String exception() {
		
		try {
			int i = 1/ 0;
		} catch (Exception e) {
			throw new RuntimeException("error...");
		}
		
		
		return "this is excrption";
	}
	
}
