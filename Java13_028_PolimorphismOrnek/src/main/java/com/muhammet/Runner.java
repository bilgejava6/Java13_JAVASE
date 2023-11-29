package com.muhammet;

import com.muhammet.entity.Memur;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Personel;
import com.muhammet.entity.Tanim;
import com.muhammet.islem.Mutemet;

public class Runner {
    public static void main(String[] args) {

        /**
         *
         * TAŞ -> taş ailesi
         * büyük büyük dede
         *
         * torun
         *
         */

        Tanim t = new Mudur("",23023d);
        t = new Memur("",344d);

        Mutemet mutemet = new Mutemet();
        Mudur mudur =new Mudur("Muhammet HOCA", 30_000d);
        mutemet.MaasHesapla(mudur);

        Memur memur = new Memur("Ayşe ",20000d);
        mutemet.MaasHesapla(memur);
    }
}
