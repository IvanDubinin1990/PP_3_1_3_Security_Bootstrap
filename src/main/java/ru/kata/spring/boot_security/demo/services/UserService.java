package ru.kata.spring.boot_security.demo.services;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {

    List<User> getAllUsers ();
    void saveUser (User user);
    void deleteUser(Long id);
    Optional<User> findUserByEmail(String email);
    void update(User updatedUser);
}
