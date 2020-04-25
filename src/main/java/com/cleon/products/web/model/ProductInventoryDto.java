package com.cleon.products.web.model;

import lombok.*;

import javax.persistence.criteria.CriteriaBuilder;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductInventoryDto
 * Inside the package - com.cleon.products.web.model
 * Created Date: 4/24/2020
 * Created Time: 8:12 PM
 **/
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductInventoryDto {

    public Long productId;
    public String productNumber;
    public String productName;
    public Integer quantityOnHand;
}
