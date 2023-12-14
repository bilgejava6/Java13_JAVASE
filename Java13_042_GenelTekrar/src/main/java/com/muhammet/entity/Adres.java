package com.muhammet.entity;

public class Adres {
    Long id;
    Long musteriId;
    String sehir;
    String mahalle;
    String apartman;

    public Long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Long musteriId) {
        this.musteriId = musteriId;
    }

    @Override
    public String toString() {
        return "Adres{" +
                "id=" + id +
                ", sehir='" + sehir + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", apartman='" + apartman + '\'' +
                '}';
    }

    public Adres(String sehir, String mahalle, String apartman,Long musteriId) {
        this.sehir = sehir;
        this.mahalle = mahalle;
        this.apartman = apartman;
        this.musteriId = musteriId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getApartman() {
        return apartman;
    }

    public void setApartman(String apartman) {
        this.apartman = apartman;
    }
}
