package com.cleon.products;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CleonProductsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CleonProductsApplication.class, args);
    }

}
