package com.muhammet;

public class Runner {
    public static void main(String[] args) throws Exception {
        /**
         * ÖNEMLİ!!!!!!!!
         * Tüm uygulamalar javada  Main Thread üzerinde koşturulur. Yani tek thread te çalışırsınız
         * bu nedenle kodlarınız sıralay işletilir.
         *
         * 1. görev, 4 saniye sürecek bir işlem olsun
         * 2. görev 2 saniye sürecek
         */
        System.out.println("1. işlem başladı");

        new Thread(()->{
            long toplam=0L;
            for(long i=0;i<24_000_000_000L;i++){
                toplam+=i;
            }
            System.out.println("Toplam....: "+ toplam);
        }).start();



        System.out.println("2. işlem başladı");

        new Thread(()->{
            long fark=34_064_645_433l;
            for(long i=0;i<8_000_000_000L;i++){
                fark-=i;
            }
            System.out.println("Fark....: "+ fark);
        }).start();



        System.out.println("UYGULAMA BİTTİ");
    }
}
