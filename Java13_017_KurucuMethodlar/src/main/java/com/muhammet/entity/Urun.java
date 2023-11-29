package com.muhammet.entity;

import java.util.UUID;

public class Urun {
    public UUID id;
    public String ad;
    public String barkod;
    public String stok;
    public Double fiyat;

    /**
     * Default constructor kısıtlanarak kullanıma kapatılabilir.
     */
    private Urun(){

    }

    public Urun(String uAd, String uBarkod, Double uFiyat){
        id = UUID.randomUUID();
        ad = uAd;
        barkod = uBarkod;
        fiyat = uFiyat;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", barkod='" + barkod + '\'' +
                ", stok='" + stok + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }
}//class sonu
