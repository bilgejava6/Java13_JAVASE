package com.muhammet.RepositoryOrnek;

import java.util.List;

public interface Repository<T,ID> {
    void save(T t);
    void update(T t);
    void delete(T t);
    T findById(ID id);
    List<T> findAll();
}
