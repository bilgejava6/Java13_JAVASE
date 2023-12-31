package com.muhammet.repository;

import java.util.List;
import java.util.Optional;

/**
 * Generic Class -> Class<?>
 */
public interface Repository<T> {
    boolean save(T entity);
    boolean update(T entity);
    boolean delete(Long id);
    List<T> findAll();
    Optional<T>  findById(Long id);
}
