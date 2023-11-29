package com.muhammet;
/**
 * Şuan içinde bulunduğumuz sınıf başka bir paket içinde
 * bulunan başkar bir sınıfı çağırdığında ona ulaşımın nasıl
 * yapılacağını bildirmek zorundır. Çünkü derleyici sınıf içinde
 * kullanılan her değişkeni tanımak ister, eğer farklı bir
 * konumdaki bir sınıfı kullanıyor iseniz bunu bilmek ister.
 * Aksi takdirde hata alırsınız uygulamanız çalışmaz.
 */
import com.muhammet.entity.Urun;
import com.muhammet.repository.UrunRepository;
import com.muhammet.utility.ProjectConfiguration;

import java.math.BigDecimal;

/**
 * Erişim Belirteçleri - Access Modifier
 * Bir sınıf içinde kullanmakta olduğumuz değişken, method gibi tanımlamaların
 * erişimini kısıtlamak ya da erişimini herkese açmak için kullanılır.
 * Burada amaç kodun güvenliği ve tutarlılığını sağlamaktır.
 *
 * public -> Herkese tüm alanlara açık
 * private -> herkese tüm alanlara kapalı, sınıf içine açık
 * protected -> paket içine açık diğer alanlara kapalı.
 * default -> paket içinde açık diğer alanlara kapalı.
 *
 */

public class Runner {
    public static void main(String[] args) {

        UrunRepository repository = new UrunRepository();
        repository.findById(3L);

        Urun urun = new Urun();
        urun.id = ProjectConfiguration.getSayac();
        urun.fiyat = BigDecimal.valueOf(5435453);
        urun.marka = "iMac";
        //urun.model = "i9";
        urun.ad = "Bilgisayar";



    }//main sonu
}//class sonu
