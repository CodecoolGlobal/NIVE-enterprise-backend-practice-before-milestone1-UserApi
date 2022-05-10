package com.codecool.repository;

import java.util.List;

public interface Dao<E> {
    List<E> findAll();

    Long save(E entity);

    E findById(Long id);

    void deleteById(Long id);
}
