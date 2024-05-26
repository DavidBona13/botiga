package com.accesadades.botiga.Repository;

import java.util.Set;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Repository;

import com.accesadades.botiga.Model.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{
    
    @Override
    @NonNull
    Set<Category> findAll();
    Category findByName(@NonNull String name);

    //String saveCategory(Category category);
    String deleteCategoryById(Long id);
}
