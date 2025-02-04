package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Product;

<<<<<<< HEAD
import java.util.List;

public interface ProductDAO {
    int addProduct(Product product);
    Product getProductById(int productId);
    void updateProduct(Product product);
    void deleteProduct(int productId);
    List<Product> getAllProducts();
=======
import java.sql.SQLException;
import java.util.List;

public interface ProductDAO {
    int addProduct(Product product) throws SQLException;
    Product getProductById(int productId) throws SQLException;
    void updateProduct(Product product) throws SQLException;
    void deleteProduct(int productId) throws SQLException;
    List<Product> getAllProducts() throws SQLException;
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}