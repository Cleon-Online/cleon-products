package com.cleon.products.web.controller;

import com.cleon.products.exception.CleonErrorObject;
import com.cleon.products.services.IProductService;
import com.cleon.products.web.model.ProductDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * vbala created on 3/21/2020
 * Inside the package - com.cleon.products.web.controller
 **/
@RestController
@RequiredArgsConstructor
@Tag(name = "products", description = "The products API")
public class ProductsController {

    private final IProductService productService;

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
    @GetMapping("/products/{productNumber}")
    public ResponseEntity<ProductDto> getProductById(@PathVariable("productNumber") String productNumber){
        ProductDto productDto = productService.getProductByNumber(productNumber);
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }

    private ResponseEntity<CleonErrorObject> notFound(){
        return new ResponseEntity<>(
                CleonErrorObject.builder()
                .errorCode(HttpStatus.NOT_FOUND.toString())
                .errorDescription("Product Not Found")
                .build(),HttpStatus.NOT_FOUND);
    }

    private ResponseEntity<CleonErrorObject> badRequest(Throwable throwable){
        return new ResponseEntity<>(
                CleonErrorObject.builder()
                        .errorCode(HttpStatus.BAD_REQUEST.toString())
                        .errorDescription("Bad Request")
                        .build(),HttpStatus.BAD_REQUEST);
    }
}
