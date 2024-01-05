package com.muhammet.entity;

import com.muhammet.utility.enums.BilesenTuru;
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
@Table(name = "tbl_bilesen")
public class Bilesen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "pc_id")
    Long pcId;
    String ad;
    @Enumerated
    BilesenTuru tur;
}
