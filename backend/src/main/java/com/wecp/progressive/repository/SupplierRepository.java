package com.wecp.progressive.repository;

import com.wecp.progressive.entity.Supplier;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    @Query("delete from Supplier u where u.supplierId=:supplierId")
    void deleteBySupplierId(@Param("supplierId") int supplierId);

    Optional<Supplier> findBySupplierId(@Param("supplierId") int supplierId);

    Optional<Supplier> findBySupplierName(String supplierName);
    Supplier findByUsername(String username);

    Optional<Supplier> findByEmail(String email);
}