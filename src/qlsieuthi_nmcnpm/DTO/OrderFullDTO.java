/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DTO;

import java.util.List;

/**
 *
 * @author ADMIN
 */
public class OrderFullDTO {
    private String orderCode;
    private double discount;
    private double total;
    private String customerName;
    private String customerCode;
    private String customerTel;
    private List<OrderDetailDTO> soldProducts;

    public OrderFullDTO(String orderCode, double discount, double total, String customerName, String customerCode, String customerTel) {
        this.orderCode = orderCode;
        this.discount = discount;
        this.total = total;
        this.customerName = customerName;
        this.customerCode = customerCode;
        this.customerTel = customerTel;
        
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerTel() {
        return customerTel;
    }

    public void setCustomerTel(String customerTel) {
        this.customerTel = customerTel;
    }

    public List<OrderDetailDTO> getSoldProducts() {
        return soldProducts;
    }

    public void setSoldProducts(List<OrderDetailDTO> soldProducts) {
        this.soldProducts = soldProducts;
    }
    
    
}
