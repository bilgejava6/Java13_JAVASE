package com.muhammet;

public class Runner_Ornek {
    public static void main(String[] args) {
        /**
         * elimizde bir dizi sayılar bu sayılardan en büyük olanını ve en küçük olanaını nasıl blurum?
         */
        int[] sayilar = {-2,33,333,2,0,23,-4332,32,1,5,98,7,564,543,435,3534,5345543,535,43,-345354535};
        int min,max;
        min = sayilar[0];
        max = sayilar[0];
        for(int i=0;i<sayilar.length;i++){
            if(sayilar[i]<min) min=sayilar[i];
            if(sayilar[i]>max) max = sayilar[i];
        }
        System.out.println("min......: "+ min);
        System.out.println("max......: "+ max);

    }
}
