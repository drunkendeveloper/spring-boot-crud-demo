package com.rest.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rest.entities.Product;
import com.rest.services.ProductService;

/**
 * Product controller.
 */
@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    /**
     * List all products.
     *
     * @return list of all products
     */
    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public List<Product> getProducts() {
        return productService.getProducts();
    }
    
    /**
     * Returns a particular product
     * @return product based on id
     */
    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    public Product getProductById(@PathVariable String id) {
        return productService.getProductById(Integer.parseInt(id));
    }
    
    /**
     * Creates a product
     * 
     * @param product
     * @return
     */
    @RequestMapping(value = "/products", method=RequestMethod.POST)
    public Product createProduct(@RequestBody Product product){
    	
    	return productService.saveProduct(product);
    }
    
    /**
     * update a product by its id
     * 
     * @param product
     * @return
     */
    @RequestMapping(value = "/products/{id}", method=RequestMethod.PUT)
    public Product updateProduct(@PathVariable String id, @RequestBody Product product){
    	product.setId(Integer.parseInt(id));
    	return productService.saveProduct(product);
    }

    @RequestMapping(value="/products/{id}", method=RequestMethod.DELETE)
    public void deleteProduct(@PathVariable String id, @RequestBody Product product){
    	productService.deleteProduct(Integer.parseInt(id));
    }
}
