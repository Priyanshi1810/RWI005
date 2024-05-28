package com.map2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapdemo {
public static void main(String[] args) {
	Configuration cfg=new Configuration();
	cfg.configure("hibernate.cfg.xml");
	
	SessionFactory factory=cfg.buildSessionFactory();
	Question q=new Question();
	q.setQuestionId(1212);
	q.setQuestion("what is java?");
	
	
	Answer an= new Answer();
	an.setAnswerId(343);
	an.setAnswer("java is programming language");
	q.setAnswer(an);
	
	
	
	Question q1=new Question();
	q1.setQuestionId(242);
	q1.setQuestion("what is collection fremwork");
	
	
	Answer an1= new Answer();
	an1.setAnswerId(344);
	an1.setAnswer("api to work with object in java");
	q1.setAnswer(an1);
	Session s=factory.openSession();
	Transaction tx=s.beginTransaction();
	
	s.save(q);
	s.save(q1);
	
	s.save(an);
	s.save(an1);
	
	tx.commit();
	
	factory.close();
}
}
