package dev.krishvora09.springSecurity.dao;

import dev.krishvora09.springSecurity.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUsername(String username);

}