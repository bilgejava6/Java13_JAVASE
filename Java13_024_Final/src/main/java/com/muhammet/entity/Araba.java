package com.muhammet.entity;

/**
 * DİKKAT!'!!!
 * bir sınıfın değişmezliği onun başka
 * sınıflar tarafından miras alınamaz kılınmasıdır.
 */
public final class Araba extends Arac{
    public String motorTuru;
    public int yolcuKapasitesi;

    @Override
    public void hizlan(){
        hiz += 41;
    }
    /**
     * DİKKAT!!!!
     * final keyword ü bir methodun değişmezliğini
     * sağlaması demek onunu miras alan sınıfta
     * override edilemez kılması demektir.
     */
//    @Override
//    public void dur(){
//
//    }


}
