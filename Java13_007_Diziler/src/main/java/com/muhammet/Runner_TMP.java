package com.muhammet;

import java.util.Scanner;

public class Runner_TMP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("lütfen eleman adedini giriniz...: ");
        int boyut = sc.nextInt();
        String[] dizi = new String[boyut];
        for(int i=0;i<boyut;i++){
            System.out.print((i+1)+". adı giriniz....: ");
            String sayi = new Scanner(System.in).nextLine();
            dizi[i] = sayi;
        }



        for(int i=0;i<boyut;i++)
            System.out.println(dizi[i]);
    }
}
