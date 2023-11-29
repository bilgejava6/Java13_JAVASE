package com.muhammet.Queue.entity;

public class Hasta implements Comparable<Hasta>{
    private String ad;
    private Integer yas;
    private String tcNo;

    @Override
    public int compareTo(Hasta o) {
       if(o.getYas()<7 || o.getYas()>64){
           return 1;
       }else
           return -1;

    }

    public Hasta(String ad, Integer yas, String tcNo) {
        this.ad = ad;
        this.yas = yas;
        this.tcNo = tcNo;
    }

    public Hasta() {
    }

    @Override
    public String toString() {
        return "Hasta{" +
                "ad='" + ad + '\'' +
                ", yas=" + yas +
                ", tcNo='" + tcNo + '\'' +
                '}';
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Integer getYas() {
        return yas;
    }

    public void setYas(Integer yas) {
        this.yas = yas;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }
}
