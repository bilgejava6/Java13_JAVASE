package com.muhammed.entity;

import java.util.Random;

public class Urun {
    /**
     * DİKKAT!!!!!
     * Bilinen en küçük yapı taşımız Java için
     * POJO dur
     * Plain Old Java Object
     * Araştırınız....
     */
    Long id;
    String ad;
    String marka;
    String model;
    double fiyat;

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    public Urun() {
    }

    public Urun(String ad, String marka, String model, double fiyat) {
        this.ad = ad;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
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

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
