package com.muhammet;

public class Runner_For_Ornek1 {
    public static void main(String[] args) {
        /**
         * 20 ile 50 arasındaki sayıları ekrana yazdıran programı yazınız.
         */
        for(int i=20;i<=50;i++){
           // System.out.println(i);
        }
        /**
         * 1 ile 65-> [1,65] arasıdaki sayıların toplamını ekrana yazdıran programı yazınız.
         */
        int toplam=0;
        for( int i=1 ; i <= 65 ; i++){
           // toplam = toplam + i;
         //  toplam += i;
        }
        //System.out.println("Toplam....: "+ toplam);
        /**
         * 80 ile 32 [80,32] arasınraki sayıları 80 den geriye gelerek ekrana yazdırın
         */
        for(int i=80;i>=32;i--){
        //    System.out.println(i);
        }
        //-----------
        for(int i=0;i<=(80-32);i++){
          //  System.out.println(80-i);
        }
        /**
         * 30 ile 99 (30,99) arasındaki tek sayıları ekrana yazdıran programı yazınız.
         */
        for(int i=31; i<99;i+=2){
      //      System.out.println(i);
        }
        /**
         * 123 ile 21 [123,21] arasındaki 5 ve 5 in katı olan sayıların toplamını bulan kodu yazınız.
         */
      //  toplam =0;
        for(int i=120;i>21;i-=5){
          //  toplam += i;
        }
       // System.out.println("toplam.....: "+  toplam);

        /**
         * 1. Genel yapılabilecek hatalar ve kullanımlar.
         */
        for(int i=0;i<10;i++);
            System.out.println("bir kod parçası");


    }
}
