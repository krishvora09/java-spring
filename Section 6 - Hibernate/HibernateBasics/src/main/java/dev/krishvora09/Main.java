package dev.krishvora09;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student();
//        s1.setsName("Aditya");
//        s1.setRollNo(108);
//        s1.setsAge(22);

//        Student s2 = null;

//        Configuration cfg = new Configuration();
//        cfg.addAnnotatedClass(dev.krishvora09.Student.class);
//        cfg.configure();
//
//        SessionFactory sf = cfg.buildSessionFactory();

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(dev.krishvora09.Student.class)
                .configure()
                .buildSessionFactory();
        Session session = sf.openSession();

//        Inserting the Data
//        Transaction transaction = session.beginTransaction();
//        session.persist(s1);
//        transaction.commit();

//        Fetching the Data
//        s2 = session.find(Student.class, 102);

//        Updating the Data
//        Transaction transaction = session.beginTransaction();
//        session.merge(s1);
//        transaction.commit();

//        Deleting the Data
        s1 = session.find(Student.class, 108);
        Transaction transaction = session.beginTransaction();
        session.remove(s1);
        transaction.commit();

        session.close();
        sf.close();

//        System.out.println(s1);
//        System.out.println(s2);

        System.out.println(s1);
    }
}