package com.muhammet;

import java.util.Scanner;

public class Runner_while_loop {
    public static void main(String[] args) {
        int secim=1;
        Scanner sc = new Scanner(System.in);

        while(secim!=0){
            System.out.println("**************************");
            System.out.println("****  HESAP MAKİNESİ *****");
            System.out.println("**************************");
            System.out.println();
            System.out.println("1- Toplama");
            System.out.println("2- Çıkartma");
            System.out.println("3- Çarpma");
            System.out.println("4- Bölme");
            System.out.println("0- Ç I K I Ş");
            System.out.print("lütfen seçiniz.....: ");
            secim = sc.nextInt();
        }




        System.out.println("PROGRAM SONLANDI");
    }//main sonu
}//class sonu
