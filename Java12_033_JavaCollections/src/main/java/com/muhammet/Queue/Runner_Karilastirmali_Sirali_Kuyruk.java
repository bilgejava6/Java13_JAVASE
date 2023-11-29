package com.muhammet.Queue;

import com.muhammet.Queue.entity.Hasta;

import java.util.PriorityQueue;

public class Runner_Karilastirmali_Sirali_Kuyruk {
    public static void main(String[] args) {
        /**
         *
         * String -> a...z
         *
         *
         */
        PriorityQueue<Hasta> hastaneSirasi = new PriorityQueue<>();
        hastaneSirasi.add(new Hasta("Ahmet Amca", 67,"54355345335"));
        hastaneSirasi.add(new Hasta("Demet", 7,"54355345335"));
        hastaneSirasi.add(new Hasta("kerim can", 3,"54355345335"));
        hastaneSirasi.add(new Hasta("buse", 9,"54355345335"));
        hastaneSirasi.add(new Hasta("kenan", 54,"54355345335"));
        hastaneSirasi.add(new Hasta("burhan", 34,"54355345335"));
        hastaneSirasi.add(new Hasta("gökçe", 77,"54355345335"));
        hastaneSirasi.add(new Hasta("durul", 1,"54355345335"));
        System.out.println("**** HASTA LİSTESİ FOREACH *****");
        hastaneSirasi.forEach(System.out::println);
        System.out.println("----------------------------------------");
        Hasta hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);
        hasta = hastaneSirasi.remove();
        System.out.println(hasta);



    }
}
