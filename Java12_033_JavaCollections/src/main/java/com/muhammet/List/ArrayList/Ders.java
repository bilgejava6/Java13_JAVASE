package com.muhammet.List.ArrayList;

public class Ders {
    String ad;
    String ogretmenAdi;
    int not1;
    int not2;

    @Override
    public String toString() {
        return "Ders{" +
                "ad='" + ad + '\'' +
                ", ogretmenAdi='" + ogretmenAdi + '\'' +
                ", not1=" + not1 +
                ", not2=" + not2 +
                '}';
    }

    public Ders(String ad, String ogretmenAdi) {
        this.ad = ad;
        this.ogretmenAdi = ogretmenAdi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getOgretmenAdi() {
        return ogretmenAdi;
    }

    public void setOgretmenAdi(String ogretmenAdi) {
        this.ogretmenAdi = ogretmenAdi;
    }

    public int getNot1() {
        return not1;
    }

    public void setNot1(int not1) {
        this.not1 = not1;
    }

    public int getNot2() {
        return not2;
    }

    public void setNot2(int not2) {
        this.not2 = not2;
    }
}
