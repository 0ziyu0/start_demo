package com.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.boot.config.DBConfig1;
import com.boot.config.DBConfig2;

@SpringBootApplication
//@ComponentScan("com.boot.controller")
//@EnableAutoConfiguration
@MapperScan({"com.boot.mapper"})
@EnableConfigurationProperties(value = {DBConfig1.class, DBConfig2.class})
public class App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	
}
