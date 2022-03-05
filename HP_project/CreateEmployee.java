package com.java.jpaproject.HP_project;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class CreateEmployee {
	public static void main(String[] args) {
		SessionFactory sessionfactory = new Configuration().configure()
				.addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = sessionfactory.openSession();
	
	try {
		System.out.println("It is creating....");
		Employee employee = new Employee("Prakash","prakash40@gmail.com",40000);
		Employee employee1 = new Employee("Suresh","suresh240@gmail.com",50000);
		Employee employee2 = new Employee("Prabu","prabu7040@gmail.com",60000);
		Transaction tr = session.beginTransaction();
		session.save(employee);
		session.save(employee1);
		session.save(employee2);
		tr.commit();
		session.close();
	} 
	catch(HibernateException h)
	{
		System.out.println("the hibernate error is " + h);
	}
	}
	}

