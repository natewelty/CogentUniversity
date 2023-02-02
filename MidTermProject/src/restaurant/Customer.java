package restaurant;

import java.util.Scanner;

public class Customer {
	private String customerName;
	private int customerTableNumber;
	Order order;
	
	public Customer() {
		System.out.println("Hello, customer, what is your name?");
		Scanner sc = new Scanner(System.in);
		setCustomerName(sc.nextLine());
		//sc.close();
	}
	
	Order OrderingItems() {
		System.out.println("Enter the number of distinct items you wish to order.");
		Scanner sc = new Scanner(System.in);
		int itemCount = sc.nextInt();
		int items[][] = new int[itemCount][2];
		System.out.println("Enter the item number followed by the quantity one at a time.");
		for(int i = 0; i<itemCount;i++) {
			System.out.println("----------------------------");
			items[i][0]=sc.nextInt();
			items[i][1]=sc.nextInt();
			
		}
		order= new Order(items,itemCount);
		Order.orderNum++;
		return order;
	}
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	void eat() {
		System.out.println("The customer is eating.");
	}
	public int getCustomerTableNumber() {
		return customerTableNumber;
	}
	public void setCustomerTableNumber(int customerTableNumber) {
		this.customerTableNumber = customerTableNumber;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	
}
