import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import pkg.cogent.controller.ProductController;

public class Main {

	public static void main(String[] args) {
		try {
			int choice = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			ProductController pc = new ProductController();
			System.out.println("Welcome to the Product Management Application");
			do {

				System.out.println("1-Add product.");
				System.out.println("2-Read all products.");
				System.out.println("3-Read category of products.");
				System.out.println("4-Modify product.");
				System.out.println("5-Delete product by ID.");
				System.out.println("6-Delete products by category.");
				System.out.println("7-Find product by ID.");
				System.out.println("8-List expired products.");
				System.out.println("9-Find cheapest product in category.");
				System.out.println("10-exit");
				System.out.println("Please enter your choice:");

				choice = Integer.parseInt(br.readLine());
				pc.accept(choice);
			} while (choice != 10);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}