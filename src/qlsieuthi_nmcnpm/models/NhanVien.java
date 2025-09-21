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
public class NhanVien extends NguoiDung{
    private String maNV;
    private double salary;
    private int userID;
    
    public NhanVien() {
       
    }

    public NhanVien(String hoTen, String tel, String address, LocalDate ngaySinh, String maNV, double salary, int userId) {
        super(hoTen, tel, address, ngaySinh);
        this.maNV = maNV;
        this.salary = salary;
        this.userID = userID;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
