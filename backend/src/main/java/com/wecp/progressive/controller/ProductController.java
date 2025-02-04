package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Product;
<<<<<<< HEAD
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ProductController {

    public ResponseEntity<List<Product>> getAllProducts() {
        return null;
    }

    public ResponseEntity<Product> getProductById(int productId) {
        return null;
    }

    public ResponseEntity<Integer> addProduct(Product product) {
        return null;
    }

    public ResponseEntity<Void> updateProduct(int productId, Product product) {
        return null;
    }

    public ResponseEntity<Void> deleteProduct(int productId) {
        return null;
    }

    public ResponseEntity<List<Product>> getAllProductByWarehouse(int warehouseId) {
        return null;
    }
}
=======
import com.wecp.progressive.service.impl.ProductServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    ProductServiceImplJpa productServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Product>> getAllProducts() throws SQLException {
        List<Product> products = productServiceImplJpa.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    @GetMapping("/{productId}")
    public ResponseEntity<Product> getProductById(@PathVariable int productId) {
        try {
            Product product = productServiceImplJpa.getProductById(productId);
            if (product != null) {
                return new ResponseEntity<>(product, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        try {
            int productId = productServiceImplJpa.addProduct(product);
            return new ResponseEntity<>(productId, HttpStatus.CREATED);
        } catch (Exception e) {
            // Return a generic error message for any other exceptions
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{productId}")
    public ResponseEntity<Void> updateProduct(@PathVariable int productId, @RequestBody Product product) {
        try {
            product.setProductId(productId);
            productServiceImplJpa.updateProduct(product);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int productId) {
        try {
            productServiceImplJpa.deleteProduct(productId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/warehouse/{warehouseId}")
    public ResponseEntity<List<Product>> getAllProductByWarehouse(@PathVariable int warehouseId) throws SQLException {
        List<Product> products = productServiceImplJpa.getAllProductByWarehouse(warehouseId);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
