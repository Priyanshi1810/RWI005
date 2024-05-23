package com.becoder.FirstApp;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 * 
 */

public class App {
	public static void main(String[] args) {
		System.out.println("Project started!");

		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	Student s1=new Student();
    	s1.setName("ayush");
    	//s1.setAddress("Anupur");
    	
    	Address ad=new Address();
    	ad.setName("rewa");
    	//ad.setPincode("486001");
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	session.save(s1);
    	session.save(ad);
    	tx.commit();
    	
    	session.close();
    	factory.close();
		 

	}
}
