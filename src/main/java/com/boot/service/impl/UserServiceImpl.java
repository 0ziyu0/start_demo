package com.boot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.boot.entity.User;
import com.boot.mapper.UserMapper;
import com.boot.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(String name, Integer age) {
		
		jdbcTemplate.update("insert into boot values(null,?,?)", name, age);

	}

	/*@Override
	public void insertMapper(String name, Integer age) {
		
		int i = userMapper.insert(name, age);
		System.out.println(i);
	}

	@Override
	public User findByName(String name) {
		
		return userMapper.findByName(name);
	}*/

}
