package com.greatlearning.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.greatlearning.entity.Product;
import com.greatlearning.repository.ProductRepository;

@RestController
@RequestMapping("/api")
public class WelcomeController {
	@Autowired
	ProductRepository pr;
//	@GetMapping("/")
//	public String welcome() {
//		return "Welcome to Cogent Infotech";
//	}
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return pr.save(product);
	}
	@GetMapping("/products")
	public List<Product> fetchProductList(){
		return pr.findAll();
	}
	@PutMapping("/products")
	public Product edit(@RequestBody Product product) {
		return pr.save(product);
	}
	@DeleteMapping("/products")
	public String delete(@RequestParam(value = "id") Integer id) {
		Optional<Product> i = pr.findById(id);
		pr.delete(i.get());
		return "Book id " +id + " deleted successfully";
	}
	@GetMapping("/products/{id}")
	public Product get(@PathVariable("id") Integer id) {
		Optional<Product> i = pr.findById(id);
		return i.get();
	}

}
