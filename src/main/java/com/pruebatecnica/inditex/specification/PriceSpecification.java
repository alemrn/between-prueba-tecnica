package com.pruebatecnica.inditex.specification;

import com.pruebatecnica.inditex.dto.PriceParamFilterDTO;
import com.pruebatecnica.inditex.models.Price;
import org.springframework.data.jpa.domain.Specification;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

public interface PriceSpecification {

    public static Specification<Price> byBrand(Integer optionalId) {
        return (root, query, builder) -> builder.equal(root.get("brand").get("id"), optionalId);
    }

    public static Specification<Price> byRangeDate(LocalDateTime optionalDate) {
        return (root, query, builder) -> builder.between(builder.literal(optionalDate), root.get("startDate"), root.get("endDate"));
    }

    public static Specification<Price> byProduct(Long optionalId) {
        return (root, query, builder) -> builder.equal(root.get("product").get("id"), optionalId);
    }

    public static Specification<Price> byPriority(Integer optionalPriority) {
        return (root, query, builder) -> builder.equal(root.get("priority"), optionalPriority);
    }

    public static Specification<Price> byPrice(BigDecimal optionalPrice) {
        return (root, query, builder) -> builder.equal(root.get("price"), optionalPrice);
    }

    public static Specification<Price> queryWithParam(PriceParamFilterDTO filter) {
        Specification<Price> spec = Specification.where(null);

        if (Objects.nonNull(filter.getBrandId())) {
            spec = spec.and(byBrand(filter.getBrandId()));
        }
        if (Objects.nonNull(filter.getDate())) {
            spec = spec.and(byRangeDate(filter.getDate()));
        }
        if (Objects.nonNull(filter.getProductId())) {
            spec = spec.and(byProduct(filter.getProductId()));
        }
        if (Objects.nonNull(filter.getPriority())) {
            spec = spec.and(byPriority(filter.getPriority()));
        }

        if (Objects.nonNull(filter.getPrice())) {
            spec = spec.and(byPrice(filter.getPrice()));
        }

        return spec;
    }

}
