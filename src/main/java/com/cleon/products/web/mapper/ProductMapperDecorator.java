package com.cleon.products.web.mapper;

import com.cleon.products.domain.Product;
import com.cleon.products.services.IProductService;
import com.cleon.products.services.inventory.IProductInventoryService;
import com.cleon.products.web.model.ProductDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductMapperDecorator
 * Inside the package - com.cleon.products.web.mapper
 * Created Date: 4/24/2020
 * Created Time: 7:45 PM
 **/
@Slf4j
public abstract class ProductMapperDecorator implements ProductMapper {

    private IProductInventoryService productInventoryService;

    private ProductMapper productMapper;

    @Autowired
    public void setProductService(IProductInventoryService productInventoryService){
        this.productInventoryService = productInventoryService;
    }

    @Autowired
    public void setProductMapper(ProductMapper productMapper){
        this.productMapper = productMapper;
    }

    public ProductDto productToProductDto(Product product){
        return productMapper.productToProductDto(product);
    }

    public ProductDto productToProductDtoWithInventory(Product product){
        ProductDto productDto = productMapper.productToProductDto(product);
        Integer productInventory = productInventoryService.getQuantityOnHand(product.getProductNumber());
        productDto.setQuantityOnHand(productInventory);
        return productDto;
    }
}
