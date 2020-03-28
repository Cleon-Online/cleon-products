package com.cleon.products.web.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class ProductDtoTest {

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void serializeProductDto() throws JsonProcessingException {
        ProductDto productDto = getProductDto();
        String productDtoAsJson = objectMapper.writeValueAsString(productDto);
        System.out.println(productDtoAsJson);
    }

    @Test
    void deserializeDto() throws JsonProcessingException {
        String productDtoAsJson = "{\"productNumber\":\"BPD-2312-324\",\"productName\":\"IPhone\",\"productType\":\"Mobile Phone\",\"productCategory\":\"Electronics\",\"productDescription\":\"This is an awesome phone\",\"productPrice\":1099.990000000000009094947017729282379150390625,\"createdDate\":\"2020-03-23T14:15:44.3723785-04:00\",\"lastModifiedDate\":\"2020-03-23T14:15:44.3733806-04:00\",\"serialNumber\":12332345}";
        ProductDto productDto = objectMapper.readValue(productDtoAsJson, ProductDto.class);
        System.out.println(productDto);
    }

    private ProductDto getProductDto(){
        ProductDto productDto = ProductDto.builder()
                .productNumber("BPD-2312-324")
                .productName("IPhone")
                .productType("Mobile Phone")
                .productCategory("Electronics")
                .productDescription("This is an awesome phone")
                .productPrice(new BigDecimal(1099.99))
                .serialNumber(12332345L)
                .createdDate(OffsetDateTime.now())
                .lastModifiedDate(OffsetDateTime.now())
                .build();
        return  productDto;
    }
}