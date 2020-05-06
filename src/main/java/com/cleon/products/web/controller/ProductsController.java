package com.cleon.products.web.controller;

import com.cleon.products.exception.CleonErrorObject;
import com.cleon.products.services.IProductService;
import com.cleon.products.web.model.ProductDto;
import com.cleon.products.web.model.ProductPagedList;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * vbala created on 3/21/2020
 * Inside the package - com.cleon.products.web.controller
 **/
@RestController
@RequiredArgsConstructor
@Tag(name = "products", description = "The products API")
@Slf4j
public class ProductsController implements ProductsApi{

    private static final Integer DEFAULT_PAGE_NUMBER = 0;
    private static final Integer DEFAULT_PAGE_SIZE = 25;
    private final IProductService productService;

    public ResponseEntity<ProductDto> getProductByNumber(@PathVariable("productNumber") String productNumber,
                                                        @RequestParam(value = "showInventory", required = false) Boolean showInventory){
        if(showInventory == null){
            showInventory = false;
        }else{
            showInventory = true;
        }
        ProductDto productDto = productService.getProductByNumber(productNumber, showInventory);
        return new ResponseEntity<>(productDto, HttpStatus.OK);
    }

    public ResponseEntity<ProductPagedList> listProducts(
            @RequestParam(value = "pageNumber", required = false) Integer pageNumber,
            @RequestParam(value = "pageSize", required = false) Integer pageSize,
            @RequestParam(value = "productName", required = false) String productName,
            @RequestParam(value = "showInventory", required = false) Boolean showInventory
    ){
        if(showInventory == null){
            showInventory = false;
        }else{
            showInventory = true;
        }
        if(pageNumber == null || pageNumber < 0){
            pageNumber = DEFAULT_PAGE_NUMBER;
        }
        if(pageSize == null || pageSize < 0){
            pageSize = DEFAULT_PAGE_SIZE;
        }
        ProductPagedList productList = productService.listProducts(productName,
                showInventory,
                PageRequest.of(pageNumber, pageSize));
        log.info("Paged List:" + productList);
        return new ResponseEntity<>(productList, HttpStatus.OK);
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
