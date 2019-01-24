package com.boot.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.boot.test.mapper.UserMapperTest01;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserServiceTest01 {

	@Autowired
	private UserMapperTest01 userMapper;
	
	@Transactional()
	public int insert(String name, Integer age) {
		
		int i = userMapper.inser(name, age);
		System.out.println("########: " + i);
		
		return i;
	}
	
}
