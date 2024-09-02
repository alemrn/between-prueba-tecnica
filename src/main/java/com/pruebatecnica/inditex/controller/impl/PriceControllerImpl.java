package com.pruebatecnica.inditex.controller.impl;

import com.pruebatecnica.inditex.controller.PriceController;
import com.pruebatecnica.inditex.dto.PriceDTO;
import com.pruebatecnica.inditex.dto.PriceParamFilterDTO;
import com.pruebatecnica.inditex.service.impl.PriceServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PriceControllerImpl implements PriceController {

    @Autowired
    private PriceServiceImpl service;

    @Override
    public ResponseEntity<List<PriceDTO>> getPricesByParamsSpecification(PriceParamFilterDTO filter) {
        try {
            List<PriceDTO> prices = service.getPricesByParamsSpecification(filter);
            return prices.isEmpty() ? new ResponseEntity<>(HttpStatus.NOT_FOUND) : ResponseEntity.ok(prices);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<List<PriceDTO>> getPricesByParams(PriceParamFilterDTO filter) {
        try {
            return ResponseEntity.ok(service.getPricesByParams(filter));
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
