package com.bilgeadam.insankaynaklari;

/**
 * Java Class
 * - Sınıfarın belli üyeleri olur ve bunlar;
 * -- inner class
 * -- property
 * -- methods
 * temel tanımlanan bileşenleridir.
 */
public class Islemler {
    /**
     * Örn: Kedi
     * Değişken
     * --- bir varlığı niteleyen özellikleri belirtmek için kullanabiliriz.
     * int ayakSayisi;
     * String tuyRengi;
     * int uzunluk;
     * String goz;
     * int yas;
     *
     * Metod
     * bir varlığın yapabildiği tüm işlevsellikler için kullanırız.
     * public void uyu();
     * public String miyavla();
     * public void yemekYe();
     * pulic Tepki seslenmek(String seslenmeSekli);
     *
     */

    /**
     * Kullanıcının verdiği sayılarla işlemler yapılacak
     * temel işlemleri yerine getirecek.
     */
    /**
     * Bir değişkenin scope' u içinde bulunduğu
     * {} parantezlerin içidir. yani tanımlandığı yer
     * içinde her alandan çağırım yapılabilir.
     * DİKKAT!!!!!!!
     * kodlamalarda akış yukarıdan aşağıya doğrudur, döngü ve koşul ifadeleri ile akış
     * yön değiştirir. Ancak, bir sınıf içinde tanımlanan sınıf üyeleri bir birlerine
     * ulaşabilirler, burada öncelik sonralık yoktur. Çünkü derleyici tarafından sınıf
     * bir bütün olarak elealınır.
     * DİKKAT!!!!
     * methodlar içinde tanımlanan dğeişkenler başlatılmak(initialize) zorundadır. Ancak sınıf
     * içinde tanımlanan değişkenker tanımlanmasalar bile defult değerler alırlar.
     * primitive data typelar akım geçmediği için 0 değeri alırlar.
     * References Data Type lar NULL değer alırlar.(bu da genellikle hataya neden olur.)
     */
    public int s3, s4;

    public void islem(){
        int sayi=6,sayii=4;
        int bolum = sayii/sayi;
    }

    public int topla(){
        int toplam = s1+s2;
        return toplam;
    }
    public int topla(int sayi1, int sayi2){
        /**
         * Methodlar içinde tanımlanan değişkenlere yerel değişken denilmektedir.
         */
        int toplam = sayi1 + sayi2;
        return toplam;
    }

    /**
     * TODO: Bu kod gereksiz tekrar düzenleyelim.
     * @param sayi3
     * @param sayi4
     * @return
     */
    public int carp(int sayi3, int sayi4){
        int carpim = sayi3 + sayi4;
        return carpim;
    }
    public int s1, s2;
}
