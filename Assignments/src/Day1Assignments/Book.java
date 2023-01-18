package Day1Assignments;



public class Book {
	private String title;
	private float price;
	
	public Book(String title) {
		this.title = title;
	}
	public Book(String title, float price) {
		this.title = title;
		this.price=price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	public float getPrice() {
		return price;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
}

