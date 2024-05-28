package com.map1;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");

        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Create some projects
        Project project1 = new Project();
        project1.setProjectname("Project A");

        Project project2 = new Project();
        project2.setProjectname("Project B");

        // Create an employee
        Employee employee1 = new Employee();
        employee1.setEmployeename("John Doe");

        // Assign projects to the employee
        List<Project> projects = new ArrayList<>();
        projects.add(project1);
        projects.add(project2);
        employee1.setProjects(projects);

        // Assign employee to the projects
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        project1.setEmployees(employees);
        project2.setEmployees(employees);

        // Persist employee (projects will be persisted due to cascade)
        session.persist(employee1);

        transaction.commit();
        session.close();
        sessionFactory.close();
    }
}