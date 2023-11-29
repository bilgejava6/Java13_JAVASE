package com.muhammet.entity;

import java.util.Date;

public class Musteri extends BaseEntity{
    Long id;
    String ad;
    String adres;
    String telefon;
    Date uyelikTarihi;

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                ", uyelikTarihi=" + uyelikTarihi +
                '}';
    }

    public Musteri() {
    }

    public Musteri(String ad, String adres, String telefon, Date uyelikTarihi) {
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.uyelikTarihi = uyelikTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Date getUyelikTarihi() {
        return uyelikTarihi;
    }

    public void setUyelikTarihi(Date uyelikTarihi) {
        this.uyelikTarihi = uyelikTarihi;
    }
}
