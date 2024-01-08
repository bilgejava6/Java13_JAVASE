package com.muhammet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_personel")
public class Personel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    @Column(name = "sicil_no")
    String sicilNo;
    String telefon;
    String email;
    Date dogumTarihi;

    /**
     * 1. Durum;
     * sadece ilgili tablonun diğer tablo ile ilişki kurduğu durum, bu yapıda ana tablo diğer tablo ile
     * @OneToMany ilişki kurduğunda, cross bir ilişki tablosu hibernate tarafından yönetilir. her iki
     * tabloda da ilişkiyi niteleyen bir alan bulunmaz.
     *
     * DİKKAT!!! oluşan tablo şu şekilde oluşur.
     * tbl_personel_tbl_adres
     * personel_id - adres_listesi_id
     * bu oluşan tabloyu ve alanları özellştirebilirsiniz.
     * @JoinTable
     * name -> oluşan cross tablosunun adını belirler.
     * joinColumns -> ana tablonun ilişki adını belirler
     * inverseJoinColumns -> bağlanılan tablo için ilişki adını belirler.
     *
     */
    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tblJoinPersonelAdres",
            joinColumns = @JoinColumn(name = "personelid"),
            inverseJoinColumns = @JoinColumn(name = "adresid")
    )
    List<Adres> adres_listesi;


    @OneToMany(mappedBy = "personel",cascade = CascadeType.ALL)
    List<Resim> resim_listesi;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personel")
    Araba araba;



}
