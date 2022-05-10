package com.codecool.repository;

import com.codecool.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();

    Long save(User user);

    User findById(Long id);

    void deleteById(Long id);
}
