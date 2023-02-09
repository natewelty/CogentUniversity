package com.cogent.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.spring.entity.Passport;
import com.cogent.spring.entity.Person;
import com.cogent.spring.repository.PersonRepository;

@SpringBootApplication
public class RelationsBetweenEntitiesApplication  {
//implements CommandLineRunner
	@Autowired
	PersonRepository repository;
	public static void main(String[] args) {
		SpringApplication.run(RelationsBetweenEntitiesApplication.class, args);
	}
//	@Override
//	public void run(String...args) throws Exception{
//		System.out.println("Start");
//		Person person = new Person();
//		person.setName("John");
//		person.setAge(21);
//		
//		Passport passport = new Passport();
//		passport.setExpDate("tomorrow");
//		passport.setAddress("here");
//		
//		person.setPassport(passport);
//		repository.save(person);
//		System.out.println("Success");
//	}

}
