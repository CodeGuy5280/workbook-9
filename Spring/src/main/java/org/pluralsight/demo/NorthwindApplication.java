package org.pluralsight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class NorthwindApplication implements CommandLineRunner {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ProductService service;

    public void run(String... args){
        service.addProduct("Items");

		// Print products
		service.addProduct("example");

		List<Product> products = service.dao.getAll();

		for (Product product : products){
			System.out.println("Product ID: " + product.getProductId());
			System.out.println("Name: " + product.getName());
			System.out.println("Category: " + product.getCategory());
			System.out.println("Price: $" + product.getPrice());
		}
    }
}
