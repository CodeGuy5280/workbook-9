package com.pluralsight.NorthWindTradersAPI.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    public class CategoriesController {

        // this method will respond to http://localhost:8080/
        @GetMapping(path="/categories")
        public String index(@RequestParam(defaultValue="Categories") String category
        ) {
            return "Welcome to the categories page: " + category + "!";
        }
    }



