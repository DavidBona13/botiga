package com.accesadades.botiga.Service;

import java.util.Set;

import com.accesadades.botiga.Model.Subcategory;

//Clase interfície on hi han mètodes buits, sense lògica de negoci.
public interface SubcategoryService {
    Set<Subcategory> findAllSubcategory();
    Subcategory findSubcategoryByNames(String name);

    Subcategory saveSub(Subcategory subcategory);
    void deleteSubcategory(Long subcategory_id);
}
