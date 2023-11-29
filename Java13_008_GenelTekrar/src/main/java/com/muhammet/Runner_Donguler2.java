package com.muhammet;

public class Runner_Donguler2 {
    public static void main(String[] args) {
        /**
         * 1- 500 arasındaki asal sayıları bulan döngüyü for ile yazınız.
         */
        long start = System.currentTimeMillis();
        for(int i=2;i<=500_000;i++){ // i=9
            boolean asalSayiMi= true;
            for(int j=2;j<=(i/2);j++){
                if(i%j==0){
                    asalSayiMi = false;
                    break;
                }
            }
            if(asalSayiMi) System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("süre....: "+ (end-start));
    }
}
