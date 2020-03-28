package com.cleon.products.services;

import com.cleon.products.domain.Product;
import com.cleon.products.exception.ProductNotFoundException;
import com.cleon.products.repositories.ProductRepository;
import com.cleon.products.web.mapper.ProductMapper;
import com.cleon.products.web.model.ProductDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.services
 **/
@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public ProductDto getProductByNumber(String productNumber) {
//        Product product = productRepository.findByProductNumber(productNumber);
//        if(product == null){
//            throw new ProductNotFoundException("Product Number: " + productNumber + "Not Found in the repository");
//        }else{
//            return productMapper.productToProductDto(product);
//        }
        return ProductDto.builder()
                .productNumber("BPD-3453-34")
                .productName("IPhone")
                .productType("Mobile Phone")
                .productCategory("Electronics").build();
    }
}
