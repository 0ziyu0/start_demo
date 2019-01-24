package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.boot.config.DBConfig1;
import com.boot.config.DBConfig2;

@EnableConfigurationProperties(value = { DBConfig1.class, DBConfig2.class })
@SpringBootApplication
public class MyApp {

	public static void main(String[] args) {
		SpringApplication.run(MyApp.class, args);
	}
	
}
