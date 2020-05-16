package com.cleon.products.services.inventory;

import com.cleon.products.web.model.ProductInventoryDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductInventoryServiceFeignImpl
 * Inside the package - com.cleon.products.services.inventory
 * Created Date: 5/16/2020
 * Created Time: 10:57 AM
 **/
@Service
@Slf4j
@RequiredArgsConstructor
public class ProductInventoryServiceFeignImpl implements IProductInventoryService{

    private final ProductInventoryServiceFeignClient feignClient;

    @Override
    public Integer getQuantityOnHand(String productNumber) {
        log.info("Calling Inventory Service from Feign Implementation");
        ResponseEntity<ProductInventoryDto> responseEntity = feignClient.getOnHandInventory(productNumber);
        /**
         * Below is a smart way to iterate over a list that is returned and sum an integer
         */
//        Integer onHand = Objects.requireNonNull(responseEntity.getBody())
//                    .stream()
//                    .mapToInt(ProductInventoryDto::getQuantityOnHand)
//                    .sum();
        Integer quantityOnHand = responseEntity.getBody().getQuantityOnHand();
        log.info("Product Number:{}, Quantity on hand: {}", productNumber, quantityOnHand);
        return quantityOnHand;
    }
}
