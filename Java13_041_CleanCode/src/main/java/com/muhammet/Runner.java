package com.muhammet;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        /**
         * Clean Code - Temiz Kod :) iyi yıkanan kod temiz olur
         * Kodun temiz ve anlaşılır olması.(clean code) -> (code smell gelmesin :))
         * *** Sınıflarımızı oluştururken varlığı soyutlama yapıyoruz. Örneğin; Satış işlemler için
         * temel işlevleri içeren methodlar yazdığınızı düşünün. SatisRepository örnek sınıfımız olsun
         * burada repository sınıfı içinde methodlar yazacaksınız. Bu methodlar tanımlanırken her bir methodun
         * tek bir işlem yapmasına odaklanmalısınız. (Single responsbility) Tek sorumluluk ilkesi.
         * **** Sınıflarımız içinde olabildiğince az method kullanmaya özen göstermelisiniz. Kabul edilebilir
         * method sayıuınızı 10-15 method olarak belirleyip bu sayıyı geçmemeye çalışmalısınız. (Method sayısı)
         * save() -> kayetMusteri() -> saveCustomer(). musteriyiKaydet()
         * **** Methodlariniz tek bir görevi yerine getirmeli, ayrıca bazen bir method yazılırken belli kod
         * blokların belli methodlarda tekrarlaması gerekebilir. Bu durumda tekrar eden kod bloklarını ayrı
         * bir method içinde değerlendirmek zorundasınız. (DRY - Don't repeat yourself) Kendini tekrar etme.
         * inputBoxUserName.text = "";
         * inputBoxPhone.text = "";
         * public void Temizle(){
         *     inputBoxUserName.text = "";
         *     inputBoxPhone.text = "";
         * }
         * ------------------------------->
         * **** Methodlarınızı yazarken gövdeleri çok kalabalık olamamalı, yani 1000 satırlık method olmaz.
         * System.out.println("1. satır"); * 1000. bellir bir sınırlandırma olsa, max satır sayınız 15-20 satır
         * aralığında tutulmalı ve method içinde kkullanacağınız değişken parametre sayınızı 2-3 marametre ile
         * sınırlandırmalısınız.
         *
         * **** Methodlarımızın içinde ister istemez karar yapılarına yer vereceğiz. Bu nedenle karar yapılarınızı
         * sınırlandırmalısınız.(if..else, switch..case) Karar yapılarınızı 7-8 seçenek ile sınırlandırmalısınız.
         *
         * **** Methodlar ilk yazıldıklarında genellikle küçük kalırlar. Ancak zamanla methodlarımızın içinde
         * ihtiyaçlar arttıkça isterler geldikçe kod eklemeleri olur bu da zamanla kodun büyümesine ve karmaşıklığının
         * artmasına neden olur.
         *
         * **** Methodlar tanımlanırken farklı isimlendirmelerle tanımlanır ancak ekip dğeişimlerinde isimleri farklı
         * yaptıkları işlemler birbirine benzeyen yada bire bir aynı olan metodlar olabilir. Bunların ivedilkle
         * tespit edilmesi ve bu kullanımlardan uzaklaşılması gereklidir.
         *
         * **** Methodların isimlendirilmesi, isimlendirmede mutlaka method ismi methodun yaptığı işe ile paralel olmak
         * zorundadur ve emir kipi ile nitelendirilmelidir. (getCustomer, saveCustomer, deleteCustomer)
         * YANLIŞ BİR ÖRNEKLEM;
         * findById(User user){ // kullanıcı bulma işlemi
         *     repository.save(user); // işlem kaydetme işlemi
         * }
         *
         * **** Methodları isimlendirirken java da bir sınırlandırma yoktur. Bu nedenle lütfen method isimlerini
         * kısaltma kullanarak yazmayın. Açık ve anlaşılır şekilde uzuuuuuuuuuunu uzun yazın.
         * Örneğin;
         * List<Post> findByIschallengeAndStatusAndFinishdateGreaterThanAndUseridNotInAndUseridNotAndIsuserchallengeIsFalse(
         *                                                                                                String ischallenge,
         *                                                                                                int status,
         *                                                                                                long timestamp,
         *                                                                                                List<String> ids,
         *                                                                                                String userid);
         *
         * **** Method isimlendirmesi, DİKKAT!!! Eğer methodun adını belirlemekte zorlanıyor iseniz yüksek ihtimal
         * bu method birden fazla karmaşık işlemi bir arada yapıyordur. Bu nedenle isimi belirlemekte zorlanıyorsunuz.
         *
         *
         *
         */

       Listem listem = new Listem();

    }
}
