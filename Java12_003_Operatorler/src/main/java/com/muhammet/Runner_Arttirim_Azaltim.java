package com.muhammet;

public class Runner_Arttirim_Azaltim {
    public static void main(String[] args) {

        int sayi = 10;
        sayi = sayi +1; // 11
        sayi += 1; // 12
        /**
         *  ++ , --
         */
        System.out.println("sayi.....: "+ sayi);
        sayi++; // 13
        System.out.println("sayi.....: "+ sayi);
        sayi--; // 12
        System.out.println("sayi.....: "+ sayi);
        sayi--; sayi--; sayi--; // 9
        System.out.println("sayi.....: "+ sayi);
        /**
         * DİKKAT!!!!!!!
         * eğer ++,-- operatörleri bir değişkenin sonuna gelir ise artma ya da eksiltme işlemi sonraki
         * kullanımlarda geçerli olur. Sayının değeri o anda değişmez.
         * eğer ++,-- operatörleri bir değişkenin başına gelir ise artma yada eksiltme işlemi o anda
         * gerçekleşir. Sayının değeri o anda değişir.
         * Bu tanımlamaları, prefix ve suffix(ön ek - son ek) kullanımları denilir.
         *
         */
        int s1=6,s2=8,s3=-2,toplam;
        // Sonuçlar; 16, 18++, 9+++, 13, 22, 8, 10, 23, 17, 12
        //        6   +   9  +  9   +  -3  +  8   -   9  +  -3  -  7  = 10
        toplam = s1++ + ++s2 + s2++ + --s3 + ++s1 - --s2 + s3-- - --s1;
        System.out.println("s1.......: "+ s1);// 7
        System.out.println("s2.......: "+ s2);// 9
        System.out.println("s3.......: "+ s3);// -4
        System.out.println("sayıların toplamı .......: "+ toplam);

    }// main sonu
}// class sonu
