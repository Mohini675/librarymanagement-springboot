package com.nagarro.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nagarro.springBoot.dao.AuthorRepository;

import com.nagarro.springBoot.model.Author;


@Component
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;
	
	public List<Author> getallAuthors(){
		List<Author> list = (List<Author>) this.authorRepository.findAll();
		return list;
	}
}
