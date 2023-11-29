package com.muhammet;

public class Runner_Iliskisel_Operatorler {
    public static void main(String[] args) {
        /**
         * Relational Operators
         * --> Bir değer diğer değerden büyük müdür? Evet/Hayır
         * boolean -> true/false
         */
        int vizeNotu = 50;
        int finalNotu = 67;
        int ort = (vizeNotu + finalNotu) / 2;
        /**
         * öğrencinin notu 50 den büyük müdür?
         */
        boolean durum;
        durum = ort > 50; // eğer ort 50 den büyükse durum true olur
        System.out.println("öğrencinin durumu....: "+ durum);
        /**
         *  == -> iki değer bir birine eşit ise true değil ise false
         *  != -> iki değer bir birine eşit değil ise true eşit ise false
         *  < ->  ilk değer ikinci değerden küçük müdür? true/false
         *  > ->  ilk değer ikinci değerden büyük müdür? true/false
         *  <= -> ilk değer ikinci değerden küçük veya eşit midir? true/false
         *  >= -> ilk değer ikinci değerden büyük veya eşit midir? true/false
         */
    }
}
