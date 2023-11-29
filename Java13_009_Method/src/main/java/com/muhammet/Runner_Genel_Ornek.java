package com.muhammet;

import java.util.Scanner;

public class Runner_Genel_Ornek {
    public static void main(String[] args) {
        run();
        System.out.println("PROGRAMDAN ÇIKILDI");

    }//main sonu

    public static void run(){
        switch (ekranaYazVeSec()){
            case 1: toplamaYap(); break;
            case 2: carpmaYap(); break;
            case 0: break;
            default: break;
        }
    }
    public static int ekranaYazVeSec(){
        System.out.println("********************");
        System.out.println("***   İŞLEMLER   ***");
        System.out.println("********************");
        System.out.println();
        System.out.println("1- Toplama");
        System.out.println("2- Çarpma");
        System.out.println("0- ÇIKIŞ");
        System.out.println();
        System.out.print("lütfen seçiniz.....: ");
        int secim = new Scanner(System.in).nextInt();
        return secim;
    }
    public static void toplamaYap(){
        System.out.print("1. sayıyı giriniz....: ");
        int sayi1 = new Scanner(System.in).nextInt();
        System.out.print("2. sayıyı giriniz....: ");
        int sayi2 = new Scanner(System.in).nextInt();
        int toplam = sayi2 + sayi1;
        System.out.println("İki sayının toplamı....: "+ toplam);
    }

    public static void carpmaYap(){
        // TODO: daha sonra yapılacak
    }

}//class sonu
