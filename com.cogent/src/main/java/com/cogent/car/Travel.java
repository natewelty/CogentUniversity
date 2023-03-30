package com.cogent.car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;



public class Travel {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(CarConfig.class);
		Car car = (Car) applicationContext.getBean("car");
		car.letsGo();
	}

}
