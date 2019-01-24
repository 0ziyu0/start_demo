package com.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dao.IUserDao;

@RestController
public class JpaController {

	@Autowired
	private IUserDao userDao;
	
	@RequestMapping("/jpa")
	public Object jpa() {
		
		return userDao.findById(1L);
		
	}
	
}
