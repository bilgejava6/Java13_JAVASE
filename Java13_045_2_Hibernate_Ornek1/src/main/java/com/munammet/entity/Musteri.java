package com.munammet.entity;

import jakarta.persistence.*;

/**
 * POJO -> Plain Old Java Object
 */
@Entity
@Table(name = "tbl_musteri")
public class Musteri {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String adres;

    @Override
    public String toString() {
        return "Musteri{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }

    public Musteri() {
    }

    public Musteri(String ad, String adres) {
        this.ad = ad;
        this.adres = adres;
    }

    public Musteri(Long id, String ad, String adres) {
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
