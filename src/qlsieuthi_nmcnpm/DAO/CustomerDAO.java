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
            String sql = "SELECT nd.ID AS userID, nd.tel, nd.hoTen, cus.ID AS customerID, cus.points, cus.maKH "
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
                cust.setMaKH(rs.getString("maKH"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cust;
    }
    
    public void addCustomer(Khach customer){
        Connection conn = null;
        PreparedStatement pre;
        ResultSet rs;
        int id = -1;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO customers (userID, points) VALUES (?,?)";
            pre = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pre.setInt(1, customer.getUserID());
            pre.setInt(2, customer.getPoints());

            pre.executeUpdate();
            rs = pre.getGeneratedKeys();
            if(rs.next()){
                id = rs.getInt(1);
                String maKH = "KH" + String.format("%02d", id);

                sql = "UPDATE customers SET maKH = ? WHERE ID = ?";
                pre = conn.prepareStatement(sql);
                pre.setString(1, maKH);
                pre.setInt(2, id);
                
                pre.executeUpdate();
            }
                  
            ConnectDB.close(conn);
            pre.close();
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    
    public void updatePoint(int id ,int point){
        Connection conn = null;
        PreparedStatement pre;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "UPDATE customers SET points = ? WHERE ID = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, point);
            pre.setInt(2, id);
            
            pre.executeUpdate();
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
