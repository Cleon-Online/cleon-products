package com.cleon.products.repositories;

import com.cleon.products.domain.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.repositories
 **/
@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, UUID> {
    ProductCategory findByProductCategoryName(String productCategoryName);
}
