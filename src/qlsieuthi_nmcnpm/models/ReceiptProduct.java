/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.models;

/**
 *
 * @author ADMIN
 */
public class ReceiptProduct {
    private int id;
    private int receiptID;
    private int productID;
    private int quantity;
    private double importPrice;
    private double total;

    public ReceiptProduct(int receiptID, int productID, int quantity, double importPrice, double total) {
        
        this.receiptID = receiptID;
        this.productID = productID;
        this.quantity = quantity;
        this.importPrice = importPrice;
        this.total = total;
    }

    public ReceiptProduct() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getReceiptID() {
        return receiptID;
    }

    public void setReceiptID(int receiptID) {
        this.receiptID = receiptID;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(double importPrice) {
        this.importPrice = importPrice;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    
}
