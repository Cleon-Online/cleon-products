package com.cleon.products.web.mapper;

import com.cleon.products.domain.Product;
import com.cleon.products.domain.ProductCategory;
import com.cleon.products.domain.ProductType;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.web.mapper
 **/
@Component
public class ProductTypeMapper {

    public ProductType asProductType(String productType){
        ProductCategory productCategory = ProductCategory.builder()
                .productCategoryId(9832442L)
                .productCategoryName("Electronics")
                .productCategoryDescription("These are electronics").build();
        if(productType != null){
            return ProductType.builder()
                    .productTypeId(9832443L)
                    .productTypeName(productType)
                    .productCategory(productCategory)
                    .build();
        }else{
            return null;
        }
    }
}
