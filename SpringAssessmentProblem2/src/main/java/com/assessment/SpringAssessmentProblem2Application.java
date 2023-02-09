package com.assessment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.assessment.entity.User;
import com.assessment.repository.UserRepository;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SpringAssessmentProblem2Application {
	@Autowired
	UserRepository userRepository;
	@PostConstruct
	public void initUser() {
		User user = new User(1, "admin","admin");
		userRepository.save(user);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringAssessmentProblem2Application.class, args);
	}

}
