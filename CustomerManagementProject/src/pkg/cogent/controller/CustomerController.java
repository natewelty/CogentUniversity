package pkg.cogent.controller;

import java.util.Scanner;

import pkg.cogent.service.CustomerService;

public class CustomerController {
	CustomerService cs;
	String cId;
	public CustomerController() {
		cs = new CustomerService();
	}
	
	public void accept(int choice) {
		Scanner sc = new Scanner(System.in);
		switch(choice) {
		case 1:
			cs.save();
			break;
		case 2:
			cs.fetch();
			break;
		case 3:
			System.out.println("Enter the customer ID.");
			cId= sc.next();
			cs.modify(cId);
			break;
		case 4:
			System.out.println("Enter the customer ID.");
			cId = sc.next();
			cs.delete(cId);
			break;
		case 5:
			System.out.println("Enter the customer ID.");
			cId = sc.next();
			cs.fetchById(cId);
			break;
		case 6:
			cs.findYoungest();
			break;
		case 7:
			break;
			
		}
	}
}
