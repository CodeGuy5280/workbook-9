package com.pluralsight.NorthWindTradersAPI.controllers;

import com.pluralsight.NorthWindTradersAPI.modules.Category;
import com.pluralsight.NorthWindTradersAPI.modules.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class ProductsController {

    private List<Product> products = new ArrayList<>();


    public ProductsController (){
        products.add(new Product(1,"Shiny", 1, 69.99   ));
        products.add(new Product(2, "Long sleeve", 2, 39.99 ));
        products.add(new Product(3, "Velour", 3, 59.99));
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return products;
    }

    //Adding missing portion for specifying each
    @GetMapping("/products/{productId}")
    public Product getProductById(@PathVariable int productId){
        for (Product product : products)
            if (product.getProductId() == productId)
                return product;
        return null;
    }
}


