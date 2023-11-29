package com.muhammet.entity;

public class Personel {
    public Long id;
    public String ad;
    public String soyad;
    public String tcKimlik;
    public String telefon;
    public String email;
    public String profilResmi;

    /**
     * Bu method Personel sınıfı içinde var olan
     * tüm özelliklerini bir listesini String olarak döner.
     * @return
     */
    public String toString(){
        return "Personel: [" +
                "id: " +id+ ", " +
                "ad: " +ad+ ", " +
                "soyad: " +soyad+ ", " +
                "tcKimlik: " +tcKimlik+ ", " +
                "telefon: " +telefon+ ", " +
                "email: " +email+ ", " +
                "profilResmi: " +profilResmi+ ", " +
                "]";
    }
}
