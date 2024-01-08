package com.muhammet;

import com.muhammet.entity.*;
import com.muhammet.repository.*;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        aracEkle();
        new PersonelRepository().findById(1L)
                .ifPresent(p->{
                    System.out.println(p.getAd());
                    System.out.println(p.getAraba().getMarka());
                    System.out.println(p.getAraba().getModel());
                    System.out.println(p.getAraba().getPkala());
                });
        //UrunEkle();
       // personelVeAdresEkle();
     //   personelVeResimekle();
//        new ResimRepository().findAll().forEach(r->{
//            System.out.println("resim adı....: "+r.getAd());
//            System.out.println("personel adı.: "+r.getPersonel().getAd());
//        });

//        new PersonelRepository().findAll().forEach(p->{
//            System.out.println("personel adı....: "+p.getAd());
//            p.getResim_listesi().forEach(r->{
//                System.out.println("r.adı...: "+r.getAd());
//            });
//            System.out.println("--------------------------");
//        });
//
    }
    private static void aracEkle(){
        Personel personel = Personel.builder()
                .telefon("0 555 4444 3333")
                .email("aliveli@gmail.com")
                .ad("Ahmet CAN TAŞ")
                .build();
        Araba araba = Araba.builder()
                .marka("BMW")
                .model("A Model")
                .pkala("06 ASDF 443")
                .modelYili(2023)
                .personel(personel)
                .build();

        personel.setAraba(araba);
        new PersonelRepository().save(personel);
    }

    private static void UrunEkle(){

        Kategori kategori = Kategori.builder()
                .ad("Mobilya")
                .build();
        new KategoriRepository().save(kategori);

        Urun urun = new Urun();
        urun.setAd("Yemek Odası");
        urun.setKategori(kategori);
        new UrunRepository().save(urun);
        Urun urun2 = new Urun();
        urun2.setAd("Çocuk Odası");
        urun2.setKategori(kategori);
        new UrunRepository().save(urun2);

    }

    private static void personelVeResimekle(){


        Personel personel = new Personel();
        personel.setAd("Murat");
        personel.setEmail("murat@gmail.com");

        new PersonelRepository().save(personel);

        Resim resim1 = Resim.builder()
                .ad("Profil")
                .url("https://aaaa")
                .personel(personel)
                .build();
        ResimRepository repository = new ResimRepository();
        repository.save(resim1);

        Resim resim2 = new Resim();
        resim2.setPersonel(personel);
        resim2.setAd("aliiiii");

        repository.save(resim2);

        Resim resim3 = new Resim();
        resim3.setAd("veliiiii");
        resim3.setPersonel(personel);

        repository.save(resim3);

    }

    private static void personelVeAdresEkle(){
        Adres adres1 = Adres.builder()
                .il("Ankara")
                .ilce("Merkez")
                .postaKodu("06021")
                .kapiNo("25")
                .build();
        Adres adres2 = Adres.builder()
                .il("İzmir")
                .ilce("Merkez")
                .postaKodu("00140014")
                .kapiNo("125")
                .build();
        AdresRepository adresRepository = new AdresRepository();
        adresRepository.save(adres1);
        adresRepository.save(adres2);
//
//        Personel personel = Personel.builder()
//                .ad("Muhammet HOCA")
//                .email("muhammet@gmail.com")
//                .telefon("0 555 666 9998")
//                .sicilNo("DPC_00124")
//                .adres_listesi(List.of(adres1,adres2))
//                .build();
//
//        PersonelRepository personelRepository = new PersonelRepository();
//        personelRepository.save(personel);
    }

    private static void personelListesi(){

        PersonelRepository personelRepository = new PersonelRepository();

        personelRepository.findAll().forEach(System.out::println);
    }
}
