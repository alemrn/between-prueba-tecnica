package com.pruebatecnica.inditex.service.impl;

import com.pruebatecnica.inditex.dto.PriceDTO;
import com.pruebatecnica.inditex.dto.PriceParamFilterDTO;
import com.pruebatecnica.inditex.mapper.PriceMapper;
import com.pruebatecnica.inditex.models.Price;
import com.pruebatecnica.inditex.repository.PricesRepository;
import com.pruebatecnica.inditex.service.PriceService;
import com.pruebatecnica.inditex.specification.PriceSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {

    @Autowired
    private PricesRepository repository;

    @Autowired
    private PriceMapper mapper;

    @Override
    public List<PriceDTO> getPricesByParamsSpecification(PriceParamFilterDTO filter) {

        Specification<Price> spec = PriceSpecification.queryWithParam(filter);

        List<Price> prices = repository.findAll(spec);

        return mapper.listPricesEntityToListDTO(prices);
    }

    @Override
    public List<PriceDTO> getPricesByParams(PriceParamFilterDTO filter) {

        return mapper.listPricesEntityToListDTO(repository.findByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfter(filter.getProductId(), filter.getBrandId(), filter.getDate(), filter.getDate()).orElseThrow());
    }

    @Override
    public PriceDTO getPriceById(Long id) {
        return mapper.priceEntityToDTO(repository.findById(id).orElseThrow());
    }

    @Override
    public List<PriceDTO> getPriceByProduct(Long productId) {
        return mapper.listPricesEntityToListDTO(repository.findByProductId(productId).orElseThrow());
    }

}
