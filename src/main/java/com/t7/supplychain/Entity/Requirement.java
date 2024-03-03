package com.t7.supplychain.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Requirement")
public class Requirement {

    @Id
    private String supervisoruser;

    private String materialName;

    private int Quantity;

    private int Budget;

    private String ExpDeliveryDate;

    private String status;

    public String getSupervisoruser() {
        return supervisoruser;
    }

    public void setSupervisoruser(String supervisoruser) {
        this.supervisoruser = supervisoruser;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSupervisorUser() {
        return supervisoruser;
    }

    public void setSupervisorUser(String supervisorUser) {
        supervisoruser = supervisorUser;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

    public String getExpDeliveryDate() {
        return ExpDeliveryDate;
    }

    public void setExpDeliveryDate(String expDeliveryDate) {
        ExpDeliveryDate = expDeliveryDate;
    }

    public Requirement() {
    }

    public Requirement(String supervisorUser, String materialName, int quantity, int budget, String expDeliveryDate, String status) {
        supervisoruser = supervisorUser;
        this.materialName = materialName;
        Quantity = quantity;
        Budget = budget;
        ExpDeliveryDate = expDeliveryDate;
        this.status = status;
    }

    @Override
    public String toString() {
        return "VendorOrderEntity{" +
                "SupervisorUser='" + supervisoruser + '\'' +
                ", materialName='" + materialName + '\'' +
                ", Quantity=" + Quantity +
                ", Budget=" + Budget +
                ", ExpDeliveryDate='" + ExpDeliveryDate + '\'' +
                '}';
    }
}