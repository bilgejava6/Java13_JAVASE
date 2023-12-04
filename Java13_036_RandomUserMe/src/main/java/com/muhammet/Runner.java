package com.muhammet;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Runner {
    private static final String URL = "https://randomuser.me/api/?results=5";
    public static void main(String[] args) {

        Scanner sc = null;
        try{
            sc = new Scanner(new URL(URL).openStream(), StandardCharsets.UTF_8);
            while (sc.hasNext()){
                System.out.println(sc.nextLine());
            }
        }catch (Exception exception){
            System.out.println("Beklenmeyen hata...: "+ exception.toString());
        }
    }
}
