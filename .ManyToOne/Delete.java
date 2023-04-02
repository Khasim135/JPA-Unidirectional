package manyToOne;

import javax.persistence.*;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Lecture l=m.find(Lecture.class, 1);
	Students s1=m.find(Students.class, 1);
	Students s2=m.find(Students.class, 2);
	Students s3=m.find(Students.class, 3);
	m.remove(s1);
//	m.remove(l);
	t.begin();
	t.commit();
}
}
