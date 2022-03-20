package com.hiberproject2.onetomany2;

import java.util.ArrayList;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreDetails {
	public StoreDetails()
	{
		System.out.println("------It is creating----------");
	 Configuration cf = new Configuration();
     cf= cf.configure("hibernate.cfg.xml");
     SessionFactory sf = cf.buildSessionFactory();
     Session s = sf.openSession();
     Transaction t = s.beginTransaction();
     
     Management m = new Management();
     m.setUniversity("Anna University");
     m.setCollegename("SREC");
     m.setPincode(602024);
     
     
     Management m2 = new Management();
     m2.setUniversity("Madras University");
     m2.setCollegename("DG Vaishnava");
     m2.setPincode(600106);
     
     
     Management m1 = new Management();
     m1.setUniversity("Anna University");
     m1.setCollegename("JCE");
     m1.setPincode(602024);
    
     Management m3 = new Management();
     m3.setUniversity("Madras University");
     m3.setCollegename("Hindu College");
     m3.setPincode(600072);
    	     
     ArrayList<Management> a = new ArrayList<>();
     a.add(m);
     a.add(m1);
     ArrayList<Management> a1 = new ArrayList<>();
     a1.add(m2);
     a1.add(m3);
     
     Courses c = new Courses();
     c.setCourse_name("AI&DataScience");
     c.setDuration("Four Years");
     c.setManagements(a);
     Courses c1 = new Courses();
     c1.setCourse_name("PetroChemical Engineering");
     c1.setDuration("Five Years");
     c1.setManagements(a);
     Courses c2 = new Courses();
     c2.setCourse_name("MCA");
     c2.setDuration("Two Years");
     c2.setManagements(a1);
     Courses c3 = new Courses();
     c3.setCourse_name("MBA");
     c3.setDuration("Three Years");
     c3.setManagements(a1);
     s.save(c);
     s.save(c1);
     s.save(c2);
     s.save(c3);
     t.commit();
     s.close();	     

}
	public static void main(String[] args) {
	
			try {
		StoreDetails f = new StoreDetails();
	
		System.out.println(" Course Details has been entered");
			} 
			catch (HibernateException e) 
			{
			System.out.println(e);
			}
			catch(Exception e)
			{	
			System.out.println(e);
			}		
			}
			
	}
	

