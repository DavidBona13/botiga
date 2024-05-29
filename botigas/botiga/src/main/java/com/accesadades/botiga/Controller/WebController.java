package com.accesadades.botiga.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.accesadades.botiga.Model.Product;
import com.accesadades.botiga.Model.Subcategory;
import com.accesadades.botiga.Service.ProductService;
import com.accesadades.botiga.Service.SubcategoryService;

import java.util.Set;

@Controller
public class WebController {
 
    @Autowired
    private ProductService productService;

    @Autowired
    private SubcategoryService subcategoryService;
 
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

    //Mètode get on li pasem totes les subcategories i un objecte buit (que s'ha d'omplir amb els camps del formulari) al arxiu html desar (a través del return) mitjançant Model.
    @RequestMapping(value = "/desar", method = (RequestMethod.GET))
    public String preProduct(Model model) {
        Set<Subcategory> subcategories = subcategoryService.findAllSubcategory();
        //Set<Category> categories = categoryService.findAllCategory();
        //model.addAttribute("categories", categories);
        model.addAttribute("subcategories", subcategories);
        model.addAttribute("product", new Product());
        return "desar";
    }

    //Mètode post que agafa les dades del formulari un cop es clica el botó, si la insercció és correcte t'enviarà a la pàgina 'inserida' sinò, tornes a l'index.
    @RequestMapping (value = "/guardarProducte", method = (RequestMethod.POST))
    public String guardarProduct(Model model, @ModelAttribute("product") Product product) {
        if(product == null){
            return "index";
        }
        productService.saveProd(product);
        return "inserida";
    }

    //Mètode delete que no està implementat ni és funcional.
    @RequestMapping(value = "/eliminar", method = (RequestMethod.DELETE))
    public void deleteProduct(@RequestParam(value = "product_id", required = false) Long product_id, Model model){
        productService.deleteProduct(product_id);
    }
}