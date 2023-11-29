package com.muhammet;

import com.muhammet.repository.MusteriRepository;

public class Runner {
    public static void main(String[] args) {

        MusteriRepository repository = new MusteriRepository();
        repository.save("Muhammet","0 555 666 4004","Ankara");
        repository.save("Demet","0 555 666 4004","İzmir");
        repository.save("Güneş","0 555 666 4004","Tokat");

        repository.findAll();

        /**
         *
         * ÖDEV,
         * Bir satış sistemi istiyorum, müşteri ye ürün satışı yapıldığı bilgisini tutan bir sistem
         * satışları listeleyerek gösteren bir sistem.
         * Müşteri adından yapılan satışı göstreren method.
         *
         */

    }//main sonu
}//class sonu
