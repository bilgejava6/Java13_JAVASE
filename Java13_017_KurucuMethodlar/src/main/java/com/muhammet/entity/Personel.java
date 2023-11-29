package com.muhammet.entity;

import java.util.Random;

public class Personel {
    public Long id;
    public String ad;
    public String soyad;
    public String telefon;

    /**
     * Default Constructor
     */
    public Personel(){

    }

    public Personel(String pAdi,String pSoyadi, String pTelefon){
        id = new Random().nextLong(1,9999);
        ad = pAdi;
        soyad = pSoyadi;
        telefon = pTelefon;
    }

}
