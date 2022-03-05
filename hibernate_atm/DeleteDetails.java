package com.java.jpaproject1.hibernate_atm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;




public class DeleteDetails {
	public static void main(String[] args) {
		SessionFactory s = new Configuration().configure("hibernate1.cfg.xml")
				.addAnnotatedClass(Details.class).buildSessionFactory();
		Session ses = s.openSession();
		try
		{
			String customer_name="Subash";
			ses = s.openSession();
			ses.beginTransaction();
			System.out.println("Getting details" +customer_name);
			Details readdetails = ses.get(Details.class, customer_name); // specify PRIMARY KEY of the student
			System.out.println("Deleting details...");

			ses.delete(readdetails);

			
			ses.getTransaction().commit();
		}
		finally
		{
			s.close();
		}
	}

}
