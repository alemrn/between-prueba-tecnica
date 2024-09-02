package com.pruebatecnica.inditex.service;

import com.pruebatecnica.inditex.dto.PriceDTO;
import com.pruebatecnica.inditex.dto.PriceParamFilterDTO;

import java.util.List;


public interface PriceService {

    List<PriceDTO> getPricesByParamsSpecification(PriceParamFilterDTO filter);

    List<PriceDTO> getPricesByParams(PriceParamFilterDTO filter);

    PriceDTO getPriceById(Long id);

    List<PriceDTO> getPriceByProduct(Long productId);

}
