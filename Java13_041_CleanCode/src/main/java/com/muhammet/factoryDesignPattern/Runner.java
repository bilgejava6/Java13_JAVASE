package com.muhammet.factoryDesignPattern;

public class Runner {
    public static void main(String[] args) {
        Tasima tasima = TasimaFactory.builder(TasimaTipi.DENIZ);
        tasima.tasimaBasladi();

    }
}
