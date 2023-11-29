package com.muhammet.entity;

import java.util.Date;

public class Satis extends BaseEntity{
    Long id;
    Long musteriId;
    Long urunId;
    Integer adet;
    Double fiyat;
    Double toplamFiyat;
    Date satisTarihi;

    @Override
    public String toString() {
        return "Satis{" +
                "id=" + id +
                ", musteriId=" + musteriId +
                ", urunId=" + urunId +
                ", adet=" + adet +
                ", fiyat=" + fiyat +
                ", toplamFiyat=" + toplamFiyat +
                ", satisTarihi=" + satisTarihi +
                '}';
    }

    public Satis() {
    }

    public Satis(Long musteriId, Long urunId, Integer adet, Double fiyat, Double toplamFiyat, Date satisTarihi) {
        this.musteriId = musteriId;
        this.urunId = urunId;
        this.adet = adet;
        this.fiyat = fiyat;
        this.toplamFiyat = toplamFiyat;
        this.satisTarihi = satisTarihi;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMusteriId() {
        return musteriId;
    }

    public void setMusteriId(Long musteriId) {
        this.musteriId = musteriId;
    }

    public Long getUrunId() {
        return urunId;
    }

    public void setUrunId(Long urunId) {
        this.urunId = urunId;
    }

    public Integer getAdet() {
        return adet;
    }

    public void setAdet(Integer adet) {
        this.adet = adet;
    }

    public Double getFiyat() {
        return fiyat;
    }

    public void setFiyat(Double fiyat) {
        this.fiyat = fiyat;
    }

    public Double getToplamFiyat() {
        return toplamFiyat;
    }

    public void setToplamFiyat(Double toplamFiyat) {
        this.toplamFiyat = toplamFiyat;
    }

    public Date getSatisTarihi() {
        return satisTarihi;
    }

    public void setSatisTarihi(Date satisTarihi) {
        this.satisTarihi = satisTarihi;
    }
}
