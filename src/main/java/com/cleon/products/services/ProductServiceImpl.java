package com.cleon.products.services;

import com.cleon.products.domain.Product;
import com.cleon.products.exception.ProductNotFoundException;
import com.cleon.products.repositories.ProductRepository;
import com.cleon.products.web.mapper.ProductMapper;
import com.cleon.products.web.model.ProductDto;
import com.cleon.products.web.model.ProductPagedList;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.UUID;
import java.util.stream.Collectors;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.services
 **/
@Service
@RequiredArgsConstructor
@Slf4j
public class ProductServiceImpl implements IProductService {

    private final ProductRepository productRepository;

    private final ProductMapper productMapper;

    @Override
    public ProductDto getProductByNumber(String productNumber) {
        Product product = productRepository.findByProductNumber(productNumber);
        if(product == null){
            throw new ProductNotFoundException("Product Number: " + productNumber + "Not Found in the repository");
        }else{
            return productMapper.productToProductDto(product);
        }
    }

    @Override
    public ProductPagedList listProducts(String productName, PageRequest pageRequest) {
        ProductPagedList productPagedList;
        Page<Product> productPage;
        if(!StringUtils.isEmpty(productName)){
            productPage = productRepository.findAllByProductName(productName, pageRequest);
        }else{
            productPage = productRepository.findAll(pageRequest);
        }
        productPagedList = new ProductPagedList(
                productPage.getContent()
                .stream()
                .map(productMapper :: productToProductDto)
                .collect(Collectors.toList()),
                PageRequest.of(
                        productPage.getPageable().getPageNumber(),
                        productPage.getPageable().getPageSize()
                ),
                productPage.getTotalElements());
        return productPagedList;
    }
}
