package com.cleon.products.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.sql.rowset.WebRowSet;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/**
 * vbala created on 3/25/2020
 * Inside the package - com.cleon.products.exception
 **/
@ControllerAdvice
@RestController
public class ProductsExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllExceptions(Exception ex, WebRequest request){
        CleonErrorObject cleonErrorObject = CleonErrorObject.builder()
                .offsetDateTime(OffsetDateTime.now())
                .errorDescription(ex.getMessage())
                .errorCode(HttpStatus.INTERNAL_SERVER_ERROR.toString()).build();
        return new ResponseEntity<>(cleonErrorObject,HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(ProductNotFoundException.class)
    public final ResponseEntity<Object> handleProductNotFoundExceptions(Exception ex, WebRequest request){
        CleonErrorObject cleonErrorObject = CleonErrorObject.builder()
                .offsetDateTime(OffsetDateTime.now())
                .errorDescription(ex.getMessage())
                .errorCode(HttpStatus.INTERNAL_SERVER_ERROR.toString()).build();
        return new ResponseEntity<>(cleonErrorObject,HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
