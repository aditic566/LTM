package com.wecp.progressive.service;

import com.wecp.progressive.entity.Product;

<<<<<<< HEAD
=======
import java.sql.SQLException;
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
import java.util.List;

public interface ProductService {

<<<<<<< HEAD
    List<Product> getAllProducts();

    Product getProductById(int productId);

    int addProduct(Product product);

    void updateProduct(Product product);

    void deleteProduct(int productId);

    //Do not implement these methods in ProductServiceImplJdbc.java class
    default List<Product> getAllProductByWarehouse(int warehouseId) {
=======
    List<Product> getAllProducts() throws SQLException;

    Product getProductById(int productId) throws SQLException;

    int addProduct(Product product) throws SQLException;

    void updateProduct(Product product) throws SQLException;

    void deleteProduct(int productId) throws SQLException;

    //Do not implement these methods in ProductServiceImplJdbc.java class
    public default List<Product> getAllProductByWarehouse(int warehouseId) {
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
        return null;
    }
}
