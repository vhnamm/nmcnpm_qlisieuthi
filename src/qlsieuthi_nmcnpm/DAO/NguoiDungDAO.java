
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.NguoiDung;
import java.sql.*;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.models.TaiKhoan;
/**
 *
 * @author ADMIN
 */
public class NguoiDungDAO {

    
    public int addNguoiDung(NguoiDung nd){
        Connection conn = null;
        PreparedStatement pre = null;
        int userID = -1;
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO users (hoTen, tel, address, ngaySinh, gender) VALUES (?,?,?,?,?)";
            pre = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            pre.setString(1, nd.getHoTen());
            pre.setString(2, nd.getTel());
            pre.setString(3, nd.getAddress());
            
            if(nd.getNgaySinh() != null){
                pre.setDate(4, Date.valueOf(nd.getNgaySinh()));
            }else{
                pre.setNull(4, java.sql.Types.DATE);
            }
            
            pre.setString(5, nd.getGender());
            
            pre.executeUpdate();
            ResultSet rs = pre.getGeneratedKeys();
            
            if(rs.next()){
                userID = rs.getInt(1);
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return userID;
    }
    
    public void updateNguoiDung(NguoiDung nd){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = ConnectDB.getInstance();
            String sql  = "UPDATE users SET "
                    + "hoTen = ?, "
                    + "tel = ?, "
                    + "address = ?, "
                    + "ngaySinh = ?, "
                    + "gender = ? "
                    + "WHERE ID = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, nd.getHoTen());
            pre.setString(2, nd.getTel());
            pre.setString(3, nd.getAddress());
            pre.setDate(4, Date.valueOf(nd.getNgaySinh()));
            pre.setString(5, nd.getGender());
            pre.setInt(6, nd.getUserID());
            
            pre.executeUpdate();
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
        }
    }
    
    public int checkTelExist(String tel){
        Connection conn = null;
        PreparedStatement pre;
        ResultSet rs;
        int id = -1;
       
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT nd.tel, nd.ID "
                    + "FROM users nd "
                    + "WHERE nd.tel = ? "
                    + "LIMIT 1";

            pre = conn.prepareStatement(sql);
            pre.setString(1, tel);
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
    
    public void updateName(String name, int id){
        Connection conn;
        PreparedStatement pre;
        try {
          conn = ConnectDB.getInstance();
          String sql = "UPDATE users SET hoTen = ? WHERE ID = ?";
          pre = conn.prepareStatement(sql);
          pre.setString(1, name);
          pre.setInt(2, id);
          pre.executeUpdate();
          
          ConnectDB.close(conn);
          pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}