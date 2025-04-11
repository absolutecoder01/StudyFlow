package com.absolutecoder01.studyflow.service;

import com.absolutecoder01.studyflow.model.User;
import com.absolutecoder01.studyflow.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        // Zwracamy przykładową listę użytkowników
        return Arrays.asList(
            new User(1, "Jan Kowalski", "jan@example.com"),
            new User(2, "Anna Nowak", "anna@example.com"),
            new User(3, "Michał Nowak", "michal@example.com")
        );
    }

    public User createUser(User user) {
        // Zapisanie nowego użytkownika w bazie danych
        return userRepository.save(user);
    }

    // Możesz dodać inne metody, np. usuwanie, edytowanie użytkowników
}
