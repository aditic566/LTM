package com.wecp.progressive.service.impl;

import java.util.List;

<<<<<<< HEAD
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


=======
import com.wecp.progressive.dao.WarehouseDAO;
import com.wecp.progressive.dao.WarehouseDAOImpl;
import com.wecp.progressive.entity.Warehouse;
import com.wecp.progressive.service.WarehouseService;

public class WarehouseServiceImplJpa implements WarehouseService  {


    private WarehouseDAO warehouseDAO;
    public WarehouseServiceImplJpa (WarehouseDAOImpl warehouseDAO)  {
        this.warehouseDAO = warehouseDAO;
    }

>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
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