package com.app.demoSpark.service;

import com.app.demoSpark.models.Products;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** The type Product service. */
public class ProductServiceImpl implements ProductService {

    private Map<String, Products> productsMap = new HashMap<String, Products>();

  /** Instantiates a new Product service. */
  public ProductServiceImpl() {
        productsMap.put ("01", new Products (1,"PR-01", "DELL G3", "Laptop Dell G3 Gammer", "Intel Core I9, 16MB RAM, 1TG HDD, 15.6 Widescreen", 5, 1800, "",1));
        productsMap.put ("02", new Products (1,"PR-02", "DELL G7", "Laptop Dell G7 Gammer", "Intel Core I9, 16MB RAM, 1TG HDD, 17.3 Widescreen", 5, 1800, "", 1));
    }

    @Override
    public void saveProduct (Products product) {
        productsMap.put (String.valueOf(product.getIdProduct ()), product) ;
    }

    @Override
    public List<Products> getProducts () {
        return new ArrayList<Products> (productsMap.values ());
    }

    @Override
    public Products getProductById (String codeProduct) {
        return productsMap.get (codeProduct);
    }

    @Override
    public void editProduct (Products product) {

    }

    @Override
    public void deleteProduct (String codeProduct) {

    }
}
