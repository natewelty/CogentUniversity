package pkg.cogent.dao;

import java.util.Scanner;

import pfg.cogent.exception.MandatoryFieldException;
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
			if(cId==null) {
				throw new MandatoryFieldException("Customer ID is a mandatory field.");
			}
			System.out.println("Please enter customer name.");
			String cName = sc.next();
			if(cName==null) {
				throw new MandatoryFieldException("Customer name is a mandatory field.");
			}
			System.out.println("Please enter customer email.");
			String cEmail = sc.next();
			if(cEmail==null) {
				throw new MandatoryFieldException("Customer email is a mandatory field.");
			}
			System.out.println("Please enter customer date of birth(YYYYMMDD).");
			String cDoB = sc.next();
			if(cDoB==null) {
				throw new MandatoryFieldException("Customer date of birth is a mandatory field.");
			}
			
			customers[i] = new Customer(cId,cEmail,cName,cDoB);
		}

	}

	@Override
	public void read() {
		for(int i = 0; i<customers.length; i++) {
			if(customers[i].getCId()!=null) {
				System.out.println("Customer ID: " + customers[i].getCId());
				System.out.println("Customer Name: " + customers[i].getCName());
				System.out.println("Customer Email: " + customers[i].getCEmail());
				System.out.println("Customer Date of Birth: " + customers[i].getCDoB());
			}
		}

	}

	@Override
	public void update(String cId) {
		String cDoB, cEmail, cName;
		boolean found=false;
		for(int i = 0; i<customers.length; i++) {
			if(customers[i].getCId().equals(cId)) {
				found=true;
				System.out.println("Current Customer ID: " + customers[i].getCId());
				System.out.println("Current Customer Name: " + customers[i].getCName());
				System.out.println("Current Customer Email: " + customers[i].getCEmail());
				System.out.println("Current Customer Date of Birth: " + customers[i].getCDoB());
				
				System.out.println("Please enter updated customer name.");
				cName = sc.next();
				if(cName==null) {
					throw new MandatoryFieldException("Customer name is a mandatory field.");
				}
				System.out.println("Please enter updated customer email.");
				cEmail = sc.next();
				if(cEmail==null) {
					throw new MandatoryFieldException("Customer email is a mandatory field.");
				}
				System.out.println("Please enter updated customer date of birth(YYYYMMDD).");
				cDoB = sc.next();
				if(cDoB==null) {
					throw new MandatoryFieldException("Customer date of birth is a mandatory field.");
				}
				customers[i].setCName(cName);
				customers[i].setCEmail(cEmail);
				customers[i].setCDoB(cDoB);
			}
			
		}
		if(found==false) {
			System.out.println("Failed to find customer ID.");
		}
	}

	@Override
	public void delete(String cId) {
		boolean found = false;
		for(int i = 0; i<customers.length; i++) {
			if(customers[i].getCId().equals(cId)) {
				found = true;
				customers[i] = new Customer();
				System.out.println("Customer record deleted.");
			}
		}
		if(found==false) {
			System.out.println("Failed to find customer ID.");
		}
	}
	@Override
	public void findById(String cId) {
		boolean found=false;
		for(int i = 0; i<customers.length; i++) {
			if(customers[i].getCId().equals(cId)) {
				System.out.println("Current Customer ID: " + customers[i].getCId());
				System.out.println("Current Customer Name: " + customers[i].getCName());
				System.out.println("Current Customer Email: " + customers[i].getCEmail());
				System.out.println("Current Customer Date of Birth: " + customers[i].getCDoB());
				found = true;
			}	
		}
		if(found == false) {
			System.out.println("Failed to find customer ID in record.");
		}
	}
	@Override
	public void findYoungest() {
		Integer youngest = 0;
				//Integer.parseInt(customers[0].getCDoB());
		for(int i=1; i<customers.length;i++) {
			if(Integer.parseInt(customers[i].getCDoB())>Integer.parseInt(customers[youngest].getCDoB())) {
				youngest = i;
			}
		}
		System.out.println("Youngest Customer ID: " + customers[youngest].getCId());
		System.out.println("Youngest Customer Name: " + customers[youngest].getCName());
		System.out.println("Youngest Customer Email: " + customers[youngest].getCEmail());
		System.out.println("Youngest Customer Date of Birth: " + customers[youngest].getCDoB());
		
	}

}
