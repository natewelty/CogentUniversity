package restaurant;

public class Chef {
	void prepareOrder(Order order) {
		System.out.println("The chef is preparing order number " + Order.orderNum);
	}
	void callWaiter(Boolean veg) {
		System.out.println("The waiter is delivering the food.");
	}
}
