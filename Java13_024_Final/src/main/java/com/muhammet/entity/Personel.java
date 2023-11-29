package com.muhammet.entity;

public class Personel {
    public final String departmanAdi;
    public String id;
    public String ad;
    public String adres;
    public Personel(String departmanAdi){
        this.departmanAdi = departmanAdi;
    }

    @Override
    public String toString() {
        return "Personel{" +
                "departmanAdi='" + departmanAdi + '\'' +
                ", id='" + id + '\'' +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
