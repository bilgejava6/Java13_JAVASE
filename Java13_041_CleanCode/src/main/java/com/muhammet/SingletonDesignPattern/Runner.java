package com.muhammet.SingletonDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Musteri musteri = Musteri.getInstance();
        List<Musteri> musteriList = new ArrayList<>();
        musteri.setAd("Ali");
        musteriList.add(musteri);
        System.out.println(musteri);
        // kaydetme işlemi
        musteri = Musteri.getInstance();
        musteri.setAd("Deniz");
        musteriList.add(musteri);
        System.out.println(musteri);
        // kaydetme işlemi
        musteri = Musteri.getInstance();
        musteri.setAd("Veli");
        musteriList.add(musteri);
        System.out.println(musteri);
        // kaydetme işlemi

        musteriList.forEach(m->{
            System.out.println(m.getAd());
        });

    }
}
