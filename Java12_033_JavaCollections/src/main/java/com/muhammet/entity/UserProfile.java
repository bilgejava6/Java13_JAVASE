package com.muhammet.entity;

public class UserProfile {
    Long id;
    String ad;
    String adres;

    @Override
    public String toString() {
        return "UserProfile{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }

    public UserProfile(Long id, String ad, String adres) {
        this.id = id;
        this.ad = ad;
        this.adres = adres;
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
}
