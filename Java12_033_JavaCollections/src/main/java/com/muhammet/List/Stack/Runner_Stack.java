package com.muhammet.List.Stack;

import java.util.*;

public class Runner_Stack {
    public static void main(String[] args) {
        /**
         * DİKKAT!!!!!
         * Bu listelerin tümü List interface inden miras aldıkları için polimorphism yapılır.
         */
        List<String> isimler = new ArrayList<>();
        isimler = new LinkedList<>();
        isimler = new Vector<>();
        isimler = new Stack<>();

        Stack<String> isimListesi = new Stack<>();
        isimListesi.add("Ahmet");
        isimListesi.add("Demet");
        isimListesi.add("Bahar");
        isimListesi.add("Elif");
        isimListesi.push("Murat");
        System.out.println(isimListesi);

        /**
         * last in first out -> LIFO
         * E-Ticaret uygulamalarında, ürün satışlarında.
         * firmaların vergi işlemlerinde LIFO kullanıldığında vergi kaybı olur.
         * Avrupa Birliğinde LIFO yasaktır.
         */
        System.out.println("----------------------------------");
        System.out.println(isimListesi.get(3));
        System.out.println("----------------------------------");
        isimListesi.forEach(System.out::println);
        System.out.println("----------------------------------");
        //--- pop, peek, push
        System.out.println(isimListesi.peek()); // en üstte bulunan değeri yani son eklenen değeri okur.
        System.out.println(isimListesi.peek());
        System.out.println(isimListesi.peek());
        System.out.println("-------------------------------");
        System.out.println(isimListesi.pop()); // en üstte olan değeri okur ancak, okuma işlemimden sonra kaydı listeden siler
        System.out.println(isimListesi.pop());
        System.out.println(isimListesi.pop());


    }
}
