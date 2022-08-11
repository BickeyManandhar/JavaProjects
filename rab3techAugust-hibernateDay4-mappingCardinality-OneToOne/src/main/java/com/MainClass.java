package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		// --------------------
		// given below 3 statements are fixed
		// SessionFactory reading all the information related to database configuration
		// and its creating an object. Its a factory of session.
		// insertion operation

		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		/*
		 * // one way to set values Author a = new Author("Biki", "biki@gmail.com");
		 * 
		 * // other way to set values Book b = new Book(); b.setName("Java");
		 * b.setDescription("Core JAva"); b.setPrice(200); b.setAuthor(a);
		 * 
		 * session.save(b); // Author a is part of Book b as we have it as attribute in
		 * Book class so save // session using b.
		 * 
		 */
		// one way to set values
		Author a1 = new Author("John", "John@gmail.com");

		// other way to set values
		Book b1 = new Book();
		b1.setName("Python");
		b1.setDescription("Python Basic");
		b1.setPrice(150);
		b1.setAuthor(a1);

		session.save(b1); // Author a is part of Book b as we have it as attribute in Book class so save
							// session using b.
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
