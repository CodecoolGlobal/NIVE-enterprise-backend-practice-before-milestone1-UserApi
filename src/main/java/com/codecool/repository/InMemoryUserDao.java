package com.codecool.repository;

import com.codecool.model.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class InMemoryUserDao {
    private Map<Long, User> data = new HashMap<>();
    private long lastId = 1L;

    public List<User> findAll() {
        return data.values().stream().toList();
    }

    public Long save(User user) {
        if(user.getId() == null) user.setId(lastId++);
        data.put(user.getId(), user);
        return user.getId();
    }

    public User findById(Long id) {
        return data.get(id);
    }

    public void deleteById(Long id) {
        data.remove(id);
    }
}
