
package qlsieuthi_nmcnpm.view;

import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import qlsieuthi_nmcnpm.DAO.OrderDAO;
import qlsieuthi_nmcnpm.DAO.ProductDAO;
import qlsieuthi_nmcnpm.DTO.OrderDetailDTO;
import qlsieuthi_nmcnpm.DTO.OrderFullDTO;
import qlsieuthi_nmcnpm.helper.SeperatorConvert;
import qlsieuthi_nmcnpm.helper.ThousandSeperator;
import qlsieuthi_nmcnpm.models.Order;


public class pnPendingOrder extends javax.swing.JPanel {

    private List<Order> list;
    private DefaultTableModel tbModel;
    private DefaultTableModel tbSummaryModel;
    
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public pnPendingOrder() {
        initComponents();
        tbModel = (DefaultTableModel) tbPending.getModel();
        ListSelectionModel listSelectionModel = tbPending.getSelectionModel();
        listSelectionModel.addListSelectionListener(new ListSelectionListener(){

            @Override
            public void valueChanged(ListSelectionEvent e) {
                tableRowChangedActionPerformed(e);
            }
        });
        tbSummaryModel = (DefaultTableModel) tbOrderSummary.getModel();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabbedMain = new javax.swing.JTabbedPane();
        pnPending = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPending = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPendingCode = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPendingTime = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCustomerCode = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbOrderSummary = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbSale = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbFinalTotal = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnAccept = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        pnAccepted = new javax.swing.JPanel();

        tabbedMain.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tabbedMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabbedMainStateChanged(evt);
            }
        });

        tbPending.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbPending.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã đơn", "Địa chỉ", "Tổng tiền", "Thời gian"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPending.setRowHeight(30);
        jScrollPane1.setViewportView(tbPending);
        tbPending.getColumnModel().getColumn(2).setCellRenderer(new ThousandSeperator());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Chi tiết đơn hàng");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(270, 10, 147, 25);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mã đơn");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 60, 51, 30);

        txtPendingCode.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtPendingCode.setEnabled(false);
        jPanel1.add(txtPendingCode);
        txtPendingCode.setBounds(120, 60, 150, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Ngày đặt");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(330, 60, 70, 30);

        txtPendingTime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPendingTime.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtPendingTime.setEnabled(false);
        jPanel1.add(txtPendingTime);
        txtPendingTime.setBounds(410, 60, 150, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText("Thông tin khách hàng");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 110, 160, 22);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tên người nhận");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 150, 110, 30);

        txtCustomerName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCustomerName.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtCustomerName.setEnabled(false);
        jPanel1.add(txtCustomerName);
        txtCustomerName.setBounds(170, 150, 170, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mã KH");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(370, 150, 50, 30);

        txtCustomerCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCustomerCode.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtCustomerCode.setEnabled(false);
        jPanel1.add(txtCustomerCode);
        txtCustomerCode.setBounds(440, 150, 140, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("SĐT");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(50, 200, 40, 30);

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTel.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtTel.setEnabled(false);
        jPanel1.add(txtTel);
        txtTel.setBounds(100, 200, 150, 30);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Địa chỉ giao");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(280, 200, 80, 30);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setLineWrap(true);
        txtAddress.setRows(5);
        txtAddress.setWrapStyleWord(true);
        txtAddress.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        txtAddress.setEnabled(false);
        jScrollPane2.setViewportView(txtAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(380, 210, 210, 80);

        tbOrderSummary.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbOrderSummary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbOrderSummary.setRowHeight(30);
        jScrollPane3.setViewportView(tbOrderSummary);
        tbOrderSummary.getColumnModel().getColumn(3).setCellRenderer(new ThousandSeperator());
        tbOrderSummary.getColumnModel().getColumn(4).setCellRenderer(new ThousandSeperator());

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 310, 670, 280);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel11.setText("TỔNG TIỀN");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(120, 600, 100, 30);

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        lbTotal.setText("0");
        jPanel1.add(lbTotal);
        lbTotal.setBounds(280, 600, 160, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("CHIẾT KHẤU");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(120, 650, 110, 25);

        lbSale.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        lbSale.setText("0");
        jPanel1.add(lbSale);
        lbSale.setBounds(280, 650, 170, 26);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("THÀNH TIỀN");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(120, 700, 120, 25);

        lbFinalTotal.setFont(new java.awt.Font("Segoe UI", 1, 19)); // NOI18N
        lbFinalTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbFinalTotal.setText("0");
        jPanel1.add(lbFinalTotal);
        lbFinalTotal.setBounds(280, 700, 160, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel17.setText("đ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(450, 610, 43, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel18.setText("đ");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(450, 650, 43, 20);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel19.setText("đ");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(450, 700, 20, 20);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("Huỷ Đơn");
        jPanel1.add(jButton2);
        jButton2.setBounds(100, 760, 170, 40);

        btnAccept.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAccept.setText("Xác Nhận");
        btnAccept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcceptActionPerformed(evt);
            }
        });
        jPanel1.add(btnAccept);
        btnAccept.setBounds(320, 760, 270, 40);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tìm theo SĐT");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Tìm kiếm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Sắp xếp theo");

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Đơn mới nhất" }));

        javax.swing.GroupLayout pnPendingLayout = new javax.swing.GroupLayout(pnPending);
        pnPending.setLayout(pnPendingLayout);
        pnPendingLayout.setHorizontalGroup(
            pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPendingLayout.createSequentialGroup()
                .addGroup(pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnPendingLayout.createSequentialGroup()
                        .addGroup(pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnPendingLayout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addGap(77, 77, 77)
                        .addGroup(pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 668, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnPendingLayout.setVerticalGroup(
            pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnPendingLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnPendingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tabbedMain.addTab("Đơn hàng đang chờ", pnPending);

        javax.swing.GroupLayout pnAcceptedLayout = new javax.swing.GroupLayout(pnAccepted);
        pnAccepted.setLayout(pnAcceptedLayout);
        pnAcceptedLayout.setHorizontalGroup(
            pnAcceptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1315, Short.MAX_VALUE)
        );
        pnAcceptedLayout.setVerticalGroup(
            pnAcceptedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 822, Short.MAX_VALUE)
        );

        tabbedMain.addTab("Đã xác nhận", pnAccepted);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabbedMain, javax.swing.GroupLayout.Alignment.TRAILING)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tabbedMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabbedMainStateChanged
        int selectedTab = tabbedMain.getSelectedIndex();
        switch (selectedTab) {
            case 0:
                loadPendingData();
                break;
            case 1:
                System.out.println("tab accepted");
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_tabbedMainStateChanged

    private void btnAcceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcceptActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Xác nhận đơn hàng và bắt đầu giao hàng?", "Hệ thống", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            int orderID = Integer.parseInt(txtPendingCode.getText());
            OrderDAO orderDAO = new OrderDAO();
            orderDAO.updateOrderStatus(orderID, 2); // Da xac nhan
            
            ProductDAO productDAO = new ProductDAO();
            for(int i=0; i<tbOrderSummary.getRowCount(); i++){
                int productID = Integer.parseInt(tbOrderSummary.getValueAt(i, 0).toString().substring(2));
                int qty = Integer.parseInt(tbOrderSummary.getValueAt(i, 2).toString());
                
            }
        }
    }//GEN-LAST:event_btnAcceptActionPerformed

    public void loadPendingData(){
        OrderDAO orderDAO = new OrderDAO();
        list = orderDAO.getPendingOrders();
        tbModel = (DefaultTableModel) tbPending.getModel();
        
        tbModel.setRowCount(0);
        
        for(Order od : list){
            tbModel.addRow(new Object[]{
                od.getCodes(),
                od.getAddress(),
                od.getFinalTotal(),
                od.getTimes().format(fmt)
            });
        }
        tbPending.setModel(tbModel);
    }
    public void tableRowChangedActionPerformed(ListSelectionEvent e){
        if(!e.getValueIsAdjusting()){
            int row = tbPending.getSelectedRow();
                if(row != -1){
                    String orderCode = tbPending.getValueAt(row, 0).toString();
                    int orderId = Integer.parseInt(orderCode.substring(2));
                    String address = tbPending.getValueAt(row, 1).toString();
                    double finalTotal = Double.parseDouble(tbPending.getValueAt(row,2).toString()) ;
                    String times = String.valueOf(tbPending.getValueAt(row, 3)) ;
                    
                    OrderDAO orderDAO = new OrderDAO();
                    OrderFullDTO orderFullDTO = orderDAO.getFullOrderInfo(orderId);
                    
                    txtPendingCode.setText(orderCode);
                    txtPendingTime.setText(times);
                    lbFinalTotal.setText(SeperatorConvert.doubleToThousandFormatted(finalTotal));
                    txtAddress.setText(address);
                    
                    txtCustomerCode.setText(orderFullDTO.getCustomerCode());
                    txtCustomerName.setText(orderFullDTO.getCustomerName());
                    txtTel.setText(orderFullDTO.getCustomerTel());
                    
                    lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(orderFullDTO.getTotal()));
                    lbSale.setText(SeperatorConvert.doubleToThousandFormatted(orderFullDTO.getDiscount()));
                    
                    tbSummaryModel.setRowCount(0);
                    for(OrderDetailDTO x : orderFullDTO.getSoldProducts()){
                        tbSummaryModel.addRow(new Object[]{
                            x.getProductCode(),
                            x.getProductName(),
                            x.getQty(),
                            x.getUnitPrice(),
                            x.getTotal()
                        });
                    }
                }
                
        }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAccept;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbFinalTotal;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JPanel pnAccepted;
    private javax.swing.JPanel pnPending;
    private javax.swing.JTabbedPane tabbedMain;
    private javax.swing.JTable tbOrderSummary;
    private javax.swing.JTable tbPending;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCustomerCode;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtPendingCode;
    private javax.swing.JTextField txtPendingTime;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
