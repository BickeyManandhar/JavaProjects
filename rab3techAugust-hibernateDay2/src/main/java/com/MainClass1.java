package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass1 {

	public static void main(String[] args) {
		// --------------------
		// given below 3 statements are fixed
		// SessionFactory reading all the information related to database configuration
		// and its creating an object. Its a factory of session.
		//insertion operation
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		Employee emp1 = new Employee("Bickey", "Nepal", 1234567);
		int key1 = (int) session.save(emp1);
		System.out.println("-------------------------------------------------");
		System.out.println("Primary key value of emp1: "+key1);
		System.out.println("-------------------------------------------------");

		Employee emp2 = new Employee("Chandra", "USA", 2234567);
		int key2 = (int) session.save(emp2);
		System.out.println("-------------------------------------------------");
		System.out.println("Primary key value of emp1: "+key2);
		System.out.println("-------------------------------------------------");
		
		Employee emp3 = new Employee("Kushal", "USA", 1134567);
		session.persist(emp3);

		// persist(); // we can use this method instead of save() method. Only different
		// is save() method return primary key value
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
