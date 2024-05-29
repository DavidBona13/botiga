package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accesadades.botiga.Model.Category;
import com.accesadades.botiga.Repository.CategoryRepository;

//Classe amb l'annotació service i que implementa la interfície CategoryService.
@Service
public class CategoryServiceImpl implements CategoryService{

    //Injecció de dependències, permet injectar beans colaboratius.
    @Autowired
    private CategoryRepository categoryRepository;
    
    //Mètodes sobreescrits i amb la lògica de negoci.
    @Override
    public Set<Category> findAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findCategoryByNames(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Category saveCat(Category category) {
        categoryRepository.save(category);
        return category;
    }

    @Override
    public void deleteCategory(Long category_id) {
        categoryRepository.deleteById(category_id);
    }
    
    
}
