package com.muhammet.factoryDesignPattern;

public class TasimaFactory {
    public static Tasima builder(TasimaTipi tasimaTipi){
        switch (tasimaTipi){
            case KARA: return new Kamyon();
            case HAVA: return new Ucak();
            case DENIZ: return new Gemi();
            default: return new Kamyon();
        }
    }
}
