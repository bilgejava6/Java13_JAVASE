package com.muhammet.entity;

import java.sql.ResultSet;

public class Ders {
    int id;
    String ad;



    @Override
    public String toString() {
        return "Ders{" +
                "id=" + id +
                ", ad='" + ad + '\'' +
                '}';
    }

    public Ders(int id, String ad) {
        this.id = id;
        this.ad = ad;
    }

    public Ders(String ad) {
        this.ad = ad;
    }

    public Ders() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }
}
