package org.SRK;

import javax.persistence.*;

public class FetchData {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
//	EntityTransaction t=m.getTransaction();
	Hospital h=m.find(Hospital.class, 1);
	Branch b1=m.find(Branch.class, 1);
	Branch b2=m.find(Branch.class, 2);
	Branch b3=m.find(Branch.class, 3);
	System.out.println("hospital :"+h.getName());
	System.out.println("Branch b1 :"+b1.getName());
	System.out.println("Branch b2 :"+b2.getName());
	System.out.println("Branch b3 :"+b3.getName());
}
}
