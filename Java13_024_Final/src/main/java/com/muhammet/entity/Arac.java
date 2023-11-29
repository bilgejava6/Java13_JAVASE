package com.muhammet.entity;

public class Arac {
    public String id;
    public String marka;
    public String model;

    public int hiz;

    public void hizlan(){
        hiz+=5;
    }

    public final void dur(){
        hiz =0;
    }
}
