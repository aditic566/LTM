package com.wecp.progressive.service.impl;

<<<<<<< HEAD
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.exception.SupplierDoesNotExistException;
import com.wecp.progressive.repository.SupplierRepository;
=======
import java.util.List;

import org.springframework.stereotype.Service;

import com.wecp.progressive.dao.SupplierDAO;
import com.wecp.progressive.entity.Supplier;
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
import com.wecp.progressive.service.SupplierService;

@Service
public class SupplierServiceImplJpa implements SupplierService  {

<<<<<<< HEAD
    private final SupplierRepository supplierRepository;
    @Autowired
    public SupplierServiceImplJpa(SupplierRepository supplierRepository) {
        this.supplierRepository=supplierRepository;
    }
   
    @Override
    public List<Supplier> getAllSuppliers() throws SQLException {
        return supplierRepository.findAll();
    }

    @Override
    public int addSupplier(Supplier supplier) throws SQLException {
        return supplierRepository.save(supplier).getSupplierId();
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() throws SQLException{
        List<Supplier> sortedSuppliers=supplierRepository.findAll();
        Collections.sort(sortedSuppliers);
        return sortedSuppliers;
        //return supplierRepository.getAllSuppliersSortedByName(supplier);
    }
    @Override
    public void updateSupplier(Supplier supplier) throws SQLException{
        supplierRepository.save(supplier);
    }
    @Override
    @Transactional
    public void deleteSupplier(int supplierId) throws SQLException{
       //supplierRepository.deleteBySupplierId(supplierId);
       supplierRepository.deleteBySupplierId(supplierId);
    }
    @Override
    public Supplier getSupplierById(int supplierId) throws SupplierDoesNotExistException{
        Supplier supplier= supplierRepository.findBySupplierId(supplierId);
        if(supplier!=null){
            return supplierRepository.findBySupplierId(supplierId);
        }
        throw new SupplierDoesNotExistException("Supplier with the given supplierId does not exists");
    }
=======
    private SupplierDAO supplierDAO;

    public SupplierServiceImplJpa(SupplierDAO supplierDAO) {
        this.supplierDAO = supplierDAO;
    }
   
    @Override
    public List<Supplier> getAllSuppliers() {
        // TODO Auto-generated method stub
        return List.of();
    }

    @Override
    public int addSupplier(Supplier supplier) {
        // TODO Auto-generated method stub
        return -1;
    }

    @Override
    public List<Supplier> getAllSuppliersSortedByName() {
        // TODO Auto-generated method stub
        return List.of();
    }

>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
}