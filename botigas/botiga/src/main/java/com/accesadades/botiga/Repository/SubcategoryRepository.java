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
    //Mètode per guardar una categoria, amb l'annotació @SuppressWarnings pots evitar possibles excepcions en operacions on el compilador pogués detectar que estàs intentant accedir a una referència nul·la.
    //Retorna un objecte subcategoria.
    @SuppressWarnings({ "unchecked", "null" })
    Subcategory save(Subcategory subcategory);
    @SuppressWarnings("null")
    void deleteById(Long subcategory_id);    
}
