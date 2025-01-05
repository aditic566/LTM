package com.wecp.progressive.service.impl;

import java.util.List;

import javax.persistence.Access;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import com.wecp.progressive.dao.WarehouseDAO;
// import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.WarehouseService;


@Service
public class WarehouseServiceImplJpa implements WarehouseService  {
    private WarehouseRepository warehouseRepository;
    public WarehouseServiceImplJpa (WarehouseRepository warehouseRepository)  {
        this.warehouseRepository = warehouseRepository;
    }


    @Override
    public List<Warehouse> getAllWarehouses() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public int addWarehouse(Warehouse warehouse) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Warehouse> getWarehousesSortedByCapacity() {
        // TODO Auto-generated method stub
        return List.of();
    }
    
}