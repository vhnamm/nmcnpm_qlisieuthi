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
public class Khach extends NguoiDung{
    private String maKH;
    private int userID;
    
    public Khach(){}

    public Khach(String hoTen, String tel, String address, String gender ,LocalDate ngaySinh) {
        super(hoTen, tel, address, gender ,ngaySinh);
        
    }


    
}
