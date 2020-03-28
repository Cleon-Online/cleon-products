package com.cleon.products.exception;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.time.OffsetDateTime;

/**
 * vbala created on 3/25/2020
 * Inside the package - com.cleon.products.exception
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CleonErrorObject {

    @Schema(description = "The time the exception occured")
    private OffsetDateTime offsetDateTime;
    @Schema(description = "Exception Error Code",
            example = "1000")
    private String errorCode;
    @Schema(description = "Description of the error that occured",
            example = "Product Not Found")
    private String errorDescription;
}
