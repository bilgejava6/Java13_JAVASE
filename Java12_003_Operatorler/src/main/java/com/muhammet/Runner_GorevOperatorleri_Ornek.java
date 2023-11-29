package com.muhammet;

import java.util.Scanner;

public class Runner_GorevOperatorleri_Ornek {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan alınan vize1, vize2 ve final notlarının ortalamalarını bulan programı yazınız
         * v1 %23, v2 %28, f %49 şeklinde ağırlıklıdır.
         */
        int v1,v2,f;
        double ort;
        Scanner sc = new Scanner(System.in);
        System.out.println("1 vize notunu giriniz: ");
        v1 = sc.nextInt();
        System.out.println("2 vize notunu giriniz: ");
        v2 = new Scanner(System.in).nextInt();
        System.out.println("final notunu giriniz: ");
        f = new Scanner(System.in).nextInt();
        ort = (v1*0.23d)+(v2*0.28d)+(f*0.49d);
        System.out.println("Ortalama: "+ort);

    }//main sonu
}// class sonu
