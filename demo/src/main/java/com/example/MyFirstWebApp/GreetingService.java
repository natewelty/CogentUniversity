package com.example.MyFirstWebApp;

import org.springframework.stereotype.Component;

@Component
public class GreetingService {
	public String sayHello() {
		return "Hello, welcome to the Spring Boot Web Application.";
	
	}
}
