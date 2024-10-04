package com.coder.Product.Management.System.BackEnd.repositry;

import com.coder.Product.Management.System.BackEnd.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface ProductRepositry extends JpaRepository<Product,Integer> {
}
