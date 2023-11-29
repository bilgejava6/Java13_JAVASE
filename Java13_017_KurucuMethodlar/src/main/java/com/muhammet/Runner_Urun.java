package com.muhammet;

import com.muhammet.entity.Urun;

public class Runner_Urun {
    public static void main(String[] args) {

        //Urun seker = new Urun();

        Urun seker = new Urun("Şeker","red3332",245d);
        /**
         * DİKKAT!!!!!
         * önemli bir özellik ve bilgi;
         * her sınıf Object adı verilen sınıftan türer ve atası Object tir
         * bu nedenle Object sınıfı içindeki toString() methodu tüm
         * sıunıflarda vardır. Özellikle değiştirilmediği sürece ilgili
         * sınıfta yaratılan nesnenin referans adresini döner.
         */
        System.out.println(seker);


    }// main sonu
}//class sonu
