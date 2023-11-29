package com.muhammet.entity;

import java.util.UUID;

public class Arac {
    public String uuid;
    public String yakitTuru;
    public int hiz;
    public int kdv;
    public int yolcuSayisi;

    public Arac(){
        super();
        System.out.println("Araç sınıfının constructor ı çağırıldı.");
        uuid = UUID.randomUUID().toString();
        kdv = 18;
    }

    public Arac(int yeniKdv){
        System.out.println("Araç parametreli con. çapırıldı.");
        uuid = UUID.randomUUID().toString();
        kdv = yeniKdv;
    }
    //          String ,                int
    public Arac(String yeniYakitTuru, int yeniKdv){
        uuid = UUID.randomUUID().toString();
        yakitTuru = yeniYakitTuru;
        kdv = yeniKdv;
    }



}
