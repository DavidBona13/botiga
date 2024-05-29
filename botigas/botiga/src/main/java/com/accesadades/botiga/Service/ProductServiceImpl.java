package com.accesadades.botiga.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Set;
import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Repository.ProductRepository;

//Classe amb l'annotació service i que implementa la interfície ProductService.
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Set<Product> findAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Set<Product> findAllProducts(String subcategory) {
        return productRepository.findAll();
    }

    @Override
    public Product findProductsByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public void increasePrice(Product product) {

    }

    @Override
    public Product saveProd(Product product) {
       productRepository.save(product);
       return product;
    }

    @Override
    public void deleteProduct(Long product_id) {
        productRepository.deleteById(product_id);
    }
}
