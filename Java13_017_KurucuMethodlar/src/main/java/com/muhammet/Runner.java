package com.muhammet;

import com.muhammet.entity.Kedi;

public class Runner {
    public static void main(String[] args) {
        /**
         * Constructor - Yapıcı, Kurucu Method
         * Tanım ->
         * - Return Type geri dönüş tipleri yoktur.
         * - Constructor ismi class ismi ile aynı olmalıdır.
         * - Dışarıdan değer alabilirler ya da boş şekilde olabilirler.
         * - Özel bir builder işlemi yok ise genellikle erişim belirteçleri public olur.
         */
        Kedi kedi = new Kedi();
        //int sayi =  kedi.toplam();
        // int sayi2 = kedi.topla();
        System.out.println(kedi.agirlik);
        System.out.println(kedi.ad);
        System.out.println(kedi.uzunluk);

        Kedi kedi2 = new Kedi("Maviş",50,1200);
        System.out.println("Kedi adı.........: "+ kedi2.ad);
        System.out.println("Kedi uzunluğu....: "+ kedi2.uzunluk);
        System.out.println("Kedi ağırlığı....: "+ kedi2.agirlik);


    }//main sonu
}//class sonu
