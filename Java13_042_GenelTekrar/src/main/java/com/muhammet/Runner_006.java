package com.muhammet;

public class Runner_006 {
    public static void main(String[] args) {
        int sayi = 5;
        /**
         * bu ifadenin foktörüyelini hesaplayan bir method yazınız.
         */
        System.out.println(sayi+" nin faktöriyel i....:"+ faktoriyelR(sayi));
    }

    public static int faktoriyel(int sayi){
        int result =1;
        for (int i=sayi;i>=1;i--){
            result *= i;// 5,20,60,120,120
        }
        return result;
    }


    public static int faktoriyelR(int sayi){
        if(sayi==1)
            return 1;
        return sayi * faktoriyelR(--sayi);
    }
    /**
     *
     *  5 * (4 * (3 * (2 * (1)))) -> 120
     *
     */

}
