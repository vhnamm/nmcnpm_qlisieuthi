/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.Khach;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;

/**
 *
 * @author ADMIN
 */
public class CustomerDAO {
    public Khach findByTel(String tel){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        Khach cust = null;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT nd.ID AS userID, nd.tel, nd.hoTen, cus.ID AS customerID, cus.points "
                    + "FROM users nd "
                    + "INNER JOIN customers cus "
                    + "ON nd.ID = cus.userID "
                    + "WHERE nd.tel = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, tel);
            
            rs = pre.executeQuery();
            if(rs.next()){
                cust  = new Khach();
                cust.setHoTen(rs.getString("hoTen"));
                cust.setTel(rs.getString("tel"));
                cust.setUserID(rs.getInt("userID"));
                cust.setId(rs.getInt("customerID"));
                cust.setPoints(rs.getInt("points"));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cust;
    }
}
