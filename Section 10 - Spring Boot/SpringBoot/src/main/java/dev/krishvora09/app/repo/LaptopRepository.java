package dev.krishvora09.app.repo;

import dev.krishvora09.app.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {

    public void save(Laptop lap) {
        System.out.println("Saved in Database");
    }
}
