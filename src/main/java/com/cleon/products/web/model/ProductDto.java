package com.cleon.products.web.model;

import lombok.*;

import javax.validation.constraints.*;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

/**
 * vbala created on 3/21/2020
 * Inside the package - com.cleon.products.web.model
 **/
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ProductDto {

    @Null
    private String productNumber;

    @NotNull
    @NotBlank
    @Size(min = 3, max = 10)
    private String productName;

    @NotNull
    @NotBlank
    private String productType;

    @NotNull
    @NotBlank
    private String productCategory;

    @NotBlank
    private String productDescription;

    @Positive
    private BigDecimal productPrice;

    @Null
    private OffsetDateTime createdDate;

    @Null
    private OffsetDateTime lastModifiedDate;

    @NotBlank
    @NotNull
    private Long serialNumber;
}
