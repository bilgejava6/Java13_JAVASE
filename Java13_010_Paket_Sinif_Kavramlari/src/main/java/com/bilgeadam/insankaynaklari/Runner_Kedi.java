package com.bilgeadam.insankaynaklari;

public class Runner_Kedi {
    public static Kedi kediNull;
    public static void main(String[] args) {
        /**
         * bir sınıf başlatılmadığı için içinde var olan özellikler adreslenmediği için,
         * kullanılamazlar. Bu nedenle sınıflardan önce nesne yaratmanız gereklidir, böylecek
         * bellekte adreslenirler ve kullanılabilirler.
         *
         */
         // Kedi.XX şeklinde kullanamazsınız
        /**
         * Sınıf tan nesne üretmektir. new Kedi()
         */


        kediNull = new Kedi();
        System.out.println(kediNull); // işaret ettiği adresi yazdırır.
        System.out.println(kediNull.tur); // null
        System.out.println(kediNull.yas); // 0
        Kedi kedi = new Kedi();
        kedi.tur ="Van Kedisi";
        kedi.yas = 4;
        kedi.uyu();

        Matematik matematik = new Matematik();
        matematik.toplam(32,2);
    }
}
