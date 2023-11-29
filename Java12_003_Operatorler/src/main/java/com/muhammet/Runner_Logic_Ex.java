package com.muhammet;

import java.util.Scanner;

public class Runner_Logic_Ex {
    public static void main(String[] args) {

        int v,f, ort;
        System.out.println("Vize Notunuzu giriniz.....: ");
        v = new Scanner(System.in).nextInt();
        System.out.println("Final Notunuzu giriniz.....: ");
        f = new Scanner(System.in).nextInt();
        ort = (v + f) / 2;
        // ortlama notu 50 nin üzerinde ise ve final notu 40 ve üzerinde ise geçer değilse kalır.
       if(ort>50 && f>=40){
           System.out.println("Dersten Geçtiniz.");
       }else {
           System.out.println("Dersten Kaldınız.");
       }


    }//main sonu
}// class sonu
