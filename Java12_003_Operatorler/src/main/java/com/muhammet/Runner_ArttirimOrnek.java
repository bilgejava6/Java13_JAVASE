package com.muhammet;

public class Runner_ArttirimOrnek {
    public static void main(String[] args) {
        int sayi = 6;
        System.out.println("sayi.....: "+ sayi++); // 6
        System.out.println("sayi.....: "+ sayi); // 7

        int sayi2 = 6;
        System.out.println("sayi2.....: "+ ++sayi2); // 7
        System.out.println("sayi2.....: "+ sayi2); // 7
    }
}
