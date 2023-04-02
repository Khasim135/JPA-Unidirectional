package org.SRK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

public class SaveStudentCourse {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Course c1=new Course();
	c1.setName("JAVA");
	c1.setDuration(60);
	Course c2=new Course();
	c2.setName("J2EE");
	c2.setDuration(40);
	Course c3=new Course();
	c3.setName("FrameWork");
	c3.setDuration(15);
	Students s1=new Students();
	s1.setName("babu");
	s1.setPerc(95.5);
	List<Course> fors1=new ArrayList<Course>(Arrays.asList(c1,c2,c3));
	s1.setCourses(fors1);
	Students s2=new Students();
	s2.setName("Harish");
	s2.setPerc(89.0);
	List<Course> fors2=new ArrayList<Course>(Arrays.asList(c1,c2,c3));
	s2.setCourses(fors2);
	Students s3=new Students();
	s3.setName("Kishor");
	s3.setPerc(90.0);
	List<Course> fors3=new ArrayList<Course>(Arrays.asList(c1,c2,c3));
	s3.setCourses(fors3);
	m.persist(c1);
	m.persist(c2);
	m.persist(c3);
	m.persist(s1);
	m.persist(s2);
	m.persist(s3);
	t.begin();
	t.commit();
}
}
