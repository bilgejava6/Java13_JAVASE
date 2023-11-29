package com.muhammet;

/**
 * public -> Daha sonra ayrıca bir eğitim alacaksınız. (Erişim Belirteci)
 * class -> Daha sonra anlatılacak.
 * Main -> bu oluşturulan dosya (Class Name) adı dır.
 * { } -> süslü parantezler, herhangi bir class, method ya da diğer bileşenlerin kod yazılabilir alanlarını
 * belirler.
 */
public class Java13_Runner {

    /**
     * static -> tanımı yapılan bileşenin adres durumunu uygulama açılırken belirleyen bir
     * belirteç olarak tanımlanabilir. ayrıca bir ders yapılacak.
     * private static String ad;
     * static {
     *
     * }
     * void[ return type] -> bir method için geri dönüş tipinin olmadığını ifade eder. ayrıca bir dersimiz olacak
     *
     * main -> çalıştırılabilir bir sınıfın main methodunun olması gereklidir. bu method ta şuan bizimi için main dir.
     *
     * String[] -> bir ifade dizisini anlatır ancak ilk kodlamalarımızda kullanacağımız bir tanım değildir.
     *
     * {} -> sınıfta olduğu gibi method içinde de kullanılan bu parantezler sınırları belirler ve kodlamaların
     * bu sınıflar içinde yapılması gerektiğini anlatır.
     */

    /**
     * compiler ; yazmış olduğunuz kodları derleyerek JVM üzerinde istenilen işletim sisteminin
     * anlayacağı dile çevrilir ve java tarafından çalıştırılır.
     *
     */

    public static void main(String[] args) {
        /**
         * System -> this computer. sizin bilgisayarınız.
         * out -> çıktı vermek için export işlemi yapıyor bir nevi
         * print -> yazdırma işlemi yapılcak
         * -ln(line) -> tüm satıra çıktı vermek
         *
         * NOT!!!!
         * [; - noktalı virgül] bir kod bloğunun tamamlandığını farklı bir bloğun başlayabileceğini ifade eder
         * tüm kodlamalarımızdan sonra kodu tamamlamak için kullabırız.
         * istisna olarak bazı kullanımloarı vardır ve {} lerin sonuna eklenmezler.
         *
         *
         * ctrl+space - kod yardımcısını açar
         */
        System.out.println("Muhammet hoca ile ilk kodlamalar"); // ln -> tüm satırı kaplar ve enter tuşuna basılmış gibi işlem görür
        System.out.print("bir ifade yazalım");
        System.out.println("    bu da başka bir ifade");
        System.out.print("trereterte");

    }

}