package com.cleon.products.services;

import com.cleon.products.domain.Product;
import com.cleon.products.web.model.ProductDto;
import com.cleon.products.web.model.ProductPagedList;
import org.springframework.data.domain.PageRequest;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.services
 **/
public interface IProductService {

    ProductDto getProductByNumber(String productNumber);

    ProductPagedList listProducts(String productName, PageRequest of);
}
