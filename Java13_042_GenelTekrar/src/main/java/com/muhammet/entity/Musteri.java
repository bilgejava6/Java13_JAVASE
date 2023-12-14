package com.muhammet.entity;

import java.util.List;

public class Musteri {
    private Long id;
    private  String ad;
    private String tel;
    List<Adres> adres;

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", tel='" + tel + '\'' +
                ", adres=" + adres +
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public List<Adres> getAdres() {
        return adres;
    }

    public void setAdres(List<Adres> adres) {
        this.adres = adres;
    }

    public Musteri(Long id,String ad, String tel, List<Adres> adres) {
        this.ad = ad;
        this.tel = tel;
        this.adres = adres;
        this.id = id;
    }
}
