package com.muhammet;

import com.muhammet.entity.Arac;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Arac arac = new Arac(12,6);
        System.out.println(arac);

        System.out.println("Seçiminiz...: "+ sec());
    }

    public static void ekranaYaz(){
        System.out.println("***************");
        System.out.println("*** DENEME ****");
        System.out.println("***************");
    }

    public static int sec(){
        ekranaYaz();
        System.out.print("seçiniz...: ");
        int secim = new Scanner(System.in).nextInt();
        return  secim;
    }



}
