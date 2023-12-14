package com.muhammet.factoryDesignPattern;

public class Gemi extends Tasima{

    public Gemi(){
        super(TasimaTipi.DENIZ);
    }

    @Override
    protected void tasimaBasladi() {
        System.out.println("Gemi ile tasima basladi.");
    }
}
