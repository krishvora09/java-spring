package dev.krishvora09;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Alien obj1 = (Alien) context.getBean("alien1");
        Alien obj1 = context.getBean("alien1", Alien.class);
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();

//        Computer comp = context.getBean(Computer.class);
//
////        Desktop obj = (Desktop) context.getBean("comp1");
//        Desktop obj = context.getBean(Desktop.class);



    }
}
