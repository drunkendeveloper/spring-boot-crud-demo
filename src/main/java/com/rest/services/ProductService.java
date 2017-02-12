package com.rest.services;

import java.util.List;

import com.rest.entities.Product;

public interface ProductService {

    List<Product> getProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);

}
