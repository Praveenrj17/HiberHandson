package com.java.jpaproject1.hibernate_atm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class ReadDetails {

	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure("hibernate1.cfg.xml")
				.addAnnotatedClass(Details.class).buildSessionFactory();
		Session session = sessionfactory.openSession();
	try {
		System.out.println("Creating a new detail..");
		Details d5 = new Details("Subash",203045,34,9087650,"Avadi");
		session.beginTransaction();
		session.save(d5);
		System.out.println("Java object saved to the database");
	    session.getTransaction().commit();
	}
	finally {
		sessionfactory.close();
	}
	}

	}


