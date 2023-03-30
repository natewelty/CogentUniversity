package com.cogent.ProductDB;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cogent.ProductDB.entity.Product;
import com.cogent.ProductDB.repository.ProductRepository;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class ProductDbApplication {
	@Autowired
	ProductRepository productRepository;
	
	@PostConstruct
	public void initDb(){
		productRepository.save(new Product("Shirt",12,"12-12-2024"));
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(ProductDbApplication.class, args);
	}

}
