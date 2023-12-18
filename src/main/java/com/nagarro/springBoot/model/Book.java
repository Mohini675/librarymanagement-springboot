package com.nagarro.springBoot.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Book {
	
	@Id
	@Column(unique=true)
	private int code;
	private String name;
	private String author;
	private Date date;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int code, String name, String author, Date date) {
		super();
		this.code = code;
		this.name = name;
		this.author = author;
		this.date = date;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Book [code=" + code + ", name=" + name + ", author=" + author + ", date=" + date + "]";
	}
	
	
	
	

}
