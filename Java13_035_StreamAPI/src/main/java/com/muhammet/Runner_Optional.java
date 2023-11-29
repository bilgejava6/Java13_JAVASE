package com.muhammet;

import com.muhammet.entity.Satis;

import java.util.Optional;

public class Runner_Optional {
    private static Optional<Satis> satis = Optional.empty();
    public static void main(String[] args) {
        System.out.println("**** UYGULAMA BAŞLADI ****");
        System.out.println();
        /**
         * Optional -> Java 8 ile gelen bir yapıdır. Bu yapı ile null pointer exception'larının önüne geçilir.
         * Optional aslında boş, null olabilecek nesneler için bir farkındalık yaratır. Yani bu nesne boş
         * gelebilir sen dolu ise kullan demenin başka bir yoludur.
         * 1. ifPresent() -> optional nesne dolu ise içindeki değeri kullanır. boş ise hiçbir şey yapmaz.
         * 2. isEmpty() -> optional nesne boş ise true, dolu ise false döner.
         * 3. isPresent() -> optional nesne dolu ise true, boş ise false döner.
         * 4. get() -> optional nesne dolu ise içindeki değeri döner. boş ise NoSuchElementException hatası fırlatır.
         * 5. ifPresentOrElse() -> optional nesne dolu ise içindeki değeri döner. boş ise default değeri döner.
         */
        satis.ifPresent(s-> System.out.println(s.getUrunAdi())); // ekrana çıktı vermez
        satis.ifPresentOrElse(s-> System.out.println(s.getUrunAdi()), ()-> System.out.println("ürün yok"));
        satis = Optional.of(new Satis("Kalem", 10.0));
        satis.ifPresent(s-> System.out.println(s.getUrunAdi()));
        satis.ifPresentOrElse(s-> System.out.println(s.getFiyat()), ()-> System.out.println("ürün yok"));
        if(satis.isEmpty()){
            // Eğer satis nesnesi boş ise burası çalışır
        }
        if(satis.isPresent()){
            // Eğer satis nesnesi dolu ise burası çalışır
        }
        //satis.orElseThrow(); // satis nesnesi boş ise NoSuchElementException hatası fırlatır.
        satis.orElseThrow(()-> new RuntimeException("ürün bulunamadı")); // satis nesnesi boş ise RuntimeException hatası fırlatır.
        //System.out.println("satılan ürün....: " + satis.get().getUrunAdi());

        System.out.println("**** UYGULAMA SONLANDI ****");
    }
}
