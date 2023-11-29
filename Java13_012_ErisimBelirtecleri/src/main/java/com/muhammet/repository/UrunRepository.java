package com.muhammet.repository;

import com.muhammet.entity.Urun;

import java.util.Date;

public class UrunRepository {

    public void save(Urun urun){
        System.out.println("Ürün Kayıt Edildi");
        connectionTime();
    }

    public Urun findById(Long id){
        connectionTime();
        return new Urun();
    }

    Urun findByProductName(String name){
        return new Urun();
    }

    protected Urun findByBarcod(String barcode){
        return new Urun();
    }

    private String connectionTime(){
        return new Date().getTime()+"";
    }
}
