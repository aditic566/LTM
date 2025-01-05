package com.wecp.progressive.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Supplier;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier,Integer>{
    //List<Supplier> getAllSuppliersSortedByName(List<Supplier> supplier);
    void deleteBySupplierId(@Param("supplierId") int supplierId);
    Supplier findBySupplierId(@Param("supplierId") int supplierId);
    Supplier findByUsername(String username);
    Supplier findByEmail(String email);

}
