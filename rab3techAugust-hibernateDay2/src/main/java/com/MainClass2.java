package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass2 {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		// Retrieval operation------> 1. load() or 2. get()

		// load()
		// if we are sure that the record exist based on id then we use load() otherwise it throws exception
		Employee e1 = session.load(Employee.class, 2); // 2 is primary key
		System.out.println(e1);
		System.out.println(e1.getEmpId());
		System.out.println(e1.getName());
		System.out.println("----------------------------------------------------");
		
		// get()
		// else we use get() because get() method return null value if the record does not exist
		// which will inform us that the record does not exist
		Employee e2 = session.get(Employee.class, 1); // 1 is primary key
		System.out.println(e2);
		System.out.println(e2.getEmpId());
		System.out.println(e2.getName());
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
