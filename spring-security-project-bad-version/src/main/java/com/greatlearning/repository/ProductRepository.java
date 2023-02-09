package com.greatlearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.greatlearning.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
