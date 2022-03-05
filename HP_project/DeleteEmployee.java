package com.java.jpaproject.HP_project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class DeleteEmployee {
	
	public static void main(String[] args) {

		// create a Session Factory

		SessionFactory sessionFactory = new Configuration().configure()
				.addAnnotatedClass(Employee.class).buildSessionFactory();

		// create a Session
		Session session = sessionFactory.openSession();

		try {
			int Emp_ID = 3;
			
			session = sessionFactory.openSession();
			session.beginTransaction();

			System.out.println("Retrieving student with id : " + Emp_ID);

		Employee reademployee = session.get(Employee.class, Emp_ID); // specify PRIMARY KEY of the student
			System.out.println("Deleting student...");

			session.delete(reademployee);

			
			session.getTransaction().commit();

		} finally {

			sessionFactory.close();
		}
	}
}
