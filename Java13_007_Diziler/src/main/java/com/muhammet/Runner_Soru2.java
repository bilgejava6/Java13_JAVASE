package com.muhammet;

import java.util.Scanner;

public class Runner_Soru2 {
    public static void main(String[] args) {
        /**
         * Bir öğretmen okuldaki öğrencilerinin isim listelerini bir dizinin içine koymak ve
         * istediği zaman onların listesini çıktılamak istiyor. Buna göre;
         * 1- Şu şekilde bir ekran yazınız.
             * ***************************
             * 1- Öğrenci Tanımla
             * 2- Öğrenci Listesi Göster
             * 0- ÇIKIŞ
             * işlemi seçiniz...: 1
         * 2- Öğrenci tanımlama ekranında öğretmen kaç öğrenci tanımlamak istediğini yazacak ve okadar öğrenciyi
         * tek tek adları ile girerek bir dizini içine atacaksınız.
         * 3- Öğrencilerini listesini göster dediğinide ise bu öğrenci dizisini ekrana yazdıracaksınız.
         * 4- çıkış işleminde ise uygulama kapanacak.
         */
        //String ogrenciAdi = new Scanner(System.in).nextLine();
        //int sayi = new Scanner(System.in).nextInt();
        int secim;
        String[] ogrenciler= new String[1];
        int boyut=0;
        do{
            System.out.println("**********************************");
            System.out.println("***** ÖĞRENCİ TAKİP SİSTEMİ ******");
            System.out.println("**********************************");
            System.out.println();
            System.out.println("1- Öğrenci Tanımla");
            System.out.println("2- Öğrenci Listesi");
            System.out.println("0- Ç I K I Ş");
            System.out.print("");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.print("lütfen öğrenci sayısını giriniz...: ");
                    boyut = sc.nextInt();
                    ogrenciler = new String[boyut];
                    for(int i=0;i<boyut;i++){
                        System.out.print((i+1)+". adı giriniz....: ");
                        String sayi = new Scanner(System.in).nextLine();
                        ogrenciler[i] = sayi;
                    }
                    break;
                case 2:  for(int i=0;i<boyut;i++)
                                System.out.println(ogrenciler[i]); break;
                case 0:
                    System.out.println("ÇIKTIK Sonunda :)"); break;
            }
        }while(secim!=0);

        System.out.println("UYGULAMA KAPANDI...");
    }
}
