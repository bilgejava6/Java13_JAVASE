package com.muhammet.entity;

import java.util.Random;

public class Satis {
    Long id;
    Long urunId;
    String musteri;
    double birimFiyat;
    int adet;
    double toplamFiyat;

    public Satis() {
    }

    public Satis(Long urunId, String musteri, double birimFiyat, int adet, double toplamFiyat) {
        this.id = new Random().nextLong();
        this.urunId = urunId;
        this.musteri = musteri;
        this.birimFiyat = birimFiyat;
        this.adet = adet;
        this.toplamFiyat = toplamFiyat;
    }

    @Override
    public String toString() {
        return "Satis{" +
                "id=" + id +
                ", urunId=" + urunId +
                ", musteri='" + musteri + '\'' +
                ", birimFiyat=" + birimFiyat +
                ", adet=" + adet +
                ", toplamFiyat=" + toplamFiyat +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public String getMusteri() {
        return musteri;
    }

    public void setMusteri(String musteri) {
        this.musteri = musteri;
    }

    public double getBirimFiyat() {
        return birimFiyat;
    }

    public void setBirimFiyat(double birimFiyat) {
        this.birimFiyat = birimFiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }
}
