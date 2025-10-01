/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
/**
 *
 * @author ADMIN
 */
public class ProductDAO {
    public boolean addProduct(Product prod){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT ID from products WHERE productName = ? AND category = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, prod.getName());
            pre.setString(2, prod.getCate());
            
            rs  = pre.executeQuery();
            if(rs.next()){
                return false;
            }else{

                sql = "INSERT INTO products (productName, unit, category, descriptions, storeQuantity, importAvrg, sellPrice, state, img) "
                        + "VALUES (?,?,?,?,?,?,?,?,?)";
                pre = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                pre.setString(1, prod.getName());
                pre.setString(2, prod.getUnit());
                pre.setString(3, prod.getCate());
                pre.setString(4, prod.getDesc());
                pre.setInt(5, prod.getStoreQuantity());
                pre.setDouble(6, prod.getImportAvrg());
                pre.setDouble(7, prod.getSellPrice());
                pre.setInt(8, prod.getState());
                pre.setBytes(9, prod.getImg());
                pre.executeUpdate();
                
                rs = pre.getGeneratedKeys();
                if(rs.next()){
                    int id = rs.getInt(1);
                    String codes  =  "SP" + String.format("%04d", id);
                    sql = "UPDATE products SET codes = ? WHERE ID = ?";
                    pre = conn.prepareStatement(sql);
                    pre.setString(1, codes);
                    pre.setInt(2, id);
                    pre.executeUpdate();
                    prod.setCodes(codes);
                }
                
                
                
                ConnectDB.close(conn);
                pre.close();
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
    
    public List<Product> getAllProducts(){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        List<Product> list = new ArrayList<>();
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM products WHERE state <> 0";
            
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            
            while(rs.next()){
                int id = rs.getInt("ID");
                String name = rs.getString("productName");
                String codes = rs.getString("codes");
                String unit = rs.getString("unit");
                String cate  = rs.getString("category");
                String des = rs.getString("descriptions");
                int quan = rs.getInt("storeQuantity");
                double importAvrg = rs.getDouble("importAvrg");
                double sellPrice = rs.getDouble("sellPrice");
                int state = rs.getInt("state");
                byte[] img = rs.getBytes("img");
                
                Product prod = new Product(name, unit, cate, des, quan, importAvrg, sellPrice, state, img);
                prod.setCodes(codes);
                prod.setId(id);
                list.add(prod);
            }
            ConnectDB.close(conn);
            rs.close();
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void updateProduct(Product prod){
        Connection conn;
        PreparedStatement pre;
        try {
            conn = ConnectDB.getInstance();
            String sql = "UPDATE products "
                    + "SET productName = ? , unit = ?, category = ?, descriptions = ?, sellPrice = ?, state = ?, img = ? "
                    + "WHERE codes = ?";
            
            pre = conn.prepareStatement(sql);
            pre.setString(1, prod.getName());
            pre.setString(2, prod.getUnit());
            pre.setString(3, prod.getCate());
            pre.setString(4, prod.getDesc());
            pre.setDouble(5, prod.getSellPrice());
            pre.setInt(6, prod.getState());
            pre.setBytes(7, prod.getImg());
            pre.setString(8, prod.getCodes());
            
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void deleteProduct(Product prod){
        Connection conn;
        PreparedStatement pre;
        try {
            conn = ConnectDB.getInstance();
            String sql = "UPDATE products "
                    + "SET state = 0 "
                    + "WHERE codes = ?";
            
            pre = conn.prepareStatement(sql);
            pre.setString(1, prod.getCodes());
            
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
