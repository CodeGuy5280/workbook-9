package org.pluralsight.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DemoApplication.class, args);

		// Get the ProductService bean from Spring
		ProductService service = context.getBean(ProductService.class);

		// Add products
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
