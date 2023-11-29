package com.muhammet.List.ArrayListOrnek;

import java.util.Random;

public class Arac {
    Long id;
    String plaka;
    String marka;
    String model;
    Double fiyat;
    Durum durum;
    public Arac(String plaka, String marka, String model, Double fiyat) {
        this.id = new Random().nextLong();
        this.durum = Durum.AKTIF;
        this.plaka = plaka;
        this.marka = marka;
        this.model = model;
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "id=" + id +
                ", plaka='" + plaka + '\'' +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", fiyat=" + fiyat +
                ", durum=" + durum +
                '}';
    }
}
