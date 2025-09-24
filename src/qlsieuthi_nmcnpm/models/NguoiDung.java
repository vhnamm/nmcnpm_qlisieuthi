/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.models;

import java.time.LocalDate;

/**
 *
 * @author ADMIN
 */
public class NguoiDung {
    protected String hoTen;
    protected String tel;
    protected String address;
    private String gender;
    protected LocalDate ngaySinh;
    private int userID;
    
    public NguoiDung(){}
    public NguoiDung(String hoTen, String tel, String address, String gender, LocalDate ngaySinh){
        this.hoTen = hoTen;
        this.tel = tel;
        this.address = address;
        this.ngaySinh = ngaySinh;
        this.gender = gender;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
    public void chuanHoa(String name){
        String[] tmp = name.toLowerCase().split("\\s+");
        String newName = "";
        for(String x : tmp){
            newName += Character.toUpperCase(x.charAt(0)) + x.substring(1) + " ";
        }
        this.hoTen = newName.trim();
    }
}

