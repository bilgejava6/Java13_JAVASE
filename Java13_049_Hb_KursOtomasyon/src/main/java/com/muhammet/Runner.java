package com.muhammet;

import com.muhammet.entity.Adres;
import com.muhammet.entity.Kategori;
import com.muhammet.entity.Kurs;
import com.muhammet.entity.Kursiyer;
import com.muhammet.repository.AdresRepository;
import com.muhammet.repository.KategoriRepository;
import com.muhammet.repository.KursRepository;
import com.muhammet.repository.KursiyerRepository;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
//        new AdresRepository().findAll().forEach(a->{
//            System.out.println("adres...:"+ a.getAdres());
//        });
        //kursiyetrEkle();

        Kursiyer kursiyer = Kursiyer.builder()
                .ad("Cemal")
                .soyad("TAŞ")
                .telefon("0 999 888 7744")
                .build();
        Kursiyer kursiyer1 = new Kursiyer();
        kursiyer1.setAd("Demet");
        kursiyer1.setSoyad("KUŞ");
        Kurs kurs = Kurs.builder()
                .ad("Nakış")
                .kapasite(5)
                .kursiyerListesi(List.of(kursiyer,kursiyer1))
                .build();
        kursiyer.setKursListesi(List.of(kurs));
        kursiyer1.setKursListesi(List.of(kurs));
        new KursRepository().save(kurs);

    }

    private static void kursiyetrEkle() {
        Adres adres = Adres.builder()
                .il("Ankara")
                .ilce("Merkez")
                .adres("buralarda bir yerlerde")
                .build();
        Kursiyer kursiyer = Kursiyer.builder()
                .ad("Muhammet")
                .soyad("HOCA")
                .adres(adres)
                .telefon("0 555 666 9988")
                .build();
        adres.setKursiyer(kursiyer);
        new KursiyerRepository().save(kursiyer);
    }

    private static void kategoriKursekle(){
        Kurs kurs = new Kurs();
        kurs.setAd("Java SE");
        kurs.setKapasite(10);

        Kurs kurs2 = new Kurs();
        kurs2.setAd("Java EE");
        kurs2.setKapasite(10);

        Kategori kategori = Kategori.builder()
                .ad("Yazılım Kategorisi")
                .aciklama("Bir çok alanda yazılım eğitimlerinin içeriklerini barındırır.")
                .kursListesi(List.of(kurs,kurs2))
                .build();
        kurs2.setKategori(kategori);
        kurs.setKategori(kategori);
        new KategoriRepository().save(kategori);
        /**
         * Önce Kurslar kayıt edilir.
         * Sonra Kategori kayıt edilir.
         */
        Kurs kurs3 = new Kurs();
        kurs3.setAd("Gitar");
        kurs3.setKapasite(10);

        Kurs kurs4 = new Kurs();
        kurs4.setAd("Bağlama");
        kurs4.setKapasite(10);

        Kategori kategori2 = Kategori.builder()
                .ad("Müzik Kategorisi")
                .aciklama("ruhunuza gıda")
                .kursListesi(List.of(kurs3,kurs4))
                .build();
        kurs3.setKategori(kategori2);
        kurs4.setKategori(kategori2);
        new KategoriRepository().save(kategori2);
    }
}
