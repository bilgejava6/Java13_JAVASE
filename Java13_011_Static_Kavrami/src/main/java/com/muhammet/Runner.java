package com.muhammet;

public class Runner {
    public static void main(String[] args) {


        Musteri musteri = new Musteri();
        System.out.println("Müşteri orderId...: "+ musteri.orderId);
        musteri.userName = "Muhammet";
        musteri.orderId = ++Depo.orderId;
        System.out.println(musteri);
        System.out.println("Kullanıcı adı...: "+ musteri.userName);
        System.out.println("Müşteri orderId...: "+ musteri.orderId);
        musteri = new Musteri();
        musteri.orderId = ++Depo.orderId;
        System.out.println(musteri);
        System.out.println("Kullanıcı adı...: "+ musteri.userName);
        System.out.println("2. Müşteri OrderId...: "+ musteri.orderId);
        System.out.println("OrderId.....:: "+ Depo.orderId);

        Depo depo = new Depo();
        depo.orderId = 50;

        System.out.println("depo order id......: "+ depo.orderId);

        depo = new Depo();

        System.out.println("depo 2 order ıd....: "+ depo.orderId);



        /**
         * DİKKAT!!!!!
         * bir sınıftan nesne yaratmamızın sebebi nedir?
         * herhangi bir uygulama bilgisayar üzerindeki bilgilere erişmek için daima adreslere ihtiyaç duyar
         * bu bir uygulama olabilir, internet üzerinde bir bilgisayar olabilir, bir program içinde değişken
         * sınıf ya da method olabilir. Yani bilgisayar adresler üzerinden iletişime geçer.
         *
         * Static -> ek bir işleme gerek kalmadan method ya da değişkenin adreslenmesini sağlayarak
         * uygulama ayağa kalakarken adresleme yapar ve bu değerlere direkt erişim yapmanızı sağlar.
         */




    }//main sonu

}//class sonu
