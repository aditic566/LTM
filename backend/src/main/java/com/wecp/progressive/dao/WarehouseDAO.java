package com.wecp.progressive.dao;

import com.wecp.progressive.entity.Warehouse;

<<<<<<< HEAD
import java.util.List;

public interface WarehouseDAO {
    int addWarehouse(Warehouse warehouse);
    Warehouse getWarehouseById(int warehouseId);
    void updateWarehouse (Warehouse warehouse);
    void deleteWarehouse (int warehouseId);
    List<Warehouse> getAllWarehouse();
=======
import java.sql.SQLException;
import java.util.List;

public interface WarehouseDAO {
    int addWarehouse(Warehouse warehouse) throws SQLException;
    Warehouse getWarehouseById(int warehouseId) throws SQLException;
    void updateWarehouse (Warehouse warehouse) throws SQLException;
    void deleteWarehouse (int warehouseId) throws SQLException;
    List<Warehouse> getAllWarehouse() throws SQLException;
>>>>>>> 8351afc1423865327955609d48f17be0b494154f
}