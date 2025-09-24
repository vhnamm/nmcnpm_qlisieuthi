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
public class QuanLy extends NguoiDung{
    private String maQL;
    private int userID;

    public QuanLy() {
    }

    public QuanLy(String hoTen, String tel, String address, String gender ,LocalDate ngaySinh, String maQL, int userID) {
        super(hoTen, tel, address, gender,ngaySinh);
        this.maQL = maQL;
        this.userID = userID;
    }

    public String getMaQL() {
        return maQL;
    }

    public void setMaQL(String maQL) {
        this.maQL = maQL;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    
    
}
