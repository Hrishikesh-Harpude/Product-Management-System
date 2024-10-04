package com.coder.Product.Management.System.BackEnd.controller;

import com.coder.Product.Management.System.BackEnd.entity.Product;
import com.coder.Product.Management.System.BackEnd.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("http://localhost:5173")
public class ProductController {

 @Autowired
    private ProductService service;

      @PostMapping("/saveProduct")
      public ResponseEntity<?> saveProduct(@RequestBody Product product)
      {
          return new ResponseEntity<>(service.saveProduct(product), HttpStatus.CREATED);
      }

      @GetMapping("/")
        public ResponseEntity<?> getAllProduct()
      {
          return new ResponseEntity<>(service.getAllProduct(),HttpStatus.OK);

      }

      @GetMapping("/{id}")
      public ResponseEntity<?> getProductById(@PathVariable Integer id)
      {
          return new ResponseEntity<>(service.getProductById(id),HttpStatus.OK);
      }

      @GetMapping("/deleteProduct/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable Integer id)
      {
          return new ResponseEntity<>(service.deleteProduct(id),HttpStatus.OK);
      }

    @PostMapping("/editProduct/{id}")
    public ResponseEntity<?> editProduct(@RequestBody Product product,@PathVariable Integer id)
    {
        return new ResponseEntity<>(service.editProduct(product,id), HttpStatus.CREATED);
    }
}
