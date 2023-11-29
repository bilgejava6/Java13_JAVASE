package com.muhammet;

public class Runner_Gorev_Operatorleri {

    public static void main(String[] args) {
        /**
         * Assignment Operator - Görev Operatörleri
         * bu operatörler atama işlemlerinde görev alır ve aritmetik işlemlerle birleşerek daha
         * kısa kullanımlara olanak sağlar.
         */
        // = atama operatörü
        int sayi;
        sayi = 10;
        System.out.println("sayi = " + sayi); // 10
        // += toplama ve atama operatörü
        sayi = sayi + 5;
        System.out.println("sayi = " + sayi); // 15
        sayi += 20;
        System.out.println("sayi = " + sayi); // 35
        // -=, /= , *=, %= gibi operatörler de vardır.
        sayi -= 5;
        System.out.println("sayi = " + sayi); // 30
        sayi *= 3;
        System.out.println("sayi = " + sayi); // 90
        sayi /= 2;
        System.out.println("sayi = " + sayi); // 45
        sayi %= 4;
        System.out.println("sayi = " + sayi); // 1

    }// main sonu
}// class sonu
