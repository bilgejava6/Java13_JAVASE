package com.muhammet;

import java.util.Scanner;

public class Runner_Aritmatik_Ornek {

    public static void main(String[] args) {
        /**
         * girilen(kullanıcıdan alınan) 3 sayının ortalamasını bulan program
         */
        // int sayi1, sayi2, sayi3;
        // 5 = 5 + 3
//        int ort=0;
        Scanner sc = new Scanner(System.in);
//        System.out.print("1. sayıyı giriniz......: ");
//        ort = sc.nextInt();
//        System.out.print("2. sayıyı giriniz......: ");
//        ort = ort + sc.nextInt();
//        System.out.print("3. sayıyı giriniz......: ");
//        ort = ort + sc.nextInt();
//        System.out.println("Ortalama...............: " + (ort/3));
        System.out.println("sıra ile 3 sayı giriniz");
        int ort = (sc.nextInt() + sc.nextInt() + sc.nextInt())/3;
        System.out.println("3 sayının ortalamasını bulan program ort....: "+ ort);
    }
}
