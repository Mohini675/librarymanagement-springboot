package com.nagarro.springBoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.springBoot.dao.BookRepository;
import com.nagarro.springBoot.model.Book;

@Component
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public List<Book> getallBooks(){
		List<Book> list = (List<Book>) this.bookRepository.findAll();
		return list;
	}
	
	public Book getBookById(int code) {
		return this.bookRepository.findById(code);
		}
	
	public Book addBook(Book b){
		Book book = this.bookRepository.save(b);
		return book;
	}
	
	public void deleteBook(int id){
		this.bookRepository.deleteById(id);
		
	}
	
	public Book updateBook(Book book, int bookId){
		book.setCode(bookId);
		Book bookk = this.bookRepository.save(book);
		return bookk;

	}
}
