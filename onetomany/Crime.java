package com.hiberproject.onetomany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Crime {

	public static void main(String[] args) {
           System.out.println("---Fetching Data------");
           Configuration cf = new Configuration();
           cf= cf.configure("hibernate.cfg.xml");
           SessionFactory sf = cf.buildSessionFactory();
           Session s = sf.openSession();
           Transaction t = s.beginTransaction();
           
           Police a	=new Police();
          
           //a.setId(1);
          a.setPname("Shakeel Ahmed");
           a.setArea("Karnataka");
           
          
         
          Police a1=new Police();
         // a.setId(2);
              a1.setPname("S.R.Jangid");
              a1.setArea("Chennai");
//           Police a2 =new Police();
          
           ArrayList<Police> list = new ArrayList<>();
             list.add(a);
             list.add(a1);
//           list.add(a2);
           
           Details q1 = new Details();
          
           q1.setCrime_year("1992-2005");
           q1.setA_name("Veerapan");
           q1.setC_name("Smuggling");
           
           
          Details q2 = new Details();
           q2.setCrime_year("1995-2004");
           q2.setA_name("Bawaria");
           q2.setC_name("Robbery,Cold-murder");
           
           //Details q2 = new Details();
           
           
           
          s.save(q1);  
           s.save(q2);
            //s.save(q2);
//           s.save(q2);
         t.commit();
           s.close();
            System.out.println("Saving successful");
           
	}
           
           

}
