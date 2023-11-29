package com.muhammet.List.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Runner_LinkedList {
    public static void main(String[] args) {

        /**
         * **** Neler Güzel ? Avantajları  ****
         * ----> dinamik bellek yapısını kullanır.
         * ----> boş kayıt bulundurmaz.
         * ----> ihtiyacı olan alanı kullanır ve böylece daha tasarruflu performanslı listeler oluşturur.
         * ----> Başa ve Sona eklemeler O(1) de gerçekleşir. yani iş yükü katsayı olarak 1 diyebiliriz.
         * **** Dezavantajları ****
         * ----> Random erişim yoktur.
         * ----> Araya ekleme işlemi nispeten zordur.
         */


        List<String> ogrenciListesiArray = new ArrayList<>();
        ogrenciListesiArray.add("Ahmet");
        ogrenciListesiArray.add("Canan");
        ogrenciListesiArray.add("Demet");
        ogrenciListesiArray.add("Bahar");
        ogrenciListesiArray.add(null);
        ogrenciListesiArray.add("Hakkı");
        ogrenciListesiArray.forEach(System.out::println);
        System.out.println("--------------------------------");

        LinkedList<String> ogrenciListesiLinkedList = new LinkedList<>();
        //ilk kayıt
        ogrenciListesiLinkedList.addFirst("Hakan");
        ogrenciListesiLinkedList.add("Ahmet");
        ogrenciListesiLinkedList.add("Güneş");
        ogrenciListesiLinkedList.add("Devrim");

        /**
         * Rastgele erişim
         */
        System.out.println(ogrenciListesiArray.get(2));
        System.out.println(ogrenciListesiLinkedList.get(2));

        /**
         * Performans Testi
         */
        ArrayList<String> arrayList = new ArrayList<>();
        LinkedList<String> linkedList = new LinkedList<>();

        long start = System.currentTimeMillis();
        for(int i=0;i<10_000_000;i++)
            arrayList.add(i+"");

        long end = System.currentTimeMillis();
        System.out.println("Array geçen süre....: "+ (end-start));
        start = System.currentTimeMillis();
        for(int i=0;i<10_000_000;i++)
            linkedList.add(i+"");
        end = System.currentTimeMillis();
        System.out.println("LinkedList geçen süre....: "+ (end-start));

        start = System.nanoTime();
        String kayit = arrayList.get(5_000_001);
        end = System.nanoTime();
        System.out.println("Array get time...: "+ (end-start));


        start = System.nanoTime();
        kayit = linkedList.get(5_000_001);
        end = System.nanoTime();
        System.out.println("Linked get time...: "+ (end-start));


    }
}
