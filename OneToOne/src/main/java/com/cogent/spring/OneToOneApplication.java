package com.cogent.spring;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.spring.entity.Contact;
import com.cogent.spring.entity.Employee;
import com.cogent.spring.repo.EmployeeRepo;

@SpringBootApplication
public class OneToOneApplication implements CommandLineRunner{
	@Autowired
	EmployeeRepo er;
	public static void main(String[] args) {
		SpringApplication.run(OneToOneApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
		Employee employee = new Employee();
		employee.setName("John");
		employee.setAge(21);
		
		Contact contact1 = new Contact();
		contact1.setAddress("Test1");
		contact1.setEmail("Test1");
		contact1.setPhone(123123);
		
		Contact contact2 = new Contact();
		contact2.setAddress("Test2");
		contact2.setEmail("Test2");
		contact2.setPhone(312321);
		
		Set<Contact> contacts = new HashSet<Contact>();
		contacts.add(contact1);
		contacts.add(contact2);
		employee.setContact(contacts);
		
		
		Employee employee2 = new Employee();
		employee.setName("John");
		employee.setAge(21);
		
		Contact contact21 = new Contact();
		contact1.setAddress("Test1");
		contact1.setEmail("Test1");
		contact1.setPhone(123123);
		
		Contact contact22 = new Contact();
		contact2.setAddress("Test2");
		contact2.setEmail("Test2");
		contact2.setPhone(312321);
		
		Set<Contact> contacts2 = new HashSet<Contact>();
		contacts2.add(contact21);
		contacts2.add(contact22);
		employee2.setContact(contacts2);
		
		
		er.save(employee);
		er.save(employee2);
		System.out.println(er.findAll());
		

	}

}
