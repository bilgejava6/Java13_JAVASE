package com.muhammet;

import java.util.Scanner;

public class Runner_Toplama {

    public static void main(String[] args) {
        // Değişken tanımlıyorum.
        int sayi1;
        int sayi2;
        int toplam;
        // 1. sayıyı girin.
        System.out.print("1. sayıyı giriniz......: "); // ekrana çıktı vermek için kullanıyorum.
        sayi1 = new Scanner(System.in).nextInt(); // kullanıcıdan terminal ekranında bilgi almak için kullanılır.
        System.out.print("2. sayıyı giriniz......: ");
        sayi2 = new Scanner(System.in).nextInt();
        toplam = sayi1 + sayi2;
        System.out.println("iki sayının toplamı.....: "+ toplam);

        System.out.println("UYGULAMA BİTTİ.");
    }

}
