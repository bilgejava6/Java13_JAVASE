package com.muhammet;

public class Runner_Operatorler {
    public static void main(String[] args) {
        /**
         * = -> atama operatörü
         * +=, -=, *=, /= %=
         *
         */
        /**
         * Bir günde 24 saat bulunur, bir saatte 60 dakika ve bir dakikada 60 saniye ve 1 saniye 1000 milisaniye dir.
         * size vereceğim zamanın günün hangi saatine eşit olduğunu nasıl bulursunuz?
         *
         */
        long time = 1698163200000L; // 24/10/2023 16:00:00
        time /= 60L*60*1000; // saate
        System.out.println((time%24));

    }
}
