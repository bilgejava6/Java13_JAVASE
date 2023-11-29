package com.muhammed;

import com.muhammed.entity.Urun;

public class Runner_Urun {
    public static void main(String[] args) {
        Urun urun = new Urun();
        urun.setAd("Şeker");
        urun.setFiyat(234);
        urun.setMarka("A Marka");
        Urun un =
                new Urun("Un",
                        "A Marka",
                        "B Model",
                        551);

        System.out.println(un);
    }
}
