package pkg.cogent.dao;

import java.util.Scanner;

import pkg.cogent.model.Customer;

public class CustomerDAOImpl implements CustomerDAO {

	Customer customers[];
	Scanner sc = new Scanner(System.in);
	@Override
	public void create() {
		System.out.println("How many customers would you like to store?");
		int size = sc.nextInt();
		customers = new Customer[size];
		for(int i = 0; i<customers.length; i++) {
			System.out.println("Please enter customer ID.");
			String cId = sc.next();
			System.out.println("Please enter customer name.");
			String cName = sc.next();
			System.out.println("Please enter customer email.");
			String cEmail = sc.next();
			System.out.println("Please enter customer date of birth.");
			String cDoB = sc.next();
			customers[i] = new Customer(cId,cName,cEmail,cDoB);
		}

	}

	@Override
	public void read() {
		for(int i = 0; i<customers.length; i++) {
			System.out.println("Customer ID: " + customers[i].getCId());
			System.out.println("Customer Name: " + customers[i].getCName());
			System.out.println("Customer Email: " + customers[i].getCEmail());
			System.out.println("Customer Date of Birth: " + customers[i].getCDoB());
		}

	}

	@Override
	public void update(String cId) {
		for(int i = 0; i<customers.length; i++) {
			if(customers[i].getCId()==cId) {
				System.out.println("Current Customer ID: " + customers[i].getCId());
				System.out.println("Current Customer Name: " + customers[i].getCName());
				System.out.println("Current Customer Email: " + customers[i].getCEmail());
				System.out.println("Current Customer Date of Birth: " + customers[i].getCDoB());
				System.out.println("Please enter updated customer ID.");
				customers[i].setCId(sc.next());
				System.out.println("Please enter updated customer name.");
				customers[i].setCName(sc.next());
				System.out.println("Please enter updated customer email.");
				customers[i].setCEmail(sc.next());
				System.out.println("Please enter updated customer date of birth.");
				customers[i].setCDoB(sc.next());
			}
		}

	}

	@Override
	public void delete(String cId) {
		// TODO Auto-generated method stub

	}
	@Override
	public void findById(String cId) {
		
	}
	@Override
	public void findYoungest() {
		
	}

}
