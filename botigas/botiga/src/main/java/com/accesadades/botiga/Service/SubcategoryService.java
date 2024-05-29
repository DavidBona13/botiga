package com.accesadades.botiga.Service;

import java.util.Set;

import com.accesadades.botiga.Model.Subcategory;

public interface SubcategoryService {
    Set<Subcategory> findAllSubcategory();
    Subcategory findSubcategoryByNames(String name);

    Subcategory saveSub(Subcategory subcategory);
    void deleteSubcategory(Long subcategory_id);
}
