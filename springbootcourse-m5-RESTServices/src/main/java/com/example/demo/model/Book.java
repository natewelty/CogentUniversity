package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book implements Serializable{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private int bookId;
  private String bookName;
  private Double bookPrice;
  
  public Book() {}
  public Book(int bookId, String bookName, Double bookPrice) {
	super();
	this.bookId = bookId;
	this.bookName = bookName;
	this.bookPrice = bookPrice;
	
}
public int getBookId() {
	return bookId;
}
public void setBookId(int bookId) {
	this.bookId = bookId;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public Double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(Double bookPrice) {
	this.bookPrice = bookPrice;
}

  
}
