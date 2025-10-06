package com.example.demo.controller;

import com.example.demo.entity.UserEntity;
import com.example.demo.repo.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository repo;

    public UserController(UserRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<UserEntity> allUsers() {
        return repo.findAll();
    }

    @PostMapping
    public UserEntity addUser(@RequestBody UserEntity user) {
        return repo.save(user);
    }
}
