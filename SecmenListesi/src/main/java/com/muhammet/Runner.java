package com.muhammet;

import com.muhammet.entity.Secmen;
import com.muhammet.repository.AdresRepository;
import com.muhammet.repository.MahalleRepository;
import com.muhammet.repository.SecmenRepository;
import com.muhammet.utility.enums.Cinsiyet;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {
    public static void main(String[] args) {
        //ornekMethod();
        //int sayi = 6;
        int topam = 6 + 78;
//        Secmen secmen = new Secmen("11111111111","Muhammet","HOCA",Cinsiyet.ERKEK);
//        SecmenRepository repository = new SecmenRepository();
//        repository.save(secmen);
//        new SecmenRepository().save(
//                new Secmen("5454744551","Bahar",
//                        "TAŞ",Cinsiyet.KADIN)
//        );

      //  new SecmenRepository().findAll().forEach(System.out::println);

//        new SecmenRepository().getAllTckimlik().forEach(System.out::println);

       // new SecmenRepository().findById(3L).ifPresent(System.out::println);

//        new SecmenRepository().getTcKimlikAndName().forEach(o->{
//            System.out.println("ad..: "+ o[0]+ " - tcno...: "+o[1]);
//        });

        //new SecmenRepository().getAllViewSecmen().forEach(System.out::println);

//        new SecmenRepository().getAdCount().forEach(o->{
//            System.out.println("ad...: "+o[0]+" - adet...: "+ o[1]);
//        });

//        new SecmenRepository().findAlNativeSQL().forEach(o->{
//            System.out.println("ad....: "+ o[1]);
//        });

//        new SecmenRepository().findAllNativeSQLSecmen().forEach(System.out::println);

        new SecmenRepository().findOptionalById(2L).ifPresent(System.out::println);

       // new Secmen(null,"ak","t",null);

       // new AdresRepository().findAll();
      //  new MahalleRepository().findAll()
    }

    private static void ornekMethod() {
        /**
         * SORU:
         * Seçmenlerin tanımlandığı bir Entity sınıfı oluşturun ve seçmen ekleyin.
         * Secmen.java
         * [
         * id
         * tcKimlik -> benzersiz
         * ad
         * soyad
         * cinsiyet -> enum
         * ]
         */
        Secmen secmen = new Secmen();
        secmen.setAd("Muhammet");
        secmen.setSoyad("HOCA");
        secmen.setTckimlik("11111111111");
        secmen.setCinsiyet(Cinsiyet.ERKEK);

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CRM");
        EntityManager em = emf.createEntityManager();
        /**
         * Transaction nedir?
         * SQ-> 1,2,3,4,5,6,7,8
         *
         * a-> 7.......... Ex -> rollback
         * b-> 8
         * c-> 9
         * d-> 9
         *
         */
        em.getTransaction().begin();
        em.persist(secmen);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
