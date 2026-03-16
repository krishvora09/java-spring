package dev.krishvora09;

import dev.krishvora09.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean("Beast", Desktop.class);
//        Desktop dt = context.getBean(Desktop.class);
//        dt.compile();
//
//        Desktop dt1 = context.getBean(Desktop.class);
//        dt1.compile();

        Alien obj1 = context.getBean(Alien.class);
//        obj1.setAge(21);
        System.out.println(obj1.getAge());
        obj1.code();
    }
}
