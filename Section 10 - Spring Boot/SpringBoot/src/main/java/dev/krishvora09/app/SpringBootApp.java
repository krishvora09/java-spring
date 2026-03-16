package dev.krishvora09.app;

import dev.krishvora09.app.model.Laptop;
import dev.krishvora09.app.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootApp {
    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringBootApp.class, args);

//        Alien obj = context.getBean(Alien.class);
//        System.out.println(obj.getAge());
//        obj.code();

        LaptopService service = context.getBean(LaptopService.class);

        Laptop lap = context.getBean(Laptop.class);
        service.addLaptop(lap);
    }
}
