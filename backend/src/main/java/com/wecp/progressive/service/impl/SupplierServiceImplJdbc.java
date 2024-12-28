package com.wecp.progressive.service.impl;

import java.util.List;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.SupplierService;

public class SupplierServiceImplJdbc implements SupplierService {

    @Override
    public List<Supplier> getAllSuppliers() {
        return List.of();
    }

    @Override
    public int addSupplier(Supplier supplier) {
       return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        return List.of();
    }

}