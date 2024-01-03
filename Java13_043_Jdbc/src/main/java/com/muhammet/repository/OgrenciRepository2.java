package com.muhammet.repository;

import com.muhammet.entity.Ogrenci;

public class OgrenciRepository2 extends CrudRepository<Ogrenci> {
    public OgrenciRepository2(){
        super(new Ogrenci(),"tblogrenci");
    }
}
