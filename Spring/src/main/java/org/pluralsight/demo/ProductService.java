package org.pluralsight.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {

    final SimpleProductDao dao;

    @Autowired
    public ProductService(SimpleProductDao dao){
        this.dao = dao;
    }

    public void addProduct(String product){
//    dao.add(product);
        Product newProduct1 = new Product(1, "Furniture", "Desk Chair", 199.99);
        Product newProduct2 = new Product(1, "Furniture", "Desk Lamp", 49.99);
        Product newProduct3 = new Product(2, "Electronics", "Laptop", 999.99);
        this.dao.add(newProduct1);
        this.dao.add(newProduct2);
        this.dao.add(newProduct3);

    }
}
