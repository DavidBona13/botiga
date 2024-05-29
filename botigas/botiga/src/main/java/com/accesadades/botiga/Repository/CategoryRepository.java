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

    //Mètode per guardar una categoria, amb l'annotació @SuppressWarnings pots evitar possibles excepcions en operacions on el compilador pogués detectar que estàs intentant accedir a una referència nul·la.
    //Retorna un objecte categoria.
    @SuppressWarnings({ "null", "unchecked" })
    Category save(Category category);
    //String saveCategory(Category category);
    @SuppressWarnings("null")
    void deleteById(Long category_id);
}
