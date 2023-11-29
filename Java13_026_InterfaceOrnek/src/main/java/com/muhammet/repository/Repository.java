package com.muhammet.repository;

public interface Repository {
    void save(Object o);
    void update(Object o);
    void delete(Object o);
    void deleteById(Long id);
    Object findById(Long id);
    Object[] findAll();
}
