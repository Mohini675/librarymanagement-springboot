package com.nagarro.springBoot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Author {

@Id
@GeneratedValue(strategy =GenerationType.AUTO)
private int aid;
private String aname;


public Author() {
	super();
	// TODO Auto-generated constructor stub
}

public Author(int aid, String aname) {
	super();
	this.aid = aid;
	this.aname = aname;
}


public int getAid() {
	return aid;
}


public void setAid(int aid) {
	this.aid = aid;
}


public String getAname() {
	return aname;
}


public void setAname(String aname) {
	this.aname = aname;
}



@Override
public String toString() {
	return "Author [aid=" + aid + ", aname=" + aname + "]";
}



}



