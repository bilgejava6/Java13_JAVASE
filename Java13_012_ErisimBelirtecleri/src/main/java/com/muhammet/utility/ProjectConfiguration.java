package com.muhammet.utility;

public class ProjectConfiguration {
    private static Long sayac =0L;

    public static Long getSayac(){
        return ++sayac;
    }
}
