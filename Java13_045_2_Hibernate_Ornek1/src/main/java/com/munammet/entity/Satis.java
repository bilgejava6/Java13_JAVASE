package com.munammet.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tbl_satis")
public class Satis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long musteriid;
    String urun;

    @Override
    public String toString() {
        return "Satis{" +
                "id=" + id +
                ", musteriid=" + musteriid +
                ", urun='" + urun + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMusteriid() {
        return musteriid;
    }

    public void setMusteriid(Long musteriid) {
        this.musteriid = musteriid;
    }

    public String getUrun() {
        return urun;
    }

    public void setUrun(String urun) {
        this.urun = urun;
    }

    public Satis() {
    }

    public Satis(Long musteriid, String urun) {
        this.musteriid = musteriid;
        this.urun = urun;
    }

    public Satis(Long id, Long musteriid, String urun) {
        this.id = id;
        this.musteriid = musteriid;
        this.urun = urun;
    }
}
