package org.cogent;

public class Product {
	int productID;
	String productName;
	int productPrice;
	public int getProductID() {
		return productID;
	}
	public void setProductID(int personID) {
		this.productID = personID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String personName) {
		this.productName = personName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int personAge) {
		this.productPrice = personAge;
	}
	public Product(int personID, String personName, int personAge) {
		super();
		this.productID = personID;
		this.productName = personName;
		this.productPrice = personAge;
	}
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
}
