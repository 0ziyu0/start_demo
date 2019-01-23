package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.boot.controller")
//@EnableAutoConfiguration
@MapperScan({"com.boot.mapper"})
public class App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	
}
