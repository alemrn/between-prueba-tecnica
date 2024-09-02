package com.pruebatecnica.inditex.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class PriceParamFilterDTO implements Serializable {

    private static final long serialVersionUID = 3054336510671651233L;
    @Schema(name = "brandId", description = "Brand id")
    private Integer brandId;

    @Schema(name = "date", description = "Date to search between start and end")
    private LocalDateTime date;

    @Schema(name = "productId", description = "Product id")
    private Long productId;

    @Schema(name = "priority", description = "Priority of the price")
    private Integer priority;

    @Schema(name = "price", description = "Price")
    private BigDecimal price;

}
