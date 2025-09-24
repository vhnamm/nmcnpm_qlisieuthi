
package qlsieuthi_nmcnpm.models;

import java.time.LocalDate;

public class NhanVien extends NguoiDung{
    private String maNV;
    private double salary;
    private int userID;
    private int trangThai;
    
    public NhanVien() {
       
    }

    public NhanVien(String hoTen, String tel, String address,String gender, LocalDate ngaySinh,double salary) {
        super(hoTen, tel, address,gender ,ngaySinh);
        
        this.salary = salary;
        
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

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }
    
    
}
