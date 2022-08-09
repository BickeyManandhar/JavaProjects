package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		//--------------------
				//given below 3 statements are fixed
				//SessionFactory reading all the information related to database configuration
				//and its creating an object. Its a factory of session.
				
				SessionFactory sf= new Configuration().configure().buildSessionFactory();		
				// obtains the session
				Session session = sf.openSession();
				session.beginTransaction();
		        //-----------
				Employee emp=new Employee(1,"Biki","Nepal",100000);
				session.save(emp);
				
				Employee emp2=new Employee(2,"Kim","Korea",80000);
				session.save(emp2);
				
				Employee emp3=new Employee(3,"Ramesh","India",90000);
				session.save(emp3);
				
				
				
				
				//-----------
				session.getTransaction().commit();
				session.close();
				//-------------

	}

}
