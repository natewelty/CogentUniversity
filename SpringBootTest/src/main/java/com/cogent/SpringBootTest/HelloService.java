package com.cogent.SpringBootTest;

import org.springframework.stereotype.Component;

@Component
public class HelloService {	
	public String sayHello(String name) {
		return "Hello, " + name + ", welcome to the Spring Boot Application.";
	}
}
