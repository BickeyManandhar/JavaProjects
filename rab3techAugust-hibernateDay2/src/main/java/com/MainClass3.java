package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass3 {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		
		// Delete Operation----->delete()
		Employee emp1=session.get(Employee.class, 4);
		if(emp1!=null) {
			session.delete(emp1);
		}
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------
		
		

	}

}
