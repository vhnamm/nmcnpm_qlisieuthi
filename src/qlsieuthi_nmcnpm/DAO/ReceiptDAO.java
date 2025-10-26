/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.models.Receipt;

/**
 *
 * @author ADMIN
 */
public class ReceiptDAO {
    public int getLatestID(){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        int id = 0;
        
        try {
            conn = ConnectDB.getInstance();
            String sql =  "SELECT ID from receipts ORDER BY ID DESC LIMIT 1";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            
            if(rs.next()){
                id  = rs.getInt(1);
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return id;
    }
    public int addReceipt(Receipt receipt){
        
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        int id = -1;
        
        try {
            conn = ConnectDB.getInstance();
            String sql =  "INSERT INTO receipts (managerID, supplierID, codes, importDate, total) VALUES (?,?,?,?,?)";
            pre = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            pre.setInt(1, receipt.getManagerID());
            pre.setInt(2, receipt.getSupplierID());
            pre.setString(3, receipt.getCodes());
            pre.setDate(4, Date.valueOf(receipt.getImportDate()));
            pre.setDouble(5, receipt.getTotal());
            
            pre.executeUpdate();
            
            rs = pre.getGeneratedKeys();
            if(rs.next()){
                id  = rs.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return id;
    
    }
    
    public List<Receipt> getAllReceipts(){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<Receipt> list = new ArrayList<>();
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM receipts ORDER BY importDate DESC";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while(rs.next()){
                Receipt rc = new Receipt(rs.getString("codes"), rs.getInt("managerID"), rs.getInt("supplierID"), rs.getDate("importDate").toLocalDate(), rs.getDouble("total"));
                list.add(rc);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                ConnectDB.close(conn);
                pre.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(ReceiptDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
