package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface ProductRepository {
=======
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByProductId(@Param("productId") int productId);

    List<Product>findAllByWarehouse_WarehouseId(@Param("warehouseId") int warehouseId);

    @Modifying
    @Transactional
    @Query("delete from Product p where  p.warehouse.warehouseId = :warehouseId")
    void deleteByWarehouseId(@Param("warehouseId") int warehouseId);

    @Modifying
    @Transactional
    @Query("delete from Product p where  p.warehouse.warehouseId in (select w.warehouseId from Warehouse w where w.supplier.supplierId = :supplierId)")
    void deleteBySupplierId(@Param("supplierId") int supplierId);

>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}
