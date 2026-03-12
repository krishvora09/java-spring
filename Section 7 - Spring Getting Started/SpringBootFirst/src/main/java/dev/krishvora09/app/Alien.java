package dev.krishvora09.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired
    Computer computer;

    public void code() {
//        System.out.println("Coding");
        computer.compile();
    }

}
