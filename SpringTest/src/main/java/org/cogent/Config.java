package org.cogent;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class Config {
	@Bean
	public Country country() {
		return new Country(101, "USA");
	}
	
	@Bean
	@Qualifier("Gyanendra")
	public Person person() {
		return new Person(1001, "Gyanendra", 32);
	}
	
	@Bean
	@Qualifier("Nate")
	public Person person2() {
		return new Person(1002, "Nate", 29);
	}
	
	@Bean
	public BeanWithPerson beanWithPerson() {
		return new BeanWithPerson();
	}
}
