package com.muhammet.factoryDesignPattern;

public class Kamyon extends Tasima{
    public Kamyon(){
        super(TasimaTipi.KARA);
    }
    @Override
    protected void tasimaBasladi() {
        System.out.println("Kamyon ile tasima basladi.");
    }
}
