package com.muhammet;

public class Runner {
    public static void main(String[] args) {


        OzelDiziSinifi dizi = new OzelDiziSinifi();
        dizi.add("Muhammet");
        for (String musteri: dizi.getDizi()) {
            System.out.println(musteri);
        }
        System.out.println("--------------------");
        System.out.println();
        dizi.add("Bahar");
        for (String musteri: dizi.getDizi()) {
            System.out.println(musteri);
        }
        System.out.println("--------------------");
        System.out.println();
        dizi.add("Deniz");
        for (String musteri: dizi.getDizi()) {
            System.out.println(musteri);
        }


        /**
        String[] musteriListesi = new String[3];
        musteriListesi[0] = "murat taş";
        musteriListesi[1] = "tekin bakır";
        musteriListesi[2] = "gül haki";
        System.out.println(musteriListesi);
        for (String musteri: musteriListesi) {
            System.out.println(musteri);
        }

       // musteriListesi[3] = "ahmet tut";

        */
    }
}
