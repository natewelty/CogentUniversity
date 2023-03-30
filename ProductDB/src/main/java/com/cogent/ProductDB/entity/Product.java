package com.cogent.ProductDB.entity;



import java.sql.Date;
import java.time.Instant;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
@Builder
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonProperty
	Long productNo;
	@JsonProperty
	String productName;
	@JsonProperty
	int productPrice;
	@JsonProperty
	String expiration;
	
	public Product(String name, int price, String exp) {
		this.productName=name;
		this.productPrice=price;
		this.expiration=exp;
	}
}
