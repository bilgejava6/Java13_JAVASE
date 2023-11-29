package com.muhammet.MAp.entity;

public class Departman {
    Long id;
    String ad;

    public Departman(Long id, String ad) {
        this.id = id;
        this.ad = ad;
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
}
