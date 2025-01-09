package com.wecp.progressive.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.wecp.progressive.entity.Insurance;

@Repository
public interface InsuranceRepository extends JpaRepository<Insurance,Integer>{

    Insurance findByInsuranceId(int insuranceId);

    @Query("delete from Insurance i where i.shipment.shipmentId=:shipmentId")
    void deleteByShipmentId(int shipmentId);
}
