/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import java.util.List;
import qlsieuthi_nmcnpm.models.Supplier;
import java.sql.*;
import java.util.ArrayList;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;

/**
 *
 * @author ADMIN
 */
public class SupplierDAO {
    public List<Supplier> getAllSuppliers(){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        List<Supplier> list = new ArrayList<>();
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM suppliers";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            
            while(rs.next()){
                Supplier supp = new Supplier(rs.getString("codes"), rs.getString("supplierName"), rs.getString("tel"), rs.getString("address"));
                list.add(supp);
            }
            ConnectDB.close(conn);
            rs.close();
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    
    public boolean addSupplier(Supplier supp){
        Connection conn = null;
        PreparedStatement pre = null;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT ID FROM suppliers WHERE tel = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, supp.getTel());
            
            ResultSet rs = pre.executeQuery();
            
            if(rs.next()){
                return false;
            }else{
                sql = "INSERT INTO suppliers (codes, supplierName, tel, address) VALUES (?,?,?,?)";
                pre = conn.prepareStatement(sql);
                pre.setString(1, supp.getCodes());
                pre.setString(2, supp.getName());
                pre.setString(3, supp.getTel());
                pre.setString(4, supp.getAddress());
                
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
