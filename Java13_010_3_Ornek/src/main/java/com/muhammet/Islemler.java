package com.muhammet;

import java.util.Scanner;

public class Islemler {

    public void konsolEkraninaCiktila(){
        System.out.println("*************************");
        System.out.println("**      İŞLEMLER       **");
        System.out.println("*************************");
        System.out.println();
        System.out.println("1- Toplama");
        System.out.println("2- Çıkartma");
        System.out.println("3- Çarpma");
        System.out.println("4- Bölme");
        System.out.println("5- Alan Hesaplama");
        System.out.println("6- Büyük/Küçük Sayıyı Bulma");
        System.out.println("7- Sayının Karesini hesaplama");
        System.out.println("0- Ç I K I Ş");
    }

    public int secimYap(int start,int end){
        int secim;
        do{
            System.out.print("lütfen seçiniz.....: ");
            secim = new Scanner(System.in).nextInt();
            if(secim<start || secim>end)
                System.out.print("Geçersiz Seçim lütfen ["+start+","+end+"] arasında bir değer girilmelidir  ");

        }while (secim<start || secim>end);
        return secim;
    }

    public void toplamaYaptir(){
        System.out.print("1. sayıyı gir...: ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("2. sayıyı gir...: ");
        int s2 = new Scanner(System.in).nextInt();
        int toplam = s1+s2;
        System.out.println("Toplam.....: "+ toplam);
    }

    public void cikartmaYaptir(){
        System.out.print("1. sayıyı gir...: ");
        int s1 = new Scanner(System.in).nextInt();
        System.out.print("2. sayıyı gir...: ");
        int s2 = new Scanner(System.in).nextInt();
        int fark = s1-s2;
        System.out.println("İki sayının farkı.....: "+ fark);
    }

    public void init(){
        konsolEkraninaCiktila();
        switch (secimYap(0,7)){
            case 1: toplamaYaptir();break;
            case 2: cikartmaYaptir();break;
            default:
                System.out.println("İşlem tanımlı değil");break;
        }
    }

}
