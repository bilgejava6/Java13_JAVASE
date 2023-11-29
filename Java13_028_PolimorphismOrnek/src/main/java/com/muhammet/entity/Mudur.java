package com.muhammet.entity;

public class Mudur extends Personel{

    public Mudur(String isim,Double maas){
        super(isim,maas,"Müdür");
    }

    public void hesapla(){
        setMaas(35_000d);
    }
}
