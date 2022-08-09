package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateRecords {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		// update records using HQL
		String hql = "update Employee set salary=:pay where empId=:eid";
		Query query = session.createQuery(hql);
		query.setParameter("pay", 120000);
		query.setParameter("eid", 2);
		int updatedRow = query.executeUpdate();
		if (updatedRow > 0) {
			System.out.println("Total number of updated row: " + updatedRow);
		}
		else {
			System.out.println("Update failed.");
		}
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
