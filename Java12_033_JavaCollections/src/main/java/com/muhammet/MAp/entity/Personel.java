package com.muhammet.MAp.entity;

public class Personel {
    Long id;
    String ad;
    String adres;
    Departman departman;

    @Override
    public String toString() {
        return "Personel{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                ", departman=" + departman +
                '}';
    }

    public Personel(Long id, String ad, String adres, Departman departman) {
        this.id = id;
        this.ad = ad;
        this.adres = adres;
        this.departman = departman;
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

    public Departman getDepartman() {
        return departman;
    }

    public void setDepartman(Departman departman) {
        this.departman = departman;
    }
}
