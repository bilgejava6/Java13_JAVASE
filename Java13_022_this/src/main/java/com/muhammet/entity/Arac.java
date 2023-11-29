package com.muhammet.entity;

import java.util.UUID;

public class Arac {
    String id;
    String yakitTuru;
    int hiz;
    int yolcuKapasitesi;

    public Arac(){
        id = UUID.randomUUID().toString();
    }

    public Arac(int hiz){
        this();
        this.hiz = hiz;
    }

    public Arac(int hiz, int yolcuKapasitesi){
        this(hiz);
        this.yolcuKapasitesi = yolcuKapasitesi;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "id='" + id + '\'' +
                ", yakitTuru='" + yakitTuru + '\'' +
                ", hiz=" + hiz +
                ", yolcuKapasitesi=" + yolcuKapasitesi +
                '}';
    }

    /**
     * this keyword -> bu sınıf diye düşünebilirsiniz.
     *
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYakitTuru() {
        return yakitTuru;
    }

    public void setYakitTuru(String yakitTuru) {
        this.yakitTuru = yakitTuru;
    }

    public int getHiz() {
        return hiz;
    }

    public void setHiz(int hiz) {
        this.hiz = hiz;
    }

    public int getYolcuKapasitesi() {
        return yolcuKapasitesi;
    }

    public void setYolcuKapasitesi(int yolcuKapasitesi) {
        this.yolcuKapasitesi = yolcuKapasitesi;
    }
}
