package com.accesadades.botiga.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

import java.util.Set;
import com.accesadades.botiga.Model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Override
    @NonNull
    Set<Product> findAll();
    Product findByName(String name);
    Set<Product> findByNameAndPrice(String name, float price);
    //Mètode per guardar una categoria, amb l'annotació @SuppressWarnings pots evitar possibles excepcions en operacions on el compilador pogués detectar que estàs intentant accedir a una referència nul·la.
    //Retorna un objecte producte.
    @SuppressWarnings({ "null", "unchecked" })
    Product save(Product product);
    @SuppressWarnings("null")
    void deleteById(Long product_id);
}