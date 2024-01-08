package com.muhammet.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "tbl_araba")
public class Araba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String marka;
    String model;
    String pkala;
    @Column(name = "model_yili")
    int modelYili;
    @Column(name = "kayit_no")
    int kayitNo;
    @OneToOne
    Personel personel;
}
