package com.accesadades.botiga.Service;

import java.util.Set;

import com.accesadades.botiga.Model.Category;

//Clase interfície on hi han mètodes buits, sense lògica de negoci.
public interface CategoryService {
    Set<Category> findAllCategory();
    Category findCategoryByNames(String name);

    Category saveCat(Category category);
    void deleteCategory(Long category_id);
}
