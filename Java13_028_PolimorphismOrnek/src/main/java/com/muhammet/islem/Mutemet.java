package com.muhammet.islem;

import com.muhammet.entity.Memur;
import com.muhammet.entity.Mudur;
import com.muhammet.entity.Personel;

public class Mutemet {

    public void MaasHesapla(Personel personel){
        personel.hesapla();
        System.out.println(personel.getUnvan()+" maaş bilgisi");
        System.out.println("------------------------------------");
        System.out.println("ad......: "+ personel.getIsim());
        System.out.println("maaş....: "+ personel.getMaas());
        System.out.println();
    }

//    public void MaasHesapla(Mudur mudur){
//        mudur.hesapla();
//        System.out.println("Müdür maaş bilgisi");
//        System.out.println("--------------------");
//        System.out.println("ad.....: "+ mudur.getIsim());
//        System.out.println("maaş...: "+ mudur.getMaas());
//    }
//
//    public void MaasHesapla(Memur memur){
//        memur.hesapla();
//        System.out.println("Memur maaş bilgisi");
//        System.out.println("--------------------");
//        System.out.println("ad.....: "+ memur.getIsim());
//        System.out.println("maaş...: "+ memur.getMaas());
//    }


}
