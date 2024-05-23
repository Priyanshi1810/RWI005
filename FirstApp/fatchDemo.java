package com.becoder.FirstApp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class fatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg=new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	
    	SessionFactory factory=cfg.buildSessionFactory();
    	Session session=factory.openSession();
    	
   //Student pri =(Student)session.get(Student.class, 1);
    	Student pri =(Student)session.load(Student.class, 1);
   System.out.println(pri);
   session.close();
	factory.close();
	}
	

}
