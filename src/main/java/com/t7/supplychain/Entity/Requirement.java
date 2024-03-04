package com.t7.supplychain.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("Requirement")
public class Requirement {

    @Id
    private String id;

    private String supervisoruser;

    private String materialName;

    private int Quantity;

    private int Budget;

    private String ExpDeliveryDate;

    private String status;


    public String getId() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getSupervisoruser() {
        return supervisoruser;
    }

    public void setSupervisoruser(String supervisoruser) {
        this.supervisoruser = supervisoruser;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Requirement(int id, String supervisoruser, String materialName, int quantity, int budget, String expDeliveryDate, String status) {
        id = id;
        this.supervisoruser = supervisoruser;
        this.materialName = materialName;
        Quantity = quantity;
        Budget = budget;
        ExpDeliveryDate = expDeliveryDate;
        this.status = status;
    }

    public Requirement() {
    }

    @Override
    public String toString() {
        return "Requirement{" +
                "Id=" + id +
                ", supervisoruser='" + supervisoruser + '\'' +
                ", materialName='" + materialName + '\'' +
                ", Quantity=" + Quantity +
                ", Budget=" + Budget +
                ", ExpDeliveryDate='" + ExpDeliveryDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}