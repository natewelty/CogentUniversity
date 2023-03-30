package com.cogent.car;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
	@Bean(name = "car")
	public Car getCar(Tyre tyre) {
		Car car = new Car();
		car.setTyre(tyre);
		return car;
	}
	
	@Bean
	public Tyre getTyre() {
		return new Tyre();
	}
}
