package com.muhammet;

public class Runner_Logic_Matiksal_Operatorler {
    public static void main(String[] args) {

        /**
         *
         *  VE  -> &&
         *  VEYA -> ||
         *
         * Bir e-ticaret sitesinde üyeliğimiz var burada işlem yapmak ürün satın almak istiyoruz.
         */
        String username= "muhammet@gmail.com";
        String password= "123456";
        /**
         * bir kullanıcı doğrulama işleminde kural olarak hangi bilgilerin doğru olmasına gerek vardır?
         *
         *  0 ve 0 -> 0
         *  0 ve 1 -> 0
         *  1 ve 0 -> 0
         *  1 ve 1 -> 1
         *
         */
        boolean girisYapabilirMi;

        girisYapabilirMi =  username == "muhammet@gmail.com" && password == "123456";
        System.out.println("giriş yapabiir mi.....: "+ girisYapabilirMi);

    }//main sonu
}//class sonu
