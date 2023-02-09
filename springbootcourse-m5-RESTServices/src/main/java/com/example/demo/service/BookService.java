package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepositoryInterface;

@Service
public class BookService {
  @Autowired
  BookRepositoryInterface itr;
  
  //Single book get
  public Optional<Book> get(int bookId){
	  return itr.findById(bookId);
  }
  //Get all books
  public List<Book> getAll(){
	  return (List<Book>) itr.findAll();
  }
  //Update/create book
  public Book update(Book book) {
	  return itr.save(book);
  }
  //Delete book
  public void delete(Book book) {
	  itr.delete(book);
  }
  //Delete all books
  public void deleteAll() {
	  itr.deleteAll();
  }
}
