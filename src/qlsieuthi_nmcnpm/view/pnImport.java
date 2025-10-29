
package qlsieuthi_nmcnpm.view;

import java.awt.Color;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlsieuthi_nmcnpm.DAO.ManagerDAO;
import qlsieuthi_nmcnpm.DAO.ProductDAO;
import qlsieuthi_nmcnpm.DAO.ReceiptDAO;
import qlsieuthi_nmcnpm.DAO.ReceiptProductDAO;
import qlsieuthi_nmcnpm.DAO.SupplierDAO;
import qlsieuthi_nmcnpm.helper.SeperatorConvert;
import qlsieuthi_nmcnpm.helper.Session;
import qlsieuthi_nmcnpm.helper.ThousandSeperator;
import qlsieuthi_nmcnpm.models.NguoiDung;
import qlsieuthi_nmcnpm.models.Product;
import qlsieuthi_nmcnpm.models.QuanLy;
import qlsieuthi_nmcnpm.models.Receipt;
import qlsieuthi_nmcnpm.models.ReceiptProduct;
import qlsieuthi_nmcnpm.models.Supplier;
import qlsieuthi_nmcnpm.models.TaiKhoan;


public class pnImport extends javax.swing.JPanel {
    private DefaultTableModel tbModel, tbReceiptModel;
    private DefaultComboBoxModel cbbModel;
    private final LocalDate todayDate = LocalDate.now();
    private double total = 0;
    
    public pnImport() {
        initComponents();
        
    }
    public void loadProductList(){
        tbModel = (DefaultTableModel) tbProduct.getModel();
        tbModel.setRowCount(0);
        ProductDAO prodDAO = new ProductDAO();
        for(Product x : prodDAO.getAllProducts()){
           tbModel.addRow(new Object[]{
               x.getCodes(),
               x.getName(),
               x.getUnit(),
               x.getImportAvrg(),
               x.getSellPrice(),
               x.getStoreQuantity()
           });
        }
        tbProduct.setModel(tbModel);
        tbProduct.getColumnModel().getColumn(4).setCellRenderer(new ThousandSeperator());
        tbProduct.getColumnModel().getColumn(3).setCellRenderer(new ThousandSeperator());
    }
    
    public void initDateAndSupplier(){
        SupplierDAO suppDAO = new SupplierDAO();
        cbbModel = (DefaultComboBoxModel) cbbSupplier.getModel();
        cbbModel.removeAllElements();
        
        for(Supplier supp : suppDAO.getAllSuppliers()){
            cbbModel.addElement(supp);
        }    
        Date date = Date.from(todayDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        dateImport.setDate(date);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogModify = new javax.swing.JDialog();
        jLabel8 = new javax.swing.JLabel();
        spinnerModify = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtPriceModify = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnSaveModify = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMaPhieu = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cbbSupplier = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        txtNguoiTao = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbReceipt = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        spinnerQuan = new javax.swing.JSpinner();
        btnAddPhieu = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JLabel();
        btnCreateReceipt = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtGiaNhap = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dateImport = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();

        dialogModify.setMinimumSize(new java.awt.Dimension(600, 400));
        dialogModify.setModal(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Chọn số lượng");

        spinnerModify.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerModify.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));

        jPanel2.setBackground(new Color(61, 74, 89));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Chỉnh sửa thông tin mặt hàng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel13)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Giá nhập");

        btnCancel.setText("Huỷ");

        btnSaveModify.setText("Lưu thay đổi");
        btnSaveModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveModifyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogModifyLayout = new javax.swing.GroupLayout(dialogModify.getContentPane());
        dialogModify.getContentPane().setLayout(dialogModifyLayout);
        dialogModifyLayout.setHorizontalGroup(
            dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dialogModifyLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogModifyLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addComponent(btnSaveModify, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogModifyLayout.createSequentialGroup()
                        .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel14))
                        .addGap(60, 60, 60)
                        .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerModify, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPriceModify, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        dialogModifyLayout.setVerticalGroup(
            dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModifyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(spinnerModify, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtPriceModify, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSaveModify, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60))
        );

        dialogModify.setLocationRelativeTo(this);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Tìm kiếm mặt hàng");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFind)
                .addGap(18, 18, 18)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFind, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Thông tin phiếu nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mã phiếu nhập");

        txtMaPhieu.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Chọn nhà cung cấp");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Người tạo phiếu");

        txtNguoiTao.setEnabled(false);

        tbProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbProduct.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên SP", "Đơn vị", "Giá nhập trung bình", "Giá bán", "Số lượng tồn"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProduct.setRowHeight(24);
        jScrollPane1.setViewportView(tbProduct);

        tbReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbReceipt.setModel(new javax.swing.table.DefaultTableModel(
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
        tbReceipt.setRowHeight(24);
        jScrollPane2.setViewportView(tbReceipt);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Chọn số lượng");

        spinnerQuan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerQuan.setModel(new javax.swing.SpinnerNumberModel(1, 1, 9999, 1));

        btnAddPhieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAddPhieu.setText("Thêm vào phiếu ");
        btnAddPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPhieuActionPerformed(evt);
            }
        });

        btnModify.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnModify.setText("Sửa thông tin");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa sản phẩm");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Tổng tiền đơn nhập:");

        txtTotal.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(255, 51, 51));
        txtTotal.setText("0");

        btnCreateReceipt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCreateReceipt.setText("Nhập hàng");
        btnCreateReceipt.setEnabled(false);
        btnCreateReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateReceiptActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Giá nhập");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("đ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Ngày nhập");

        dateImport.setDateFormatString("dd/MM/yyyy");
        dateImport.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        dateImport.setMaxSelectableDate(Date.from(todayDate.atStartOfDay(ZoneId.systemDefault()).toInstant())
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("đ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(spinnerQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel10)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(jLabel2))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(jLabel11)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(dateImport, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(cbbSupplier, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(txtNguoiTao))))))
                                .addGap(0, 26, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCreateReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(110, 110, 110))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dateImport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtMaPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spinnerQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(txtGiaNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(17, 17, 17))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbbSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModify, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtTotal)
                            .addComponent(jLabel12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCreateReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPhieuActionPerformed
        int row = tbProduct.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm muốn nhập", "Hệ thống", JOptionPane.WARNING_MESSAGE);
         
        }else{
            try {
                String codes = tbProduct.getValueAt(row, 0).toString();
                String name = tbProduct.getValueAt(row, 1).toString();
                try {
                    spinnerQuan.commitEdit();
                } catch (ParseException pe) {
                    JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ", "Hệ thống", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                int soLuongNhap = (Integer) spinnerQuan.getValue();
                double giaNhap = Double.valueOf(txtGiaNhap.getText());
                
                tbReceiptModel = (DefaultTableModel) tbReceipt.getModel();
                tbReceipt.getColumnModel().getColumn(3).setCellRenderer(new ThousandSeperator());
                tbReceipt.getColumnModel().getColumn(4).setCellRenderer(new ThousandSeperator());
                for (int i = 0; i < tbReceiptModel.getRowCount(); i++) {
                    if(tbReceiptModel.getValueAt(i, 0).toString().equals(codes)){
                        JOptionPane.showMessageDialog(this, "Bạn đã thêm sản phẩm này vào phiếu rồi, vui lòng sửa số lượng!", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                
                double thanhTienSP = giaNhap * soLuongNhap;
                
                tbReceiptModel.addRow(new Object[]{
                    codes,
                    name,
                    soLuongNhap,
                    giaNhap,
                    thanhTienSP
                });
                txtGiaNhap.setText("");
                spinnerQuan.setValue(1);
                
                //cap nhat tong tien
                this.total += thanhTienSP;               
                txtTotal.setText(SeperatorConvert.doubleToThousandFormatted(total));
                btnCreateReceipt.setEnabled(true);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(this, "Giá nhập không hợp lệ", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAddPhieuActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int row = tbReceipt.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng lòng chọn sản phẩm cần sửa", "Hệ thống", JOptionPane.WARNING_MESSAGE);
        }else{
            txtPriceModify.setText(String.format("%.0f", tbReceipt.getValueAt(row, 3)));
            spinnerModify.setValue(tbReceipt.getValueAt(row, 2));
            dialogModify.setVisible(true);
            
        }
        
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveModifyActionPerformed
        int choice = JOptionPane.showConfirmDialog(dialogModify, "Bạn có chắc muốn thay đổi?", "Hệ thống", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            try {
                double priceModified = Double.parseDouble(txtPriceModify.getText());
                try {
                    spinnerModify.commitEdit();
                } catch (ParseException pe) {
                    JOptionPane.showMessageDialog(this, "Số lượng không hợp lệ", "Hệ thống", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                int soLuongNhap = (Integer) spinnerModify.getValue();
                int row = tbReceipt.getSelectedRow();
                double thanhTien = soLuongNhap * priceModified;
                
                tbReceipt.setValueAt(soLuongNhap, row, 2);
                tbReceipt.setValueAt(priceModified, row, 3);
                
                this.total -= (Double) tbReceipt.getValueAt(row, 4);
                tbReceipt.setValueAt(thanhTien, row, 4);
                this.total += thanhTien;
                txtTotal.setText(SeperatorConvert.doubleToThousandFormatted(total));
                
                JOptionPane.showMessageDialog(dialogModify, "Lưu thay đổi thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                dialogModify.setVisible(false);
            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(dialogModify, "Giá nhập không hợp lệ", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnSaveModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tbReceipt.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn mặt hàng trong phiếu", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            
        }else{
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá sản phẩm này khỏi đơn nhập?", "Hệ thống", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                int quan = (Integer) tbReceipt.getValueAt(row, 2);
                double price  =(Double) tbReceipt.getValueAt(row, 3);
                this.total -= (quan * price);
                
                txtTotal.setText(SeperatorConvert.doubleToThousandFormatted(this.total));
                tbReceiptModel.removeRow(row);
                if(tbReceiptModel.getRowCount() == 0){
                    btnCreateReceipt.setEnabled(false);
                }
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateReceiptActionPerformed
        String receiptCode = txtMaPhieu.getText();
        LocalDate lcDate = LocalDate.ofInstant(dateImport.getDate().toInstant(), ZoneId.systemDefault());
        String maNguoiTao = txtNguoiTao.getText();
        //lay ID quan ly tu maQL
        ManagerDAO mngDAO = new ManagerDAO();
        int idQL = mngDAO.getIDByCode(maNguoiTao);
        int idNCC = ((Supplier)cbbSupplier.getSelectedItem()).getId();
        
        double total = SeperatorConvert.thousandFormattedToDouble(txtTotal.getText());
        
        System.out.println(txtTotal.getText());
        //insert vao bang Receipt
        Receipt rc  = new Receipt(receiptCode, idQL, idNCC, lcDate, total);
        ReceiptDAO rcDAO = new ReceiptDAO();
        int receiptGeneratedID = rcDAO.addReceipt(rc);
        
        //Insert vao bang trung gian Receipt_Product
        for(int i=0; i<tbReceiptModel.getRowCount(); i++){
            int productID = Integer.parseInt(tbReceipt.getValueAt(i, 0).toString().substring(3));
            int quan = Integer.parseInt(tbReceipt.getValueAt(i, 2).toString());
            double importPrice = (Double)tbReceipt.getValueAt(i, 3);
            double totalPrice = quan * importPrice;
            
            ReceiptProduct rcp = new ReceiptProduct(receiptGeneratedID, productID, quan ,importPrice, totalPrice);
            ReceiptProductDAO rcpDAO  = new ReceiptProductDAO();
            
            //them vao bang trung gian
            rcpDAO.addReceiptDetail(rcp);
            //cap nhat so luong va gia nhap
            ProductDAO prodDAO = new ProductDAO();
            prodDAO.updateImportedProduct(productID, quan, importPrice);
            
            //xoa het row table Phieu Nhap
            
        }
        loadProductList();
        this.total = 0;
        JOptionPane.showMessageDialog(this, "Nhập hàng thành công. Vui lòng vào phần Thống Kê để xem chi tiết!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        tbReceiptModel.setRowCount(0);
        txtTotal.setText("0");
        
        initReceiptInfo();
    }//GEN-LAST:event_btnCreateReceiptActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        String keyword = txtFind.getText().trim();
        if(keyword.isEmpty()){
            loadProductList();
        }else {
            tbModel.setRowCount(0);
            ProductDAO productDAO = new ProductDAO();
            for(Product prod : productDAO.getSearchedProducts(keyword)){
                tbModel.addRow(new Object[]{
                    prod.getCodes(),
                    prod.getName(),
                    
                    prod.getUnit(),
                    prod.getImportAvrg(),
                    prod.getSellPrice(),
                    prod.getStoreQuantity(),
                    
                    
                   
                });
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed
    public void initReceiptInfo(){
        ReceiptDAO rcDAO = new ReceiptDAO();
        txtMaPhieu.setText("PN" + String.format("%02d", rcDAO.getLatestID() + 1));
        String maNguoiNhap = "";
        String quyen = Session.getCurrentTk().getQuyen();
        
        switch (quyen) {
            case "quanly":
                ManagerDAO mngDAO = new ManagerDAO();
                QuanLy ql = mngDAO.getManagerByUserID(Session.getCurrentTk().getNguoiDung().getUserID());
                maNguoiNhap = ql.getMaQL();
                break;
            default:
                throw new AssertionError();
        }
        
        
        
        txtNguoiTao.setText(maNguoiNhap);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPhieu;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreateReceipt;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSaveModify;
    private javax.swing.JComboBox<Supplier> cbbSupplier;
    private com.toedter.calendar.JDateChooser dateImport;
    private javax.swing.JDialog dialogModify;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner spinnerModify;
    private javax.swing.JSpinner spinnerQuan;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTable tbReceipt;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtGiaNhap;
    private javax.swing.JTextField txtMaPhieu;
    private javax.swing.JTextField txtNguoiTao;
    private javax.swing.JTextField txtPriceModify;
    private javax.swing.JLabel txtTotal;
    // End of variables declaration//GEN-END:variables
}
