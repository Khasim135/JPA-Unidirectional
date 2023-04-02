package manyToOne;

import javax.persistence.*;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Lecture l=m.find(Lecture.class, 1);
	Students s1=m.find(Students.class, 1);
	Students s2=m.find(Students.class, 2);
	Students s3=m.find(Students.class, 3);
	l.setName("Punith_sir");
	s1.setName("NTR");
	s2.setName("YASH");
	s3.setName("Pavan");
	m.merge(l);
	m.merge(s1);
	m.merge(s2);
	m.merge(s3);
	t.begin();
	t.commit();
}
}
