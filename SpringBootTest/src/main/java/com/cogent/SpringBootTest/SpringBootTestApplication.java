package com.cogent.SpringBootTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cogent.SpringBootTest.HelloService;

@SpringBootApplication
public class SpringBootTestApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootTestApplication.class, args);
		HelloService hello = context.getBean("helloService",HelloService.class);
		String msg = hello.sayHello("William");
		System.out.println(msg);
		
	}

}
