package com.codecool.controller;

import com.codecool.model.User;
import com.codecool.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User> findAll() {
        return userService.findAll();
    }

    @PostMapping("/user")
    public Long save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/user/{id}")
    public Long save(@PathVariable("id") Long id, @RequestBody User user) {
        user.setId(id);
        return userService.save(user);
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @DeleteMapping("/user/{id}")
    public void deleteById(@PathVariable("id") Long id) {
        userService.deleteById(id);
    }
}
