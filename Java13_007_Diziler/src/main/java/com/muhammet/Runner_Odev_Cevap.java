package com.muhammet;

import java.util.Scanner;

public class Runner_Odev_Cevap {
    public static void main(String[] args) {
        /**
         * Bir öğretmen öğrencilerin listesini ve her ders için bir dizi oluşturarak not ortalamalarını
         * tutuyor. buna göre öğrencilerin listesini ve notlarını gösteren uygulamayı yazınız.
         *
         * Öğrenci listesi
         * Matemetik Notları Listesi
         * Türkçe Notları Listesi
         *
         */

        String[] ogrenciListesi = new String[0];
        int[] matematikNotListesi = new int[0];
        int[] turkceNotListesi = new int[0];
        int secim=0;
        int ogrenciSayisi=0;

        do{
            System.out.println("**************************");
            System.out.println("***     OKUL OTOMASTONU **");
            System.out.println("**************************");
            System.out.println("1- Öğrenci Tanımla");
            System.out.println("2- Matematik Notu Girişi");
            System.out.println("3- türkçe notu girişi");
            System.out.println("4- Öğrenci Notları");
            System.out.println("0- ÇIKIŞ");
            System.out.println();
            System.out.print("lütfen seçiniz....: ");
            secim = new Scanner(System.in).nextInt();

            switch (secim){
                case 1:
                    System.out.print("kaç öğrenci tanımlamak istiyosunuz...:");
                    ogrenciSayisi = new Scanner(System.in).nextInt();
                    ogrenciListesi = new String[ogrenciSayisi];
                    for(int i=0;i<ogrenciSayisi;i++){
                        System.out.print((i+1)+". Öğrenciyi gir....: ");
                        ogrenciListesi[i] = new Scanner(System.in).nextLine();
                    }
                    break;
                case 2: break;
                case 3: break;
                case 4: break;
                case 0:
                    System.out.println("Çıkış yapıldı"); break;
            }
        }while (secim!=0);




        System.out.println("UYGULAMA SONLANDI.");
    }
}
