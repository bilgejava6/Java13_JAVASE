package com.muhammet.factoryDesignPattern;

public abstract class Tasima {
    private TasimaTipi tasimaTipi;

    public Tasima(TasimaTipi tasimaTipi){
        this.tasimaTipi = tasimaTipi;
    }

    protected abstract void tasimaBasladi();

    public TasimaTipi getTasimaTipi(){
        return tasimaTipi;
    }
}
