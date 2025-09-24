
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.TaiKhoan;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;

public class TaiKhoanDAO {
    public TaiKhoan getAccountByTk(String username, String password){
        TaiKhoan tk = null;
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT * FROM accounts WHERE tenDangNhap = ? AND matKhau = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, username);
            pre.setString(2, password);
            
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                tk = new TaiKhoan();
                tk.setQuyen(rs.getString("quyen"));
                tk.setIsActive(rs.getBoolean("isActive"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConnectDB.close(conn);
            try {
                pre.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tk;
    }
    
    public void createAccount(TaiKhoan tk){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO accounts (userID, tenDangNhap, matKhau, quyen, isActive) VALUES (?,?,?,?,?)";
            pre = conn.prepareStatement(sql);
            
            pre.setInt(1, tk.getNguoiDung().getUserID());
            pre.setString(2, tk.getTenDangNhap());
            pre.setString(3, tk.getMatKhau());
            pre.setString(4, tk.getQuyen());
            pre.setBoolean(5, tk.isIsActive());
            
            pre.execute();
            
            ConnectDB.close(conn);
            pre.close();
        } catch (Exception e) {
        }
    }
    
    public boolean checkExist(String tenDangNhap){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT userID FROM accounts WHERE tenDangNhap = ?";
            
            pre = conn.prepareStatement(sql);
            pre.setString(1, tenDangNhap);
            rs = pre.executeQuery();
            
            if(rs.next()){
                
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConnectDB.close(conn);
            try {
                rs.close();
                pre.close();
            } catch (SQLException ex) {
                Logger.getLogger(TaiKhoanDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        return true;
    }
    
    public void disableAccount(TaiKhoan tk){
        Connection conn = null;
        PreparedStatement pre = null;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "UPDATE accounts SET isActive = false WHERE tenDangNhap = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, tk.getTenDangNhap());
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
        }
    }
    
    public void updateAccount(TaiKhoan tk){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = ConnectDB.getInstance();
            String sql  = "UPDATE accounts SET "
                    + "tenDangNhap = ?, "
                    + "isActive = ? "
                    + "WHERE userID = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, tk.getTenDangNhap());
            pre.setBoolean(2, tk.isIsActive());
            pre.setInt(3, tk.getNguoiDung().getUserID());
            
            pre.executeUpdate();
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
        }
    }
}
