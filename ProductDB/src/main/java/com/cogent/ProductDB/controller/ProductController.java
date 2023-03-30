package com.cogent.ProductDB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cogent.ProductDB.entity.Product;
import com.cogent.ProductDB.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@GetMapping("/products")
	public List<Product> fetchProductList(){
		
		return productService.fetchProductList();
	}
	@PostMapping("/products")
	public Product saveProduct(@RequestBody Product product) {
		return productService.saveProduct(product);
	}
	
}
