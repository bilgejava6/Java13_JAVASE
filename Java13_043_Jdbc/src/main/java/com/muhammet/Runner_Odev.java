package com.muhammet;

import com.muhammet.entity.Ders;
import com.muhammet.entity.Ogrenci;
import com.muhammet.repository.DersRepository;
import com.muhammet.repository.DersRepository2;
import com.muhammet.repository.OgrenciRepository;
import com.muhammet.repository.OgrenciRepository2;

import java.sql.*;
import java.util.Scanner;

public class Runner_Odev {
    public static void main(String[] args) {
        /**
         * OkulDB
         * -- Öğrenciler olacak - tblogrenci (id,ad,soyad,yas,veliadi,iletisimtel)
         * -----
         * Java tarafından
         * ***************************
         * *** OKUL OTOMASYONU *******
         * 1- Öğrenci Ekle
         * 2- Öğrenci Listele
         * 3- Öğrenci Düzenle
         * 0- ÇIKIŞ
         * ------
         * Öğrenci EKleme Ekranı
         * ad:
         * soyad:
         * yas:
         * veliadi:
         * iletişim:
         * DB ye kaydet
         */
        int secim;
        do {
            System.out.println("""
                        *******************************
                        ****** OKUL OTOASYONU  ********
                        *******************************
                        1- Öğrenci Ekle
                        2- Öğrenci Düzenle
                        3- Öğrenci Listele
                        4- Ders Ekle
                        5- Ders Listele
                        0- Ç I K I Ş
                                    
                    """);
            System.out.print("lütfen seçiniz.....: ");
            secim = new Scanner(System.in).nextInt();
            switch (secim){
                case 1: ogrenciEkle(); break;
                case 2: ogrenciGuncelle(); break;
                case 3: ogrenciListele(); break;
                case 4: dersEkle(); break;
                case 5: dersListele(); break;
                case 0:
                    System.out.println("Çıkış yapıldı"); break;
                default:
                    System.out.println("Geçersiz seçim yaptınız"); break;
            }
        }while(secim!=0);

        System.out.println("PROGRAM SONLANDI.");
    }

    private static void dersListele() {
        new DersRepository2().findAll().forEach(System.out::println);
    }

    private static void dersEkle() {
        System.out.print("Ders adı.....: ");
        String ad = new Scanner(System.in).nextLine();
        Ders ders = new Ders(ad);
        new DersRepository2().save(ders);
    }

    private static void ogrenciEkle(){
        System.out.print("Öğrenci adı.................: ");
        String ad = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci soyadı..............: ");
        String soyad = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci veli adı.............: ");
        String veliadi = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci yaşı.................: ");
        int yas = new Scanner(System.in).nextInt();
        System.out.print("Öğrenci iletisim telefonu.....: ");
        String iletisimtel = new Scanner(System.in).nextLine();
        new OgrenciRepository2()
               .save(new Ogrenci(ad,soyad,veliadi,yas,iletisimtel));
    }

    private static void ogrenciGuncelle(){
        System.out.print("Öğrenci adı.................: ");
        int id = new Scanner(System.in).nextInt();
        System.out.print("Öğrenci adı.................: ");
        String ad = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci soyadı..............: ");
        String soyad = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci veli adı.............: ");
        String veliadi = new Scanner(System.in).nextLine();
        System.out.print("Öğrenci yaşı.................: ");
        int yas = new Scanner(System.in).nextInt();
        System.out.print("Öğrenci iletisim telefonu.....: ");
        String iletisimtel = new Scanner(System.in).nextLine();
        new OgrenciRepository2()
                .update(new Ogrenci(id,ad,soyad,veliadi,yas,iletisimtel));


    }

    private static void ogrenciListele(){
       new OgrenciRepository2().findAll().forEach(System.out::println);
    }
}
