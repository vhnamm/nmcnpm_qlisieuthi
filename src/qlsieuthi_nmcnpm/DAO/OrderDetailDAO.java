/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.OrderDetail;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
/**
 *
 * @author ADMIN
 */
public class OrderDetailDAO {
    public void addOrderDetail(OrderDetail odDetail){
        Connection conn;
        PreparedStatement pre;
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO order_detail (orderID, productID, quantity, unitPrice, total) "
                    + "VALUES (?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            
            pre.setInt(1, odDetail.getOrderID());
            pre.setInt(2, odDetail.getProductID());
            pre.setInt(3, odDetail.getQty());
            pre.setDouble(4, odDetail.getUnitPrice());
            pre.setDouble(5, odDetail.getTotal());
            
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
