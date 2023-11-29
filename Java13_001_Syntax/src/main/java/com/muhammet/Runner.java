package com.muhammet;

/**
 * sınıf isimleri büyük harf ile başlamalıdır. [User, Product, Order]
 * Eğer sınıf adı birden fazla kelime ile birleştirilmiş ise tüm kelimelerin baş harfleri büyük yazılır. [UserRepository, ProductController]
 * Oluşturduğunuz sınıfın adı ile dosya adının aynı olması gereklidir. aynı olmadığı durumlarda Uygulama hata verir
 * Sınıf isimlendirmelerinde türkçe karakter kullanılmaz. [Müşteri, Ürün] YAZILAMAZ --- [Musteri, Urun] YAZILABİLİR
 * Birden fazla kelime içeren sınıf adlarında, özel karakter, boşluk kullanılmaz. [Musteri Deposu], [Musteri-Deposu]
 * Sınıf isimleri sayı ile başlayamaz. [1Musteri, 2Urun] ---- YAZILABİLİR [Musteri2, Urun2]
 * Sınıflarda kelime adlarını bir birinden ayırmak için _ alt tire kullanabilirsiniz. [User_Repository]
 */
public class Runner {
    /**
     * Bir uygulamanın başlaması için gerekli olan main metodu ilgili sınıf içinde olmalıdır.
     * işlevsel kodlamalarınızı methodların içine yazarsınız.
     * ctrl+shift+r -> run
     */
    public static void main(String[] args){

        /**
         * DİKKAT!!!!!
         * yazılan kodlarınızın tamamlandığını belirmek ve kod satırının sonuna gelindiğini belirtmek için noktalı virgül kullanılır.
         * eğer bir kodlama içinde {} var ise önüne yada arkasına ; koymayınız.
         * if(true){} -> if();{} -> if(){}; ->
         *
         * Kodlamalar sürekli olarak bir müdehale etmediğimiz sürece yukarıdan aşağıya doğru akış eğilimindedir.
         *
         * Syntax -> Gramer
         */
        System.out.print("Merhaba Dünya -1");
        System.out.println("Merhaba Dünya -2");
        //System.err.println("Merhaba Dünya");
        System.out.print("Merhaba Dünya -3");

    }// main methodu sonu

}// class sonu

