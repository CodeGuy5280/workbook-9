package org.pluralsight.demo;

import org.springframework.stereotype.Component;

import java.util.List;


public interface SimpleProductDao {
    void add(Product product);
    List<Product> getAll();
}
