/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import java.util.List;
import qlsieuthi_nmcnpm.models.Category;
import java.sql.*;
import java.util.ArrayList;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;

/**
 *
 * @author Admin
 */
public class CategoryDAO {
    public List<Category> getAllCategories(){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        List<Category> list = new ArrayList<>();
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM categories";
            pre = conn.prepareStatement(sql);
            
            rs = pre.executeQuery();
            while(rs.next()){
                Category cate = new Category(rs.getString("categoryName"));
                cate.setId(rs.getInt("ID"));
                
                list.add(cate);
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public void addCategory(Category cat){
        Connection conn;
        PreparedStatement pre;

        
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO categories (categoryName) VALUES (?)";
            
            pre = conn.prepareStatement(sql);
            pre.setString(1, cat.getCategoryName());
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
}
