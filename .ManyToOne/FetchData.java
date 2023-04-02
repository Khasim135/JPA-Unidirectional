package manyToOne;

import javax.persistence.*;

public class FetchData {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
//	EntityTransaction t=m.getTransaction();
	Lecture l=m.find(Lecture.class, 1);
	
//	Students s1=m.find(Students.class, 1);
	
	Students s2=m.find(Students.class, 2);
	Students s3=m.find(Students.class, 3);
	Lecture l1=s2.getLect();
	System.out.println("lect 1"+l1.getId());
	System.out.println("lecture :"+l.getName());
//	System.out.println("student "+s1.getName());
	System.out.println("student "+s2.getName());
	System.out.println("student "+s3.getName());
	
	
}
}
