package com.pruebatecnica.inditex.controller;

import com.pruebatecnica.inditex.dto.PriceDTO;
import com.pruebatecnica.inditex.dto.PriceParamFilterDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/api/v1/inditex/prices")
@Tag(name = "Price Controller", description = "Price Controller to get access price data")
public interface PriceController {


    @Operation(summary = "Get prices data using specification")
    @GetMapping("/filter")
    public ResponseEntity<List<PriceDTO>> getPricesByParamsSpecification(PriceParamFilterDTO filter);

    @Operation(summary = "Get prices data using simple param")
    @GetMapping("/")
    public ResponseEntity<List<PriceDTO>> getPricesByParams(PriceParamFilterDTO filter);



}
