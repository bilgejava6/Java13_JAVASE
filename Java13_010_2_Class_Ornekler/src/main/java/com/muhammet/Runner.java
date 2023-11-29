package com.muhammet;

import com.muhammet.entity.Musteri;
import com.muhammet.entity.Satis;
import com.muhammet.entity.Urun;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Runner {
    public static void main(String[] args) {

        Satis satis = new Satis();
        satis.adres =  "Ankara";
        satis.indirimOrani = 4;
        satis.odemeSekli = "Kredi Kartı";
        satis.uuid = UUID.randomUUID(); // rastgele benzersiz bir uuid üretir.
        satis.tarih = new Date();
        satis.localDateTime = LocalDateTime.now();

        Musteri musteri = new Musteri();
        musteri.ad = "Ahmet";
        musteri.soyad = "TAŞ";
        musteri.id = 12442L;
        musteri.email = "ahmet@tas.com.tr";
        musteri.telefon = "0 666 999 8877";
        musteri.adres = "Bursa";
        satis.musteri = musteri;

        Urun urun = new Urun();
        urun.id = 4543L;
        urun.ad = "Şeker";
        urun.fiyat = 54;
        urun.stokAdedi = 1000;

        satis.urun = urun;


        System.out.println("Satış Adresi.....: "+ satis.adres);
        System.out.println("Müşteri Adresi...: "+ satis.musteri.adres);




    }//main sonu
}//class sonu
