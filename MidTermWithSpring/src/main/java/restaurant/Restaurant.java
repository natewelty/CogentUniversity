package restaurant;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan("restaurant")
public class Restaurant {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new AnnotationConfigApplicationContext(Restaurant.class);
		Customer customer = applicationContext.getBean(Customer.class);
		WAITER waiter = applicationContext.getBean(WAITER.class);
		waiter.takeOrder(customer);
		waiter.placeOrderToChef(customer.getOrder());
		customer.eat();
		BILL bill = applicationContext.getBean(BILL.class);
		bill.generateBill(customer);
		
		applicationContext.close();
	}

}
