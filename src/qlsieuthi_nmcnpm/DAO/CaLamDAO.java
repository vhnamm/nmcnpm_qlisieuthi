/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import java.util.List;
import qlsieuthi_nmcnpm.models.CaLam;
import java.sql.*;
import java.util.ArrayList;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
/**
 *
 * @author ADMIN
 */
public class CaLamDAO {
    public List<CaLam> getAllShifts(){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<CaLam> list = new ArrayList<>();
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM shifts";
            pre = conn.prepareStatement(sql);
            rs  = pre.executeQuery();
            
            while(rs.next()){
                CaLam shift = new CaLam(rs.getString("tenCa"), rs.getString("gioBatDau"), rs.getString("gioKetThuc"));
                shift.setId(rs.getInt("ID"));
                
                list.add(shift);
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
