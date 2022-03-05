package com.java.jpaproject.HP_project;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmployee {
	public static void main(String[] args) {
		
		SessionFactory sessionfactory = new Configuration().configure()
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionfactory.openSession();
		try {
			int Emp_ID=4;
			session = sessionfactory.openSession();
			session.beginTransaction();
			
			System.out.println("Retrieving employee with id : " + Emp_ID);
			Employee reademployee = session.get(Employee.class,Emp_ID);
			
			System.out.println("Updating employee...");
			
			reademployee.setEmployee_name("Akash");
		
			
			System.out.println("Updating email for all employees");
			int rowsUpdated = session.createQuery("update Employee set email='akash4@gmail.com'").executeUpdate();
			
			System.out.println("Rows updated : " + rowsUpdated);
			
			session.getTransaction().commit();
		}
		finally {
			sessionfactory.close();
		}
		
		}

}
