package com;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveParticularRecords {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		// retrieve of particular records using HQL
		String hql = "from Employee where salary=:pay";
		Query query = session.createQuery(hql);
		query.setInteger("pay", 80000);
		List<Employee> emplist = query.list();
		for (Employee temp : emplist) {
			// System.out.println(temp); //all table
			System.out.println(temp.getName() + "   " + temp.getSalary()); // particular table
		}
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------
	}

}
