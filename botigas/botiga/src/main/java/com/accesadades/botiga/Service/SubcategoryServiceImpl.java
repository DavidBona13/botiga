package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accesadades.botiga.Model.Subcategory;
import com.accesadades.botiga.Repository.SubcategoryRepository;

//Classe amb l'annotació service i que implementa la interfície SubcategoryService.
@Service
public class SubcategoryServiceImpl implements SubcategoryService{

    @Autowired
    private SubcategoryRepository subcategoryRepository;

    @Override
    public Set<Subcategory> findAllSubcategory() {
        return subcategoryRepository.findAll();
    }

    @Override
    public Subcategory findSubcategoryByNames(String name) {
        return subcategoryRepository.findByName(name);
    }

    @Override
    public Subcategory saveSub(Subcategory subcategory) {
        subcategoryRepository.save(subcategory);
        return subcategory;
    }

    @Override
    public void deleteSubcategory(Long subcategory_id) {
        subcategoryRepository.deleteById(subcategory_id);
    }
    
}
