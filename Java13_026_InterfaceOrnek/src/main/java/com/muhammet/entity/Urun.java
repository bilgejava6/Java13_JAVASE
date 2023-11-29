package com.muhammet.entity;

import java.util.Random;

public class Urun {
    Long id;
    String ad;
    double fiyat;

    public Urun() {
    }

    public Urun(String ad, double fiyat) {
        this.id = new Random().nextLong();
        this.ad = ad;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", fiyat=" + fiyat +
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

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
