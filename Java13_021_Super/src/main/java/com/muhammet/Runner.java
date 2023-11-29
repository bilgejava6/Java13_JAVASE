package com.muhammet;

import com.muhammet.entity.Arac;
import com.muhammet.entity.Ucak;

public class Runner {
    public static void main(String[] args) {
        /**
         * DİKKAT!!!!!!
         * **** miras alınan sınıfın constructor' ı miras alan sınıflar tarasından da tetiklenir.
         * super keyword,
         * ÖNEMLİ!!!!!!
         * - super her costructor içinde vardır siz yazmasanızda vardır.
         * - bir constructor içinde ilk çalışan kod super() methodu dur.
         * - super keyword unden önce hiç bir kodlama yazılamaz.
         * - super() miras alınan sınıfın constructor unu çağırır.
         *
         */

//        Arac arac = new Arac();
//        Arac arac1 = new Arac(35);

        Ucak ucak = new Ucak(35,"Jet Yakıtı");

        System.out.println("Uçak id........: "+ ucak.uuid);
        System.out.println("Uçak kdv........: "+ ucak.kdv);

    }
}
