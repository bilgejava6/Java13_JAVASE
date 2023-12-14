package com.muhammet;

public class Runner_005 {
    public static void main(String[] args) {
        int[] dizi1 = new int[]{8,24,41,34};
        int[] dizi2 = new int[]{11,33,28,3};
        /**
         * iki dizide en küçük ve en büyük sayılarının ortalaması büyük olan diziyi bul
         */
        if(ortalama(dizi1)>ortalama(dizi2))
            System.out.println("1. Dizi Büyüktür");
        else
            System.out.println("2. Dizi Büyüktür");
    }

    private static double ortalama(int[] dizi){
        int enb = dizi[0];
        int enk = dizi[0];
        for (int i=1;i<dizi.length;i++){
            if (dizi[i]>enb)
                enb = dizi[i];
            if(dizi[i]<enk)
                enk = dizi[i];
        }
       double ort = (enk+enb)/2;
       return ort;
    }
}
