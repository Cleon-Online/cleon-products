package com.cleon.products.web.mapper;

import com.cleon.products.domain.Product;
import com.cleon.products.web.model.ProductDto;
import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.web.mapper
 **/
@Mapper(uses = {ProductTypeMapper.class, DateMapper.class})
@DecoratedWith(ProductMapperDecorator.class)
public interface ProductMapper {

    @Mapping(target = "productCategory", source = "productType.productCategory.productCategoryName")
    @Mapping(target = "productType", source = "productType.productTypeName")
    ProductDto productToProductDto(Product product);

    @Mapping(target = "productCategory", source = "productType.productCategory.productCategoryName")
    @Mapping(target = "productType", source = "productType.productTypeName")
    ProductDto productToProductDtoWithInventory(Product product);
    Product productDtoToProduct(ProductDto productDto);
}
