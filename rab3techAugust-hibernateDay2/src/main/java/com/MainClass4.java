package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass4 {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		
		// Update Operation
		Employee emp1=session.get(Employee.class, 2);
		if(emp1!=null) {
			emp1.setName("Chandra");
			emp1.setCountry("Nepal");
		}
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------
		
		

	}

}
