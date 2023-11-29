package com.muhammet.List.ArrayListOrnek;

import java.util.ArrayList;

public class Runner_Array_Ornek {
    public static void main(String[] args) {
        /**
         * Galericinin araclarının Listesini görmek istiyoruz.
         * önce ekleyeceğiz. sonra listeleme işlemi yapacağız.
         */
        Arac arac1 = new Arac("06 AAA", "BMW", "i7",5_000_000D);
        Arac arac2 = new Arac("06 AAAB", "BMW", "i8",6_000_000D);
        Arac arac3 = new Arac("06 AAAC", "BMW", "i9",9_500_000D);
        Arac arac4 = new Arac("06 AAAD", "BMW", "i10",15_000_000D);

        ArrayList<Arac> araclar = new ArrayList<>();
        araclar.add(arac1);
        araclar.add(arac2);
        araclar.add(arac3);
        araclar.add(arac4);

        /**
         * Ekrana Yazdıralım.
         */
        System.out.println(araclar);
        System.out.println("------------------------------");
        for(Arac arac: araclar){
            System.out.println(arac);
        }
        System.out.println("-------------------------------");
        araclar.forEach(System.out::println);
        System.out.println("------------------------------");
        araclar.forEach(arac->{
            System.out.println(arac.id);
            System.out.println(arac.marka);
            System.out.println(arac.model);
            System.out.println("------");
        });
        System.out.println("--------------------------------");
        for (int i=0;i<araclar.size();i++)
            System.out.println(araclar.get(i));
    }
}
