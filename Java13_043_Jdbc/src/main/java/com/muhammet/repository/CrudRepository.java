package com.muhammet.repository;

import java.sql.ResultSet;
import java.util.List;

public abstract class CrudRepository<T> {
    private T t;
    private String tableName;
    private  CRUD crud;
    private ResultSet resultSet;

    public CrudRepository(T entity, String tableName){
        this.t = entity;
        this.tableName = tableName;
        crud = new CRUD("OkulDB");
    }
    public void save(T t){
        crud.executeUpdate(SQLQueryBuilder.generateInsert(t,tableName));
    }

    public void update(T t){
        crud.executeUpdate(SQLQueryBuilder.generateUpdate(t,tableName));
    }

    public void delete(int id){
        crud.executeUpdate("select * from "+tableName+" where id="+id);
    }

    public List<T> findAll(){
        resultSet = crud.getAllTableRows("select * from "+tableName);
        return (List<T>) SQLQueryBuilder.generateList(t.getClass(),tableName,resultSet);
    }
}
