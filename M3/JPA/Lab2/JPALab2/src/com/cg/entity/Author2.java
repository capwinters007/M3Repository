package com.cg.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Author2 {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	private String aname;
	
	@ManyToMany(targetEntity=Books2.class)
	private Set<Books2> booksList;
	
	public Author2(){
		super();
	}

	public Author2(int id, String aname, Set<Books2> booksList) {
		super();
		this.id = id;
		this.aname = aname;
		this.booksList = booksList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Set<Books2> getBooksList() {
		return booksList;
	}

	public void setBooksList(Set<Books2> booksList) {
		this.booksList = booksList;
	}

	@Override
	public String toString() {
		return "Author2 [id=" + id + ", aname=" + aname + ", booksList="
				+ booksList + "]";
	}
	
	
}
