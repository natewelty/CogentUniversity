package org.cogent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	@Bean
	public Country country() {
		return new Country(101, "USA");
	}
	
	@Bean
	public Person person() {
		return new Person(1001, "Gyanendra", 32);
	}
}
