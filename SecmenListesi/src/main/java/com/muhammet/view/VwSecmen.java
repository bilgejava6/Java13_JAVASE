package com.muhammet.view;

public class VwSecmen {
    String ad;
    String tckimlik;

    public VwSecmen(String ad, String tckimlik) {
        this.ad = ad;
        this.tckimlik = tckimlik;
    }

    @Override
    public String toString() {
        return "VwSecmen{" +
                "ad='" + ad + '\'' +
                ", tckimlik='" + tckimlik + '\'' +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public String getTckimlik() {
        return tckimlik;
    }
}
