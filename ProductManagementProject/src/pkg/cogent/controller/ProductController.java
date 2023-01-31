package pkg.cogent.controller;

import java.util.Scanner;

import pkg.cogent.service.ProductService;

public class ProductController {
	ProductService ps;

	public ProductController() {
		super();
		ps = new ProductService();
	}

	public void accept(int choice) {
		Scanner scCON = new Scanner(System.in);
		switch (choice) {
		case 1:// add product
			ps.save();
			break;
		case 2:
			ps.fetchAll();
			break;
		case 3:
			System.out.println("Enter the category.");
			ps.fetchByCat(scCON.nextLine());
			break;
		case 4:
			System.out.println("Enter the product ID to be modified.");
			ps.modify(scCON.nextInt());
			break;
		case 5:
			System.out.println("Enter the product ID to be deleted.");
			ps.delete(scCON.nextInt());
			break;
		case 6:
			System.out.println("Enter the category to be deleted.");
			ps.deleteCat(scCON.nextLine());
			break;
		case 7:
			System.out.println("Enter the product ID to be displayed");
			ps.fetchByID(scCON.nextInt());
			break;
		case 8:
			ps.findExpiredInventory();
			break;
		case 9:
			System.out.println("Enter the category.");
			ps.fetchCheapestByCat(scCON.nextLine());
			break;
		case 10:
			System.out.println("Goodbye");
			scCON.close();
			break;

		}

	}

}
