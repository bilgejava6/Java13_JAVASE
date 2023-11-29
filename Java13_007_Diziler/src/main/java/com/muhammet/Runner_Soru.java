package com.muhammet;

import java.util.Scanner;

public class Runner_Soru {
    public static void main(String[] args) {
        /**
         * Kullanıcıdan girmek istediği sayı adedini alıp bu uzunlukta bir dizi oluşturacksınız ve
         * istenilen adette sayı girmesini sağlayıp bu sayıları dizinin içine ekleyeceksiniz.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen eleman adedini giriniz...: ");
        int boyut = sc.nextInt();
        int[] dizi = new int[boyut];
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". sayıyı giriniz....: ");
            int sayi = sc.nextInt();
            dizi[i] = sayi;
        }

        System.out.println(dizi);

    }
}
