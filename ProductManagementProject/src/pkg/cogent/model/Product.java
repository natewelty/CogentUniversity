package pkg.cogent.model;

import java.time.Instant;

public class Product {
	private int ID;
	private String name, cat;
	private Instant manufacture_date, exp_date;
	private double price;

	public Product(String name, String cat, Instant manufacture_date, Instant exp_date, double price) {
		super();
		this.name = name;
		this.cat = cat;
		this.manufacture_date = manufacture_date;
		this.exp_date = exp_date;
		this.price = price;
	}

	public Product(int ID, String name, String cat, Instant manufacture_date, Instant exp_date, double price) {
		super();
		this.ID = ID;
		this.name = name;
		this.cat = cat;
		this.manufacture_date = manufacture_date;
		this.exp_date = exp_date;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [ID=" + ID + ", name=" + name + ", cat=" + cat + ", manufacture_date=" + manufacture_date
				+ ", exp_date=" + exp_date + ", price=" + price + "]";
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCat() {
		return cat;
	}

	public void setCat(String cat) {
		this.cat = cat;
	}

	public Instant getManufacture_date() {
		return manufacture_date;
	}

	public void setManufacture_date(Instant manufacture_date) {
		this.manufacture_date = manufacture_date;
	}

	public Instant getExp_date() {
		return exp_date;
	}

	public void setExp_date(Instant exp_date) {
		this.exp_date = exp_date;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
