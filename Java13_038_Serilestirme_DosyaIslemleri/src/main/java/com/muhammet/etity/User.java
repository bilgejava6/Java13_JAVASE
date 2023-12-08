package com.muhammet.etity;

import java.io.Serializable;
import java.util.Random;

public class User implements Serializable {
    Long id;
    String ad;
    String adres;
    String telefon;

    public User(String ad, String adres, String telefon) {
        this.ad = ad;
        this.adres = adres;
        this.telefon = telefon;
        this.id = new Random().nextLong();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                ", telefon='" + telefon + '\'' +
                '}';
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
}
