package com.nagarro.springBoot.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.springBoot.model.Author;



public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
