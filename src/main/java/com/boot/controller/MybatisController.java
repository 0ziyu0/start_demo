package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.entity.User;
import com.boot.mapper.UserMapper;

@RestController
public class MybatisController {

	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/mapper")
	public User mapper() {
		
		int i = userMapper.insert("李四", 21);
		System.out.println(i);
		
		User user = userMapper.findByName("李四");
		
		return user;
		
	}
	
}
