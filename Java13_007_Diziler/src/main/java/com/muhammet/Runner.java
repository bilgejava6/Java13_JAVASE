package com.muhammet;

public class Runner {
    public static void main(String[] args) {
        /**
         *
         * char karakter = 65; // A
         *
         *
         * {34,3424,23423,42} --> kullanıcı sıra no, sayılar, not
         * {"xcz","zxczc","czxcz"} -> kullanıcı adları, günler, aylar
         * {true,false,false} --> hobileriniz?
         * ....
         * int sayi = 45;
         * bir array tanımlamak;
         * int[] sayilar;
         * int [] gunler;
         * int aylar[];
         * bir diziye(array) değer nasıl atanır?
         * int[] sayilar = 4; // yanlış
         * DİKKAT!!!!
         * bir dizinin kullanılabilmesi için önelikle başlatılması(initilalize) gereklidir.
         * bu işlem 2 şekilde yapılır;
         * int[] sayilar = new int[uzunluk];
         * int[] sayilar = {3,2,2,21,2}; // burada girilen bilgiler kadar değerler atanır ve dizinin uzunluğu
         * atanan değerler kadar olup sabit kalır.
         */
        int sayi = 5;
        int[] sayilar = new int[5]; // {0,0,0,0,0} // {int,int,int,int,int}
        int[] gunler = {1,2,3,4,5,6,7}; // 7 elemanlı dizi
        /**
         * DİKKAT!!!!!
         * - başlatılmamış(initialize) bir dizinin değer ataması yapılamaz ve hata fırlatır.
         * - sınırları dışında diziye değer atamaya çalışmak hata fırlatır ()
         * - sınırları dışında bir dizinin değerlerini okumaya çalışmak hata fırlatır. (ArrayIndexOutOfBoundsException)
         */
        /**
         * Dizinin içinden değer okumak
         */
        System.out.println("sayı.......: "+ sayi);
        System.out.println("günler(0)..: "+ gunler[0]); // dizi[index]
        System.out.println("günler(1)..: "+ gunler[1]);
        // index number.... 0...n -> boyut-1
        //System.out.println("günler(7)..: "+ gunler[7]);
        sayi = 45;
        gunler[4] = 54;
        /**
         * neler dizi olarak tanımlanabilir?
         */
        int[] sayiDizisi;
        double[] ondalikDizisi;
        boolean[] hobilerim;
        String [] ifadelerDizisi;
        Runner[] runnerDizisi;


    }
}
