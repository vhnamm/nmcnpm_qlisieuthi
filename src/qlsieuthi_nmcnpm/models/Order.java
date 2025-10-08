/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.models;

import java.time.LocalDateTime;

/**
 *
 * @author ADMIN
 */
public class Order {
    private int id;
    private int employeeID;
    private int customerID;
    private String codes;
    private double total;
    private double customerPaid;
    private LocalDateTime times;
    private int state;

    public Order(int employeeID, int customerID, String codes, double total, double customerPaid, LocalDateTime times, int state) {
        this.employeeID = employeeID;
        this.customerID = customerID;
        this.codes = codes;
        this.total = total;
        this.customerPaid = customerPaid;
        this.times = times;
        this.state = state;
    }

    public Order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getCustomerPaid() {
        return customerPaid;
    }

    public void setCustomerPaid(double customerPaid) {
        this.customerPaid = customerPaid;
    }

    public LocalDateTime getTimes() {
        return times;
    }

    public void setTimes(LocalDateTime times) {
        this.times = times;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
    
    
}
