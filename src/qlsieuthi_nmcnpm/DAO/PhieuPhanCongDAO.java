/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.models.PhieuPhanCong;
import java.sql.*;
import java.time.LocalDate;
/**
 *
 * @author ADMIN
 */
public class PhieuPhanCongDAO {
    public boolean addAssignment(PhieuPhanCong p){
        Connection conn = null;
        PreparedStatement pre = null;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM assignments WHERE ngay = ? AND nhanVienID = ? AND shiftID = ?";
            pre = conn.prepareStatement(sql);
            pre.setDate(1, Date.valueOf(p.getDate()));
            pre.setInt(2, p.getNhanVienID());
            pre.setInt(3, p.getCaLamID());
            
            ResultSet rs = pre.executeQuery();
            
            if(rs.next()){
                return false;
            }else{
                sql = "INSERT INTO assignments (ngay, nhanVienID, shiftID) VALUES (?,?,?)";
                pre = conn.prepareStatement(sql);
                pre.setDate(1, Date.valueOf(p.getDate()));
                pre.setInt(2, p.getNhanVienID());
                pre.setInt(3, p.getCaLamID());
                
                pre.executeUpdate();
                ConnectDB.close(conn);
                pre.close();
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
