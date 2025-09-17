package com.nie.csd.controllers;
import com.nie.csd.models.Products;
import com.nie.csd.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;
@RestController
@RequestMapping("/api/products")
public class ProductController {
 @GetMapping("/hello")  
 public ResponseEntity<String> sayHello() {
     return ResponseEntity.ok("Hello, World!");
    }

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> products = productRepository.findAll();
        return ResponseEntity.ok(products);
    }
}