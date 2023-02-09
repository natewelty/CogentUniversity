package com.example.MyFirstWebApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class GreetingController {
	@Autowired
	GreetingService greetingServices;
	
	@RequestMapping("/")
	public String sayHello() {
		return "Hello from Spring Boot";
	}
	
	@RequestMapping("/hello")
	public String home() {
		return greetingServices.sayHello();
	}
}
