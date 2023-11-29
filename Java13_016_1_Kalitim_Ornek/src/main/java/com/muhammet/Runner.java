package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {
    public static void main(String[] args) {

        Kedi kedi = new Kedi();
        kedi.ad= "Tekir";
        kedi.agirlik = 600;
        kedi.boy = 40;
        kedi.beslenmeSekli = "Etobur";

        for(int i=0;i<(24*1250);i++){
            /**
             * Kod akışını bekletmek için kullanıyoruz. milisaniye cinsinden değer alır.
             */
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println((i+1)+". saat teyiz.");
            kedi.birSaat();
        }



    }
}
