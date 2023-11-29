package com.muhammet;

import java.util.Scanner;

public class Runner_Donguler {
    public static void main(String[] args) {
        boolean dongu = true;
        int secim = 1;
        while(secim!=0){
            Scanner sc = new Scanner(System.in);
            System.out.println("Çıkış yapmak istiyor musunuz?(E/H) ");
            String durum = sc.nextLine();
            if(durum.equals("E"))
                secim=0;

        }
        System.out.println("ÇIKTIK");
    }// main sonu
}// class sonu
