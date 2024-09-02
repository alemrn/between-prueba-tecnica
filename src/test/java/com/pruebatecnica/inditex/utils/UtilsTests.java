package com.pruebatecnica.inditex.utils;

import com.pruebatecnica.inditex.dto.PriceParamFilterDTO;

import java.time.LocalDateTime;

public class UtilsTests {

    public static final PriceParamFilterDTO PRUEBA1 = PriceParamFilterDTO.builder()
            .brandId(1)
            .productId(35455L)
            .date(LocalDateTime.of(2020, 06, 14, 10, 0, 0))
            .build();
    public static final PriceParamFilterDTO PRUEBA2 = PriceParamFilterDTO.builder()
            .brandId(1)
            .productId(35455L)
            .date(LocalDateTime.of(2020, 06, 14, 16, 0, 0))
            .build();
    public static final PriceParamFilterDTO PRUEBA3 = PriceParamFilterDTO.builder()
            .brandId(1)
            .productId(35455L)
            .date(LocalDateTime.of(2020, 06, 14, 21, 0, 0))
            .build();
    public static final PriceParamFilterDTO PRUEBA4 = PriceParamFilterDTO.builder()
            .brandId(1)
            .productId(35455L)
            .date(LocalDateTime.of(2020, 06, 15, 10, 0, 0))
            .build();
    public static final PriceParamFilterDTO PRUEBA5 = PriceParamFilterDTO.builder()
            .brandId(1)
            .productId(35455L)
            .date(LocalDateTime.of(2020, 06, 16, 21, 0, 0))
            .build();

    public UtilsTests() {
    }
}
