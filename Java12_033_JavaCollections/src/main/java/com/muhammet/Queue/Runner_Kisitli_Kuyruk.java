package com.muhammet.Queue;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Runner_Kisitli_Kuyruk {
    public static void main(String[] args) {
        /**
         * Kuyruğa ekleme işlemlerini kısıtlamak gerekebilir, bunun için kısıtlı kuyrukları
         * kullanmak gereklidir.
         * Kuyruğu tanımlarken, eklenebilecek kapasiteyi tanımlayabiliyoruz.
         * DİKKAT!!!
         * Eğer kuyruk dolmuş ve eklemeye devam ediyorsanız.
         * add(item) -> kuyruk dolu olduğu için hata fırlatır (Queue full Exception)
         * offer(item) -> kuyruğa ekleme yapamaz ise false döner hata fırlatmaz.
         *
         */
        Queue<String> hastaKuyrugu = new ArrayBlockingQueue<>(3);
        System.out.println(hastaKuyrugu.add("1. hasta"));
        System.out.println(hastaKuyrugu.add("2. hasta"));
        System.out.println(hastaKuyrugu.add("3. hasta"));
        System.out.println(hastaKuyrugu.offer("4. hasta"));
        System.out.println(hastaKuyrugu.offer("5. hasta"));
        System.out.println(hastaKuyrugu.offer("6. hasta"));
        hastaKuyrugu.forEach(System.out::println);

    }
}
