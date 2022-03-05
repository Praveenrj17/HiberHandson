package com.java.jpaproject1.hibernate_atm;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateDetails {

	public static void main(String[] args) {
		SessionFactory s = new Configuration().configure("hibernate1.cfg.xml")
				.addAnnotatedClass(Details.class).buildSessionFactory();
		Session session = s.openSession();
		
		try
		{
			System.out.println("It is creating....");
			Details d = new Details("Ramoji",220320,70,90853456,"Chennai");
			Details d1 = new Details("Prem",220124,65,90803450,"Vandaloor");
			Details d2 = new Details("Ram",220126,39,90803446,"Trichy");
			Details d3 = new Details("Rajith",220120,50,90803454,"Poonammelle");
			Transaction t = session.beginTransaction();
			session.save(d);
			session.save(d1);
			session.save(d2);
			session.save(d3);
			t.commit();
			session.close();
			
		}
		catch(HibernateException h)
		{
			System.out.println("The error is "+ h);
		}		
	}
	}


