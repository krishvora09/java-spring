    package dev.krishvora09.springSecurity.service;

    import dev.krishvora09.springSecurity.dao.UserRepo;
    import dev.krishvora09.springSecurity.model.User;
    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
    import org.springframework.stereotype.Service;

    @Service
    public class UserService {

        @Autowired
        private UserRepo repo;
        private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);

        public User saveUser(User user) {
            user.setPassword(encoder.encode(user.getPassword()));
            return repo.save(user);
        }

    }
