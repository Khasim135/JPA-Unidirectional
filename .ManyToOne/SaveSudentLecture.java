package manyToOne;

import javax.persistence.*;

public class SaveStudentLecture {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Lecture l=new Lecture();
	l.setName("sathish");
	l.setPhon(7777);
	l.setSubject("Framework");
	Students s1=new Students();
	s1.setName("babu");
	s1.setMail("BTBabu@gmail.com");
	s1.setLect(l);
	
	Students s2=new Students();
	s2.setName("kishore");
	s2.setMail("kishore@gmail.com");
	s2.setLect(l);
	
	Students s3=new Students();
	s3.setName("harish");
	s3.setMail("Harish@gmail.com");
	s3.setLect(l);
	m.persist(l);
	m.persist(s1);
	m.persist(s2);
	m.persist(s3);
	t.begin();
	t.commit();
	
}
}
