package com.muhammet.MAp;

import com.muhammet.MAp.entity.Departman;
import com.muhammet.MAp.entity.Personel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Runner_Ornek {
    public static void main(String[] args) {
        Departman bilgiIslem = new Departman(1L,"Bilgi İşlem");
        Departman insanKaynaklari = new Departman(2L,"İnsan Kaynakları");
        Departman muhasebe = new Departman(3L,"Muhasebe");

        List<Personel> personelListesi = new ArrayList<>();
        personelListesi.add(new Personel(1L,"Ahmet Taş","Ankara",bilgiIslem));
        personelListesi.add(new Personel(2L,"Demet SAĞIR","İzmir",muhasebe));
        personelListesi.add(new Personel(3L,"Peker AK","Ankara",insanKaynaklari));
        personelListesi.add(new Personel(4L,"Turan DURMUŞ","Bursa",bilgiIslem));
        personelListesi.add(new Personel(5L,"Emine ALTIN","Ankara",insanKaynaklari));
        personelListesi.add(new Personel(6L,"Halim MASKAN","Samsun",muhasebe));
        personelListesi.add(new Personel(7L,"Bahattin TEKİN","Antalya",bilgiIslem));
        personelListesi.add(new Personel(8L,"Eymen AŞIK","Ankara",insanKaynaklari));
        personelListesi.add(new Personel(9L,"Hulki CAN","İzmir",bilgiIslem));
        personelListesi.add(new Personel(10L,"Leyla GÜVENÇ","İstanbul",muhasebe));
        personelListesi.add(new Personel(11L,"Murat TOK","Ankara",bilgiIslem));
        personelListesi.add(new Personel(12L,"Bülent AYMAZ","İstanbul",muhasebe));
        personelListesi.add(new Personel(13L,"Zeynep BAKİ","Ankara",bilgiIslem));
        System.out.println(personelListesi.get(8));
        personelListesi.forEach(p->{});
        /**
         * Map<Departman,List<Personel>>
         *
         * Bilgi Ekleme İşlemi
         * put(Key,Value)
         */
//
//        Map<Departman,List<Personel>> departmanListMap= null;
//        List<Personel> personelList=null;
//        departmanListMap.put(bilgiIslem,personelList);

        /**
         * Bilgi Okuma İşlemi
         * get(Key) -> return Value
         */
//        Map<Departman,List<Personel>> departmanListMap= null;
//        departmanListMap.get(bilgiIslem);

        /**
         * DİKKAT!!!!!
         * 1- Olmayan bir key çağrımı yaptığınızda Exception fırlatır.
         * 2- forEach ile verileri dolaşabilirsiniz, Diğer kolatioyonların aksine döngü değerileri değil,
         *    Key ve Value bilgilerini döner.
         * 3- Key ya da Value bilgilerinin varlığını dooğrudan sorgulayabilirsiniz.
         * 4- Bir Key var ise herşey yolundadır ancak, key yok ise işler ters gider. Bunun için özel bir methos
         *    kullanarak bu durumu aşaruz. getOrDefault() size eğer istenilen key yok ise defult bir değer
         *    dönmenize olanak tanır.
         *
         */
//        Map<Departman,List<Personel>> departmanListMap= null;
//        departmanListMap.forEach((k,v)->{
//
//        });
//
//        departmanListMap.get(null);
//
//        if(departmanListMap.containsKey(null)){
//            //key var sa işlem yap
//        }else{
//
//        }
//
//        Departman yazilim = new Departman(4L,"Yazılım");
//        departmanListMap.getOrDefault(yazilim,List.of(new Personel(999L,"","",yazilim)));

        Map<Departman,List<Personel>> departmanListMap = personelListesi.stream().collect(Collectors.groupingBy(Personel::getDepartman));
        departmanListMap.forEach((k,v)->{
            System.out.println("Departan....: "+ k.getAd());
            System.out.println("Personeller..: "+ v);
            System.out.println("----------------------------------");
        });

    }
}
