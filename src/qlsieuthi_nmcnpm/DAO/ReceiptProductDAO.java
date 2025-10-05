/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.models.ReceiptProduct;
/**
 *
 * @author ADMIN
 */
public class ReceiptProductDAO {
    public void addReceiptDetail(ReceiptProduct rcp){
        Connection conn;
        PreparedStatement pre;
    
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO receipt_detail (receiptID, productID, quantity, unitPrice, total) VALUES (?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, rcp.getReceiptID());
            pre.setInt(2, rcp.getProductID());
            pre.setInt(3, rcp.getQuantity());
            pre.setDouble(4, rcp.getImportPrice());
            pre.setDouble(5, rcp.getTotal());
            
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
