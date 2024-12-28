package com.wecp.progressive.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.wecp.progressive.config.DatabaseConnectionManager;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJdbc implements ProductService {
    private Connection connection;
    public ProductServiceImplJdbc(){
        try{
            connection=DatabaseConnectionManager.getConnection();
        }catch(SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    public List<Product> getAllProducts() {
        return List.of();
    }
    @Override
    public Product getProductById(int productId) {
        return null;
    }
    @Override
    public int addProduct(Product product) {
        return -1;
    }
    @Override
    public void updateProduct(Product product) {
        
    }
    @Override
    public void deleteProduct(int productId) {
        
    }

    
}