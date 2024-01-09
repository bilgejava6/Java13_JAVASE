package com.muhammet.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_kurs")
public class Kurs extends BaseEntity  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String detay;
    Long start_date;
    Long end_date;
    Integer kapasite;
    String adres;
    @ManyToOne
    Kategori kategori;
    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "kursListesi")
    List<Kursiyer> kursiyerListesi;
}
