package com.cleon.products.services.inventory;

/**
 * Created by IntelliJ IDEA
 * User: Balaji Varadharajan
 * Class/Interface/Enum Name: IProductInventoryService
 * Inside the package - com.cleon.products.services.inventory
 * Created Date: 4/24/2020
 * Created Time: 7:49 PM
 **/
public interface IProductInventoryService {
    Integer getQuantityOnHand(String productNumber);
}
