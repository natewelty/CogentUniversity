package restaurant;

public class WAITER {
	final String listItems[]= {"1.Full meals --100", "2.veg biriyani--150", "3.veg Rice--50", "4.veg Palav--100","5.veg Manchuria--50", "6.gobi Nudles--50", "7.chicken Biriyani--200", "8.chicken65--200", "9.chicken Curry--100", "10.chicken Manchuria--150"};
	
	void menu() {
		for(String s:listItems) {
			System.out.println(s);
		}
	}
	void takeOrder(Customer customer) {
		System.out.println("Hello," + customer.getCustomerName() + ", I will be your waiter today. Here is the menu.");
		menu();
		Order customersOrder = customer.OrderingItems();
		displayOrder(customersOrder);
		
	}
	void placeOrderToChef(Order order) {
		VegChef vegChef = new VegChef();
		NonVegChef nonVegChef = new NonVegChef();
		Boolean veg = true;
		System.out.println("The waiter will take the order to the chef now.");
		for(int i=0; i<order.noOfItems;i++) {
			if(order.items[i][0] != 2 && order.items[i][0] != 3 && order.items[i][0] != 4) {
				veg = false;
			}	
		}
		
		if(veg) {
			System.out.println("The order has been delivered to the veg chef");
			vegChef.vegSection(order);
		}
		else {
			System.out.println("The order hass been delivered to the non-veg chef.");
			nonVegChef.nonVegSection(order);
			
		}
	}
	public void displayOrder(Order order) {
		System.out.println("Let me read that back to you.");
		for(int i = 0; i<order.noOfItems; i++) {
			System.out.println("You have ordered " + order.items[i][1] + " order(s) of " + listItems[order.items[i][0]-1]);
		}
		System.out.println();
	}
}
