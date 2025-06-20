package com.pluralsight.NorthWindTradersAPI.controllers;

import com.pluralsight.NorthWindTradersAPI.modules.Category;
import com.pluralsight.NorthWindTradersAPI.modules.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
    public class CategoriesController {

        private List<Category> categories = new ArrayList<>();


        public CategoriesController (){
            categories.add(new Category(1, "Shoes"));
            categories.add(new Category(2, "Shirts"));
            categories.add(new Category(3, "Pants"));
        }

    @GetMapping("/categories")
    public List<Category> getAllCategories() {
        return categories;
    }

    //Adding missing portion for specifying each GETMAPPING
    @GetMapping("/category/{categoryId}")
    public Category getCategoryById(@PathVariable int categoryId){
        for (Category category : categories)
            if (category.getCategoryId() == categoryId)
                return category;
        return null;
    }
}



