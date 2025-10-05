/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qlsieuthi_nmcnpm;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import qlsieuthi_nmcnpm.models.Khach;
import qlsieuthi_nmcnpm.models.NguoiDung;
import qlsieuthi_nmcnpm.view.frmLogin;

/**
 *
 * @author ADMIN
 */
public class QLSieuThi_nmcnpm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Locale.setDefault(Locale.US);
        frmLogin login = new frmLogin();
        login.setVisible(true);
        login.setLocationRelativeTo(null);
    }
    
}
