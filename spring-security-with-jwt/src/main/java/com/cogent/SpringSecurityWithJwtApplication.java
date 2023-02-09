package com.cogent;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jakarta.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.entity.User;
import com.cogent.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityWithJwtApplication {
	@Autowired
	UserRepository repository;

	@PostConstruct
	public void initUsers() {
		Stream.of(new User(101, "gyanendra", "password", "gsytec@gmail.com"),
				new User(102, "user1", "pwd1", "user1@gmail.com"), new User(103, "user2", "pwd2", "user2@gmail.com"),
				new User(104, "user3", "pwd3", "user3@gmail.com")).forEach(u->repository.saveAll(u));;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithJwtApplication.class, args);
	}

}
