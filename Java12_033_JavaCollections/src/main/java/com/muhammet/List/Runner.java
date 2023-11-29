package com.muhammet.List;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        /**
         * Çok biçimlilik
         */
        List<String> musteriIsimleri = new ArrayList<>();
        /**
         * add(value) -> listeye kayıt eklemek için kullanılır.
         * add(index,value) -> listede istenilen konuma kayıt eklemek için kullanılır.
         * DİKKAT!!! eğer girilen index sınırların dışında yani dizinin böyle bir index i yok ise
         * uygulama istisna fırlatır.
         */
        musteriIsimleri.add("Murat");
        musteriIsimleri.add("Tekim");
        musteriIsimleri.add("bahar");
        musteriIsimleri.add("Elif");
        musteriIsimleri.add(1,"gül");
        // musteriIsimleri.add(100,"betül"); Exception -> IndexOutOfBoundException

        /**
         * Okuma İşlemi
         * get(index) -> var olan kaydı getirir.
         */
        System.out.println("2. index teki müşteri......: "+musteriIsimleri.get(2));

        /**
         * Bir liste içinde dolaşarak bilgilerini okuma işlemi
         * 1-> foreach
         * 2-> for
         * 3-> lambda expressions
         */
        System.out.println("--------------------------");
        System.out.println("*****    foreach    ******");
        for(String musteri: musteriIsimleri){
            System.out.println(musteri);
        }
        System.out.println("--------------------------");
        System.out.println("*****      for      ******");
        for (int i=0;i<musteriIsimleri.size();i++){
            System.out.println(musteriIsimleri.get(i));
        }
        System.out.println("--------------------------");
        System.out.println("*****     stream    ******");
        musteriIsimleri.forEach(m-> System.out.println(m));
        System.out.println("--------------------------");
        System.out.println("*****     stream-2  ******");
        musteriIsimleri.forEach(System.out::println);
    }
}
