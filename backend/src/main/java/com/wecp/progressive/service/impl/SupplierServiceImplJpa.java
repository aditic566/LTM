package com.wecp.progressive.service.impl;


import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.exception.SupplierAlreadyExistsException;
import com.wecp.progressive.exception.SupplierDoesNotExistException;
import com.wecp.progressive.repository.ProductRepository;
import com.wecp.progressive.repository.SupplierRepository;
import com.wecp.progressive.repository.WarehouseRepository;
import com.wecp.progressive.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class SupplierServiceImplJpa implements SupplierService {

    @Autowired
    WarehouseRepository warehouseRepository;

    @Autowired
    ProductRepository productRepository;

    private final SupplierRepository supplierRepository;

    @Autowired
    public SupplierServiceImplJpa(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierRepository.findAll();
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        String name=supplier.getSupplierName();
        String email=supplier.getEmail();
        Optional<Supplier> newSupplier=supplierRepository.findBySupplierName(name);
        Optional<Supplier> newEmail=supplierRepository.findByEmail(email);
        if(newSupplier.isPresent() || newEmail.isPresent()){
            throw new SupplierAlreadyExistsException("already exist supplier");
        }
        return supplierRepository.save(supplier).getSupplierId();

    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException {
        List<Supplier> sortedSuppliers = supplierRepository.findAll();
        Collections.sort(sortedSuppliers);
        return sortedSuppliers;
    }

    @Override
    public void updateSupplier(Supplier supplier) throws SQLException {
        String name=supplier.getSupplierName();
        Optional<Supplier> newName=supplierRepository.findBySupplierName(name);
        if(newName.isPresent()){
            throw new SupplierAlreadyExistsException("already exists");
        }
        supplierRepository.save(supplier);
    }

    @Override
    @Transactional
    public void deleteSupplier(int supplierId) throws SQLException {
        productRepository.deleteBySupplierId(supplierId);
        warehouseRepository.deleteBySupplierId(supplierId);
        supplierRepository.deleteBySupplierId(supplierId);
    }

    @Override
    public Supplier getSupplierById(int supplierId) throws SQLException {
        Optional<Supplier> optionalSupplier=supplierRepository.findBySupplierId(supplierId);
        if(optionalSupplier.isPresent()){
            throw new SupplierDoesNotExistException("doesnot exists");
        }else{
            return optionalSupplier.get();
        }
    }
}