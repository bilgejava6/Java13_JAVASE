package com.muhammet.factoryDesignPattern;

public class Ucak extends Tasima{
    public Ucak(){
        super(TasimaTipi.HAVA);
    }
    @Override
    protected void tasimaBasladi() {
        System.out.println("Ucak ile tasima basladi.");
    }
}
