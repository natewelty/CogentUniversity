package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@Controller
@ResponseBody
@RequestMapping("/api")
public class BookController {
	@Autowired
	BookService bs;
	
	//Get All books
	@GetMapping(value= {"/books"})
	public List<Book> getAll(){
		List<Book> book = bs.getAll();
		System.out.println("books retrieved "+book.size());
		return book;
	}
	//Get an book
	@GetMapping("/books/{id}")
	public Book get(@PathVariable("id") Integer id) {
		Optional<Book> b = bs.get(id);
		return b.get();
	}
	//Insert an book
	@PostMapping("/books")
	public Book add(@RequestBody Book book) {
		return bs.update(book);
	}
	//Update an book
	@PutMapping("/books")
	public Book edit(@RequestBody Book book) {
		return bs.update(book);
	}
	//Delete an book
	@DeleteMapping("/books")
	public String delete(@RequestParam(value="id") Integer id) {
		Optional<Book> i = bs.get(id);
		bs.delete(i.get());
		return "Book id "+id+" deleted successfully";
	}

}
