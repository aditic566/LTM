package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    //@GetMapping
    public ResponseEntity<List<Product>> getAllProducts() {
        return null;
    }

    //@GetMapping
    public ResponseEntity<Product> getProductById(int productId) {
        return null;
    }

    //@PutMapping
    public ResponseEntity<Integer> addProduct(Product product) {
        return null;
    }

    //@PostMapping
    public ResponseEntity<Void> updateProduct(int productId, Product product) {
        return null;
    }

    //@PostMapping
    public ResponseEntity<Void> deleteProduct(int productId) {
        return null;
    }

    //@GetMapping
    public ResponseEntity<List<Product>> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
}
