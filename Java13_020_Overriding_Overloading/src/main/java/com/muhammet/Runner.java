package com.muhammet;

import com.muhammet.entity.Araba;
import com.muhammet.entity.Ucak;

public class Runner {
    public static void main(String[] args) {
        Ucak ucak = new Ucak();
        Araba araba = new Araba();
        System.out.println("Uçağın hızı.......: "+ ucak.hiz);
        System.out.println("Arabanın hızı.....: "+ araba.hiz);
        ucak.hizlan();
        araba.hizlan(4);
        araba.hizlan();
        System.out.println("Uçağın hızı.......: "+ ucak.hiz);
        System.out.println("Arabanın hızı.....: "+ araba.hiz);

    }
}
