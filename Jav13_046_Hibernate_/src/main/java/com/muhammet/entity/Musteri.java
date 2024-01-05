package com.muhammet.entity;

import com.muhammet.utility.enums.Cinsiyet;
import com.muhammet.utility.enums.Yetki;
import jakarta.persistence.*;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name="tblmusteri")
public class Musteri {
    /**
     * Otomatik olarak id nin atanması için mutlaka bir değer üretecek strateji belirtilmelidir.
     * bunu yapmanın farklı yolları vardır.
     * 1. @GeneratedValue(strategy = GenerationType.IDENTITY)
     * IDENTITY -> her tablo için ayrı bir sequence oluşturur. Böylece her tablonun id si 1...n şeklinde olur.
     *
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    /**
     * 2. @GeneratedValue(strategy = GenerationType.AUTO)
     * AUTO -> tüm tablolar için tek bir sequence oluşur ve her tablo için tek bir numaralandırma yapılır.
     * yani A tablosunda 1 değeri verilmiş ise B tabosuna eklenen kayıt 2 den başlar. Tekrar A tablosuna
     * bir kayıt eklenirse 3 değeri verilir. şeklinde devam eder.
     */
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id_2;
    /**
     * 3. Elle seuqence oluşturmak.
     * - öncelikle bir sequence tanımlıyorsunuz. (DİKKAT tanımlamak kullandığınız anlamına gelmez.)
     *
     */
    @SequenceGenerator(name="sq_musteri_id",sequenceName = "sq_musteri_id",allocationSize = 5, initialValue = 100)
    @GeneratedValue(generator = "sq_musteri_id")
    Long id_3;

    @GenericGenerator(name="uuid",strategy = "uuid2")
    @GeneratedValue(generator = "uuid")
    UUID uuid;
    /**
     * Kolonların özelleştirilmesi
     * @Column
     * - name -> kolonun veritabanındaki adı, Özellikle belirtmez iseniz değişken adı kolon adı olacaktır.
     * - length -> kolonun uzunluğu, karakter sayısını belirtiyoruz. Eğer belirtmez iseniz 255 karakter olur.
     * - nullable -> Kolona girilecek değerin boş(null) geçilip geçilemeyeceğini belirtir. Default olarak true gelir.
     * - insertable -> kolona veri girilip girilemeyeceğini belirtir. Default olarak true gelir.
     * - updatable -> kolondaki verinin güncellenebilir olup olmadığını belirtir. Default olarak true gelir.
     * - unique -> kolondaki verinin unique olup olmadığını belirtir. Default olarak false gelir.
     */
    @Column(name = "musteri_ad", length = 50, nullable = false
    ,insertable = true,updatable = true,unique = false)
    String ad;

    String soyad;
    /**
     * Bazı alanlar kullanılmak istenebilir ancak DB ye yer almasına gerek yoktur.
     * @Transient annotation ı ile bu alanlar belirtilebilir.
     */
    @Transient
    String adSoyad;
    /**
     * Bazen büyük dataları içinde barındırmamız gereken alanlar olabilir. Mesela bir metin alanı.
     * mesela-> Base64 formatında bir resim. ya da Base64 formatında bir pdf dosyası. JAva sınıfı v.s.
     */
    @Lob
    String adres;

    /**
     * Date alanrına mutlaka @Temporal annotation ı eklenmelidir. Aksi durumda hata alırsınız.
     */
    @Temporal(TemporalType.DATE)
    Date dogumTarihi;
    @Temporal(TemporalType.TIME)
    Time dogumSaati;
    @Temporal(TemporalType.TIMESTAMP)
    Timestamp dogumTarihiSaati;

    /**
     * DİKKAT!!! enumlar iki değer sahipir. name ve ordinal değerleridir.
     * birisi sayı saklarken diğeri görünen adı saklar.
     * @Enumerated annotation ı ile hangi değerin saklanacağı belirtilmelidir.
     * Default olarak ordinal değer saklanır. -> yani sayısal karşılığı db de tutulur.
     * Eğer görünen adını saklamak istersenizz @Enumerated(EnumType.STRING) kullanılmalıdır.
     */
    @Enumerated(EnumType.STRING)
    Cinsiyet cinsiyet;

    @Enumerated(EnumType.ORDINAL)
    Yetki yetki;

    /**
     * @Embedded annotation ı ile başka bir sınıfı bu sınıfın içine gömebilirsiniz.
     * Bu sınıfın içindeki tüm alanlar bu sınıfın içine gömülmüş olur.
     * Bu sınıfın içindeki alanlara erişmek için bu sınıfın getter setter larını kullanmalısınız.
     */
    @Embedded
    BaseEntity baseEntity;

    @ElementCollection
    @CollectionTable(name = "tbl_musteri_hobi",joinColumns = @JoinColumn(name = "mst_id"))
    List<String> hobiler;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_2() {
        return id_2;
    }

    public void setId_2(Long id_2) {
        this.id_2 = id_2;
    }

    public Long getId_3() {
        return id_3;
    }

    public void setId_3(Long id_3) {
        this.id_3 = id_3;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public Date getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(Date dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public Time getDogumSaati() {
        return dogumSaati;
    }

    public void setDogumSaati(Time dogumSaati) {
        this.dogumSaati = dogumSaati;
    }

    public Timestamp getDogumTarihiSaati() {
        return dogumTarihiSaati;
    }

    public void setDogumTarihiSaati(Timestamp dogumTarihiSaati) {
        this.dogumTarihiSaati = dogumTarihiSaati;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public Yetki getYetki() {
        return yetki;
    }

    public void setYetki(Yetki yetki) {
        this.yetki = yetki;
    }

    public BaseEntity getBaseEntity() {
        return baseEntity;
    }

    public void setBaseEntity(BaseEntity baseEntity) {
        this.baseEntity = baseEntity;
    }

    public List<String> getHobiler() {
        return hobiler;
    }

    public void setHobiler(List<String> hobiler) {
        this.hobiler = hobiler;
    }
}
