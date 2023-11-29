package com.muhammet;

import com.muhammet.entity.Satis;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        /**
         * stream nedir?
         * youtube bir video var 1Dk video olsun. boyutu 300mb
         * 1. senaryo -> videoyu tam indirip izliyorsunuz. bunun için öncelikle video tam olarak inmeli
         *              sonra video oynatılmalı. bu mantıksız ve masraflı bir durum
         * 2. senaryo -> video parçalara bölünür ve parça parça iletilir. yani istenilen parça indirilir.
         *           böylelikle sadece ihtiyaç olan parça indirilir ve oynatılır. bu mantıklı ve masrafsız bir durum
         */
        Stream<String> streamTekKayit = Stream.of("Muhammet"); // count -> 1
        Stream<String> streamBosKayit = Stream.empty(); // count -> 0
        Stream<String> streamCokluKayit = Stream.of("Muhammet", "Ali", "Veli"); // count -> 3

        /**
         * StreamAPI kendi başına içinde fonksiyonel programlamayı barıdıran bir yapıdır. Ancak bizim
         * uygulamalarımızda kullanılan tüm veriler Colecitons yapısında tutulur. Bu yüzden StreamAPI
         * kullanabilmek için Kolesiyonlarımızı stream() fonksiyonu ile StreamAPI'ye çevirmemiz gerekir.
         */
        List<String> haftaninGunleri = List.of("Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar");
        Stream<String> streamHaftaninGunleri = haftaninGunleri.stream(); // list to stream
        streamHaftaninGunleri.filter(x-> x.contains("i")).forEach(System.out::println); // içinde i harfi olanları yazdırır
        // streamHaftaninGunleri.filter(x-> x.contains("e")).forEach(System.out::println); // stream kullanıldığı için hata verir.
        haftaninGunleri.stream().filter(x-> x.contains("e")).forEach(System.out::println); // list to stream
        haftaninGunleri.stream().filter(x-> x.contains("a")).forEach(System.out::println); // list to stream
        haftaninGunleri.stream().filter(x-> x.contains("ş")).forEach(System.out::println); // list to stream

        /**
         * Sonsuz Streamler
         */
        Stream<Double> sonsuzStream = Stream.generate(Math::random); // count -> sonsuz

        Stream<Integer> sonsuzStreamInteger = Stream.iterate(400, n -> n+1); // 400,401,402,403......

        Stream<Integer> sonsuzStreamIntegerSonlu = Stream.iterate(500_000, n -> n<501_100, n -> n+100);// 500_000,500_100,500_200.....
        List<Integer> listem = new ArrayList<>();
        int size = 43;
        for(int i=0; i<size; i++){
            listem.add(i);
        }
//        sonsuzStreamIntegerSonlu.forEach(s->{
//            try {
//                Thread.sleep(1000L);
//                System.out.println(s);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });

        /**
         * reduce-> bir stream içerisindeki tüm elemanları tek bir elemana indirger.
         */
        System.out.println("***** reduce *****");
        System.out.println();
        var isimDizisi = new String[]{"M","u","h","a","m","m","e","t"};
        String isimim="";
        for(String ad : isimDizisi) isimim+=ad;
        System.out.println(isimim);

        Stream<String> ifadeStream = Stream.of("M","u","h","a","m","m","e","t");
        /**
         * s1 -> ""+ "M" -> M
         * s2 -> "M"+ "u" -> Mu
         * s3 -> "Mu"+ "h" -> Muh
         */
        String ismimReduce = ifadeStream.reduce("", (x,y)->x+" "+y.toUpperCase());
        System.out.println(ismimReduce);

        Stream<Integer> notlar = Stream.of(50,60,80); //
        /**
         * s1 -> (x=-1, y=50) -> 50
         * s2 -> (x=50, y=60) -> 55
         * s3 -> (x=55, y=80) -> 67
         */
        Integer toplamNot = notlar.reduce(-1, (x,y)-> x == -1 ? y : (x+y)/2);
        System.out.println(toplamNot);
        /**
         * min -> en küçük elemanı bulur
         * max -> en büyük elemanı bulur
         * count -> stream içerisindeki eleman sayısını bulur
         *
         */
        Stream<String> isimListesi = Stream.of("Muhammet", "Ali", "Veli","Mehmet","Ayşe","Fatma","Zeynep", "Su");
        Optional<String> enkisaIsim = isimListesi.min((MevcutIsim, SiradakiIsim)-> MevcutIsim.length() - SiradakiIsim.length());
        enkisaIsim.ifPresent(System.out::println);

        Stream<Satis> satisStream = Stream.of(
                new Satis("Kalem", 10.0),
                new Satis("Silgi", 5.0),
                new Satis("Defter", 20.0),
                new Satis("Kitap", 30.0)
        );
        /**
         * Optional
         */
        Optional<Satis> enBuyukSatis = satisStream.max((s1,s2)-> s1.getFiyat().compareTo(s2.getFiyat()));
        enBuyukSatis.ifPresent(System.out::println);

        BinaryOperator<Integer> op = (a,b) -> a*2 + b/3;
        Stream<Integer> ucSayi = Stream.of(3,18,66);
        /**
         * s1-> a=3, b=18 -> 3*2 + 18/3 = 6+6 = 12
         * s1-> a=12, b=66 -> 12*2 + 66/3 = 24+22 = 46
         */
        ucSayi.reduce(op).ifPresent(System.out::println);

    }
}
