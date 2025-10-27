
package qlsieuthi_nmcnpm.view;

import java.awt.Color;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import qlsieuthi_nmcnpm.DAO.CustomerDAO;
import qlsieuthi_nmcnpm.DAO.NguoiDungDAO;
import qlsieuthi_nmcnpm.DAO.NhanVienDAO;
import qlsieuthi_nmcnpm.DAO.OrderDAO;
import qlsieuthi_nmcnpm.DAO.OrderDetailDAO;
import qlsieuthi_nmcnpm.DAO.ProductDAO;
import qlsieuthi_nmcnpm.helper.ClockThread;
import qlsieuthi_nmcnpm.helper.DateConverter;
import qlsieuthi_nmcnpm.helper.ImageConvert;
import qlsieuthi_nmcnpm.helper.SeperatorConvert;
import qlsieuthi_nmcnpm.helper.Session;
import qlsieuthi_nmcnpm.helper.ThousandSeperator;
import qlsieuthi_nmcnpm.models.Khach;
import qlsieuthi_nmcnpm.models.Order;
import qlsieuthi_nmcnpm.models.OrderDetail;
import qlsieuthi_nmcnpm.models.Product;

public class pnSell extends javax.swing.JPanel {
    private List<Product> list;
    private DefaultTableModel tbProductModel;
    private DefaultTableModel tbOrderModel;
    private double total = 0;
    private ClockThread clockThread;
    private Thread t;
    private Timer timeDebounce;
    private DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");
    public pnSell() {
        initComponents();
        initNhanVienNgayTao();
        
        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentShown(java.awt.event.ComponentEvent e){
                initClockThread();
            }
            
            @Override
            public void componentHidden(java.awt.event.ComponentEvent e){
                stopCurrentThread();
            }
        });
    }
    
    public void stopCurrentThread(){
        if(clockThread != null){
            clockThread.stopClockThread(t);
        }
    }
    
    public void initClockThread(){
        clockThread = new ClockThread(lbTimeCreate);
        t = new Thread(clockThread);
        t.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogModify = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        spinnerModifyQty = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        btnModifyCancel = new javax.swing.JButton();
        btnSaveChange = new javax.swing.JButton();
        dialogPoint = new javax.swing.JDialog();
        jPanel4 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        txtNhapDiem = new javax.swing.JTextField();
        btncCancelExchange = new javax.swing.JButton();
        btnComfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbOrder = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtFindSDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCodes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        btnUsePoint = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbSale = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lbTotalAfterSale = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPaid = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtReturn = new javax.swing.JTextField();
        btnCancelInvoice = new javax.swing.JButton();
        btnCreateInvoice = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbTimeCreate = new javax.swing.JLabel();
        btnAddCustomer = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        spinnerQty = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        btnAddToOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        dialogModify.setMinimumSize(new java.awt.Dimension(421, 276));
        dialogModify.setModal(true);

        jPanel3.setBackground(new Color(61, 74, 89));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Sửa số lượng");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(146, 146, 146))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel20)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        spinnerModifyQty.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel21.setText("Nhập số lượng");

        btnModifyCancel.setText("Huỷ");
        btnModifyCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyCancelActionPerformed(evt);
            }
        });

        btnSaveChange.setText("Lưu");
        btnSaveChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogModifyLayout = new javax.swing.GroupLayout(dialogModify.getContentPane());
        dialogModify.getContentPane().setLayout(dialogModifyLayout);
        dialogModifyLayout.setHorizontalGroup(
            dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dialogModifyLayout.createSequentialGroup()
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogModifyLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel21)
                        .addGap(47, 47, 47)
                        .addComponent(spinnerModifyQty, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogModifyLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(btnModifyCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnSaveChange, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        dialogModifyLayout.setVerticalGroup(
            dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModifyLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(spinnerModifyQty, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnModifyCancel, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnSaveChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(36, 36, 36))
        );

        dialogModify.setLocationRelativeTo(this);

        dialogPoint.setMinimumSize(new java.awt.Dimension(423, 284));

        jPanel4.setBackground(new Color(61, 74, 89));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Đổi điểm");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jLabel22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel22)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setText("Nhập số điểm cần quy đổi");

        txtNhapDiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btncCancelExchange.setText("Huỷ");
        btncCancelExchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncCancelExchangeActionPerformed(evt);
            }
        });

        btnComfirm.setText("Xác nhận");
        btnComfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogPointLayout = new javax.swing.GroupLayout(dialogPoint.getContentPane());
        dialogPoint.getContentPane().setLayout(dialogPointLayout);
        dialogPointLayout.setHorizontalGroup(
            dialogPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dialogPointLayout.createSequentialGroup()
                .addGroup(dialogPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogPointLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(dialogPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNhapDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel23)))
                    .addGroup(dialogPointLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(btncCancelExchange, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnComfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        dialogPointLayout.setVerticalGroup(
            dialogPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogPointLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNhapDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(dialogPointLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnComfirm, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btncCancelExchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        dialogPoint.setLocationRelativeTo(this);

        tbProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tbProduct.setRowHeight(60);
        tbProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbProduct);
        tbProductModel = new DefaultTableModel(
            new Object[]{"Mã SP", "Tên SP", "Số lượng", "Giá", "Ảnh SP"}, 0
        ) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                // Cột thứ 4 (index = 4) là ảnh
                if (columnIndex == 4) {
                    return ImageIcon.class;
                }
                return Object.class;
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // không cho sửa
            }
        };
        tbProduct.setModel(tbProductModel);
        tbProduct.setRowHeight(70);
        TableColumn tbColumn = tbProduct.getColumn("Ảnh SP");
        tbColumn.setMaxWidth(70);

        tbOrder.setModel(new javax.swing.table.DefaultTableModel(
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
        tbOrder.setRowHeight(26);
        jScrollPane2.setViewportView(tbOrder);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Thông tin hoá đơn");

        txtFindSDT.setPreferredSize(new java.awt.Dimension(64, 27));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Mã KH/SĐT");

        btnFind.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnFind.setText("Tra cứu");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên Khách");

        txtName.setEnabled(false);
        txtName.setPreferredSize(new java.awt.Dimension(64, 27));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("SĐT");

        txtSDT.setEnabled(false);
        txtSDT.setPreferredSize(new java.awt.Dimension(64, 27));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Điểm tích luỹ");

        txtPoint.setEnabled(false);
        txtPoint.setPreferredSize(new java.awt.Dimension(64, 27));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Mã HĐ");

        txtCodes.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtCodes.setEnabled(false);
        txtCodes.setPreferredSize(new java.awt.Dimension(71, 27));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Thời gian");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Nhân viên");

        txtMaNV.setEnabled(false);
        txtMaNV.setPreferredSize(new java.awt.Dimension(64, 27));

        btnUsePoint.setText("Đổi điểm");
        btnUsePoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsePointActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel11.setText("TỔNG TIỀN");

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbTotal.setText("0");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel13.setText("CHIẾT KHẤU");

        lbSale.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbSale.setText("0");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel15.setText("THÀNH TIỀN");

        lbTotalAfterSale.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbTotalAfterSale.setForeground(new java.awt.Color(255, 0, 51));
        lbTotalAfterSale.setText("0 ");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Khách trả");

        txtPaid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPaid.setPreferredSize(new java.awt.Dimension(71, 27));
        txtPaid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPaidKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Trả lại");

        txtReturn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtReturn.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        txtReturn.setEnabled(false);
        txtReturn.setPreferredSize(new java.awt.Dimension(71, 27));

        btnCancelInvoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancelInvoice.setText("Huỷ");
        btnCancelInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelInvoiceActionPerformed(evt);
            }
        });

        btnCreateInvoice.setBackground(new java.awt.Color(0, 153, 0));
        btnCreateInvoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateInvoice.setForeground(new java.awt.Color(255, 255, 255));
        btnCreateInvoice.setText("Thanh toán");
        btnCreateInvoice.setEnabled(false);
        btnCreateInvoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateInvoiceActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Mã KH");

        txtMaKH.setEnabled(false);
        txtMaKH.setPreferredSize(new java.awt.Dimension(71, 27));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("vnđ");

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel16.setText("vnđ");

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel19.setText("vnđ");

        lbTimeCreate.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbTimeCreate.setForeground(new java.awt.Color(0, 102, 0));
        lbTimeCreate.setText("10/01/2005 00:00:00");

        btnAddCustomer.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddCustomer.setText("Tạo mới");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        jLabel24.setText("vnđ");

        jLabel25.setText("vnđ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(lbTimeCreate)
                            .addComponent(txtCodes, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(70, 70, 70))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(52, 52, 52)
                                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(txtFindSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFind))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnCancelInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(btnCreateInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel17)
                                            .addComponent(jLabel18))
                                        .addGap(65, 65, 65)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPaid, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                            .addComponent(txtReturn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(jLabel25))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel24)))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel15))
                                    .addGap(88, 88, 88)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lbTotalAfterSale)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel16))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbTotal)
                                                .addComponent(lbSale))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel19, javax.swing.GroupLayout.Alignment.TRAILING)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addGap(0, 0, Short.MAX_VALUE)
                                            .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPoint, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnUsePoint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel12)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCodes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(lbTimeCreate))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPoint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(4, 4, 4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFindSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel6)
                                .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel12))
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUsePoint, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(lbTotal)
                    .addComponent(jLabel14))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(lbSale)
                    .addComponent(jLabel19))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(lbTotalAfterSale)
                    .addComponent(jLabel16))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPaid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtReturn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCreateInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(btnCancelInvoice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        spinnerQty.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spinnerQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Nhập số lượng");

        btnAddToOrder.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddToOrder.setText("Thêm vào đơn hàng");
        btnAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Danh sách sản phẩm");

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jButton2.setText("Tìm kiếm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addContainerGap())
        );

        btnModify.setText("Sửa số lượng");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addGap(192, 192, 192)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 287, Short.MAX_VALUE)
                        .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnModify, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnAddToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int row = tbOrder.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần sửa", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return;
        }else{
            int qty = (Integer)tbOrder.getValueAt(row, 2);
            spinnerModifyQty.setValue(qty);
            dialogModify.setVisible(true);
        }
        
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String tel = txtFindSDT.getText().trim();
        if(tel.isEmpty()){
            JOptionPane.showMessageDialog(this, "Nhập số điện thoại khách để tra cứu", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        CustomerDAO customerDAO = new CustomerDAO();
        Khach customer = customerDAO.findByTel(tel);
        if(customer == null){
            txtName.setText("");
            txtSDT.setText("");
            txtMaKH.setText("");
            txtPoint.setText("");
            JOptionPane.showMessageDialog(this, "Không tìm thấy thông tin khách với SĐT này. Vui lòng tạo mới", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        txtName.setText(customer.getHoTen());
        txtSDT.setText(customer.getTel());
        txtMaKH.setText(customer.getMaKH());
        txtPoint.setText(String.valueOf(customer.getPoints()));
        //trg hợp đang làm cho khách đã đổi điểm, nhưng lại tra cứu khách khác thì phải reset trường Khuyến mại & thành tiền
        lbSale.setText("0");
        lbTotalAfterSale.setText(SeperatorConvert.doubleToThousandFormatted(this.total));
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tbOrder.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm trong đơn", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        }else{
            double totalPrice = (Double) tbOrder.getValueAt(row, 4);
            this.total -= totalPrice;
            
            
            lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(total));
            
            double giaSauGiam = this.total - SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
            if(giaSauGiam <= 0){
                lbSale.setText("0");
                giaSauGiam = this.total;
                
            }
            lbTotalAfterSale.setText(SeperatorConvert.doubleToThousandFormatted(giaSauGiam));
            
            tbOrderModel.removeRow(row);
            
            txtPaid.setText("");
            txtReturn.setText("");
            btnCreateInvoice.setEnabled(false);
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnUsePointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsePointActionPerformed
        String point = txtPoint.getText();
        
        if(point.equals("0") || point.isEmpty()){
            JOptionPane.showMessageDialog(this, "Khách hàng chưa có điểm tích luỹ", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        
        dialogPoint.setVisible(true);
    }//GEN-LAST:event_btnUsePointActionPerformed

    private void btnCancelInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelInvoiceActionPerformed
        // TODO add your handling code here:
        clearOrderUI();
    }//GEN-LAST:event_btnCancelInvoiceActionPerformed

    private void btnCreateInvoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateInvoiceActionPerformed
        if(txtMaKH.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Chưa có thông tin khách hàng", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            
        }else{
            if(tbOrder.getRowCount() == 0){
                JOptionPane.showMessageDialog(this, "Chưa có sản phẩm trong giỏ, không thể thanh toán!");
                return;
            }
            int choice  = JOptionPane.showConfirmDialog(this, "Thanh toán và tạo hoá đơn cho đơn hàng này?", "Hệ thống", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                LocalDateTime createdAt = DateConverter.stringToLocalDateTime(lbTimeCreate.getText());
                int employeeID = Integer.parseInt(txtMaNV.getText().substring(2));
                int customerID = Integer.parseInt(txtMaKH.getText().substring(2));
                String codes = txtCodes.getText();
                int state = 3; // Da thanh toan (Hoan tat)
                String address = "Tại quầy";
                double total = SeperatorConvert.thousandFormattedToDouble(lbTotal.getText());
                double customerPaid = Double.parseDouble(txtPaid.getText().trim());
                double chietKhau = SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
                int usedPoint = (int) (chietKhau / 1000);
                double finalTotal = SeperatorConvert.thousandFormattedToDouble(lbTotalAfterSale.getText());

                Order order = new Order(employeeID, customerID, codes, address, createdAt, total, customerPaid, chietKhau, finalTotal, state);
                OrderDAO orderDAO = new OrderDAO();
                orderDAO.addOrder(order);

                //them vao database Order detail va cap nhat lai so luong hang trong kho
                int orderID = Integer.parseInt(codes.substring(3));

                ProductDAO productDAO = new ProductDAO();

                for(int i=0; i<tbOrderModel.getRowCount(); i++){
                    int productID = Integer.parseInt(tbOrder.getValueAt(i, 0).toString().substring(3));
                    int qty = Integer.parseInt(tbOrder.getValueAt(i, 2).toString());
                    double unitPrice = (double)tbOrder.getValueAt(i, 3);
                    double tongTienSP = (double) tbOrder.getValueAt(i, 4);

                    OrderDetail odDetail = new OrderDetail(orderID, productID, qty, unitPrice, tongTienSP);
                    OrderDetailDAO odDtDAO = new OrderDetailDAO();
                    odDtDAO.addOrderDetail(odDetail);

                    //trừ đi (cập nhật) số lượng hàng tồn tương ứng với mỗi SP
                    productDAO.updateSoldQty(productID, qty);
                }


                //Cập nhật lại điểm tích luỹ
                if(customerID != 1){  // ko phải khách vãng lai ko có SDT
                    // Chỉ tích điểm cho đơn ko sử dụng khuyến mãi 
                    if(usedPoint == 0){
                        int earnedPoint  = (int) Math.round((total * 0.04) / 1000);
                        CustomerDAO customerDAO = new CustomerDAO();
                        customerDAO.updatePoint(customerID, Integer.parseInt(txtPoint.getText()) + earnedPoint);

                    }else{// khách có sử dụng điểm
                        CustomerDAO customerDAO = new CustomerDAO();
                        customerDAO.updatePoint(customerID, Integer.parseInt(txtPoint.getText()) -  usedPoint);
                    }
                }
                
                
                JOptionPane.showMessageDialog(this, "Thanh toán thành công. Kiểm tra hoá đơn trong phần Hoá đơn!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                loadProductData();
                initOrderCode();
                clearOrderUI();
                
            }
            
            
        }
    }//GEN-LAST:event_btnCreateInvoiceActionPerformed

    private void btnAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToOrderActionPerformed
        int row = tbProduct.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        }else{
            int qty =(Integer) spinnerQty.getValue();
            String codes = tbProduct.getValueAt(row, 0).toString();
            
            ProductDAO productDAO = new ProductDAO();
            
            if(!productDAO.checkStoreQty(Integer.parseInt(codes.substring(2)), qty)){
                JOptionPane.showMessageDialog(this, "Không đủ số lượng mặt hàng này", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            
            String name = tbProduct.getValueAt(row, 1).toString();
            double price  = (Double) tbProduct.getValueAt(row, 3);
            
            tbOrderModel = (DefaultTableModel) tbOrder.getModel();
            for(int i=0; i<tbOrderModel.getRowCount(); i++){
                if(codes.equals(tbOrder.getValueAt(i, 0).toString())){
                    JOptionPane.showMessageDialog(this, "Mặt hàng này đã có trong đơn, vui lòng sửa số lượng!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            tbOrder.getColumnModel().getColumn(3).setCellRenderer(new ThousandSeperator());
            tbOrder.getColumnModel().getColumn(4).setCellRenderer(new ThousandSeperator());
            
            tbOrderModel.addRow(new Object[]{
                codes,
                name,
                qty,
                price,
                price * qty
            });
            this.total += price * qty;
            lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(total));
            double giaSauGiam = this.total - SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
            
            if(giaSauGiam <= 0){
                lbSale.setText("0");
                giaSauGiam = this.total;
            }
            lbTotalAfterSale.setText(SeperatorConvert.doubleToThousandFormatted(giaSauGiam));
            txtPaid.setText("");
            txtReturn.setText("");
            btnCreateInvoice.setEnabled(false);
            spinnerQty.setValue(1);
        }
    }//GEN-LAST:event_btnAddToOrderActionPerformed

    private void btnModifyCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyCancelActionPerformed
        dialogModify.setVisible(false);
    }//GEN-LAST:event_btnModifyCancelActionPerformed

    private void btnSaveChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangeActionPerformed
        int choice = JOptionPane.showConfirmDialog(dialogModify, "Lưu thay đổi?", "Hệ thống", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            int qtyModified = (Integer)spinnerModifyQty.getValue();
            int row = tbOrder.getSelectedRow();
            int productID = Integer.parseInt(tbOrder.getValueAt(row, 0).toString().substring(2));
            ProductDAO productDAO = new ProductDAO();
            
            if(!productDAO.checkStoreQty(productID, qtyModified)){
                JOptionPane.showMessageDialog(dialogModify, "Không đủ số lượng hàng trong kho");
                return;
            }
            
            
            double thanhTien = qtyModified * (Double)tbOrder.getValueAt(row, 3);
            tbOrderModel.setValueAt(qtyModified, row , 2);
            
            this.total -= (Double) tbOrder.getValueAt(row, 4);
            tbOrderModel.setValueAt(thanhTien, row, 4);
            
            this.total += thanhTien;
            lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(total));
            
            double giaSauGiam = this.total - SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
            
            if(giaSauGiam <= 0){
                lbSale.setText("0");
                giaSauGiam = this.total;
            }
            lbTotalAfterSale.setText(SeperatorConvert.doubleToThousandFormatted(giaSauGiam));
            
            JOptionPane.showMessageDialog(dialogModify, "Lưu thay đổi thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            txtPaid.setText("");
            txtReturn.setText("");
            btnCreateInvoice.setEnabled(false);
            dialogModify.setVisible(false);
        }
    }//GEN-LAST:event_btnSaveChangeActionPerformed

    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCustomerActionPerformed
       String tel = txtFindSDT.getText().trim();
       if(tel.isEmpty()){
           JOptionPane.showMessageDialog(this, "Vui lòng nhập SĐT cho khách cần tạo mới", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
           
       }else{
           NguoiDungDAO ndDAO = new NguoiDungDAO();
           int checkSDTid = ndDAO.checkTelExist(tel);
           
           if (checkSDTid == -1){ // chưa có NguoiDung nào với SDT này
                Khach customer = new Khach();
                customer.setTel(tel);
                String name  = "guest" + tel.substring(tel.length() - 3);
                customer.setHoTen(name);
                
                //lấy userID vừa tạo
                int userIDReceived = ndDAO.addNguoiDung(customer);
                
                //gán cho Customer các trường tương ứng trong DB
                customer.setUserID(userIDReceived);
                customer.setPoints(0);
                CustomerDAO cusDAO = new CustomerDAO();
                cusDAO.addCustomer(customer);
                
                JOptionPane.showMessageDialog(this, "Tạo khách hàng mới thành công! Chọn tra cứu để lấy thông tin", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               JOptionPane.showMessageDialog(this, "Đã tồn tại khách với SDT này trong hệ thống", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
               return;
           }
       }
    }//GEN-LAST:event_btnAddCustomerActionPerformed

    private void btncCancelExchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncCancelExchangeActionPerformed
        dialogPoint.setVisible(false);
    }//GEN-LAST:event_btncCancelExchangeActionPerformed

    private void btnComfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComfirmActionPerformed
        String s = txtNhapDiem.getText().trim();
        if(s.isEmpty()){
            JOptionPane.showMessageDialog(dialogPoint, "Vui lòng nhập số điểm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            int exchangePoint = Integer.parseInt(s);
            
            if(exchangePoint > Integer.parseInt(txtPoint.getText())){
                JOptionPane.showMessageDialog(dialogPoint, "Không đủ điểm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            if(exchangePoint * 1000 > this.total){
                JOptionPane.showMessageDialog(dialogPoint, "Khuyến mại vượt quá giá trị đơn hàng", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                txtNhapDiem.setText("");
            }else{
                lbSale.setText(SeperatorConvert.doubleToThousandFormatted(exchangePoint * 1000));
                lbTotalAfterSale.setText(SeperatorConvert.doubleToThousandFormatted(this.total - exchangePoint * 1000));
                JOptionPane.showMessageDialog(dialogPoint, "Đổi điểm thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                dialogPoint.setVisible(false);
                txtNhapDiem.setText("");
                txtPaid.setText("");
                txtReturn.setText("");
                btnCreateInvoice.setEnabled(false);
            }
        }
        
        
    }//GEN-LAST:event_btnComfirmActionPerformed

    private void txtPaidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPaidKeyTyped
        
        
        if(this.timeDebounce != null){
            timeDebounce.cancel();
        }
        
        pnSell _this = this;
        timeDebounce = new Timer();
        timeDebounce.schedule(new TimerTask(){
            @Override
            public void run() {
                if(!txtPaid.getText().isEmpty()){
                    try {
                    double paid = Double.parseDouble(txtPaid.getText());
                    double thanhTien = SeperatorConvert.thousandFormattedToDouble(lbTotalAfterSale.getText());
                    
                    double traLai = paid - thanhTien;
                    if(traLai < 0){
                        txtReturn.setText("");
                    }else{
                        txtReturn.setText(SeperatorConvert.doubleToThousandFormatted(traLai));
                    }
                } catch (NumberFormatException nfe) {
                    JOptionPane.showMessageDialog(_this, "Số tiền không hợp lệ", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                    txtPaid.setText("");
                    txtReturn.setText("");
                    return;
                }
                   if(!txtReturn.getText().isEmpty()){
                       btnCreateInvoice.setEnabled(true);
                   }else{
                       btnCreateInvoice.setEnabled(false);
                   }
                }else{
                    txtReturn.setText("");
                    btnCreateInvoice.setEnabled(false);
                }
            }
            
        }, 800);
    }//GEN-LAST:event_txtPaidKeyTyped
    
    public void loadProductData(){
        ProductDAO prodDAO = new ProductDAO();
        list = prodDAO.getAllProducts();
        
        tbProductModel.setRowCount(0);
        for(Product prod : list){
            tbProductModel.addRow(new Object[]{
                prod.getCodes(),
                prod.getName(),
                prod.getStoreQuantity(),
                prod.getSellPrice(),
                ImageConvert.getByteToImageIcon(prod.getImg(), 70, 70)
            });
        }
        
        tbProduct.setModel(tbProductModel);
        
        tbProduct.getColumnModel().getColumn(3).setCellRenderer(new ThousandSeperator());
    }
    
    public void clearOrderUI(){
        this.total = 0;
        tbOrderModel.setRowCount(0);
        txtFindSDT.setText("");
        txtName.setText("");
        txtSDT.setText("");
        txtMaKH.setText("");
        txtPoint.setText("");
        lbTotal.setText("0");
        lbSale.setText("0");
        lbTotalAfterSale.setText("0");
        txtPaid.setText("");
        txtReturn.setText("");
        btnCreateInvoice.setEnabled(false);
    }
    public void initNhanVienNgayTao(){
        NhanVienDAO nvDAO = new NhanVienDAO();
        String code = nvDAO.getCodesNhanVien(Session.getCurrentTk().getNguoiDung().getUserID());
        txtMaNV.setText(code);
        

    }
    public void initOrderCode(){
        OrderDAO odDAO = new OrderDAO();
        txtCodes.setText("HĐ" + String.format("%02d",odDAO.getLatestOrder() + 1));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddToOrder;
    private javax.swing.JButton btnCancelInvoice;
    private javax.swing.JButton btnComfirm;
    private javax.swing.JButton btnCreateInvoice;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnModifyCancel;
    private javax.swing.JButton btnSaveChange;
    private javax.swing.JButton btnUsePoint;
    private javax.swing.JButton btncCancelExchange;
    private javax.swing.JDialog dialogModify;
    private javax.swing.JDialog dialogPoint;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbTimeCreate;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JLabel lbTotalAfterSale;
    private javax.swing.JSpinner spinnerModifyQty;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTable tbOrder;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextField txtCodes;
    private javax.swing.JTextField txtFindSDT;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNhapDiem;
    private javax.swing.JTextField txtPaid;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtReturn;
    private javax.swing.JTextField txtSDT;
    // End of variables declaration//GEN-END:variables
}
