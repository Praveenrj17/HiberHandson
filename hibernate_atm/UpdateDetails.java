package com.java.jpaproject1.hibernate_atm;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UpdateDetails {

	public static void main(String[] args) {
     SessionFactory s = new Configuration().configure("hibernate1.cfg.xml")
    		 .addAnnotatedClass(Details.class).buildSessionFactory();
     Session c = s.openSession();
     try
     {
    	 String customer_name ="Prem" ;
    	 c=s.openSession();
    	 c.beginTransaction();
    	 
    	 System.out.println("Retrieving employee with id : " + customer_name);
			Details readdetail = c.get(Details.class,customer_name);
			
			System.out.println("Updating details...");
			
			readdetail.setCustomer_name("Harish");
		
			
			System.out.println("Updating acc_number for all employees");
			int rowsUpdated = c.createQuery("update Customer acc number=12390").executeUpdate();
			
			System.out.println("Rows updated : " + rowsUpdated);
			
			c.getTransaction().commit();
     }
     finally
     {
    	 s.close();
     }
	}

}
