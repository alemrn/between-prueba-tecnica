package com.pruebatecnica.inditex.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String type;
    private String kind;
    private String state;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;
    private String name;
    private Long section;
    private String sectionName;
    private Long familyId;
    private String familyName;
    private Long subfamilyId;
    private String subfamilyName;
    private LocalDateTime firstVisibleDate;
}