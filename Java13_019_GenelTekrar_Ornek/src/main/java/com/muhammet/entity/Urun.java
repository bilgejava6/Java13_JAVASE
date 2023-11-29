package com.muhammet.entity;

public class Urun extends BaseEntity{
    Long id;
    String marka;
    String model;
    String ad;
    Double fiyat;
    Integer stok;

    public Urun() {
    }

    public Urun(String marka, String model, String ad, Double fiyat, Integer stok) {
        this.marka = marka;
        this.model = model;
        this.ad = ad;
        this.fiyat = fiyat;
        this.stok = stok;
    }

    @Override
    public String toString() {
        return "Urun{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", ad='" + ad + '\'' +
                ", fiyat=" + fiyat +
                ", stok=" + stok +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }
}
