package com.muhammet.entity;

public class Satis {
    Long id;
    String urunAdi;
    Double fiyat;

    public Satis(String urunAdi, Double fiyat) {
        this.urunAdi = urunAdi;
        this.fiyat = fiyat;
        this.id = (long) (Math.random()*1000);
    }

    @Override
    public String toString() {
        return "Satis{" +
                "id=" + id +
                ", urunAdi='" + urunAdi + '\'' +
                ", fiyat=" + fiyat +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }
}
