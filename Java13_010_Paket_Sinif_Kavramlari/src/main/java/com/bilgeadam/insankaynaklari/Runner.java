package com.bilgeadam.insankaynaklari;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        int sayi = 5;
        Scanner scanner = new Scanner(System.in);
        Islemler islem = new Islemler();
        islem.s1 = 10;
        islem.s2 = 43;
        System.out.println(islem.topla(45,77));
        System.out.println(islem.topla());

    }//main sonu



}//class sonu
