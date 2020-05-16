package com.cleon.products.services.inventory;

import com.cleon.products.web.model.ProductInventoryDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: ProductInventoryServiceFeignClientImpl
 * Inside the package - com.cleon.products.services.inventory
 * Created Date: 5/16/2020
 * Created Time: 10:51 AM
 **/
@FeignClient(name = "cleon-products-inventory")
public interface ProductInventoryServiceFeignClient {

    String INVENTORY_PATH = "/products/{productNumber}/inventory";

    @RequestMapping(method = RequestMethod.GET, value = INVENTORY_PATH)
    ResponseEntity<ProductInventoryDto> getOnHandInventory(@PathVariable String productNumber);
}
