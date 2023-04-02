package org.SRK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

public class SaveHB {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Hospital h=new Hospital();
	h.setName("Apollo");
	h.setGst("AB143");
	h.setFounder("balayya");
	h.setNumber(7787);
	Branch b1=new Branch();
	b1.setEmail("AB@gmail.com");
	b1.setName("apollo");
	Branch b2=new Branch();
	b2.setEmail("AB@gmail.com");
	b2.setName("apollo");
	Branch b3=new Branch();
	b3.setEmail("AB@gmail.com");
	b3.setName("apollo");
	
	List<Branch> branchs=new ArrayList<Branch>(Arrays.asList(b1,b2,b3));
	h.setBranchs(branchs);
	m.persist(h);
	m.persist(b1);
	m.persist(b2);
	m.persist(b3);
	t.begin();
	t.commit();
}
}
