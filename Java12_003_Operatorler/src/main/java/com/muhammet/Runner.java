package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         * 1. Aritmetik Operatörler
         * ---- +, -, *, /, %
         */
        int s1 = 5;
        int s2 = 78;
        // + -> Toplama Operatörü  => günlük  hayatta 5 + 9 = 14

        int toplam = s1 + s2;
        System.out.println("Toplam: " + toplam);
        // - -> Çıkartma Operatörü
        int fark = s1 - s2;
        System.out.println("Fark: " + fark);

        // * -> Çarpma Operatörü
        int carpim = s1 * s2;
        System.out.println("Çarpım: " + carpim);

        // / -> Bölme Operatörü
        int bolum = s1 / s2; // ?
        System.out.println("Bölüm: " + bolum);// 0

        bolum = (int)(5d / 78d);
        System.out.println("Bölüm: " + bolum); // 0

        double bolum_d = (int)(5d / 78d); // 1. (0,0641025641025641) -> 2. cast -> 0 -> 3. atama -> 0.0
        System.out.println("Bölüm_d: " + bolum_d); //

        double bolum_d1 = 5d / 78d;
        System.out.println("Bölüm_d1: " + bolum_d1); //

        double bolum_d2 = 5d / s2;
        System.out.println("Bölüm_d2: " + bolum_d2); //

        // % -> Mod Alma Operatörü
        // 15 mod 4 => 3
        int mod = 15 % 4;
        System.out.println("Mod: " + mod);

        // Bugün Perşembe 134 gün sonra hangi gündür?
        int gun = 134;
        int artikgun = gun % 7;
        System.out.println("Bugün Perşembe 134 gün sonra hangi gündür? " + artikgun);


    }
}
