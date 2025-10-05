/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.QuanLy;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
/**
 *
 * @author ADMIN
 */
public class ManagerDAO {
    public QuanLy getManagerByUserID(int id){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        QuanLy ql = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT maQL from managers WHERE userID = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, id);
            
            rs = pre.executeQuery();
            if(rs.next()){
                ql = new QuanLy();
                ql.setMaQL(rs.getString("maQL"));
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ql;
    }
    
    public int getIDByCode(String code){
        Connection conn;
        PreparedStatement pre;
        ResultSet rs;
        int id = -1;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT ID from managers WHERE maQL = ?";
            pre = conn.prepareStatement(sql);
            pre.setString(1, code);
            
            rs = pre.executeQuery();
            if(rs.next()){
                id = rs.getInt("ID");
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return id;
    }
}
