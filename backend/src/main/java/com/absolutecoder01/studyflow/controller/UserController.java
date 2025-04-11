package com.absolutecoder01.studyflow.controller;

import com.absolutecoder01.studyflow.model.User;
import com.absolutecoder01.studyflow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api")
public class UserController {
    @GetMapping("/users")
    public List<User> getUsers() {
        return List.of(
            new User(1, "user1", "user1@example.com"),
            new User(2, "user2", "user2@example.com")
        );
    }

}
