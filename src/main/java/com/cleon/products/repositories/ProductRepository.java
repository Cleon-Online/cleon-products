package com.cleon.products.repositories;

import com.cleon.products.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.repositories
 **/
@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    Product findByProductNumber(String productNumber);
}
