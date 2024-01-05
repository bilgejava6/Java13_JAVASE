package com.muhammet.entity;

import com.muhammet.utility.enums.Cinsiyet;
import jakarta.persistence.*;
@NamedQueries(value = {
        @NamedQuery(name = "Secmen.findAll", query = "FROM Secmen s"), // HQL
        @NamedQuery(name = "Secmen.FindById",
                query = "SELECT s FROM Secmen s WHERE s.id = :ahmet_amca_nasilsin") // JPQL
})
@Entity
@Table(name = "tblsecmen")
public class Secmen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(unique = true,length = 11)
    String tckimlik;
    String ad;
    String soyad;
    @Enumerated
    Cinsiyet cinsiyet;

    @Override
    public String toString() {
        return "Secmen{" +
                "id=" + id +
                ", tckimlik='" + tckimlik + '\'' +
                ", ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", cinsiyet=" + cinsiyet +
                '}';
    }

    public Secmen() {
    }

    public Secmen(String tckimlik, String ad, String soyad, Cinsiyet cinsiyet) {
        this.tckimlik = tckimlik;
        this.ad = ad;
        this.soyad = soyad;
        this.cinsiyet = cinsiyet;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(String tckimlik) {
        this.tckimlik = tckimlik;
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

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
