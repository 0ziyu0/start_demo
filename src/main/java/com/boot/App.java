package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@ComponentScan("com.boot.controller")
//@EnableAutoConfiguration
public class App {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}

	
}
