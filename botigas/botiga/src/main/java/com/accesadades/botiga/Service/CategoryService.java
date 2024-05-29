package com.accesadades.botiga.Service;

import java.util.Set;

import com.accesadades.botiga.Model.Category;

public interface CategoryService {
    Set<Category> findAllCategory();
    Category findCategoryByNames(String name);

    Category saveCat(Category category);
    void deleteCategory(Long category_id);
}
