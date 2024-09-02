package com.pruebatecnica.inditex.service.impl;

import com.pruebatecnica.inditex.InditexApplication;
import com.pruebatecnica.inditex.dto.PriceDTO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static com.pruebatecnica.inditex.utils.UtilsTests.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = InditexApplication.class)
@Slf4j
class PriceServiceImplTest {


    @Autowired
    private PriceServiceImpl service;

    @Test
    void getPricesByParamsSpecificationPrueba1() {

        List<PriceDTO> prices = service.getPricesByParamsSpecification(PRUEBA1);
        log.info(" Prueba {} - Elementos del listado {}", 1, prices.size());

        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));

    }

    @Test
    void getPricesByParamsSpecificationPrueba2() {

        List<PriceDTO> prices = service.getPricesByParamsSpecification(PRUEBA2);
        log.info(" Prueba {} - Elementos del listado {}", 2, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 2));

    }

    @Test
    void getPricesByParamsSpecificationPrueba3() {

        List<PriceDTO> prices = service.getPricesByParamsSpecification(PRUEBA3);
        log.info(" Prueba {} - Elementos del listado {}", 3, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));

    }
    @Test
    void getPricesByParamsSpecificationPrueba4() {

        List<PriceDTO> prices = service.getPricesByParamsSpecification(PRUEBA4);
        log.info(" Prueba {} - Elementos del listado {}", 4, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 3));

    }

    @Test
    void getPricesByParamsSpecificationPrueba5() {

        List<PriceDTO> prices = service.getPricesByParamsSpecification(PRUEBA5);
        log.info(" Prueba {} - Elementos del listado {}", 5, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 4));

    }

    @Test
    void getPricesByParamsPrueba1() {

        List<PriceDTO> prices = service.getPricesByParams(PRUEBA1);
        log.info(" Prueba {} - Elementos del listado {}", 6, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));

    }

    @Test
    void getPricesByParamsPrueba2() {

        List<PriceDTO> prices = service.getPricesByParams(PRUEBA2);
        log.info(" Prueba {} - Elementos del listado {}", 7, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 2));

    }

    @Test
    void getPricesByParamsPrueba3() {

        List<PriceDTO> prices = service.getPricesByParams(PRUEBA3);
        log.info(" Prueba {} - Elementos del listado {}", 8, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));

    }
    @Test
    void getPricesByParamsPrueba4() {

        List<PriceDTO> prices = service.getPricesByParams(PRUEBA4);
        log.info(" Prueba {} - Elementos del listado {}", 9, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 3));

    }

    @Test
    void getPricesByParamsPrueba5() {

        List<PriceDTO> prices = service.getPricesByParams(PRUEBA5);
        log.info(" Prueba {} - Elementos del listado {}", 10, prices.size());
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 1));
        assertTrue(prices.stream().anyMatch(priceDTO -> priceDTO.getPriceList() == 4));

    }
}