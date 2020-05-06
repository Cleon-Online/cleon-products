package com.cleon.products.web.mapper;

import com.cleon.products.domain.Product;
import com.cleon.products.web.model.ProductDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.web.mapper
 **/
@Mapper(uses = {ProductTypeMapper.class,
                DateMapper.class})
@DecoratedWith(ProductMapperDecorator.class)
public interface ProductMapper {

    ProductDto productToProductDto(Product product);
    ProductDto productToProductDtoWithInventory(Product product);
    Product productDtoToProduct(ProductDto productDto);
}
