package com.muhammet;

public class Runner_Tamsayi_Degiskenleri {
    public static void main(String[] args) {
        /**
         * Değişken Türleri Java için 2 ye ayrılır.
         * 1- Primitive DataType - İlkel Değişken Türleri
         * 1.1. Sayısal Değişken Türleri
         * 1.1.1. Tamsayı Değişken Türleri
         * 1.1.1.1. byte sayı türü -> 8 bit -> 2^8 = 256 adet değer alabilir.
         *
         * 2- Reference DataType - Referans Değişken Türleri
         */
        /**
         * Değişken nasıl tanımlanır?
         * Syntax -> [ Data Type + Değişken Adı ] bir değişken tanımlar.
         * DİKKAT!!!!!
         * Değişkenleri tanılarken uyulması gereken kurallar vardır bazı kurallar gerekli değil fakat
         * doğru yazım için uyulması gereken kurallardır.
         */
        byte enKucukSayiDegiskeni;
        byte enkucuksayi;
        byte en_kucuk_sayi;
        // byte 1EnkucukSayi; // hatalı yazım
        // byte en-kucuk-sayi; // hatalı yazım
        // byte en kucuk sayi; // hatalı yazım
        byte enkucuksayi1;
        byte en1kucuk3sayi;
        //byte en*Kucuk?Sayi; // hatalı yazım
        byte PI;
        /**
         * Tanımlanmış Bir değişkene değer atama işlemi nasıl yapılır?
         * 1- Syntax -> [degişkenin adı = atanılacak değer] şeklinde yapılır.
         * Yeni tanımlanacak olan bir değişkene atam yapmak?
         * 2- Syntax -> [Data Type + Name = Value] şeklinde yapılır.
         *
         */
         // 1
         enKucukSayiDegiskeni = 5;
         // 2
         byte byte_sayi = 43;

        /**
         * Değişkenlerin değerleri nasıl yazdırılır? Kullanılmak istenildiğinde nasıl kullanılır?
         */
        System.out.println("byte_sayısı değeri.......: "+ byte_sayi);
        /**
         * Değişkenleri aynı anda tanımlaya biliyor muyuz ve aynı anda değer atayabiliyor muyunz?
         */
        byte b_sayi1,b_sayi2,b_sayi3;
        /**
         * DİKKAT!!!!!
         * daha önceden değişken adı olarak tanımlanmış bir ifadeyi tekrar tanımlayamazsınız.
         */
        byte b_sayi4=3,b_sayi5=9,b_sayi6=12, toplam;
        /**
         * İstisna!!!!
         * Her dilin default olarak kabul ettiği değerler vardır. Bu nedenle işlemler bu default değerler
         * üzerinde işler. Bu nedenle uyuşmazlık yaşanır. Bunu aşmak için CAST işlemi yapılır sorun düzelir.
         */
        toplam = (byte) (b_sayi5 + b_sayi4);
        System.out.println("toplam.......: "+ toplam);

        /**
         * Bir değişkenin sınırları ve sınırların aşılması durumunda bellekte ve ifadece oluşanlar
         * byte -> 2^8 = 256 adet değer alabilir.      -128,-127,-126,-125....-2,-1,0,1,2....127
         */
        byte min_byte = -128;
        byte max_byte = 127;

        byte b_deger = (byte) 257; // cast işlemi
        System.out.println("b_deger.......: "+ b_deger); // burada ne yazacak?

        byte bs1 = 34;
        System.out.println("bs1.......: "+ bs1);
        bs1 = 98;
        System.out.println("bs1.......: "+ bs1);

        /**
         * short -> 2^16 = 65536 adet değer alabilir.  -32768, -32767, -32766, -32765....-2,-1,0,1,2....32767
         */
        short min_short = -32768;
        short max_short = 32767;
        System.out.println("min_short.......: "+ min_short);

        /**
         * (Integer) int -> 2^32 = 4294967296 adet değer alabilir.
         * -2147483648, -2147483647, -2147483646, -2147483645....-2,-1,0,1,2....2147483647
         * Her dilde default olarak tanımlanan değişken türleri vardır. int de Java için default olarak tanımlanan
         * değişken türüdür. Bu aslında şunu niteler, bir sayısal tam sayı işlemleri yaptığınızda java bunu
         * int olarak algılar.
         */
        byte yeni_toplam = 5 + 4;
        System.out.println("yeni_toplam.......: "+ yeni_toplam);
        short yeni_toplam1 = 5 + 4;
        System.out.println("yeni_toplam.......: "+ yeni_toplam1);
        int yeni_toplam2 = 5 + 4;
        System.out.println("yeni_toplam.......: "+ yeni_toplam2);
        /**
         * Burada işleme tabi tutulan değerler int olarak işlenir ve sonuçta int olarak dönülür.
         */
        System.out.println("Yeni Toplam....... "+ (4 + 5));

        /**
         * (Long) long -> 2^64 = 18,446,744,073,709,551,616 adet değer alabilir.
         * -9223372036854775808, -9223372036854775807, -9223372036854775806, -9223372036854775805....-2,-1,
         * 0,1,2....9223372036854775807
         * --> l, L
         */
        long l_deger_b = 5;
        long l_deger_s = 500;
        long l_deger_i = 5000000;
        long l_deger = 50000000000l;
        l_deger = 50000000000L;

        long uzun_sayi = 10000L * 50 * 100000 * 360 * 10;
        System.out.println("uzun_sayi.......: "+ uzun_sayi);// 180,000,000,000,000

        /**
         * 1,000,000,000,000 + 1,500,000 = -
         */

        /**
         * _ alt çizgi kullanımı
         */
        long uzun_sayi1 = 10000000000000L;
        long uzun_sayi2 = 10_000_000_000_000L;
        long uzun_sayi3 = 98_4545_5453_5345_55L;

        System.out.println("uzun_sayi1.......: "+ uzun_sayi1);
        System.out.println("uzun_sayi2.......: "+ uzun_sayi2);
        System.out.println("uzun_sayi3.......: "+ uzun_sayi3);

        /**
         * Ondalıklı sayı türleri
         * float -> 2^32 = 4294967296 adet değer alabilir.
         * DİKKAT!!!!1
         * java da ondalıklı değerler için kullanılan default değişken türü double dır.
         */
        float f_sayi = 590.54f;
        f_sayi = 54.345443F;
        System.out.println("f_sayi.......: "+ f_sayi);

        /**
         * double -> 2^64 = 18,446,744,073,709,551,616 adet değer alabilir.
         */
        double d_sayi = 5435345344345.54535345345345;
        d_sayi = 4234324.234242423d;
        d_sayi = 4234324324434244.234242423D;

        int sayi = (int)544444.99999f;
        System.out.println("sayi.......: "+ sayi);
        int t_sayi = 46;
        float f_sayi4 = t_sayi;

        /**
         * DİKKAT!!!!
         * Kullanmakta olduğumuz tüm ilkel veri türlerinin kapsayıcı sınıfları bulunur ve
         * bunlar referans veri tipleridir. Tanımları ilkel veri tür adlarının
         * sınıf adı şeklinde kullanılır halleridir.
         */
        System.out.println("byte max değeri.......: "+ Byte.MAX_VALUE);
        Byte bb_sayi = 5;
        System.out.println("short max değeri.......: "+ Short.MAX_VALUE);
        System.out.println("int max değeri.......: "+ Integer.MAX_VALUE);
        System.out.println("long max değeri.......: "+ Long.MAX_VALUE);
        System.out.println("float max değeri.......: "+ Float.MAX_VALUE);
        System.out.println("double max değeri.......: "+ Double.MAX_VALUE);


        /**
         * Karakter veri tipleri.
         * char ->
         * A -> sayı olarak algılar. 0-1
         * ? -> sayı olarak algılar. 0-1
         */
        char karakter = 't';
        System.out.println("karakter.......: "+ karakter);
        char sayiyal_olarak_karakter = 116;
        System.out.println("sayiyal_olarak_karakter.......: "+ sayiyal_olarak_karakter);

        System.out.print('M');
        System.out.print('u');
        System.out.print('h');
        System.out.print('a');
        System.out.print('m');
        System.out.print('m');
        System.out.print('e');
        System.out.print('t');
        /**
         * String veri tipi
         * "" tırnak ile yazılan tüm ifadeler String olarak tanımlanır. Javanın default tanımlarından biridir.
         */
        System.out.println("Muhammet");

        String ad = "Muhammet";
        System.out.println("ad.......: "+ ad);

        /**
         * boolean veri tipi
         * ---> 1 bit tir. -> 0 veya 1 değerini alabilir.
         * -> true - false  - 1-0 / evet-hayır / doğru-yanlış
         */
        boolean isiklar_acik_mi = true;
        System.out.println("isiklar_acik_mi? .......: "+ isiklar_acik_mi);

        boolean isActive = true; // 1 kutu

        String aktifMi = "Evet"; // 32 kutu

        byte aktifMidir = 1; // 8 kutu




    }
}
