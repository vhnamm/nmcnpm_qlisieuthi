/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.helper;

import qlsieuthi_nmcnpm.models.NguoiDung;
import qlsieuthi_nmcnpm.models.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class Session {
    private static TaiKhoan currentAccount;

    
    public static void setCurrentTk(TaiKhoan tk){
        currentAccount = tk;
    }
    
    public static TaiKhoan getCurrentTk(){
        return currentAccount;
    }

}
