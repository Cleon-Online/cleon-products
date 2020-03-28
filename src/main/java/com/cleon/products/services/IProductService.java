package com.cleon.products.services;

import com.cleon.products.domain.Product;
import com.cleon.products.web.model.ProductDto;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.services
 **/
public interface IProductService {

    ProductDto getProductByNumber(String productNumber);
}
