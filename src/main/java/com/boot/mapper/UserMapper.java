package com.boot.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.boot.entity.User;

public interface UserMapper {

	@Select("SELECT * FROM boot WHERE name = #{name}")
	User findByName(@Param("name") String name);

	@Insert("INSERT INTO boot(name, age) VALUES(#{name}, #{age})")
	int insert(@Param("name") String name, @Param("age") Integer age);
	
	
}
