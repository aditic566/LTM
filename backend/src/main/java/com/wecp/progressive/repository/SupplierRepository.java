package com.wecp.progressive.repository;

<<<<<<< HEAD

public interface SupplierRepository {
}
=======
import com.wecp.progressive.entity.Supplier;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

    // @Modifying
    // @Transactional
    void deleteBySupplierId(@Param("supplierId") int supplierId);

    Supplier findBySupplierId(@Param("supplierId") int supplierId);

    Supplier findByUsername(String username);

    Supplier findByEmail(String email);
}
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
