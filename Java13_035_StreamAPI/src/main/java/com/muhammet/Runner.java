package com.muhammet;

import com.muhammet.entity.Satis;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
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

        /**
         *
         * Bir koleksiondan bakşasına dönüşüm, ya da stream dan dönüşüm
         */
        System.out.println("***** collect *****");
        Stream<String> isimStream = Stream.of("m","u","h","a","m","m","e","t");
        TreeSet<String> setIsim = isimStream.collect(
                TreeSet::new, // dönüşüm türünüz
                TreeSet::add, // dönüşüm işleminiz
                TreeSet::addAll // addAll işlemi bir listeye birden fazla eleman eklemek için kullanılır.
        );
        /**
         * m,u,h,a,e,t
         */
        System.out.println(setIsim);

        isimStream = Stream.of("m","u","h","a","m","m","e","t");
        var varIsim = isimStream.collect(Collectors.toCollection(HashSet::new));
        System.out.println(varIsim);

        Stream<String> musteriListesiStream = Stream.of("Muhammet", "Ali", "Veli","Mehmet","Ayşe","Fatma","Zeynep", "Su");
        List<String> musteriListesiList = List.of("Ali","Muhammet", "Ali", "Veli","Mehmet","Ayşe","Fatma","Zeynep", "Su");
        System.out.println("***** filter *****");
        musteriListesiStream.filter(x-> x.startsWith("A")).forEach(System.out::println);
        musteriListesiList.stream()
                .filter(x-> x.contains("e"))
                .forEach(buraya_canimin_istedigini_yazarim-> System.out.print(buraya_canimin_istedigini_yazarim+", "));
        System.out.println();
        // dında a-A içerecek ve uzunluğu 4 karakterden az olanlar
        /**
         * DİKKAT!!!!!!!
         * UTF-8 karakter setindeki bazı harfler 1 karakter olarak sayılırken bazıları 2 karakter olarak sayılır.
         */
        musteriListesiList.stream()
                .filter(x-> (x.contains("a") || x.contains("A")) && x.length()<=4)
                .forEach(System.out::println);

        musteriListesiList.stream()
                .filter(x-> x.toLowerCase().contains("a") && x.length()<=4)
                .forEach(System.out::println);

        System.out.println("--------------------------");
        musteriListesiList.stream()
                .filter(x-> x.length()<=4)
                .filter(x-> x.contains("a") || x.contains("A"))
                .forEach(System.out::println);

        System.out.println("***** distinct *****");
        musteriListesiList = List.of("Ali","Muhammet", "Ali", "Veli","Mehmet","Ayşe","Muhammet","Fatma","Veli","Zeynep", "Su");
        musteriListesiList.stream()
                .distinct() // tekrar eden elemanları siler
                .forEach(System.out::println);

        System.out.println("***** skip, limit *****");
        Stream<Integer> ozelListem = Stream.iterate(5,n-> n+2); // 5,7,9,11,13,15,17,19,21,23,25,27,29,31,33,35....
        size = 10;
        int page = 1;
        ozelListem
                .skip(page*size) // ilk 10 elemanı atlar
                .limit(size) // 10 elemanı alır
                .forEach(System.out::println); // ekrana yazdırır.
        /**
         *
         * E-Ticaret sistesinde altta ürünlerin sayfalama işlemi yapılırken kullanılır.
         */

        System.out.println("***** map *****");
        musteriListesiList = List.of("Ali","Muhammet", "Ali", "Veli","Mehmet","Ayşe","Muhammet","Fatma","Veli","Zeynep", "Su");
        musteriListesiList.stream()
                .map(String::length)
                .forEach(System.out::println);

        musteriListesiList.stream()
                        .map(x-> x.charAt(0))
                                .forEach(k-> System.out.print(k+" ")); // A, M, A, V, M, A, M, F, V, Z, S
        System.out.println();
        System.out.println("***** map Class *****");
        List<Musteri> mList = List.of(
                new Musteri("Muhammet","Karakaya","Ankara"),
                new Musteri("Ali","Karakaya","Ankara"),
                new Musteri("Deniz", "Kaptan", "İstanbul"),
                new Musteri("Veli", "Kaptan", "İstanbul"),
                new Musteri("Bahar","KAŞIKÇI","İzmir")
        );
        /**
         * MAP
         * <Key, Value> -> <String, Integer>
         */
        mList.stream()
                .map(Musteri::getSehir)
                .forEach(System.out::println);

        List<String> sehirListesi = mList.stream()
                .map(Musteri::getSehir)
                .toList();
        System.out.println("Şehir Listesi: " + sehirListesi);

        TreeSet<String> sehirSeti = mList.stream()
                .map(Musteri::getSehir)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("Şehir Seti: " + sehirSeti);

        System.out.println("***** Sorting *****");
        musteriListesiList = List.of("Ali","Muhammet", "Ali", "Veli","Mehmet","Ayşe","Muhammet","Fatma","Veli","Zeynep", "Su");
        List<String> siraliListe = musteriListesiList.stream()
                .sorted()
                .toList();
        System.out.println("a..z Sıralı liste...: "+siraliListe);

        List<String> tersSiraliListe = musteriListesiList.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("z..a Ters Sıralı liste....: "+tersSiraliListe);
        /**
         * DİKKAT!!!!!!
         * stream ile listelerde yaptığınız tüm işlemler orjinal listeyi etkilemez.
         * ancak Collections.sort() ile yaptığınız işlemler orjinal listeyi etkiler.
         */
        System.out.println("orjinal liste....: "+ musteriListesiList);
        ArrayList<String> newList = new ArrayList<>(musteriListesiList);
        System.out.println("yeni liste...........: "+ newList);
        Collections.sort(newList);
        System.out.println("yeni liste sıralı....: "+ newList);

        /**
         *
         * Collectiong Result -> toList(), toSet(), toMap() v.s
         *
         */
        System.out.println();
        System.out.println("***** Collecting Result *****");
        musteriListesiList = List.of("Ali","Muhammet", "Ali", "Veli","Mehmet","Ayşe","Muhammet","Fatma","Veli","Zeynep", "Su");
        String birlesikIsimListesi = musteriListesiList.stream()
                                        .collect(Collectors.joining(", "));
        System.out.println("Birleşik İsim Listesi: " + birlesikIsimListesi);
        birlesikIsimListesi = musteriListesiList.stream()
                .collect(Collectors.joining(" - "));
        System.out.println("Birleşik İsim Listesi: " + birlesikIsimListesi);

        Double uzunlukOrtalamasi = musteriListesiList.stream()
                .collect(Collectors.averagingDouble(String::length));
        System.out.println("Ortalama Uzunluk: " + uzunlukOrtalamasi);

        TreeSet<String> treeSetListesi = musteriListesiList.stream()
                                        .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("TreeSet Listesi: " + treeSetListesi);


        Map<String,Integer> mapIsimListesi = musteriListesiList.stream().distinct()
                .collect(Collectors.toMap(i-> i,String::length));
        System.out.println("Map İsim Listesi: " + mapIsimListesi);

        mapIsimListesi = musteriListesiList.stream().distinct()
                .collect(Collectors.toMap(i-> i,k-> k.length()*k.length()));
        System.out.println("Map İsim Listesi: " + mapIsimListesi);

        mList = List.of(
                new Musteri("Muhammet","Karakaya","Ankara",45),
                new Musteri("Ali","Karakaya","Ankara",69),
                new Musteri("Deniz", "Kaptan", "İstanbul",98),
                new Musteri("Veli", "Kaptan", "İstanbul",123),
                new Musteri("Bahar","KAŞIKÇI","İzmir",45),
                new Musteri("Turan","Kahya","Ankara",670)
        );
        Map<String, List<Musteri>> sehirMusteriMapListesi = mList.stream()
                .collect(Collectors.groupingBy(Musteri::getSehir));
        System.out.println("Şehir Musteri Map Listesi: " + sehirMusteriMapListesi);

        Map<String,Integer> sehirMusteriSayisiMapListesi = mList.stream()
                .collect(Collectors.groupingBy(Musteri::getSehir, Collectors.summingInt(x-> 1)));
        System.out.println("Şehir Musteri Sayısı Map Listesi: " + sehirMusteriSayisiMapListesi);

        TreeMap<String,Integer> sehirMusteriTotalTutarTreeMapListesi = mList.stream()
                .collect(Collectors.groupingBy(
                        Musteri::getSehir,
                        TreeMap::new,
                        Collectors.summingInt(Musteri::getTotalSatis)
                ));
        System.out.println("Şehre göre müşterilerin toplam satışları TreeMap Listesi: " + sehirMusteriTotalTutarTreeMapListesi);

    }
}

class Musteri{
    String ad;
    String soyad;
    String sehir;
    Integer totalSatis;
    @Override
    public String toString() {
        return "Musteri{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", sehir='" + sehir + '\'' +
                '}';
    }

    public Musteri(String ad, String soyad, String sehir,Integer totalSatis) {
        this.ad = ad;
        this.soyad = soyad;
        this.sehir = sehir;
        this.totalSatis = totalSatis;
    }

    public Musteri(String ad, String soyad, String sehir) {
        this.ad = ad;
        this.soyad = soyad;
        this.sehir = sehir;

    }


    public Integer getTotalSatis() {
        return totalSatis;
    }

    public void setTotalSatis(Integer totalSatis) {
        this.totalSatis = totalSatis;
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }
    public String getSoyad() {
        return soyad;
    }
    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public String getSehir() {
        return sehir;
    }
    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
}
