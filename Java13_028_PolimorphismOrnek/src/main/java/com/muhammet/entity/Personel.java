package com.muhammet.entity;

public class Personel implements Tanim{
    private String isim;
    private Double maas;
    private String unvan;

    public void hesapla(){

    }

    public Personel(String isim, Double maas, String unvan) {
        this.isim = isim;
        this.maas = maas;
        this.unvan = unvan;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public Double getMaas() {
        return maas;
    }

    public void setMaas(Double maas) {
        this.maas = maas;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
}
