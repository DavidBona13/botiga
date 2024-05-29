package com.accesadades.botiga.Service;

import java.util.Set;
import com.accesadades.botiga.Model.Product;

//Clase interfície on hi han mètodes buits, sense lògica de negoci.
public interface ProductService {
 
    Set<Product> findAllProducts();
    Product findProductsByName(String name);
    Set<Product> findAllProducts(String subcategory);
    void increasePrice(Product product);
    Product saveProd(Product product);
    void deleteProduct(Long product_id);
}
