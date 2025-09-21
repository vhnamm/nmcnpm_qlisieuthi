
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
}
