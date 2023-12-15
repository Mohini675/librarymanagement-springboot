package com.nagarro.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nagarro.springBoot.model.Author;
import com.nagarro.springBoot.service.AuthorService;


@RestController
@RequestMapping("/api/authors")
public class AuthorController {
	
	@Autowired
	private AuthorService authorService;
	
	@GetMapping("/authors")
	public List<Author> getAllAuthors(){
		
		List<Author> list = authorService.getallAuthors();
		
		return list;
		
	}

}
