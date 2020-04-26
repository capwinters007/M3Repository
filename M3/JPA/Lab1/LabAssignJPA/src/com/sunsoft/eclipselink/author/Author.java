package com.sunsoft.eclipselink.author;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Author {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	
	private int authorId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String pNumber;
	public Author(){
		
	}

	public Author(int authorId, String firstName, String secondName,
			String lastName, String pNumber) {
		super();
		this.authorId = authorId;
		this.firstName = firstName;
		this.middleName = secondName;
		this.lastName = lastName;
		this.pNumber = pNumber;
	}

	public int getAuthorId() {
		return authorId;
	}

	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String secondName) {
		this.middleName = secondName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPNumber() {
		return pNumber;
	}

	public void setPNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", phoneNo=" + pNumber + "]";
	}
	
	
	
	

}
