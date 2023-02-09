package com.greatlearning;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.greatlearning.entity.Product;
import com.greatlearning.entity.User;
import com.greatlearning.repository.ProductRepository;
import com.greatlearning.repository.UserRepository;

@SpringBootApplication
public class SpringSecurityProjectApplication implements CommandLineRunner {
	@Autowired
	ProductRepository pr;
	@Autowired
	UserRepository repository;

	@PostConstruct
	public void initUsers() {
		List<User> users = Stream.of(new User(101, "gyanendra", "password", "gsytec@gmail.com"),
				new User(102, "user1", "pwd1", "user1@gmail.com"), new User(103, "user2", "pwd2", "user2@gmail.com"),
				new User(104, "user3", "pwd3", "user3@gmail.com")).collect(Collectors.toList());
		repository.saveAll(users);
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Product product = new Product();
		product.setProductName("Trombone");
		product.setProductPrice(12);

		pr.save(product);
		Product product2 = new Product();
		product2.setProductName("Tuba");
		product2.setProductPrice(19);
		pr.save(product2);
	}

}
