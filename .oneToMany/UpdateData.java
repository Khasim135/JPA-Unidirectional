package org.SRK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

public class Update {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Hospital h=m.find(Hospital.class, 1);
	Branch b1=m.find(Branch.class, 1);
	Branch b2=m.find(Branch.class, 2);
	h.setName("Gandhi");
	b1.setName("bala");
	b2.setName("NTR");
//	List<Branch> branchs=new ArrayList<Branch>(Arrays.asList(b1,b2));
	m.merge(h);
	m.merge(b1);
	m.merge(b2);
	t.begin();
	t.commit();
}
}
