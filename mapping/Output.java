package com.java.jpaproject2.mapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Output {
	public static void main(String args[]) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hiber.cfg.xml").build();
		Metadata met = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory s = met.getSessionFactoryBuilder().build();
		Session m = s.openSession();
		Transaction t = m.beginTransaction();
		
	MovieDetails o = new MovieDetails();
	o.setReleaseyear(1992);
	o.setMname("Roja");
	o.setBudget(500000);
	
	MusicDirector d = new MusicDirector();
	d.setName("Rahman");
	d.setAge(45);
	d.setFirstmovie("Roja");
	
	o.setName(d);
	d.setMname(o);
	
	m.persist(o);
	t.commit();

	m.close();
	System.out.println("Success");
				
	}

}
