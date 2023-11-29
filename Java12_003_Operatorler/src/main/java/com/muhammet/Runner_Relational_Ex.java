package com.muhammet;

import java.util.Scanner;

public class Runner_Relational_Ex {
    public static void main(String[] args) {

        System.out.print("Vize Notunuzu giriniz.....: ");
        int v = new Scanner(System.in).nextInt();
        System.out.print("Final Notunuzu giriniz.....: ");
        int f = new Scanner(System.in).nextInt();
        int ort = (v + f) / 2;
        // eğer öğrencinin notu 50' ye eşit ve üzerinde ise geçti değilse kaldı yazsın.
        if(ort >= 50){
            System.out.println("Dersten Geçtiniz.");
        }else{
            System.out.println("Dersten Kaldınız.");
        }

    }//main sonu
}//class sonu
