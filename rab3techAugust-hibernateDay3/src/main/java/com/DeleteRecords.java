package com;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteRecords {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		// delete records using HQL
		String hql = "delete Employee where empId=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", 5);
		int updatedRow = query.executeUpdate();
		if (updatedRow > 0) {
			System.out.println("Total number of deleted row: " + updatedRow);
		}
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
