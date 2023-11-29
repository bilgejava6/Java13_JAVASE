package com.muhammet.List.ArrayListOkul;

public class Ders {
    Dersler dersAdi;
    Ogretmen ogretmen;
    int vizeNotu;
    int finalNotu;

    public int ort(){
        return (vizeNotu+finalNotu)/2;
    }
}
