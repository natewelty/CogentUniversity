package restaurant;

import org.springframework.stereotype.Component;

@Component("veg")
public class VegChef extends Chef {
	public void vegSection(Order order) {
		prepareOrder(order);
		System.out.println("The chef has finished preparing the order and is calling the waiter.");
		callWaiter(true);
	}
}
