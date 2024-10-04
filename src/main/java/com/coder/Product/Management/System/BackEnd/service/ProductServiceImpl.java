package com.coder.Product.Management.System.BackEnd.service;

import com.coder.Product.Management.System.BackEnd.entity.Product;
import com.coder.Product.Management.System.BackEnd.repositry.ProductRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepositry repositry;


    @Override
    public Product saveProduct(Product product) {
        return repositry.save(product);
    }

    @Override
    public List<Product> getAllProduct() {
        return repositry.findAll();
    }

    @Override
    public Product getProductById(Integer id) {
        return repositry.findById(id).orElse(null);
    }

    @Override
    public String deleteProduct(Integer id) {

        Product product=repositry.findById(id).get();

        if (product!=null)
        {
            repositry.delete(product);
            return "Product Deleted SuccessFully..!!";
        }
        return "Something Went Wrong";

    }

    @Override
    public Product editProduct(Product p, Integer id) {
        Product oldProduct=repositry.findById(id).get();
        oldProduct.setProductName(p.getProductName());
        oldProduct.setDescription(p.getDescription());
        oldProduct.setPrice(p.getPrice());
        oldProduct.setStatus(p.getStatus());
        return repositry.save(oldProduct);

    }
}
