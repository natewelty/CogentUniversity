package com.cogent;

public class Book {
	String title;
	String author;
	int pages;
	double price;
	
	public Book(String title, String author, int pages, double price) {
		super();
		this.title = title;
		this.author = author;
		this.pages = pages;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Book["+title + ", by " + author +", " + pages + " pages, $" +price +"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		if(getClass() != obj.getClass()){
			return false;
		}
		Book other = (Book) obj;
		return title.compareToIgnoreCase(other.title)==0 && author.compareToIgnoreCase(other.author)==0 && pages==other.pages && price==other.price;
	}
}
