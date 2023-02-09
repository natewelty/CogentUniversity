package restaurant;

import org.springframework.stereotype.Component;

@Component("nonveg")
public class NonVegChef extends Chef {
	public void nonVegSection(Order order) {
		prepareOrder(order);
		System.out.println("The chef has finished preparing the order and is calling the waiter.");
		callWaiter(false);
	}
}
