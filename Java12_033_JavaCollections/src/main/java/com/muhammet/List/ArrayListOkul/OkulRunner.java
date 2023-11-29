package com.muhammet.List.ArrayListOkul;

import java.util.ArrayList;
import java.util.List;

public class OkulRunner {
    public static void main(String[] args) {
        Ogretmen ogretmenAsli = new Ogretmen();
        ogretmenAsli.ad = "Asli";
        ogretmenAsli.brans = Branslar.Matematik;

        Ogretmen ogretmenAli = new Ogretmen();
        ogretmenAli.ad = "Ali";
        ogretmenAli.brans = Branslar.Turkce;

        Ogretmen ogretmenAsi = new Ogretmen();
        ogretmenAsi.ad = "Asi";
        ogretmenAsi.brans = Branslar.Tarih;

        List<Ogrenci> sinif = new ArrayList<>();

        Ders dersMatematik = new Ders();
        dersMatematik.ogretmen = ogretmenAsli;
        dersMatematik.dersAdi = Dersler.MATEMATIK;
        dersMatematik.vizeNotu = 16;
        dersMatematik.finalNotu = 64;

        Ders dersTurkce = new Ders();
        dersTurkce.ogretmen = ogretmenAli;
        dersTurkce.dersAdi = Dersler.TURKCE;
        dersTurkce.vizeNotu = 65;
        dersTurkce.finalNotu = 77;

        List<Ders> dersListesi = new ArrayList<>();
        dersListesi.add(dersTurkce);
        dersListesi.add(dersMatematik);

        Ogrenci ogrenci = new Ogrenci();
        ogrenci.ad = "Ayşe";
        ogrenci.adres = "Ankara";
        ogrenci.veli = "Hakan";
        ogrenci.dersListesi = dersListesi;

        sinif.add(ogrenci);

        dersMatematik = new Ders();
        dersMatematik.ogretmen = ogretmenAsli;
        dersMatematik.dersAdi = Dersler.MATEMATIK;
        dersMatematik.vizeNotu = 96;
        dersMatematik.finalNotu = 64;

        dersTurkce = new Ders();
        dersTurkce.ogretmen = ogretmenAli;
        dersTurkce.dersAdi = Dersler.TURKCE;
        dersTurkce.vizeNotu = 99;
        dersTurkce.finalNotu = 86;

        dersListesi = new ArrayList<>();
        dersListesi.add(dersTurkce);
        dersListesi.add(dersMatematik);

        ogrenci = new Ogrenci();
        ogrenci.ad = "Hakan";
        ogrenci.adres = "İzmir";
        ogrenci.veli = "Bahar";
        ogrenci.dersListesi = dersListesi;

        sinif.add(ogrenci);

        sinif.forEach(ogr->{
            System.out.println("Öğrenci "+ ogr.ad);

            ogr.dersListesi.forEach(ders->{
                System.out.println(ders.dersAdi+"  ort...: "+ders.ort());
            });

        });



    }
}
