package com.nagarro.springBoot.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springBoot.model.Book;
import com.nagarro.springBoot.service.BookService;

@RestController
@RequestMapping("/api/books")
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/books")
	public List<Book> getBooks() {
		
		List<Book> list = bookService.getallBooks();
		return list;
		
		}
	
	@GetMapping("/{code}")
	public Book getBook(@PathVariable("code")int code) {
		
		return this.bookService.getBookById(code);
		
		
	}

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		System.out.println(book);
		Book b = null;
		return this.bookService.addBook(book);
		
		
	}
	
	@DeleteMapping("/{code}")
	public void DeleteBook(@PathVariable("code")int code) {
		
		this.bookService.deleteBook(code);
		
	}
	@PutMapping("/{code}")
	public Book updateBook(@PathVariable("code")int code , @RequestBody Book book) {
		
		return this.bookService.updateBook(book, code);
		
	}
}
