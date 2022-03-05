package com.java.jpaproject.HP_project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class ReadEmployee {
	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure()
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionfactory.openSession();
	try {
		System.out.println("Creating a new detail..");
		Employee employee = new Employee("Subash","subash@gmail.com",30000);
		session.beginTransaction();
		session.save(employee);
		System.out.println("Java object saved to the database");
	    session.getTransaction().commit();
		System.out.println("Saved employee. Generated Id by MySQL database : " + employee.getEmp_ID());
		session = sessionfactory.getCurrentSession();
		session.beginTransaction();
		System.out.println("Getting the Employee based on id: " + employee.getEmp_ID());
		System.out.println("Retrieved employee : " + employee);
	    session.getTransaction().commit();
	}
	finally {
		sessionfactory.close();
	}
	}

}
