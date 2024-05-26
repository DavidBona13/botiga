package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import com.accesadades.botiga.Model.Category;
import com.accesadades.botiga.Repository.CategoryRepository;

public class CategoryServiceImpl implements CategoryService{


    @Autowired
    private CategoryRepository categoryRepository;
    
    @Override
    public Set<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategoryByNames(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public String saveCat(Category category) {
        categoryRepository.save(category);
        return "Afegit correctament";
    }

    @Override
    public String deleteCategory(Long id) {
        categoryRepository.deleteById(id);
        return "Eliminat correctament!";
    }
    
    
}
