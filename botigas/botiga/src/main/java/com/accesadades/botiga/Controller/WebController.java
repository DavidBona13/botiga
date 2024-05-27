package com.accesadades.botiga.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.accesadades.botiga.Model.Category;
import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.Subcategory;
import com.accesadades.botiga.Service.CategoryService;
import com.accesadades.botiga.Service.ProductService;
import com.accesadades.botiga.Service.SubcategoryService;

import java.time.LocalDate;
import java.util.Set;

@Controller
public class WebController {
 
    @Autowired
    private ProductService productService;
/* 
    @Autowired
    private SubcategoryService subcategoryService;

    @Autowired
    private CategoryService categoryService;*/
 
    @RequestMapping(value = "/")
    public String index(Model model) {
        return "index";
    }
 
    @RequestMapping(value = "/catalog")
    public String catalog(Model model) {
        Set<Product> products = productService.findAllProducts();
        model.addAttribute("products", products);
        return "catalog";
    }

    @RequestMapping(value = {"/search", "/prodname"}, method = {RequestMethod.GET, RequestMethod.POST})
    public String searchProductByName(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name != null) {
            Product product = productService.findProductsByName(name);
            model.addAttribute("product", product);
        }
        return "search"; // Referencia a search.html en el directorio templates
    }


    @RequestMapping(value = {"/productes", "/desar"}, method = (RequestMethod.POST))
    public String insertProduct(@RequestParam("nom") String nom,
                                @RequestParam("descripcio") String descripcio,
                                @RequestParam("fabricant") String fabricant,
                                @RequestParam("preu") double preu,
                                @RequestParam("Unitats") int unitats,
                                @RequestParam("subcategoria") String subcategoria,
                                @RequestParam("categoria") String categoria,
                                Model model) {
        
        return "desar";
    }

    @RequestMapping(value = {"/eliminar", "/name"}, method = (RequestMethod.DELETE))
    public String deleteProduct(@RequestParam(value = "name", required = false) String name, Model model){
        String message = productService.deleteProduct(name);
        model.addAttribute("message", message);
        return "eliminar"; // Referencia a eliminar.html en el directorio templates
    }
}