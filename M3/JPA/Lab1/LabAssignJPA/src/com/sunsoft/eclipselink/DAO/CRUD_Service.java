package com.sunsoft.eclipselink.DAO;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.sunsoft.eclipselink.author.Author;

public class CRUD_Service {
	
	static EntityManagerFactory emfactory=Persistence.createEntityManagerFactory("LabAssignJPA");
	static EntityManager emanager=emfactory.createEntityManager();
	
	public static void main(String[] args){
		CRUD_Service cs=new CRUD_Service();
		
		/*Author author=new Author();
		author.setAuthorId(101);
		author.setFirstName("Daniel");
		author.setMiddleName("Gerhard");
		author.setLastName("Brown");
		author.setPNumber("996587797");*/
		
		Author author2=new Author();
		author2.setAuthorId(103);
		author2.setFirstName("Joanne");
		author2.setMiddleName("k");
		author2.setLastName("Rowling");
		author2.setPNumber("989898989");
		
		/*cs.insertIntoDB(author);*/
		cs.insertIntoDB(author2);
		
		/*cs.updateDB(101,"5656565656");*/
		
		/*cs.deleteFromDB(101);*/
		
		
	}
	
	void insertIntoDB(Author author){
		emanager.getTransaction().begin();
		emanager.persist(author);
		emanager.getTransaction().commit();
	}
	void updateDB(int id,String no){
		Author author=emanager.find(Author.class, id);
		emanager.getTransaction().begin();
		author.setPNumber(no);
		emanager.getTransaction().commit();
	}
	void deleteFromDB(int id){
		Author author=emanager.find(Author.class, id);
		emanager.getTransaction().begin();
		emanager.remove(author);
		emanager.getTransaction().commit();
	}

}
