package com.muhammet.entity;

public class Memur extends Personel{

    public Memur(String isim, Double maas){
        super(isim,maas,"Memur");
    }

    public void hesapla(){
        setMaas(20_000d);
    }
}
