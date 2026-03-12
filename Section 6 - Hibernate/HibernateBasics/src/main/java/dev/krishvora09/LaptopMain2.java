package dev.krishvora09;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LaptopMain2 {

    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

//        Laptop laptop = session.find(Laptop.class, 2);
//        Laptop laptop = session.getReference(Laptop.class, 2);
//        System.out.println(laptop);

        Laptop l1 = session.find(Laptop.class, 2);
        System.out.println(l1);

        session.close();

        Session session1 = sf.openSession();

        Laptop l2 = session1.find(Laptop.class, 2);
        System.out.println(l2);

        session1.close();

        sf.close();
    }
}
