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
@Table(name = "tbl_kursiyer")
public class Kursiyer  extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String telefon;
    @OneToOne(mappedBy = "kursiyer",cascade = CascadeType.ALL)
    Adres adres;
    @ManyToMany
    List<Kurs> kursListesi;
}
