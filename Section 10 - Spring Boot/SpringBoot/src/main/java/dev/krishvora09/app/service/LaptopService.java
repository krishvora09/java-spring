package dev.krishvora09.app.service;

import dev.krishvora09.app.repo.LaptopRepository;
import dev.krishvora09.app.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository repo;

    public void addLaptop(Laptop lap) {
        repo.save(lap);
    }

    public boolean isGoodForProg(Laptop lap) {
        return true;
    }
}
