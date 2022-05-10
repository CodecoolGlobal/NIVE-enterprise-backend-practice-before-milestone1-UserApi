package com.codecool.repository;

import com.codecool.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

@Repository
public class InMemoryUserDao implements Dao<User> {
    private final Map<Long, User> data = new TreeMap<>();
    private long lastId = 1L;

    @Override
    public List<User> findAll() {
        return data.values().stream().toList();
    }

    @Override
    public Long save(User user) {
        if (user.getId() == null) user.setId(lastId++);
        data.put(user.getId(), user);
        return user.getId();
    }

    @Override
    public User findById(Long id) {
        return data.get(id);
    }

    @Override
    public void deleteById(Long id) {
        data.remove(id);
    }
}
