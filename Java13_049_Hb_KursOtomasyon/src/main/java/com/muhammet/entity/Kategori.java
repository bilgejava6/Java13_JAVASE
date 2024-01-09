package com.muhammet.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_kategori")
public class Kategori extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String aciklama;
    @OneToMany(cascade = CascadeType.ALL,mappedBy = "kategori",fetch = FetchType.EAGER)
    List<Kurs> kursListesi= new ArrayList<>();

    public void addKurs(Kurs kurs){
        kursListesi.add(kurs);
        kurs.setKategori(this);
    }
}
