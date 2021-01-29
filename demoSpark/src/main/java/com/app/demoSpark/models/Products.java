package com.app.demoSpark.models;

import lombok.AllArgsConstructor;
import lombok.Data;

/** The type Products. */
@AllArgsConstructor
@Data
public class Products {
    private double IdProduct;
    private String codProduct;
    private String nameProduct;
    private String descProduct;
    private String specificationsProduct;
    private int quantityProduct;
    private double costProduct;
    private String urlImageProduct;
}
