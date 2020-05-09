package com.cleon.products.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * vbala created on 3/23/2020
 * Inside the package - com.cleon.products.domain
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
//@Table(schema = "CLEON_PRODUCTS")
public class ProductCategory {

    /**
     * Primary key for product category
     */
    @Id
    //@GeneratedValue(generator = "UUID")
    //@GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGGenerator")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_cat_sequence")
    @SequenceGenerator(name="product_cat_sequence", sequenceName = "product_cat_seq", //schema = "CLEON_PRODUCTS",
            initialValue = 10001, allocationSize = 1)
    @Column(updatable = false, nullable = false)
    private Long productCategoryId;

    /**
     * The name of the product category
     */
    @NotBlank
    @Column(length = 50, columnDefinition = "varchar", nullable = false, unique = true)
    private String productCategoryName;

    /**
     * A short description of the product category
     */
    @NotBlank
    @Column(length = 100, columnDefinition = "varchar", nullable = false)
    private String productCategoryDescription;

    /**
     * This list will contain the all the product types that belong
     * a product category
     *
     * The default fetch strategy for OneToMany side of the relationship
     * is LAZY
     */
    @OneToMany(mappedBy = "productCategory", fetch = FetchType.LAZY)
    private List<ProductType> productTypes = new ArrayList<>();

    /**
     * The date and time on which the product category was created
     */
    @CreationTimestamp
    @Column(updatable = false)
    private Timestamp createdDate;

    /**
     * The last occurence when the product category was updated
     */
    @UpdateTimestamp
    @Column(updatable = false)
    private Timestamp lastModifiedDate;
}
