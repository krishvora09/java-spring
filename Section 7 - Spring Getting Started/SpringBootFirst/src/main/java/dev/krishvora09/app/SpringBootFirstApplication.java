package dev.krishvora09.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootFirstApplication.class, args);

//        System.out.println("Hello World");

//        Alien obj = new Alien();
//        obj.code();

//        Alien obj = context.getBean(Alien.class);  // Must use @Component on Alien class
//        obj.code();

//        Computer comp = context.getBean(Computer.class);  // Computer object runs here but
//                                                             would not run in Alien class simply
//        comp.compile();

	}

}
