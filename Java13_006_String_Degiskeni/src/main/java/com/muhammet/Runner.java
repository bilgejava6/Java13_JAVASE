package com.muhammet;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {

        /**
         * String değişkeni,
         * Bildiğimiz gibi, iki tür değişken bulunmakta idi;
         * 1- primitive data type
         * 2- references data type
         * String değişkeni referans tipli bir değişkendir ve kendi bellek yönetimi vardır. bu değişken türü
         * bellek alanının hem stack hemde heap alanını kullanır. Bu nedenle sabit bir genişliği yoktur
         * içerisine eklene değerle büyümektedir.
         */
        String ifade = "Muhammet";
        String musteriAdi = "mert";
        String makale = "Bugün hava kapalı ve çok ta mutlu değilim, dışarıya çıkmak istemiyor sürekli yatmak istiyorum.";

        String userName = "muhammedali"; // adres 1
        String userName2 = "muhammedali";// adres 2
        /**
         * userName değerini 2 şekilde if ile kontrol ediniz.
         * if(true)
         *  so("Giriş Başarılı")
         */
        if(userName == userName2){
            System.out.println("iki farklı değiken kontrol DOĞRU");
        }else {
            System.out.println("iki farklı değiken kontrol YANLIŞ");
        }

        if(userName == "muhammedali"){
            System.out.println("elle giriş testi...: Giriş Başarılı");
        }else{
            System.out.println("elle giriş testi...: Giriş Başarısız");
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Lütfen kullanıcı adınız giriniz...: ");
        String okunanDeger = sc.nextLine();
        System.out.println("*** OKUDUĞUM DEĞER.....: "+ okunanDeger);

        if(userName.equals(okunanDeger)){ // kontrol ettiğiniz şey, bu iki bilginin referanslarını eşitliğidir.
            System.out.println("consoldan giriş testi...: Giriş Başarılı");
        }else{
            System.out.println("consoldan giriş testi...: Giriş Başarısız");
        }

        //String okunanDeger =  sc.nextLine(); // kullanıcıdan string değer alırısınız.
    }//main sonu
}//class sonu
