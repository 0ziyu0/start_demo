package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.service.IUserService;

@RestController
public class JdbcController {

	@Autowired
	private IUserService userService;
	
	@RequestMapping("/add")
	public String add() {
		
		userService.add("张三", 20);
		
		return "success";
	}
	
}
