package com.wecp.progressive.service.impl;

import java.util.List;

<<<<<<< HEAD
import org.springframework.stereotype.Service;

//import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.service.ProductService;

@Service
public class ProductServiceImplJpa implements ProductService  {

    private ProductRepository productRepository;

    public ProductServiceImplJpa (ProductRepository productRepository) {
        this.productRepository = productRepository;
=======
import com.wecp.progressive.dao.ProductDAO;
import com.wecp.progressive.entity.Product;
import com.wecp.progressive.service.ProductService;

public class ProductServiceImplJpa implements ProductService  {

    private ProductDAO productDAO;

    public ProductServiceImplJpa (ProductDAO productDAO) {
        this.productDAO = productDAO;
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
    }
   
    @Override
    public List<Product> getAllProducts() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public Product getProductById(int productId) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int addProduct(Product product) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public void updateProduct(Product product) {
        // TODO Auto-generated method stub
    }

    @Override
    public void deleteProduct(int productId) {
        // TODO Auto-generated method stub
    }

}
