package com.muhammet.Set;
import com.muhammet.List.ArrayListOrnek.Arac;

import java.util.*;

public class Runner {
    public static void main(String[] args) {
        /**
         * Set -> tekrar eden kayıt içermez.
         * HashSet, TreeSet
         * ----- benzersiz kayıtları tutar
         * ----- karma denilen bir yapıda depolama yapar
         * ----- liste içinde boş kayıt içerebilir
         * ----- içinde kayıt olmasa bile default olarak değerleri vardır. ilk başlangıç boyutu 16 dır.
         *       yani default kapasite 16 dır.
         * ----- yük faktörü 0.75 tir.
         */

        List<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Ayten");
        isimler.add("Ali");
        isimler.add("Demir");
        isimler.add("Bahar");
        isimler.add("Canan");
        isimler.add("Emel");
        isimler.add("Fatih");
        isimler.add("Hakan");
        isimler.add("İhsan");
        isimler.add("Murat");
        isimler.add("Ali");
        isimler.add("Bahar");
        isimler.add("Ali");
        isimler.add("Emel");
        System.out.println("**** ARRAYLIST ****");
        System.out.println("Size....: "+ isimler.size());
        isimler.forEach(System.out::println);


        System.out.println("---------------------------------");

        Set<String> tekilListe = new HashSet<>();
        Set<String> tekil = new TreeSet<>();
        tekilListe.add("Ali");
        tekilListe.add("Ayten");
        tekilListe.add("Ali");
        tekilListe.add("Demir");
        tekilListe.add("Bahar");
        tekilListe.add("Canan");
        tekilListe.add("Emel");
        tekilListe.add("Fatih");
        tekilListe.add("Hakan");
        tekilListe.add("İhsan");
        tekilListe.add("Murat");
        tekilListe.add("Ali");
        tekilListe.add("Bahar");
        tekilListe.add("Ali");
        tekilListe.add("Emel");

        System.out.println("**** HASHSET *****");
        System.out.println("Size...: "+ tekilListe.size());
        tekilListe.forEach(System.out::println);
        System.out.println("**** SIRALI TEKİL LİSTE");
        SortedSet<String> siraliTekilListe = new TreeSet<>();
        siraliTekilListe.add("Ali");
        siraliTekilListe.add("Ayten");
        siraliTekilListe.add("Ali");
        siraliTekilListe.add("Demir");
        siraliTekilListe.add("Bahar");
        siraliTekilListe.add("Canan");
        siraliTekilListe.add("Emel");
        siraliTekilListe.add("Fatih");
        siraliTekilListe.add("Hakan");
        siraliTekilListe.add("Ihsan");
        siraliTekilListe.add("Murat");
        siraliTekilListe.add("Ali");
        siraliTekilListe.add("Bahar");
        siraliTekilListe.add("Ali");
        siraliTekilListe.add("Emel");
        siraliTekilListe.forEach(System.out::println);

    }
}
