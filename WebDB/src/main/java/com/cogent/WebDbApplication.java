package com.cogent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//@EnableJpaRepositories(com.cogent.DAO)
@SpringBootApplication
public class WebDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebDbApplication.class, args);
	}

}
