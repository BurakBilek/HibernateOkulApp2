package com.burak.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_ogrenci")
public class Ogrenci {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long id;


    @Builder.Default
    @Column(nullable = false)
    private LocalDate dogumTarihi= LocalDate.now();

    @Embedded
    KisiselBilgiler kisiselBilgiler;

}
