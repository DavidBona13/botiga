package com.accesadades.botiga.Service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accesadades.botiga.Model.Subcategory;
import com.accesadades.botiga.Repository.SubcategoryRepository;

@Service
public class SubcategoryServiceImpl implements SubcategoryService{

    @Autowired
    private SubcategoryRepository subcategoryRepository;

    @Override
    public Set<Subcategory> findAllSubcateogy() {
        return subcategoryRepository.findAll();
    }

    @Override
    public Subcategory findSubcategoryByNames(String name) {
        return subcategoryRepository.findByName(name);
    }

    @Override
    public String saveSub(Subcategory subcategory) {
        subcategoryRepository.save(subcategory);
        return "Afegit correctament!";
    }

    @Override
    public String deleteSubcategory(Long id) {
        subcategoryRepository.deleteById(id);
        return "Eliminat correctament!";
    }
    
}
