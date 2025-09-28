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
public class PhieuPhanCong {
    private LocalDate date;
    private int nhanVienID;
    private int caLamID;

    public PhieuPhanCong(LocalDate date, int nhanVienID, int caLamID) {
        this.date = date;
        this.nhanVienID = nhanVienID;
        this.caLamID = caLamID;
    }

    public PhieuPhanCong() {
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNhanVienID() {
        return nhanVienID;
    }

    public void setNhanVienID(int nhanVienID) {
        this.nhanVienID = nhanVienID;
    }

    public int getCaLamID() {
        return caLamID;
    }

    public void setCaLamID(int caLamID) {
        this.caLamID = caLamID;
    }
    
    
}
