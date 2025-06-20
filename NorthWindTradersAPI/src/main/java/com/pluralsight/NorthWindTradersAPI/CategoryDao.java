package com.pluralsight.NorthWindTradersAPI;

import com.pluralsight.NorthWindTradersAPI.modules.Category;
import java.util.List;

public interface CategoryDao {
    List<Category> getAll();
    Category getById(int id);
    Category insert(Category category);  // New method
}
