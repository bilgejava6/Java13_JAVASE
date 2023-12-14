package com.muhammet;

public class Runner_001 {
    public static void main(String[] args) {
        int sayi = 3;
        String karakter = "Ayten";
        char k = '?';
        // sayi + karakter uzunluğu + karakterin int değeri
        int toplam = sayi + karakter.length() + (int)k;
        System.out.println(toplam);

    }
}
