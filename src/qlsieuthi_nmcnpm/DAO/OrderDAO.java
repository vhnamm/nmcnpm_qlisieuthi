/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;
import java.sql.Connection;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.models.Order;
/**
 *
 * @author ADMIN
 */
public class OrderDAO {
    public int getLatestOrder(){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        int id = 0;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT ID FROM orders ORDER BY ID DESC LIMIT 1";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            
            if(rs.next()){
                id = rs.getInt("ID");
            }
            ConnectDB.close(conn);
            rs.close();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
    
    public void addOrder(Order od){
        Connection conn;
        PreparedStatement pre;
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO orders (employeeID, customerID, codes, times, address, total, customerPaid, discount, finalTotal, state) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            Timestamp ts = Timestamp.valueOf(od.getTimes());
            
            pre = conn.prepareStatement(sql);
            pre.setInt(1, od.getEmployeeID());
            pre.setInt(2, od.getCustomerID());
            pre.setString(3, od.getCodes());
            pre.setTimestamp(4, ts);
            pre.setString(5, od.getAddress());
            pre.setDouble(6, od.getTotal());
            pre.setDouble(7, od.getCustomerPaid());
            pre.setDouble(8, od.getDiscount());
            pre.setDouble(9, od.getFinalTotal());
            pre.setInt(10, od.getState());
            
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
