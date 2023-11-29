package com.muhammet.entity;

public class Ucak extends Arac{

    public Ucak(){
        super(); // new Arac();
        System.out.println("Uçak sınıfının constructor ı çağırıldı.");
    }
    public Ucak(int kdv){
        super(kdv);
        System.out.println("Uçak parametreli con. çapırıldı");
    }
    public Ucak(int kdv,String ahmet_amca_nasilsin){
        super(ahmet_amca_nasilsin,kdv);
        System.out.println("Uçak 2 parametreli con. çağırıldı.");
    }

}
