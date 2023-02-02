package org.cogent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationBeans {
	
	
	@Bean(name = "product")
	public Product getPerson() {
		Product product=new Product();
		product.setProductID(1001);
		product.setProductName("Tasty Wheat");
		product.setProductPrice(12);
		return product;
	}
}
