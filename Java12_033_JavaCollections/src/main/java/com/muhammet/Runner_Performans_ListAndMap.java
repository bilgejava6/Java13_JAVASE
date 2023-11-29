package com.muhammet;

import com.muhammet.entity.UserProfile;

import java.util.*;

public class Runner_Performans_ListAndMap {
    public static void main(String[] args) {

        List<UserProfile> kullaniciListesi = new ArrayList<>();
        Map<Long,UserProfile> kullaniciListesiHashMap = new HashMap<>();
        Map<Long,UserProfile> kullaniciListesiTreeMap = new TreeMap<>();
        long start = System.currentTimeMillis(); // 1/1_000_000_000 sn
        for (long i=0;i<10_000_000;i++){
            kullaniciListesi.add(new UserProfile(i,"User-"+i,"Adres-"+i));
        }
        long end = System.currentTimeMillis();
        System.out.println("ArrayList geçen süre(ns)..: "+ (end-start));
        start = System.currentTimeMillis();
        for (long i=0;i<10_000_000;i++){
            kullaniciListesiHashMap.put(i,new UserProfile(i,"User-"+i,"Adres-"+i));
        }
        end = System.currentTimeMillis();
        System.out.println("HashMap geçen süre(ns)..: "+ (end-start));
        start = System.currentTimeMillis();
        for (long i=0;i<10_000_000;i++){
            kullaniciListesiTreeMap.put(i,new UserProfile(i,"User-"+i,"Adres-"+i));
        }
        end = System.currentTimeMillis();
        System.out.println("TreeMap geçen süre(ns)..: "+ (end-start));

        /**
         * Arama Performansları
         */

        start = System.nanoTime();
        UserProfile bulunan = kullaniciListesi.stream().filter(u-> u.getId()==5_453_433L).findFirst().get();
        end = System.nanoTime();
        System.out.println("ArrayList Bulunma süresi.....: "+ (end-start));

        start = System.nanoTime();
        bulunan = kullaniciListesiHashMap.get(5_453_433L);
        end = System.nanoTime();
        System.out.println("HashMap Bulunma süresi.....: "+ (end-start));

        start = System.nanoTime();
        bulunan = kullaniciListesiTreeMap.get(5_453_433L);
        end = System.nanoTime();
        System.out.println("TreeMap Bulunma süresi.....: "+ (end-start));

        /**
         *
         * ArrayList geçen süre(ns)..: 845
         * HashMap geçen süre(ns)..: 999
         * TreeMap geçen süre(ns)..: 1.918
         * ArrayList Bulunma süresi.....: 26.469.542 -> 1/50 s
         * HashMap Bulunma süresi.....: 10.125       -> 1/100.000 s
         * TreeMap Bulunma süresi.....: 44.667       -> 1/25.000 s
         *
         * 20->
         *  kullanıcı bilgileri-> 3ms
         *  post bilgileri -> 3ms
         *  yorum yapanlar -> 3ms
         *      yorum yapanın bilgisi -> 30ms
         *  like yapanlar -> 3ms
         *      like yapanların bilgilerini-> 30ms
         *  1 kayıt için 72ms
         *  toplam -> 1.4sn
         *
         *
         */


    }
}
