package com.wecp.progressive.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Insurance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int insuranceId;
    private String insuranceProvider;
    private Long insuranceCoverageAmount;

    @ManyToOne //(cascade = CascadeType.ALL)
    @JoinColumn(name = "shipmentId")
    private Shipment shipment;

    public Insurance(){}

    public Insurance(int insuranceId, String insuranceProvider, Long insuranceCoverageAmount, Shipment shipment) {
        this.insuranceId = insuranceId;
        this.insuranceProvider = insuranceProvider;
        this.insuranceCoverageAmount = insuranceCoverageAmount;
        this.shipment = shipment;
    }

    public int getInsuranceId() {
        return insuranceId;
    }

    public void setInsuranceId(int insuranceId) {
        this.insuranceId = insuranceId;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public Long getInsuranceCoverageAmount() {
        return insuranceCoverageAmount;
    }

    public void setInsuranceCoverageAmount(Long insuranceCoverageAmount) {
        this.insuranceCoverageAmount = insuranceCoverageAmount;
    }

    public Shipment getShipment() {
        return shipment;
    }

    public void setShipment(Shipment shipment) {
        this.shipment = shipment;
    }

    

}