package StreamTesting;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamingArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> productList = new ArrayList<>();
		productList.add(new Product(1, "Apple", 19.95));
		productList.add(new Product(2, "Dell", 29.95));
		productList.add(new Product(3, "Lenovo", 59.95));
		productList.add(new Product(4, "IBM", 99.95));
		productList.add(new Product(5, "Alienware", 199.95));
				
		
		Stream<Product> productStream = productList.stream();
		
		productStream.filter(p->p.price>90.00).map(p->p.price).forEach(System.out::println);
		
		
		
	}

}

class Product{
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
}