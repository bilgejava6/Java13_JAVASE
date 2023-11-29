package com.muhammet;


import java.util.Scanner;

public class Runner_Aritmetik_Islem_Ornekleri {

    public static void main(String[] args) {
        // iki adet int türde tam sayı değişkeni tanımlamak.
        int s1,s2;
        /**
         * Konsol ekranında kullanıcıdan bilgi girişi almak için Scanner adı verile bir sınıf kullanırız.
         * Detaylarını sonra göreceğimiz kalıp kullanımıları ile ilerliyoruz.
         * Tanım:
         * Scanner sc = new Scanner(System.in); // değişken oluşturmak ve nesne yarata işlemi
         * sc.nextInt() -> tam sayı değişken değeri okumak
         * sc.nextLine() -> String türde değer okumak
         * sc.nextDouble() -> double türde değer okumak
         * .....
         */
        //Scanner selam_nasilsiniz_iyi_misiniz; // değişken tanımlama -> Data Type + name
        Scanner sc = new Scanner(System.in); // değişken oluşturmak ve nesne yarata işlemi
        System.out.print("1. sayıyı giriniz....: ");
        s1 = sc.nextInt(); // konsol ekranından tam sayı değeri okumak
        System.out.print("2. sayıyı giriniz....: ");
        s2 = sc.nextInt();
        int toplam = s1 + s2;
        System.out.println("iki sayının toplamı : " + toplam);

        //----------------------------------------------------

        double d1,d2;

        System.out.print("ondalıklı olarak sayı 1 giriniz.....: ");
        d1 = sc.nextDouble();
        System.out.print("ondalıklı olarak sayı 2 giriniz.....: ");
        d2 = sc.nextDouble();
        double bolum = d1 / d2;
        System.out.println("iki sayının bölümü : " + bolum);


    }
}
