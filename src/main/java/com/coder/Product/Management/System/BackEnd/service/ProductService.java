package com.coder.Product.Management.System.BackEnd.service;

import com.coder.Product.Management.System.BackEnd.entity.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProduct();

    public Product getProductById(Integer id);

    public String deleteProduct(Integer id);

    public Product editProduct(Product product,Integer id);

}
