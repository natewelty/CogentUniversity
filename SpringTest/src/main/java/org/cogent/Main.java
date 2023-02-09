package org.cogent;

import org.springframework.context.ApplicationContext;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("org.cogent")
public class Main {

	public static void main(String[] args) {
		// ConfigurableApplicationContext ctx=new
		// AnnotationConfigApplicationContext(Main.class);
		// ApplicationContext ctx=new
		// ClassPathXmlApplicationContext("spring/beans.xml");
		// Person person=ctx.getBean("person",Person.class);
		// person.showPerson();
//		System.out.println(person.getID());
//		System.out.println(person.getName());
//		System.out.println(person.getAge());

		ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationBeans.class);
		Product product = ctx.getBean("product", Product.class);
		System.out.println(product.getProductID());
		System.out.println(product.getProductName());
		System.out.println(product.getProductPrice());

	}

}