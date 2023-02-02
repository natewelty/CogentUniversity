package restaurant;

public class Restaurant {

	public static void main(String[] args) {
		Customer customer = new Customer();
		WAITER waiter = new WAITER();
		waiter.takeOrder(customer);
		waiter.placeOrderToChef(customer.getOrder());
		customer.eat();
		BILL bill = new BILL();
		bill.generateBill(customer);

	}

}
