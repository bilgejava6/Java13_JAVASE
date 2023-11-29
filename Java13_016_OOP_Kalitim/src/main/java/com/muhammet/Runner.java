package com.muhammet;

import com.muhammet.entity.Mudur;
import com.muhammet.entity.Muhendis;

public class Runner {
    public static void main(String[] args) {
        /**
         * Inheritance(Kalıtım),
         * sınıflarımızın ortak paydalarının bir sınıf özelinde toplanarak alt sınıflar tarafından kullanılmasıdır.
         * burada miras verecek ortak paydaların bulunduğu sınıfa parent class(super) sınıf denir.
         * ondan miras alan sınıflara ise child sınıf denir.
         * DİKKAT!!!!
         * [Bir sınıf başka bir sınıf] tan ya da
         * [Bir interface başka bir interface] den
         * kalıtım almak için extends anahtar kelimesi kullanılır.
         *
         */
        Muhendis muhendis = new Muhendis();
        Mudur mudur = new Mudur();

        mudur.id = 1L;
        mudur.ad = "Muhammet";
        mudur.soyad = "HOCA";
        mudur.tcKimlik = "12345678901";
        mudur.telefon = "05555555555";

        System.out.println(mudur.toString());

        muhendis.id = 2L;
        muhendis.ad = "Canan";
        muhendis.soyad = "TAŞKIN";

        System.out.println(muhendis.toString());




    }//main sonu
}// class sonu

