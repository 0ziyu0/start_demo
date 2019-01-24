package com.boot.test.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.boot.entity.UserTest;

public interface UserMapperTest01 {

	@Select("select * from user where name = #{name}")
	UserTest findByName(@Param("name") String name);
	
	@Insert("insert into user(name, age) values(#{name}, #{age})")
	int inser(@Param("name") String name, @Param("age") Integer age);
	
}
