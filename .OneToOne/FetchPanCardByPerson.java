package org.SRK;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchPanByPerson {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	String qr="select p from Person p ";
	Query q=m.createQuery(qr);
	List<Person> ps=q.getResultList();
	
	for(Person p:ps)
	{
		System.out.println("id  :"+p.getId());
		System.out.println("name  :"+p.getName());
		System.out.println("place  :"+p.getPlace());
		System.out.println("________________________");
		
		PanCard c=p.getPan();
		
		System.out.println("id  :"+c.getId());
		System.out.println("number  :"+c.getNumber());
		System.out.println("state  :"+c.getState());
		System.out.println("DOB  :"+c.getDob());
		System.out.println("========================================");
	}
}
}
