package com.cg.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.entity.Author2;
import com.cg.entity.Books2;

public class Service {
	
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("JPALab2");
	static EntityManager eManager=emf.createEntityManager();
	
	public static void main(String[] args){
		eManager.getTransaction().begin();
		
		/*Books2 b1=new Books2();
		b1.setPrice(350);
		b1.setBname("Chambers of Secret");
		b1.setIsbn("45687123");
		
		Books2 b2=new Books2();
		b2.setBname("Prisoner of Askaban");
		b2.setIsbn("45678912");
		b2.setPrice(450);
		
		Books2 b3=new Books2();
		b3.setBname("Philospher Stone");
		b3.setIsbn("15623478");
		b3.setPrice(299);
		
		Books2 b4=new Books2();
		b4.setBname("Angels and Demons");
		b4.setIsbn("59645612");
		b4.setPrice(150);
		
		Books2 b5=new Books2();
		b5.setBname("Da-Vinci Demons");
		b5.setIsbn("78945826");
		b5.setPrice(450);
		
		Set<Books2> l1=new HashSet<>();
		l1.add(b1);
		l1.add(b2);
		l1.add(b3);
		
		Set<Books2> l2=new HashSet<>();
		l2.add(b4);
		l2.add(b5);
		
		Author2 a1=new Author2();
		a1.setAname("J K Rowling");
		a1.setId(1);
		
		Author2 a2=new Author2();
		a2.setAname("Dan Brown");
		a2.setId(2);
		
		Set<Author2> l3=new HashSet<>();
		l3.add(a1);
		
		Set<Author2> l4=new HashSet<>();
		l4.add(a2);
		
		a1.setBooksList(l1);
		a2.setBooksList(l2);
		
		b1.setAuthorList(l3);
		b2.setAuthorList(l3);
		b3.setAuthorList(l3);
		
		b4.setAuthorList(l4);
		b5.setAuthorList(l4);
		
		eManager.persist(b1);
		eManager.persist(b2);
		eManager.persist(b3);
		eManager.persist(b4);
		eManager.persist(b5);
		eManager.persist(a1);
		eManager.persist(a2);*/
		
		Query q=eManager.createQuery("Select b from Books2 b");
		List<Books2> list=q.getResultList();
		
		for (Books2 books2 : list) {
			System.out.println(books2.getBname()+"vishal");
		}
		
		/*Query q=eManager.createQuery("Select b from Books2 b join b.authorList a where a.aname='J K Rowling' ");
		List<Books2> list=q.getResultList();
		
		for (Books2 books2 : list) {
			System.out.println(books2.getBname()+"vishal");
		}*/
		
		/*Query q=eManager.createQuery("Select b from Books2 b where b.price between "+200+" and "+500);
		List<Books2>list=q.getResultList();
		
		for (Books2 books2 : list) {
			System.out.println(books2.getBname()+"vishal");
		}*/
		
		/*Query q=eManager.createQuery("Select a from Author2 a join a.booksList b where b.isbn='78945826'");
		List<Author2> list=q.getResultList();
		
		for (Author2 author2 : list) {
			System.out.println(author2.getAname()+"vishal");
		}
		*/
		eManager.getTransaction().commit();
		eManager.close();
		emf.close();
		
		
	}

}
