package com.muhammet;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Runner_Atomic {
    public static void main(String[] args) {
        List<String> listem = List.of("Ahmet","Canan","Mehmet","Demet","Betül","Eylem");

        // isim içinde a harfi olanların sayısını bulunuz.
        int adet2 =0;
        for(int i=0;i<listem.size();i++){
            if(listem.get(i).toLowerCase().contains("a"))
                adet2++;
        }
        System.out.println("adet2...: "+adet2);

        AtomicInteger adet = new AtomicInteger(0);
        listem.forEach(x->{
                if(x.toLowerCase().contains("a"))
                    adet.getAndIncrement();
                    //adet.set(adet.get());
        });

        System.out.println("adet = " + adet);
    }
}
