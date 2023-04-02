package org.SRK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.persistence.*;

public class Delete {
public static void main(String[] args) {
	EntityManagerFactory f=Persistence.createEntityManagerFactory("dev");
	EntityManager m=f.createEntityManager();
	EntityTransaction t=m.getTransaction();
	Hospital h=m.find(Hospital.class, 1);
	Branch b1=m.find(Branch.class, 1);
	Branch b2=m.find(Branch.class, 2);
	Branch b3=m.find(Branch.class, 3);
	m.remove(b3);
	m.remove(b1);
	m.remove(b2);
	m.remove(h);
	t.begin();
	t.commit();
}
}
