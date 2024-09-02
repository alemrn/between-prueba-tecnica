package com.pruebatecnica.inditex.mapper;

import com.pruebatecnica.inditex.dto.PriceDTO;
import com.pruebatecnica.inditex.models.Price;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PriceMapper {

    @Mapping(target="brandId", source = "price.brand.id")
    @Mapping(target="productId", source = "price.product.id")
    PriceDTO priceEntityToDTO(Price price);

    List<PriceDTO> listPricesEntityToListDTO(List<Price> priceList);

}
