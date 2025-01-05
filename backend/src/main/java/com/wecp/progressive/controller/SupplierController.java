package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Supplier;
import com.wecp.progressive.service.impl.SupplierServiceImplArraylist;
import com.wecp.progressive.service.impl.SupplierServiceImplJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
<<<<<<< HEAD
//import org.springframework.security.access.method.P;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;


=======
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
@RestController
@RequestMapping("/supplier")
public class SupplierController {
    @Autowired
    private SupplierServiceImplArraylist supplierServiceImplArraylist;
    @Autowired
    private SupplierServiceImplJpa supplierServiceImplJpa;

    @GetMapping
<<<<<<< HEAD
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
=======
    public ResponseEntity<List<Supplier>> getAllSuppliers() {
        return new ResponseEntity<>(supplierServiceImplJpa.getAllSuppliers(), HttpStatus.OK);
    }
    @GetMapping("/{supplierID}")
    public ResponseEntity<Supplier> getSupplierById(@PathVariable int supplierId) {
        // try{
        //     return new ResponseEntity<>(supplierServiceImplJpa.getSupplierById(supplierId), HttpStatus.OK);
        // }catch(Exception e){
        //     e.printStackTrace();
        // }
        return null;
    }

    @PostMapping
    public ResponseEntity<Integer> addSupplier(@RequestBody Supplier supplier) {
        //return new ResponseEntity<>(supplierServiceImplJpa.addSupplier(supplier),HttpStatus.OK);
        return null;
    }

    public ResponseEntity<Void> updateSupplier(Supplier supplier) {
        return null;
    }

    public ResponseEntity<Void> deleteSupplier(int supplierId) {
        return null;
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
    }


    @GetMapping("/fromArrayList")
<<<<<<< HEAD
    public ResponseEntity<List<Supplier>> getAllSupplierFromArrayList()throws SQLException{
=======
    public ResponseEntity<List<Supplier>> getAllSupplierFromArrayList(){
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliers();
        return new ResponseEntity<>(s,HttpStatus.OK);
    }
    @PostMapping("/toArrayList")
<<<<<<< HEAD
    public ResponseEntity<Integer> addSupplierToArrayList(@RequestBody Supplier supplier) throws SQLException{
=======
    public ResponseEntity<Integer> addSupplierToArrayList(@RequestBody Supplier supplier) {
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
        int listSize=supplierServiceImplArraylist.addSupplier(supplier);
        return new ResponseEntity<>(listSize, HttpStatus.CREATED);
        
    }
    @GetMapping("/fromArrayList/all")
<<<<<<< HEAD
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() throws SQLException {
=======
    public ResponseEntity<List<Supplier>> getAllSuppliersSortedByNameFromArrayList() {
>>>>>>> 4ad703be7cb45c426ce07d35587a657a0fb20c98
        List<Supplier> s=supplierServiceImplArraylist.getAllSuppliersSortedByName();
        return new ResponseEntity<>(s, HttpStatus.OK);
       
    }
}
