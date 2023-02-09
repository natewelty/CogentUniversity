package com.cogent.ProductDB.service;

import java.util.List;

import com.cogent.ProductDB.entity.Product;

public interface ProductService {
	Product saveProduct(Product product);
	List<Product> fetchProductList();
	Product updateProduct();
	
}
