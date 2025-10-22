/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;

import qlsieuthi_nmcnpm.models.NhanVien;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.DTO.NhanVienFullDTO;
import qlsieuthi_nmcnpm.models.TaiKhoan;

public class NhanVienDAO {
    
    public void addNhanVien(NhanVien nv){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO employees (userID, maNV, salary, trangThai) VALUES (?,?,?,?)";
            pre = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            pre.setInt(1, nv.getUserID());
            pre.setString(2, "");
            pre.setDouble(3, nv.getSalary());
            pre.setInt(4, 3); // trạng thái đang làm : 3
            
            pre.executeUpdate();
            
            //lấy id mà sql vừa ren làm maNV
            rs = pre.getGeneratedKeys();
            if(rs.next()){
                int idNV = rs.getInt(1);
                String maNV = "NV" + String.format("%03d", idNV);
                try {
                    String mnvSql = "UPDATE employees SET maNV = ? WHERE ID =?";
                    PreparedStatement updatePre = conn.prepareStatement(mnvSql);
                    updatePre.setString(1, maNV);
                    updatePre.setInt(2, idNV);
                    updatePre.executeUpdate();
                    
                    updatePre.close();
                    nv.setMaNV(maNV);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    
    public List<NhanVienFullDTO> getAllNhanVien_full(){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        List<NhanVienFullDTO> arr = null;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT nv.maNV, nv.userID ,nv.salary ,usr.hoTen, usr.tel, usr.address, usr.ngaySinh, "
                    + "usr.gender, tk.tenDangNhap, tk.isActive "
                    + "FROM employees nv "
                    + "INNER JOIN users usr ON nv.userID = usr.ID "
                    + "INNER JOIN accounts tk ON usr.ID = tk.userID "
                    + "WHERE tk.isActive <> 0";
            
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            arr = new ArrayList<>();
            
            while(rs.next()){
                String maNV = rs.getString("maNV");
                String hoTen = rs.getString("hoTen");
                String tel = rs.getString("tel");
                Date ngaySinh = rs.getDate("ngaySinh");
                String gender = rs.getString("gender");
                String tdn = rs.getString("tenDangNhap");
                Boolean active = rs.getBoolean("isActive");
                String addres = rs.getString("address");
                
                Double salary = rs.getDouble("salary");
                int userID = rs.getInt("userID");
                
                NhanVien nv = new NhanVien(hoTen, tel, addres, gender, ngaySinh.toLocalDate(), salary);
                nv.setUserID(userID);
                nv.setMaNV(maNV);
                
                TaiKhoan tk = new TaiKhoan();
                tk.setTenDangNhap(tdn);
                tk.setIsActive(active);
                
                NhanVienFullDTO nvFull = new NhanVienFullDTO();
                nvFull.setNv(nv);
                nvFull.setTk(tk);
                
                arr.add(nvFull);
                               
            }
             ConnectDB.close(conn);
                pre.close();
                rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return arr;
    }
    
    public void deleteNhanVien(NhanVien nv){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "UPDATE employees SET trangThai = 0 WHERE maNV = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setString(1, nv.getMaNV());
            pre.executeUpdate();
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
        }
    }
    
    public void updateNhanVien(NhanVien nv){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn = ConnectDB.getInstance();
            String sql  = "UPDATE employees SET "
                    + "salary = ?, "
                    + "trangThai = ? "
                    + "WHERE maNV = ?";
            pre = conn.prepareStatement(sql);
            
            pre.setDouble(1, nv.getSalary());
            pre.setInt(2, nv.getTrangThai());
            pre.setString(3, nv.getMaNV());
            
            pre.executeUpdate();
            ConnectDB.close(conn);
            pre.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<NhanVien> getAllNhanVien(){
        List<NhanVien> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT nv.maNV, nv.trangThai,nd.hoTen, nd.tel "
                    + "FROM employees nv "
                    + "INNER JOIN users nd "
                    + "ON nv.userID = nd.ID "
                    + "INNER JOIN accounts acc ON acc.userID = nd.ID "
                    + "WHERE acc.isActive = true";
            
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            
            while(rs.next()){
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("maNv"));
                nv.setHoTen(rs.getString("hoTen"));
                nv.setTrangThai(rs.getInt("trangThai"));
                nv.setTel(rs.getString("tel"));
                
                list.add(nv);
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
    
    public int getIdNhanVien(String maNV){
        Connection conn = null;
        PreparedStatement pre = null;
        int id = -1;
        try {
            conn = ConnectDB.getInstance();
            String sql  = "SELECT ID FROM employees WHERE maNV = ?";
            
            pre = conn.prepareStatement(sql);          
            pre.setString(1, maNV);
            
            ResultSet rs = pre.executeQuery();
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
    
    public String getCodesNhanVien(int id){
        Connection conn = null;
        PreparedStatement pre = null;
        String code = null;
        try {
            conn = ConnectDB.getInstance();
            String sql  = "SELECT maNV FROM employees WHERE userID = ?";
            
            pre = conn.prepareStatement(sql);          
            pre.setInt(1, id);
            
            ResultSet rs = pre.executeQuery();
            if(rs.next()){
                code = rs.getString("maNV");
            }
            ConnectDB.close(conn);
            pre.close();
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return code;
    }
}
