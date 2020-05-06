package com.cleon.products.web.controller;

import com.cleon.products.web.model.ProductDto;
import com.cleon.products.web.model.ProductPagedList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * vbala created on 4/4/2020
 * Inside the package - com.cleon.products.web.controller
 **/
@Tag(name = "products", description = "The products API")
public interface ProductsApi {

    @Operation(
            summary = "Find Product By id",
            description = "Find the product for the given input product number",
//            tags = {
//                    "product"
//            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful Operation",
                            content = {
                                    @Content(
                                            schema = @Schema(implementation = ProductDto.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping(value = "/products/{productNumber}",produces = {"application/json"})
    ResponseEntity<ProductDto> getProductByNumber(@PathVariable("productNumber") String productNumber,
                                                  @RequestParam(value = "showInventory", required = false) Boolean showInventory);

    @Operation(
            summary = "Search products",
            description = "Search for all products or search products by name",
//            tags = {
//                    "product"
//            },
            responses = {
                    @ApiResponse(
                            responseCode = "200",
                            description = "Successful Operation",
                            content = {
                                    @Content(
                                            schema = @Schema(implementation = ProductDto.class)
                                    )
                            }
                    )
            }
    )
    @GetMapping(value = "/products", produces = {"application/json"})
    ResponseEntity<ProductPagedList> listProducts(
            @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
            @RequestParam(value = "pageSize", required = false) Integer pageSize,
            @RequestParam(value = "productName", required = false) String productName,
            @RequestParam(value = "showInventory", required = false) Boolean showInventory
    );
}
