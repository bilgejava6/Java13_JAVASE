package com.muhammet;

import java.util.Scanner;

public class Runer_Cozum {
    public static void main(String[] args) {
        int genislik = 5;
        int x=2,y=2;
        while (true) {
            System.out.println("      8      ");
            System.out.println("  4       6  ");
            System.out.println("      2      ");
            System.out.print("Lütfen yön giriniz...: ");
            int yon = new Scanner(System.in).nextInt();
            switch (yon){
                case 8: x--; if(x<0)x=genislik-1; break;
                case 2: x++; if(x==genislik) x=0; break;
                case 4: y--; if(y<0) y=genislik-1; break;
                case 6: y++; if(y==genislik) y=0; break;
            }
            for (int i = 0; i < genislik; i++) {
                for (int j = 0; j < genislik; j++) {
                    if (i == x && j == y)
                        System.out.print("*  ");
                    else
                        System.out.print(".  ");
                }
                System.out.println();
            }
        }

    }
}
