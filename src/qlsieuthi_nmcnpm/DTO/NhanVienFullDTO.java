/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DTO;


import qlsieuthi_nmcnpm.models.NhanVien;
import qlsieuthi_nmcnpm.models.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class NhanVienFullDTO {
    private NhanVien nv;
    private TaiKhoan tk;
    

    public NhanVienFullDTO(NhanVien nv, TaiKhoan tk) {
        this.nv = nv;
        this.tk = tk;
        
    }
    
    public NhanVienFullDTO(){}
    
    public NhanVien getNv() {
        return nv;
    }

    public void setNv(NhanVien nv) {
        this.nv = nv;
    }

    public TaiKhoan getTk() {
        return tk;
    }

    public void setTk(TaiKhoan tk) {
        this.tk = tk;
    }


    
    
}
