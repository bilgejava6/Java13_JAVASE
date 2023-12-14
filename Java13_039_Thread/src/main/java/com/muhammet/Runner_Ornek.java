package com.muhammet;

import java.util.List;

public class Runner_Ornek {
    public static void main(String[] args) {
        Deger deger = new Deger();
        deger.sayi = 985788774;
        Arttirim arttirim = new Arttirim(deger);
        Azaltim azaltim = new Azaltim(deger);
        Thread threadAzaltim = new Thread(azaltim);
        Thread threadArttirim = new Thread(arttirim);
        threadArttirim.start();
        threadAzaltim.start();

    }
}
class Deger{
    int sayi;
}
class Arttirim implements Runnable{
    Deger d;
    public Arttirim(Deger d){
        this.d = d;
    }
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            d.sayi++;
            System.out.println("Arttirim: "+d.sayi);
        }
    }
}

class Azaltim implements Runnable{
    Deger d;
    public Azaltim(Deger d){
        this.d = d;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){
            d.sayi--;
            System.out.println("Azaltim: "+d.sayi);
        }
    }
}