package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class mapdemo1 {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();

        session.beginTransaction();

        // Create a new Question
        Que question = new Que();
        question.setContent("What is Hibernate?");

        // Create two Answers
        Ans answer1 = new Ans();
        answer1.setContent("Hibernate is an ORM tool.");
        answer1.setQuestion(question);

        Ans answer2 = new Ans();
        answer2.setContent("It helps in mapping Java objects to database tables.");
        answer2.setQuestion(question);

        // Add Answers to the Question
        question.getAnswers().add(answer1);
        question.getAnswers().add(answer2);

        // Save the Question (which will also save the Answers due to cascade settings)
        session.save(question);

        session.getTransaction().commit();
        session.close();

        sessionFactory.close();
    }
}