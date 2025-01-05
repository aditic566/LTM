package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;
import com.wecp.progressive.service.impl.SupplierServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierServiceImplArraylist supplierServiceImplArraylist;
    @Autowired
    private SupplierServiceImplJpa supplierServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Supplier>> getAllSuppliers() throws SQLException {
        try{
            List<Supplier> s=supplierServiceImplJpa.getAllSuppliers();
            return new ResponseEntity<>(s,HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        
    }
    @GetMapping("/{supplierId}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable int supplierId) throws SQLException{
        try{
            return new ResponseEntity<>(supplierServiceImplJpa.getSupplierById(supplierId),HttpStatus.OK);
        }catch(Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);

    }

    @PostMapping
    public ResponseEntity<Integer> addSupplier(@RequestBody Supplier supplier){
        try{
            int s=supplierServiceImplJpa.addSupplier(supplier);
            return new ResponseEntity<>(s,HttpStatus.CREATED);
        }
        catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
       
    }

    @PutMapping("/{supplierId}")
    public ResponseEntity<Void> updateSupplier(@PathVariable int supplierId,@RequestBody Supplier supplier) throws SQLException{
        try{
            Supplier s=supplierServiceImplJpa.getSupplierById(supplierId);
            if(s==null){
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            supplier.setSupplierId(s.getSupplierId());
            supplierServiceImplJpa.updateSupplier(supplier);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{supplierId}")
    public ResponseEntity<?> deleteSupplier(@PathVariable int supplierId) throws SQLException{
        try{
            supplierServiceImplJpa.deleteSupplier(supplierId);
            return new ResponseEntity<>("Deleted successfully",HttpStatus.NO_CONTENT);
        }catch(Exception e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Supplier>> getAllSupplierFromArrayList()throws SQLException{
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliers();
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addSupplierToArrayList(@RequestBody Supplier supplier) throws SQLException{
        int listSize=supplierServiceImplArraylist.addSupplier(supplier);
        return new ResponseEntity<>(listSize, HttpStatus.CREATED);
        
    }
    @GetMapping("/fromArrayList/all")
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() throws SQLException {
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliersSortedByName();
        return new ResponseEntity<>(s, HttpStatus.OK);
       
    }
}
