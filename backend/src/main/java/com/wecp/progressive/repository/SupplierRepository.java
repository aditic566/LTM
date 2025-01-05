package com.wecp.progressive.repository;

<<<<<<< HEAD
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

=======

public interface SupplierRepository {
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
}
