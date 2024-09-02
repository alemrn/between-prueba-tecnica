package com.pruebatecnica.inditex.dto;

import com.pruebatecnica.inditex.models.enums.Currency;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PriceDTO implements Serializable {

    private static final long serialVersionUID = 965671106616103589L;

    private Long priceList;

    private Long brandId;

    private LocalDateTime startDate;

    private LocalDateTime endDate;

    private Long productId;

    private Integer priority;

    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Currency currency;
}
