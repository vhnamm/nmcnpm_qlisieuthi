/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;
import java.sql.Connection;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
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
            String sql = "SELECT ID FROM orders ORDER BY ID LIMIT 1";
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
}
