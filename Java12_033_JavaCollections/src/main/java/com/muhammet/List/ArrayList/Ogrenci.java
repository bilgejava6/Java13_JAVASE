package com.muhammet.List.ArrayList;

import java.util.List;
import java.util.UUID;

public class Ogrenci {
    String id;
    String ad;
    String adres;
    /**
     * Öğrencinin dersleri
     */
    List<Ders> dersListesi;

    public Ogrenci(){
        this.id = UUID.randomUUID().toString();
    }

    public Ogrenci(String ad,String adres){
        this();
        this.ad = ad;
        this.adres = adres;
    }

    public Ogrenci(String ad, String adres, List<Ders> dersListesi) {
        this();
        this.ad = ad;
        this.adres = adres;
        this.dersListesi = dersListesi;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                ", dersListesi=" + dersListesi +
                '}';
    }

    public String getId() {
        return id;
    }


    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Ders> getDersListesi() {
        return dersListesi;
    }

    public void setDersListesi(List<Ders> dersListesi) {
        this.dersListesi = dersListesi;
    }
}
