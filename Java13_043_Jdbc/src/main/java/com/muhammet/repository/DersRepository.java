package com.muhammet.repository;

import com.muhammet.entity.Ders;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DersRepository {
    private CRUD crud;
    private ResultSet rs;

    public DersRepository(){
        crud = new CRUD("OkulDB");
    }

    public void save(Ders ders){
        crud.executeUpdate(SQLQueryBuilder.generateInsert(ders,"tblders"));
    }
    public void update(Ders ders){
        crud.executeUpdate(SQLQueryBuilder.generateUpdate(ders,"tblders"));
    }
    public void delete(int id){
        crud.executeUpdate("delete from tblders where id="+id);
    }
    public List<Ders> findAll(){
        return SQLQueryBuilder.generateList(
                Ders.class,
                "tblders",
                crud.getAllTableRows("select * from tblders")
        );
    }

}
