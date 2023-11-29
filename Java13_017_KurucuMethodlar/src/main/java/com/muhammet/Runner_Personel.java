package com.muhammet;

import com.muhammet.entity.Personel;

import java.util.Random;

public class Runner_Personel {
    public static void main(String[] args) {
        Personel mudur = new Personel();
        mudur.id = new Random().nextLong(1,9999);
        mudur.ad = "Murat";
        mudur.soyad = "TAŞKIN";
        mudur.telefon = "0 555 666 9988";
        System.out.println("Müdür id...........: "+ mudur.id);
        System.out.println("Müdür adı..........: "+ mudur.ad);
        System.out.println("Müdür soyadı.......: "+ mudur.soyad);
        System.out.println("Müdür telefonu.....: "+ mudur.telefon);

        Personel muhendis =
                new Personel("Ayşe","TAŞ","0 555 333 5544");
        System.out.println("Mühendis id........: "+ muhendis.id);
        System.out.println("Mühendis ad........: "+ muhendis.ad);
        System.out.println("Mühendis soyad.....: "+ muhendis.soyad);
        System.out.println("Mühendis telefon...: "+ muhendis.telefon);

    }
}
