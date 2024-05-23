package com.becoder.FirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class emdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	
    	
    	Student s1=new Student();
    	s1.setID(1);
    	s1.setName("priyanshi");
    	Certificate c=new Certificate();
    	c.setCourse("Andriod");
    	c.setDuration("2 months");
    	s1.setCerti(c);
    	
    	
    	
    	Student s2=new Student();
    	s2.setID(1);
    	s2.setName("tushar");
    	Certificate c1=new Certificate();
    	c1.setCourse("hibernate");
    	c1.setDuration("2 months");
    	s2.setCerti(c1);
    	
    	
    	
    	Session session=factory.openSession();
    	Transaction tx=session.beginTransaction();
    	
    	//object save
    	session.save(s1);
    	session.save(s2);
    	
    	tx.commit();
    	
    	session.close();
    	factory.close();
	}

}
