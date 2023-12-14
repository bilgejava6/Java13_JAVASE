package com.muhammet.SingletonDesignPattern;

public class Musteri {
    private static Musteri INSTANCE = null;
    private Long id; // 64bit
    private String ad; // 8*X bit
    private String soyad;// 8*X bit
    private String adres;// 8*X bit

    private Musteri(){

    }

    public static Musteri getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Musteri();
        }
        return INSTANCE;
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

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
