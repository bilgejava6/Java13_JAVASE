package com.muhammet;

import com.muhammet.entity.Arac;

public class Runner {
    public static void main(String[] args) {

        /**
         * OOP -> Object Oriented Programming
         * Nesne Yönelimli Programlama
         * C, C++,
         *
         * Abstraction - Soyutlama
         * Soyutlamalar tamamen kurgudan ibarettir. Bir varlığı genel hatları ile tanımlarsınız.
         */

        Arac arac; // Arac referans türünden adı arac olan bir değişken tanımlama işlemidir.
        arac = new Arac(); // Arac türünden bir nesne yaratılması işlemidir. Burada araç nesnesinin adresi değişkene atanır.
        // Artık nesnesi yaratılan tür, içindeki özelliklerini kullanıma açar. Aslında yapılan işlem adresleme ve değişkenlerin
        // kullanıma sunulmasıdır.
        arac.hizi = 54;/// bir nesnenin içinde bulunan properties lerin değerlerini değiştirmek için object değişken adı .(nokta) değişken adı
        arac.maxHiz = 300;
        System.out.println("Değer Okuma.....: "+ arac.maxHiz);
    }//main sonu
}//class sonu
