package com.pluralsight.NorthWindTradersAPI;

import com.pluralsight.NorthWindTradersAPI.modules.Product;
import java.util.List;

public interface ProductDao {
    List<Product> getAll();
    Product getById(int id);
    Product insert(Product product);  // New method
}
