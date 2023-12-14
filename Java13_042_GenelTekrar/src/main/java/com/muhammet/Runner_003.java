package com.muhammet;

import java.util.Objects;

public class Runner_003 {
    public static void main(String[] args) {
        Object[] dizi = new Object[]{"Ahmet",true,"Cemre",6,"Eylül"};
        Object o;
        o = 4;
        o = true;
        o = new Runner_001();
        o = "fsdfssddsf";

        for (Object object : dizi){
            System.out.println(object);
        }
    }
}
