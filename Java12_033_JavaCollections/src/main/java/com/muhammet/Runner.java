package com.muhammet;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {

        ArrayList<String> ifadeDizisi = new ArrayList<>();
        ifadeDizisi.add("muhammet");//0
        ifadeDizisi.add("bugün hava soğuk");//2
        ifadeDizisi.add("demet");//3
        ifadeDizisi.add(1,"hakan"); //1

        for (String ifade: ifadeDizisi) {
            System.out.println(ifade);
        }
        System.out.println("-------------------");
        System.out.println(ifadeDizisi);



    }
}
