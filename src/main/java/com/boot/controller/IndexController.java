package com.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class IndexController {

	@RequestMapping("/index")
	public String index() {
		
		return "hello world...这是测试";
	}
	
	/*public static void main(String[] args) throws Exception {
		SpringApplication.run(IndexController.class, args);
	}*/

	
}
