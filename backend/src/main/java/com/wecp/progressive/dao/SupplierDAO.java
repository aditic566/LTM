package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Supplier;

<<<<<<< HEAD
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier);
    Supplier getSupplierById(int supplierId);
    void updateSupplier(Supplier supplier);
    void deleteSupplier(int supplierId) ;
    List<Supplier> getAllSuppliers();
=======
import java.sql.SQLException;
import java.util.List;

public interface SupplierDAO {
    int addSupplier(Supplier supplier) throws SQLException;
    Supplier getSupplierById(int supplierId) throws SQLException;
    void updateSupplier(Supplier supplier) throws SQLException;
    void deleteSupplier(int supplierId) throws SQLException ;
    List<Supplier> getAllSuppliers()  throws SQLException;
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}
