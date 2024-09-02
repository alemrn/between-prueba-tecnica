package com.pruebatecnica.inditex.repository;

import com.pruebatecnica.inditex.models.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface PricesRepository extends JpaRepository<Price, Long>, JpaSpecificationExecutor<Price> {


    Optional<List<Price>> findByProductId(Long productId);

    Optional<List<Price>> findByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfter(Long productId, Integer BrandId, LocalDateTime start, LocalDateTime end );
}
