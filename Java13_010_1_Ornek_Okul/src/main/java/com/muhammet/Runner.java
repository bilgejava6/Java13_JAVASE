package com.muhammet;

import com.muhammet.entity.Matematik;
import com.muhammet.entity.Ogrenci;

public class Runner {
    public static void main(String[] args) {
    //  Öğrenci Değişkeni = Öğrenci nesnesi oluşturma
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.adres = "Ankara - Merkez";
        ogrenci.adSoyad = "Demet DUR";
        ogrenci.dogumYili = 2013;
        ogrenci.sinif = "5. Sınıf";
        ogrenci.sube = "B";
        ogrenci.okulNumarasi = "OKL03E3";
        ogrenci.veli = "Murat DUR";

        Matematik  matematik = new Matematik();
        matematik.ogretmen = "Nuray Öğretmen";
        matematik.vizeNotu = 54;
        matematik.finalNotu = 78;

        ogrenci.matematik = matematik;

        System.out.println(ogrenci.adSoyad);
        System.out.println(ogrenci.matematik.ogretmen);
        System.out.println(ogrenci.matematik.finalNotu);

    }//main sonu

}//class sonu
