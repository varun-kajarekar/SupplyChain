package com.t7.supplychain.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("SupervisorReq")
public class SupervisorReq {

    @Id
    private String id;

    private String material_name;

    private String vendorName;

    private String quantity;

    private int budget;

    private String fleet_type;

    private String nofleet;

    private String expDeliveryDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMaterial_name() {
        return material_name;
    }

    public void setMaterial_name(String material_name) {
        this.material_name = material_name;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }

    public String getFleet_type() {
        return fleet_type;
    }

    public void setFleet_type(String fleet_type) {
        this.fleet_type = fleet_type;
    }

    public String getNofleet() {
        return nofleet;
    }

    public void setNofleet(String nofleet) {
        this.nofleet = nofleet;
    }

    public String getExpDeliveryDate() {
        return expDeliveryDate;
    }

    public void setExpDeliveryDate(String expDeliveryDate) {
        this.expDeliveryDate = expDeliveryDate;
    }

    public SupervisorReq(String id, String material_name, String vendorName, String quantity, int budget, String fleet_type, String nofleet, String expDeliveryDate) {
        this.id = id;
        this.material_name = material_name;
        this.vendorName = vendorName;
        this.quantity = quantity;
        this.budget = budget;
        this.fleet_type = fleet_type;
        this.nofleet = nofleet;
        this.expDeliveryDate = expDeliveryDate;
    }

    public SupervisorReq() {
    }

    @Override
    public String toString() {
        return "SupervisorReq{" +
                "id='" + id + '\'' +
                ", material_name='" + material_name + '\'' +
                ", vendorName='" + vendorName + '\'' +
                ", quantity='" + quantity + '\'' +
                ", budget='" + budget + '\'' +
                ", fleet_type='" + fleet_type + '\'' +
                ", nofleet='" + nofleet + '\'' +
                ", expDeliveryDate='" + expDeliveryDate + '\'' +
                '}';
    }
}
