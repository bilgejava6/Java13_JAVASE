package com.muhammet;

public class Runner_002 {
    public static void main(String[] args) {
        int s1 = 5, s4 = 2, s3=6;
        //            5   +  3   +   5  -   5  +  5   +  7   +  5 = 25
        int toplam = s1++ + ++s4 + --s3 - --s1 + s3++ + ++s3 + s1;
        System.out.println("toplam.....: "+ toplam);

        if(s1>s3 && (s3<6 || s4>s1) || s1>0){
            System.out.println("Buradayım");
        }else {
            System.out.println("değilim");
        }

    }
}
