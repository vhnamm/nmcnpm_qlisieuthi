/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsieuthi_nmcnpm.DAO;
import java.sql.Connection;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import qlsieuthi_nmcnpm.ConnectUtil.ConnectDB;
import qlsieuthi_nmcnpm.DTO.OrderDetailDTO;
import qlsieuthi_nmcnpm.DTO.OrderFullDTO;
import qlsieuthi_nmcnpm.models.Order;
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
            String sql = "SELECT ID FROM orders ORDER BY ID DESC LIMIT 1";
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
    
    public void addOrder(Order od){
        Connection conn;
        PreparedStatement pre;
        try {
            conn = ConnectDB.getInstance();
            String sql = "INSERT INTO orders (employeeID, customerID, codes, times, address, total, customerPaid, discount, finalTotal, state) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?)";
            
            Timestamp ts = Timestamp.valueOf(od.getTimes());
            
            pre = conn.prepareStatement(sql);
            if(od.getEmployeeID() < 0){
                pre.setNull(1, java.sql.Types.INTEGER);
            }else{
                pre.setInt(1, od.getEmployeeID());
            }
            
            pre.setInt(2, od.getCustomerID());
            pre.setString(3, od.getCodes());
            pre.setTimestamp(4, ts);
            pre.setString(5, od.getAddress());
            pre.setDouble(6, od.getTotal());
            pre.setDouble(7, od.getCustomerPaid());
            pre.setDouble(8, od.getDiscount());
            pre.setDouble(9, od.getFinalTotal());
            pre.setInt(10, od.getState());
            
            pre.executeUpdate();
            
            ConnectDB.close(conn);
            pre.close();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public List<Order> getPendingOrders(){
        List<Order> list = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT codes, address, times, finalTotal FROM orders WHERE state = 1 ORDER BY times ASC";
            pre = conn.prepareStatement(sql);
            rs = pre.executeQuery();
            while(rs.next()){
                Order od = new Order();
                od.setCodes(rs.getString("codes"));
                od.setAddress(rs.getString("address"));
                od.setTimes(rs.getTimestamp("times").toLocalDateTime());
                od.setFinalTotal(rs.getDouble("finalTotal"));
                
                list.add(od);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally{
            try {
                ConnectDB.close(conn);
                pre.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
    
    public OrderFullDTO getFullOrderInfo(int orderID){
        Connection conn = null;
        PreparedStatement pre = null;
        ResultSet rs = null;
        OrderFullDTO orderFullDTO = null;
        List<OrderDetailDTO> list = new ArrayList<>();
        
        try {
            conn = ConnectDB.getInstance();
            String sql = "SELECT o.codes AS orderCode, o.discount, o.total AS orderTotal, "
                    + "cus.maKH, cus.points, user.hoTen, user.tel, "
                    + "odt.quantity, odt.unitPrice, odt.total AS productTotal, "
                    + "prod.codes AS productCode, prod.productName "
                    + "FROM orders o "
                    + "INNER JOIN customers cus ON o.customerID = cus.ID "
                    + "INNER JOIN users user ON cus.userID = user.ID "
                    + "INNER JOIN order_detail odt ON odt.orderID = o.ID "
                    + "INNER JOIN products prod ON odt.productID = prod.ID "
                    + "WHERE o.ID = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, orderID);
            rs = pre.executeQuery();
            while(rs.next()){
                if(orderFullDTO == null){
                    orderFullDTO = new OrderFullDTO(rs.getString("orderCode"), rs.getDouble("discount"), rs.getDouble("orderTotal"), rs.getString("hoTen"), rs.getString("maKH"), rs.getString("tel"), 
                            rs.getInt("points")
                    );
                    
                }
                
                OrderDetailDTO orderDetailDTO = new OrderDetailDTO(
                    rs.getString("productName"),
                    rs.getString("productCode"),
                    rs.getInt("quantity"),
                    rs.getDouble("unitPrice"),
                    rs.getDouble("productTotal")
                );
                list.add(orderDetailDTO);
            }
            
            orderFullDTO.setSoldProducts(list);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            try {
                ConnectDB.close(conn);
                pre.close();
                rs.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return orderFullDTO;
        
    }
    
    public void updateOrderStatus(int orderID, int status){
        Connection conn = null;
        PreparedStatement pre = null;
        try {
            conn= ConnectDB.getInstance();
            String sql = "UPDATE orders SET state = ? WHERE ID = ?";
            pre = conn.prepareStatement(sql);
            pre.setInt(1, status);
            pre.setInt(2, orderID);
            
            pre.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally{
            ConnectDB.close(conn);
            try {
                pre.close();
            } catch (SQLException ex) {
                Logger.getLogger(OrderDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
