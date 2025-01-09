package com.wecp.progressive.controller;

import com.wecp.progressive.entity.Insurance;
import com.wecp.progressive.service.impl.InsuranceServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/insurance")
public class InsuranceController {

    @Autowired
    InsuranceServiceImpl insuranceServiceImpl;

    @GetMapping
    public ResponseEntity<List<Insurance>> getAllInsurances() {
        try{
            List<Insurance> insurances=insuranceServiceImpl.getAllInsurances();
            return new ResponseEntity<>(insurances,HttpStatus.OK);
        }catch(SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{insuranceId}")
    public ResponseEntity<Insurance> getInsuranceById(@PathVariable int insuranceId) {
        try{
            Insurance insurance=insuranceServiceImpl.getInsuranceById(insuranceId);
            if(insurance!=null){
                return new ResponseEntity<>(insurance,HttpStatus.OK);
            }else{
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        }catch(SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Integer> createInsurance(@RequestBody Insurance insurance) {
        try{
            int insuranceCreation=insuranceServiceImpl.addInsurance(insurance);
            return new ResponseEntity<>(insuranceCreation,HttpStatus.CREATED);
        }catch(SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{insuranceId}")
    public ResponseEntity<Void> updateInsurance(@PathVariable int insuranceId,@RequestBody Insurance insurance) {
        try{
            insurance.setInsuranceId(insuranceId);
            insuranceServiceImpl.updateInsurance(insurance);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch(SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{insuranceId}")
    public ResponseEntity<Void> deleteInsurance(@PathVariable int insuranceId) {
        try{
            insuranceServiceImpl.deleteInsurance(insuranceId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }catch(SQLException e){
            e.printStackTrace();
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
