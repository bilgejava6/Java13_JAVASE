package com.muhammet.service;

import com.muhammet.entity.Kullanici;
import com.muhammet.entity.Pc;
import com.muhammet.repository.BilesenRepository;
import com.muhammet.repository.KullaniciRepository;
import com.muhammet.repository.PcRepository;

import java.util.List;
import java.util.Optional;

public class KullaniciService {
    /**
     * Kullanıcı Repository
     * Pc Repository
     * Bileşen Repository
     * ---- Ahmet -> id:20
     * PcRepository -> findByUserId(20)
     * BilesenRespository -> findAllByPcId(pc.Id)
     *
     */
    private final KullaniciRepository kullaniciRepository;
    private final PcRepository pcRepository;
    private final BilesenRepository bilesenRepository;
    public KullaniciService(){
        this.bilesenRepository = new BilesenRepository();
        this.kullaniciRepository = new KullaniciRepository();
        this.pcRepository = new PcRepository();
    }

    public void getPcOnUserId(Long userId){
        /**
         * Pc Listesi
         * PC1
         * --- Bileşen Listesi
         * PC2
         * --- Bileşen Listesi
         */
      Optional<Kullanici> kullanici =  kullaniciRepository.findById(userId);
      kullanici.ifPresent(k->{
          System.out.println("****** KULLANICI BİLGİSİ  ********");
          System.out.println(k);
          System.out.println();
          List<Pc> bilgisayarListesi = pcRepository.findByColumnAndValue("kullaniciId",k.getId());
          bilgisayarListesi.forEach(pc->{
              System.out.println("**** BİLGİSAYAR BİLGİSİ *******");
              System.out.println(pc);
              System.out.println();
              System.out.println("****** Bileşen Bilgisi *******");
              bilesenRepository.findByColumnAndValue("pcId",pc.getId()).forEach(System.out::println);
              System.out.println("-------------------------------");

          });

      });
    }
}
