package Day1Assignments;

import java.util.Scanner;

public class testBook {

	
		static Scanner myInput = new Scanner(System.in);
		public static void main(String[] args) {
			Book[] myBookstore = createBooks(3);
			displayBooks(myBookstore);
		}
		
		public static Book[] createBooks(int n) {
			Book[] storeInventory = new Book[n];
			for(int i = 0; i<n; i++) {
				System.out.println("Enter a book title: ");
				storeInventory[i] = new Book(myInput.nextLine());
				//storeInventory[i].setTitle(myInput.nextLine());
				System.out.println("Enter its price: ");
				storeInventory[i].setPrice(myInput.nextFloat());
				myInput.nextLine();
			}
			return storeInventory;
		}
		public static void displayBooks(Book[] library) {
			System.out.println("Book Title            Price");	
			for(int i = 0; i<library.length; i++) {
				System.out.println(library[i].getTitle() + " 			" + library[i].getPrice());
			}
		}
	

}
