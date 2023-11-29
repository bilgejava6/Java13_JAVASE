package com.muhammet;

import java.util.Scanner;

public class Runner_do_while_loop {
    public static void main(String[] args) {
        int secim;
        Scanner sc = new Scanner(System.in);

        do{
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
        }while(secim!=0);




        System.out.println("PROGRAM SONLANDI");
    }
}
