package com.bilgeadam.insankaynaklari;

public class Runner_Matamatik {
    public static void main(String[] args) {
        Matematik matematik = new Matematik();
        int sonuc = matematik.toplam(2,98,54,897);
        System.out.println("Toplam sonucu...: "+ sonuc);

        System.out.println(matematik.enBuyukSayi(2,98,4,123,0));

        matematik.toplam(4,44);

        Integer.parseInt("54");
    }// main sonu


}//class sonu
