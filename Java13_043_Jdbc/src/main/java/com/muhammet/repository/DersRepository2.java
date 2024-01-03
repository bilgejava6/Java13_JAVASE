package com.muhammet.repository;

import com.muhammet.entity.Ders;

public class DersRepository2 extends CrudRepository<Ders>{
    public DersRepository2(){
        super(new Ders(),"tblders");
    }
}
