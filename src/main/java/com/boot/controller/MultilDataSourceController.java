package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.test02.service.UserServiceTest02;

@RestController
public class MultilDataSourceController {

	@Autowired
	private UserServiceTest02 userService;
	
	@RequestMapping("/dataSource")
	public Object dateSource(String name, Integer age) {
		
		return userService.insert01And02(name, age);
	}
	
}
