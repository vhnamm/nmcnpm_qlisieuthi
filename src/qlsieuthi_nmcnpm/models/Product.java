/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.models;



/**
 *
 * @author ADMIN
 */
public class Product {
    private int id;
    private String name;
    private String codes;
    private String unit;
    private String cate;
    private String desc;
    private int storeQuantity;
    private double importAvrg;
    private double sellPrice;
    private int state;
    private byte[] img;

    public Product(int id, String name, String codes, String unit, String cate, String desc, int storeQuantity, double importAvrg, double sellPrice, int state, byte[] img) {
        this.id = id;
        this.name = name;
        this.codes = codes;
        this.unit = unit;
        this.cate = cate;
        this.desc = desc;
        this.storeQuantity = storeQuantity;
        this.importAvrg = importAvrg;
        this.sellPrice = sellPrice;
        this.state = state;
        this.img = img;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCodes() {
        return codes;
    }

    public void setCodes(String codes) {
        this.codes = codes;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getCate() {
        return cate;
    }

    public void setCate(String cate) {
        this.cate = cate;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getStoreQuantity() {
        return storeQuantity;
    }

    public void setStoreQuantity(int storeQuantity) {
        this.storeQuantity = storeQuantity;
    }

    public double getImportAvrg() {
        return importAvrg;
    }

    public void setImportAvrg(double importAvrg) {
        this.importAvrg = importAvrg;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public byte[] getImg() {
        return img;
    }

    public void setImg(byte[] img) {
        this.img = img;
    }
    
    
}
