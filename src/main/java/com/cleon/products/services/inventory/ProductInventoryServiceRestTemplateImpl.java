package com.cleon.products.services.inventory;

import com.cleon.products.web.model.ProductInventoryDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductInventoryServiceRestTemplateImpl
 * Inside the package - com.cleon.products.services.inventory
 * Created Date: 4/24/2020
 * Created Time: 7:49 PM
 **/
@Slf4j
@ConfigurationProperties(prefix = "cleon.products", ignoreUnknownFields = false)
@Component
public class ProductInventoryServiceRestTemplateImpl implements IProductInventoryService{

    private final String INVENTORY_PATH = "/product/{productNumber}/inventory";

    private RestTemplate restTemplate;

    private String inventoryServiceHost;

    public ProductInventoryServiceRestTemplateImpl(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public void setInventoryServiceHost(String inventoryServiceHost){
        this.inventoryServiceHost = inventoryServiceHost;
    }

    @Override
    public Integer getQuantityOnHand(String productNumber) {
        log.info("Calling Inventory service");
        ResponseEntity<ProductInventoryDto> responseEntity = restTemplate
                .exchange(inventoryServiceHost + INVENTORY_PATH, HttpMethod.GET, null,
                        new ParameterizedTypeReference<ProductInventoryDto>() {}, (Object) productNumber);
        Integer quantityOnHand = responseEntity.getBody().getQuantityOnHand();
        return quantityOnHand;
    }
}
