package com;
import java.util.List;

//org.hibernate in main class
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveAllRecords {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		// obtains the session
		Session session = sf.openSession();
		session.beginTransaction();
		// -----------
		// retrieve of all records using HQL
		String hql="from Employee";
		Query query=session.createQuery(hql);
		List<Employee> emplist=query.list();
		
		for(Employee temp : emplist) {
			//System.out.println(temp); //all table
			System.out.println(temp.getName()+"   "+temp.getSalary()); //particular table
		}
		
		
		// -----------
		session.getTransaction().commit();
		session.close();
		// -------------

	}

}
