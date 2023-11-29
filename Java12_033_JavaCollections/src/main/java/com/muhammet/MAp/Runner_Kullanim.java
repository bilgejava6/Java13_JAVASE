package com.muhammet.MAp;

import java.util.*;

public class Runner_Kullanim {
    public static void main(String[] args) {
        /**
         * Zaman,
         * günler -> {"Pazartesi","Salı","Çarşamba,"Perşembe"....}
         * aylar ->
         * mevsimler->
         */
        Map<Zaman, List<String>> zaman = new HashMap<>();
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        //gunler = new ArrayList<>(){"","",""};
        gunler = List.of("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar");
        gunler = Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar");
        /**
         * Ekleme
         */
        zaman.put(Zaman.GUNLER,gunler);
        zaman.put(Zaman.AYLAR, List.of("Ocak","Şubat","Mart","Nisan"));
        zaman.put(Zaman.MEVSIMLER,Arrays.asList("İlk Bahar","Yaz","Son Bahar","Kış"));
        /**
         * Okuma
         */
        List<String> result = zaman.get(Zaman.GUNLER);
        System.out.println(result);
        System.out.println("---------------------");
        System.out.println(zaman.get(Zaman.MEVSIMLER));

        /**
         * Map içinde dolaşmak
         */
        result.forEach(g->{

        });
        System.out.println("******* FOREACH KULLANIMI ********");
        /**
         * [K,V]
         * 0-> Zaman.GUNLER, {Pazartesi,Salı....}
         * 1-> Zaman.AYLAR, {}
         * 2-> Zaman,MEVSIMLER, {}
         *
         */
        zaman.forEach((k,v)->{
            System.out.println(k);
            System.out.println(v);
            System.out.println("---------------------------");
        });




    }
}

enum Zaman{
    GUNLER,
    AYLAR,
    MEVSIMLER
}