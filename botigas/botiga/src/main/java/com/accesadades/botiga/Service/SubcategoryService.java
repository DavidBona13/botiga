package com.accesadades.botiga.Service;

import java.util.Set;

import com.accesadades.botiga.Model.Subcategory;

public interface SubcategoryService {
    Set<Subcategory> findAllSubcateogy();
    Subcategory findSubcategoryByNames(String name);

    String saveSub(Subcategory subcategory);
    String deleteSubcategory(Long id);
}
