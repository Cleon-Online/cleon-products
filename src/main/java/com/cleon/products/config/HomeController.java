package com.cleon.products.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * vbala created on 4/4/2020
 * Inside the package - com.cleon.products.config
 **/
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() {
        System.out.println("swagger-ui.html");
        return "redirect:swagger-ui.html";
    }
}
