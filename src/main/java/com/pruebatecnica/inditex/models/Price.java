package com.pruebatecnica.inditex.models;

import com.pruebatecnica.inditex.models.enums.Currency;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Getter
@Setter
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long priceList;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private Integer priority;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Currency currency;


}
