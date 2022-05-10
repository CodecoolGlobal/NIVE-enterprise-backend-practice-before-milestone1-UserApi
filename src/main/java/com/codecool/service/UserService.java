package com.codecool.service;

import com.codecool.model.User;
import com.codecool.repository.Dao;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final Dao<User> userDao;

    public UserService(Dao<User> userDao) {
        this.userDao = userDao;
    }

    public List<User> findAll() {
        return userDao.findAll();
    }

    public Long save(User user) {
        return userDao.save(user);
    }

    public User findById(Long id) {
        return userDao.findById(id);
    }

    public void deleteById(Long id) {
        userDao.deleteById(id);
    }

    public List<User> findEnabledUsers() {
        return userDao.findAll().stream()
                .filter(User::isEnabled)
                .toList();
    }

    public List<User> findUsersByRole(String role) {
        return userDao.findAll().stream()
                .filter(u -> u.getRoles().contains(role))
                .toList();
    }
}
