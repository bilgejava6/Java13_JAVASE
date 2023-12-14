package com.muhammet;

import com.muhammet.entity.Adres;
import com.muhammet.entity.Musteri;

import java.util.List;

public class Runner_007 {
    public static void main(String[] args) {
        Long musteriId = 5L;
        Adres adres = new Adres("Ankara","54 Mah.","Java Apt.",musteriId);
        Adres adres2 = new Adres("İzmir","54 Mah.","Java Apt.",4L);
        Adres adres3 = new Adres("Bursa","54 Mah.","Java Apt.",musteriId);

        List<Adres> musteriAdresListeleri = List.of(adres,adres3);

        Musteri musteri = new Musteri(
                musteriId,
                "Muhammet",
                "0 555 999 6666",
               musteriAdresListeleri
        );

        List<Adres> tumMusteriAdresListesi = List.of(adres,adres3,adres2);

        tumMusteriAdresListesi.stream().filter(a-> a.getMusteriId().equals(musteri.getId())).forEach(System.out::println);
    }
}
