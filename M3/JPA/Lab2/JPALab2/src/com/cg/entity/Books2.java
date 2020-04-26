package com.cg.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Books2 {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String isbn;
	
	private String bname;
	private int price;
	
	@ManyToMany(targetEntity=Author2.class)
	private Set<Author2> authorList;
	
	public Books2()
	{
		super();
	}

	public Books2(String isbn, String bname, int price, Set<Author2> authorList) {
		super();
		this.isbn = isbn;
		this.bname = bname;
		this.price = price;
		this.authorList = authorList;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Set<Author2> getAuthorList() {
		return authorList;
	}

	public void setAuthorList(Set<Author2> authorList) {
		this.authorList = authorList;
	}

	@Override
	public String toString() {
		return "Books2 [isbn=" + isbn + ", bname=" + bname + ", price=" + price
				+ ", authorList=" + authorList + "]";
	}
	
	
}
