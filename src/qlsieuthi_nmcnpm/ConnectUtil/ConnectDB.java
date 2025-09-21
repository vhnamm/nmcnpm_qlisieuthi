/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.ConnectUtil;

import java.sql.*;
public class ConnectDB {
    private static String url = "jdbc:mySQL://localhost:3306/sieuthi";
    private static String username = "root";
    private static String pass = "vohoainam10012005";
    
    public static Connection getInstance(){
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, username, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return conn;
    }
    
    public static void close(Connection conn){
        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
