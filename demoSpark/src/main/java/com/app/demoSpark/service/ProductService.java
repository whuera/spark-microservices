package com.app.demoSpark.service;

import com.app.demoSpark.models.Products;

import java.util.List;

public interface ProductService {
    public void saveProduct(Products product);
    public List<Products> getProducts();
    public Products getProductById (String codeProduct);
    public void editProduct(Products product);
    public void deleteProduct(String codeProduct);

}
