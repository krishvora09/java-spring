package dev.krishvora09;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class LaptopMain {

    public static void main(String[] args) {

//        Laptop l1 = new Laptop();
//        l1.setLid(4);
//        l1.setBrand("Asus");
//        l1.setModel("Strix");
//        l1.setRam(32);

        SessionFactory sf = new Configuration()
                .addAnnotatedClass(Alien.class)
                .addAnnotatedClass(Laptop.class)
                .configure()
                .buildSessionFactory();

        Session session = sf.openSession();

//        Adding The Data
//        Transaction transaction = session.beginTransaction();
//        session.persist(l1);
//        transaction.commit();

        // select * from laptop where ram = 32   --> SQL
        // from Laptop where ram = 32            --> HQL

        String brand = "Asus";

//        Query query = session.createQuery("from Laptop");
//        Query query = session.createQuery("from Laptop where ram = 32", Laptop.class);
//        Query query = session.createQuery("from Laptop where brand like 'Asus'");
//        Query query = session.createQuery("from Laptop where brand like ?1");
//        Query query = session.createQuery("select model from Laptop where brand like ?1");
        Query query = session.createQuery("select brand, model from Laptop where brand like ?1");
        query.setParameter(1, brand);
//        List<Laptop> laptops = query.getResultList();
        List<Object[]> laptops = query.getResultList();

//        Laptop l1 = session.find(Laptop.class, 3);

        for (Object[] data: laptops) {
            System.out.println((String)data[0] + " " + (String)data[1]);
        }

//        System.out.println(l1);
        System.out.println(laptops);

        session.close();

        sf.close();
    }
}
