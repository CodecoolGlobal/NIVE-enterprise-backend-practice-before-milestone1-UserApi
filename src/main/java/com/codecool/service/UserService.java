package com.codecool.service;

import com.codecool.model.User;
import com.codecool.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

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
