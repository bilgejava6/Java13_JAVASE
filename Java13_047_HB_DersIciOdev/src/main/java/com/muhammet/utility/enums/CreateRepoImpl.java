package com.muhammet.utility.enums;

import com.muhammet.entity.Bilesen;
import com.muhammet.entity.Kullanici;
import com.muhammet.entity.Pc;
import com.muhammet.repository.BilesenRepository;
import com.muhammet.repository.KullaniciRepository;
import com.muhammet.repository.PcRepository;

public class CreateRepoImpl {
    private final KullaniciRepository kullaniciRepository;
    private final PcRepository pcRepository;
    private final BilesenRepository bilesenRepository;
    public CreateRepoImpl(){
        this.bilesenRepository = new BilesenRepository();
        this.kullaniciRepository = new KullaniciRepository();
        this.pcRepository = new PcRepository();
    }

    public void  createDemoData(){
        createUser();
        createPc();
        createBilesen();
    }
    private void createBilesen(){
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.ANAKART)
                .ad("Asus Anakart")
                .pcId(1L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.ANAKART)
                .ad("MSI Anakart")
                .pcId(2L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.ANAKART)
                .ad("AsRoc Anakart")
                .pcId(3L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.ANAKART)
                .ad("Asus Anakart")
                .pcId(4L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.ISLEMCI)
                .ad("İ7 4.4GHZ")
                .pcId(1L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.MONITOR)
                .ad("ViewSonic 32' ")
                .pcId(1L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.ISLEMCI)
                .ad("i9 5.5GHZ")
                .pcId(4L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.EKRAN_KARTI)
                .ad("Asus GTX5090")
                .pcId(4L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.MONITOR)
                .ad("Samsung 27' ")
                .pcId(2L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.SSD)
                .ad("M.2 SSD 1TB")
                .pcId(3L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.RAM)
                .ad("64GB DDR-5")
                .pcId(1L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.RAM)
                .ad("32GB DDR-4")
                .pcId(2L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.RAM)
                .ad("128GB DDR5")
                .pcId(4L)
                .build());
        bilesenRepository.save(Bilesen.builder()
                .tur(BilesenTuru.RAM)
                .ad("16GB DDR3")
                .pcId(3L)
                .build());

    }

    private void createPc(){
        pcRepository.save(Pc.builder()
                        .pcAdi("Muhammet PC-1")
                        .kullaniciId(1L)
                .build());
        pcRepository.save(Pc.builder()
                .pcAdi("Muhammet PC-2")
                .kullaniciId(1L)
                .build());
        pcRepository.save(Pc.builder()
                .pcAdi("Muhammet PC-3")
                .kullaniciId(1L)
                .build());
        pcRepository.save(Pc.builder()
                .pcAdi("Demet PC-1")
                .kullaniciId(3L)
                .build());

    }

    private void createUser(){
        kullaniciRepository.save(Kullanici.builder()
                        .ad("Muhammet")
                        .adres("Ankara")
                        .yas(41)
                        .telefon("0 555 444 3322")
                .build());
        kullaniciRepository.save(Kullanici.builder()
                .ad("Deniz")
                .adres("Ankara")
                .yas(34)
                .telefon("0 555 444 3322")
                .build());
        kullaniciRepository.save(Kullanici.builder()
                .ad("Demet")
                .adres("Ankara")
                .yas(37)
                .telefon("0 555 444 3322")
                .build());
    }


}
