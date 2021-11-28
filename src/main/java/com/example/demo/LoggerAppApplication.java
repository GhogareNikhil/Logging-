package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.UserService;

@SpringBootApplication
public class LoggerAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(LoggerAppApplication.class, args);
	UserService userService=  context.getBean(UserService.class);
	userService.saveUser();
	}

}
