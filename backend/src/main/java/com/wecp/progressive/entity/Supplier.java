package com.wecp.progressive.entity;

import java.util.Comparator;

public class Supplier implements Comparable<Supplier>,Comparator<Supplier>{
    private int supplier_id;
    private String supplier_name;
    private String contact_email;
    private String address;
    private String role;
    public Supplier(int supplier_id, String supplier_name, String contact_email, String address, String role) {
        this.supplier_id = supplier_id;
        this.supplier_name = supplier_name;
        this.contact_email = contact_email;
        this.address = address;
        this.role = null;
    }
    public int getSupplier_id() {
        return supplier_id;
    }
    public void setSupplier_id(int supplier_id) {
        this.supplier_id = supplier_id;
    }
    public String getSupplier_name() {
        return supplier_name;
    }
    public void setSupplier_name(String supplier_name) {
        this.supplier_name = supplier_name;
    }
    public String getContact_email() {
        return contact_email;
    }
    public void setContact_email(String contact_email) {
        this.contact_email = contact_email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public int compareTo(Supplier o) {
        return this.getSupplier_name().compareTo(o.getSupplier_name());
    }
    
    

    
}