package com.muhammet;

import com.muhammet.entity.Urun;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {
        Urun urun = new Urun();
        urun.setCreateAt(new Date());
        urun.setUpdateAt(new Date());
        urun.setActive(true);
        urun.setAd("Şeker");
    }
}
