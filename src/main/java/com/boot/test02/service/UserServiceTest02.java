package com.boot.test02.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.test.mapper.UserMapperTest01;
import com.boot.test02.mapper.UserMapperTest02;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceTest02 {

	@Autowired
	private UserMapperTest01 userMapper01;
	
	@Autowired
	private UserMapperTest02 userMapper02;
	
	@Transactional()
	public int insert01And02(String name, Integer age) {
		
		int i = userMapper01.inser(name, age);
		System.out.println("########: " + i);
		
		int j = userMapper02.inser(name, age);
		System.out.println("########: " + j);
		
		return i + j;
	}
	
}
