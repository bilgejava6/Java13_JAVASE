package com.muhammet;

import java.util.UUID;

public class Runner_Musteri {
    public static void main(String[] args) {

        Musteri musteri1 = new Musteri();
        musteri1.uuid  = UUID.randomUUID().toString();
        musteri1.userName = "muhammed";
        musteri1.orderId = ++Depo.orderId;
        musteri1.dil = "Türkçe";
        System.out.println("müşteri 1 dil...: "+musteri1.dil);
        Musteri musteri2 = new Musteri();
        musteri2.uuid  = UUID.randomUUID().toString();
        musteri2.userName = "canan";
        musteri2.orderId = ++Depo.orderId;
        musteri2.dil = "Almanca";
        System.out.println("müşteri 1...: "+ musteri1.dil);
        System.out.println("müşteri 2...: "+ musteri2.dil);
        Musteri musteri3 = new Musteri();
        musteri3.uuid  = UUID.randomUUID().toString();
        musteri3.userName = "demet";
        musteri3.orderId = ++Depo.orderId;
        musteri3.dil = "Çince";

        System.out.println("***** 1. Müşteri *****");
        System.out.println("uuid......: "+ musteri1.uuid);
        System.out.println("Ad........: "+ musteri1.userName);
        System.out.println("orderId...: "+ musteri1.orderId);
        System.out.println("dil.......: "+ musteri1.dil);

        System.out.println("***** 2. Müşteri *****");
        System.out.println("uuid......: "+ musteri2.uuid);
        System.out.println("Ad........: "+ musteri2.userName);
        System.out.println("orderId...: "+ musteri2.orderId);
        System.out.println("dil.......: "+ musteri2.dil);

        System.out.println("***** 3. Müşteri *****");
        System.out.println("uuid......: "+ musteri3.uuid);
        System.out.println("Ad........: "+ musteri3.userName);
        System.out.println("orderId...: "+ musteri3.orderId);
        System.out.println("dil.......: "+ musteri3.dil);



    }// main sonu
}
