package com.wecp.progressive.service;

import com.wecp.progressive.entity.Warehouse;

<<<<<<< HEAD
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses();

    int addWarehouse(Warehouse warehouse);

    List<Warehouse> getWarehousesSortedByCapacity();

    default public void emptyArrayList() {
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) {
    }

    default void deleteWarehouse(int warehouseId) {
    }

    default Warehouse getWarehouseById(int warehouseId) {
=======
import java.sql.SQLException;
import java.util.List;

public interface WarehouseService {
    List<Warehouse> getAllWarehouses() throws SQLException;

    int addWarehouse(Warehouse warehouse) throws SQLException;

    List<Warehouse> getWarehousesSortedByCapacity() throws SQLException;

    default public void emptyArrayList() throws SQLException {
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java class
    default void updateWarehouse(Warehouse warehouse) throws SQLException {
    }

    default void deleteWarehouse(int warehouseId) throws SQLException {
    }

    default Warehouse getWarehouseById(int warehouseId) throws SQLException {
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
        return null;
    }

    //Do not implement these methods in WarehouseServiceImplArraylist.java and WarehouseServiceImplJdbc.java class
<<<<<<< HEAD
    default List<Warehouse> getWarehouseBySupplier(int supplierId) {
        return null;
    }
}
=======
    default List<Warehouse> getWarehouseBySupplier(int supplierId) throws SQLException {
        return null;
    }
}


>>>>>>> 8351afc1423865327955609d48f17be0b494154f
