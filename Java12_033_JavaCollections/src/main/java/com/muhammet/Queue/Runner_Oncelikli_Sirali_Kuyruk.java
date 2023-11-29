package com.muhammet.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Runner_Oncelikli_Sirali_Kuyruk {
    public static void main(String[] args) {
        /**
         * Metin:   a...z
         * Sayı:    0...9
         */
        Queue<String> siraliKuyruk = new PriorityQueue<>();
        PriorityQueue<Integer> sayiKuyrugu = new PriorityQueue<>();
        sayiKuyrugu.add(300);
        sayiKuyrugu.add(40);
        sayiKuyrugu.add(1235);
        sayiKuyrugu.add(90);
        sayiKuyrugu.add(-100);
        sayiKuyrugu.add(50);
        System.out.println("***** SAYI KUYRUĞU *****");
        sayiKuyrugu.forEach(System.out::println);
        System.out.println("-------------------------------");
        Integer okunanSayi = sayiKuyrugu.remove();
        System.out.println("Okunan Sayı.....: "+ okunanSayi);
        okunanSayi = sayiKuyrugu.remove();
        System.out.println("Okunan Sayı.....: "+ okunanSayi);
        okunanSayi = sayiKuyrugu.remove();
        System.out.println("Okunan Sayı.....: "+ okunanSayi);
        okunanSayi = sayiKuyrugu.remove();
        System.out.println("Okunan Sayı.....: "+ okunanSayi);
        okunanSayi = sayiKuyrugu.remove();
        System.out.println("Okunan Sayı.....: "+ okunanSayi);
        okunanSayi = sayiKuyrugu.remove();
        System.out.println("Okunan Sayı.....: "+ okunanSayi);
        sayiKuyrugu.poll();
    }
}
