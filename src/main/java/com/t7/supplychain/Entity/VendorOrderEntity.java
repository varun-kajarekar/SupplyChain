package com.t7.supplychain.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("VendorOrder")
public class VendorOrderEntity {

    @Id
    private int id;

    private int Budget;

    private int Quantity;

    private String Expdate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBudget() {
        return Budget;
    }

    public void setBudget(int budget) {
        Budget = budget;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int quantity) {
        Quantity = quantity;
    }

    public String getExpdate() {
        return Expdate;
    }

    public void setExpdate(String expdate) {
        Expdate = expdate;
    }

    public VendorOrderEntity(int id, int budget, int quantity, String expdate) {
        this.id = id;
        Budget = budget;
        Quantity = quantity;
        Expdate = expdate;
    }

    public VendorOrderEntity() {
    }

    @Override
    public String toString() {
        return "VendorOrder{" +
                "id=" + id +
                ", Budget=" + Budget +
                ", Quantity=" + Quantity +
                ", Expdate='" + Expdate + '\'' +
                '}';
    }
}
