package com.muhammet;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("tekrar sayısını giriniz");
        //int tekrar = new Scanner(System.in).nextInt();
        /**
         * for loop -> for döngüsü ile kodun akışını değiştirebilir belli kod bloklarının
         * tekrar etmesini sağlayabiliriz.
         * SYNTAX:
         * for(int i=0; i<5;i++){
         *   // kod bloğu
         * }
         * for döngüsünda kural doğru olduğu sürece kod blogğu içinde bulunan kodlar
         * çalıtırılmaya devam eder.
         */

        for(int sayac=1;sayac<=10;sayac++){
         //   System.out.println("Muhammmet HOCA");
        }
       // System.out.println("PROGRAM SONLANDIRILDI.");

        /**
         *
         * parantezlerin içi doğru olduğu sürece döngü devam eder.
         * while(true){
         *  // kod
         * }
         */
        int sayi =0;
        while(sayi<5){
            System.out.println("sayi......: "+sayi);
            sayi++;
        }
        for(int sayi1=0;sayi1<5;sayi1++){

        }

        /**
         * SYNTAX:
         * do{
         *  // kod
         * }while(true);
         * while parantex içi doğru olduğu sürece döngü devam eder, ancak dikkat edileceği üzere
         * durumun incelenmesi kod bloğunun çalışmasında sonra gerçekleşmektedir.
         *
         */
        System.out.println("While loop");
        int s=5;
        while (s<5){
            s++;
            System.out.println(s);
        }
        System.out.println("do..while loop");
        int s1 = 5;
        do{
            s1++;
            System.out.println(s1);
        }while (s1<5);







        System.out.println("PROGRAM SONLANDI");
    }
}
