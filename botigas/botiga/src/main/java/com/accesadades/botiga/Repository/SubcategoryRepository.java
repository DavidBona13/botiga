package com.accesadades.botiga.Repository;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import com.accesadades.botiga.Model.Subcategory;

public interface SubcategoryRepository extends CrudRepository<Subcategory, Long>{

    @Override
    @NonNull
    Set<Subcategory> findAll();
    Subcategory findByName(String name);

    String deleteSubcategoryById(Long id);    
}
