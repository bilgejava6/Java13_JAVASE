package com.muhammet.RepositoryOrnek;

import java.util.List;

public class RespositoryFactory<T, ID> implements Repository<T,ID> {
    @Override
    public void save(T t) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }
}
