package com.pluralsight.NorthWindTradersAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductsController {

    // this method will respond to http://localhost:8080/
    @GetMapping(path="/products")
    public String index(@RequestParam(defaultValue="Products") String products
    ) {
        return "Welcome to the products page: " + products + "!";
    }
}



