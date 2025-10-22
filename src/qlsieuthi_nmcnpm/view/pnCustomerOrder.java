
package qlsieuthi_nmcnpm.view;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.html.HTML;
import qlsieuthi_nmcnpm.DAO.CategoryDAO;
import qlsieuthi_nmcnpm.DAO.CustomerDAO;
import qlsieuthi_nmcnpm.DAO.OrderDAO;
import qlsieuthi_nmcnpm.DAO.OrderDetailDAO;
import qlsieuthi_nmcnpm.DAO.ProductDAO;
import qlsieuthi_nmcnpm.helper.ImageConvert;
import qlsieuthi_nmcnpm.helper.SeperatorConvert;
import qlsieuthi_nmcnpm.helper.Session;
import qlsieuthi_nmcnpm.helper.ThousandSeperator;
import qlsieuthi_nmcnpm.models.Category;
import qlsieuthi_nmcnpm.models.Khach;
import qlsieuthi_nmcnpm.models.Order;
import qlsieuthi_nmcnpm.models.OrderDetail;
import qlsieuthi_nmcnpm.models.Product;


public class pnCustomerOrder extends javax.swing.JPanel {
    private DefaultTableModel tbProductModel;
    private DefaultComboBoxModel<Category> cbbModel;
    private DefaultTableModel tbCartModel;
    private List<Product> prods;
    private boolean triggerChangeTableData = true;
    private double total= 0;
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public pnCustomerOrder() {
        initComponents();
        
    }
    
    
    public void loadData(){
        triggerChangeTableData = false;
        initCbb();
        filterData(0, null);
        triggerChangeTableData = true;
    }
    public void initCbb(){
        CategoryDAO categoryDAO = new CategoryDAO();
        cbbModel = (DefaultComboBoxModel) cbbCategory.getModel();
        cbbModel.removeAllElements();
        cbbModel.addElement(new Category(0, "Tất cả"));
        for(Category x : categoryDAO.getAllCategories()){
            cbbModel.addElement(x);
        }
        
    }
    public void initOrderInfo(){
        OrderDAO orderDAO = new OrderDAO();
        int latestID = orderDAO.getLatestOrder();
        txtInvoiceCode.setText("HĐ" + String.format("%02d", latestID + 1));
        
        CustomerDAO customerDAO = new CustomerDAO();
        Khach customer = customerDAO.findByTel(Session.getCurrentTk().getTenDangNhap());
        txtCustomerCode.setText(customer.getMaKH());
        txtName.setText(customer.getHoTen());
        txtTel.setText(customer.getTel());
        txtPoint.setText(String.valueOf(customer.getPoints()));
    }
    public void filterData(int categoryID, String orderBy){
        System.out.println("filtered");
        ProductDAO productDAO = new ProductDAO();
        tbProductModel.setRowCount(0);
        for(Product x : productDAO.getFilteredProduct(categoryID, orderBy)){
            tbProductModel.addRow(new Object[]{
                x.getCodes(),
                x.getName(),
                x.getUnit(),
                x.getSellPrice(),
                ImageConvert.getByteToImageIcon(x.getImg(),70, 70)
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dialogModify = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        spinnerModify = new javax.swing.JSpinner();
        jLabel14 = new javax.swing.JLabel();
        btnCancelModify = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        dialogRedeem = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        spinnerPoint = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnConfirm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProduct = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCustomerCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txtInvoiceCode = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbCart = new javax.swing.JTable();
        jLabel10 = new javax.swing.JLabel();
        txtModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtPoint = new javax.swing.JTextField();
        btnRedeem = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lbTotal = new javax.swing.JLabel();
        lbSale = new javax.swing.JLabel();
        lbFinalTotal = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        spinnerQty = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbbCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbbOrderBy = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        dialogModify.setMinimumSize(new java.awt.Dimension(475, 303));
        dialogModify.setModal(true);

        jPanel2.setBackground(new Color(61, 74, 89));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel13.setText("Sửa số lượng");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(161, 161, 161))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        spinnerModify.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spinnerModify.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Chọn số lượng");

        btnCancelModify.setText("Huỷ");
        btnCancelModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelModifyActionPerformed(evt);
            }
        });

        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogModifyLayout = new javax.swing.GroupLayout(dialogModify.getContentPane());
        dialogModify.getContentPane().setLayout(dialogModifyLayout);
        dialogModifyLayout.setHorizontalGroup(
            dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(dialogModifyLayout.createSequentialGroup()
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogModifyLayout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel14)
                        .addGap(56, 56, 56)
                        .addComponent(spinnerModify, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogModifyLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(btnCancelModify, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        dialogModifyLayout.setVerticalGroup(
            dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogModifyLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(spinnerModify, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(dialogModifyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelModify, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );

        dialogModify.setLocationRelativeTo(this);

        dialogRedeem.setMinimumSize(new java.awt.Dimension(421, 293));
        dialogRedeem.setModal(true);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setText("Đổi Điểm");

        spinnerPoint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        spinnerPoint.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jLabel19.setText("Nhập số lượng");

        jButton1.setText("Huỷ");

        btnConfirm.setText("Xác nhận");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogRedeemLayout = new javax.swing.GroupLayout(dialogRedeem.getContentPane());
        dialogRedeem.getContentPane().setLayout(dialogRedeemLayout);
        dialogRedeemLayout.setHorizontalGroup(
            dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRedeemLayout.createSequentialGroup()
                .addGroup(dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogRedeemLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel18))
                    .addGroup(dialogRedeemLayout.createSequentialGroup()
                        .addGroup(dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dialogRedeemLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(jLabel19))
                            .addGroup(dialogRedeemLayout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(34, 34, 34)
                        .addGroup(dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(spinnerPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        dialogRedeemLayout.setVerticalGroup(
            dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogRedeemLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel18)
                .addGap(49, 49, 49)
                .addGroup(dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(spinnerPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(dialogRedeemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnConfirm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(47, 47, 47))
        );

        dialogRedeem.setLocationRelativeTo(this);

        tbProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbProduct.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbProduct);
        tbProductModel = new DefaultTableModel(new Object[]{
            "Mã SP", "Tên SP", "Đơn vị tính", "Đơn giá", "Ảnh SP"
        }, 0){
            @Override
            public Class<?> getColumnClass(int columnIndex){
                if(columnIndex == 4){
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
        TableColumn imgCol = tbProduct.getColumn("Ảnh SP");
        imgCol.setMaxWidth(70);
        tbProduct.getColumnModel().getColumn(3).setCellRenderer(new ThousandSeperator());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 17)); // NOI18N
        jLabel1.setText("Thông tin đơn hàng");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 0, 169, 25);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Tên người đặt");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 90, 93, 20);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setEnabled(false);
        txtName.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel1.add(txtName);
        txtName.setBounds(130, 90, 190, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("SĐT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 90, 26, 20);

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTel.setEnabled(false);
        txtTel.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel1.add(txtTel);
        txtTel.setBounds(410, 90, 190, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mã KH");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 50, 45, 20);

        txtCustomerCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCustomerCode.setEnabled(false);
        txtCustomerCode.setPreferredSize(new java.awt.Dimension(64, 24));
        jPanel1.add(txtCustomerCode);
        txtCustomerCode.setBounds(410, 40, 190, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Địa chỉ giao");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(20, 130, 79, 20);

        txtAddress.setColumns(20);
        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtAddress.setLineWrap(true);
        txtAddress.setRows(5);
        txtAddress.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(130, 130, 190, 50);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Mã đơn");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 40, 51, 20);

        txtInvoiceCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtInvoiceCode.setEnabled(false);
        txtInvoiceCode.setPreferredSize(new java.awt.Dimension(64, 24));
        jPanel1.add(txtInvoiceCode);
        txtInvoiceCode.setBounds(130, 40, 190, 30);

        tbCart.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tbCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Đơn vị tính", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbCart.setRowHeight(30);
        tbCart.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tbCart);
        tbCart.getColumnModel().getColumn(4).setCellRenderer(new ThousandSeperator());
        tbCart.getColumnModel().getColumn(5).setCellRenderer(new ThousandSeperator());

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(0, 210, 630, 343);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Giỏ hàng");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 180, 60, 20);

        txtModify.setText("Sửa");
        txtModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModifyActionPerformed(evt);
            }
        });
        jPanel1.add(txtModify);
        txtModify.setBounds(110, 560, 142, 38);

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);
        btnDelete.setBounds(20, 560, 78, 38);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Điểm");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 140, 35, 20);

        txtPoint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPoint.setEnabled(false);
        jPanel1.add(txtPoint);
        txtPoint.setBounds(410, 140, 85, 26);

        btnRedeem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRedeem.setText("Đổi điểm");
        btnRedeem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRedeemActionPerformed(evt);
            }
        });
        jPanel1.add(btnRedeem);
        btnRedeem.setBounds(510, 140, 90, 40);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel22.setText("TỔNG TIỀN");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(100, 610, 108, 27);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel23.setText("CHIẾT KHẤU");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(100, 660, 118, 27);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel24.setText("THÀNH TIỀN");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(100, 710, 123, 27);

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbTotal.setText("0");
        jPanel1.add(lbTotal);
        lbTotal.setBounds(260, 610, 170, 30);

        lbSale.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbSale.setText("0");
        jPanel1.add(lbSale);
        lbSale.setBounds(260, 660, 180, 30);

        lbFinalTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbFinalTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbFinalTotal.setText("0");
        jPanel1.add(lbFinalTotal);
        lbFinalTotal.setBounds(260, 710, 180, 30);

        btnOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOrder.setText("Đặt hàng");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jPanel1.add(btnOrder);
        btnOrder.setBounds(330, 780, 207, 44);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("Huỷ");
        jPanel1.add(jButton7);
        jButton7.setBounds(90, 780, 126, 44);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("đ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(440, 620, 8, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("đ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(440, 670, 8, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("đ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(440, 720, 8, 20);

        spinnerQty.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spinnerQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddToCart.setText("Thêm vào giỏ hàng");
        btnAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddToCartActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Nhập số lượng");

        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(71, 30));

        jButton2.setText("Tìm kiếm");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel3.setText("Bộ lọc");

        cbbCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbCategory.setMinimumSize(new java.awt.Dimension(72, 27));
        cbbCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbCategoryItemStateChanged(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Sắp xếp theo");

        cbbOrderBy.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Giá tăng dần", "Giá giảm dần" }));
        cbbOrderBy.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbOrderByItemStateChanged(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setText("Nhập tên mặt hàng cần tìm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel11))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 858, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbbOrderBy, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spinnerQty, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cbbCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbCategoryItemStateChanged
        if(!triggerChangeTableData){
            return;
        }
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
            applyFilter();
        }
    }//GEN-LAST:event_cbbCategoryItemStateChanged
    
    
    private void txtModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyActionPerformed
       int row = tbCart.getSelectedRow();
       if(row == -1){
           JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm trong giỏ hàng", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
       }else{
           int qty = (int)tbCart.getValueAt(row, 3);
           spinnerModify.setValue(qty);
           dialogModify.setVisible(true);
       }
    }//GEN-LAST:event_txtModifyActionPerformed

    private void cbbOrderByItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbOrderByItemStateChanged
        if(!triggerChangeTableData){
            return;
        }
        if(evt.getStateChange() == ItemEvent.SELECTED){
           applyFilter();
        }
        
    }//GEN-LAST:event_cbbOrderByItemStateChanged

    private void btnAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddToCartActionPerformed
        int row = tbProduct.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        }else{
            for(int i = 0; i<tbCart.getRowCount(); i++){
                if(tbProduct.getValueAt(row, 0).toString().equals(tbCart.getValueAt(i, 0))){
                    JOptionPane.showMessageDialog(this, "Sản phẩm đã có trong giỏ hàng, Vui lòng sửa số lượng", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }
            String code = tbProduct.getValueAt(row, 0).toString();
            String name = tbProduct.getValueAt(row, 1).toString();
            int qty = (int) spinnerQty.getValue();
            
            ProductDAO productDAO = new ProductDAO();
            if(!productDAO.checkStoreQty(Integer.parseInt(code.substring(2)), qty)){
                JOptionPane.showMessageDialog(this, "Khong du so luong hang", "He thong", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            String unit = tbProduct.getValueAt(row, 2).toString();
            double price = (double)  tbProduct.getValueAt(row, 3);
            double total = price * qty;
            
            tbCartModel = (DefaultTableModel) tbCart.getModel();
            tbCartModel.addRow(new Object[]{
                code,
                name,
                unit,
                qty,
                price,
                total
            });
            
            this.total += total;
            lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(this.total));
            double giaSauGiam = this.total - SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
            
            if(giaSauGiam <= 0){
                lbSale.setText("0");
                giaSauGiam = this.total;
            }
            
            lbFinalTotal.setText(SeperatorConvert.doubleToThousandFormatted(giaSauGiam));
            spinnerQty.setValue(1);
        }
    }//GEN-LAST:event_btnAddToCartActionPerformed

    private void btnCancelModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelModifyActionPerformed
        dialogModify.setVisible(false);
    }//GEN-LAST:event_btnCancelModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int modifiedQty = (int)spinnerModify.getValue();
        int row = tbCart.getSelectedRow();
        String code = tbCart.getValueAt(row, 0).toString();
        ProductDAO productDAO = new ProductDAO();
            if(!productDAO.checkStoreQty(Integer.parseInt(code.substring(2)), modifiedQty)){
                JOptionPane.showMessageDialog(dialogModify, "Khong du so luong hang", "He thong", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        
        
        double price = (double) tbCart.getValueAt(row, 4);
        this.total -=  (double)tbCart.getValueAt(row, 5);
        tbCart.setValueAt(modifiedQty, row, 3);
        tbCart.setValueAt(price * modifiedQty, row, 5);
        this.total += price * modifiedQty;
        lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(this.total));
        
        double giaSauGiam = this.total - SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
            
            if(giaSauGiam <= 0){
                lbSale.setText("0");
                giaSauGiam = this.total;
            }
        lbFinalTotal.setText(SeperatorConvert.doubleToThousandFormatted(giaSauGiam));
        
        JOptionPane.showMessageDialog(dialogModify, "Lưu thay đổi thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        dialogModify.setVisible(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int row = tbCart.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        }else{
            double amount = (double)tbCart.getValueAt(row, 5);
            this.total -= amount;
            tbCartModel.removeRow(row);
            lbTotal.setText(SeperatorConvert.doubleToThousandFormatted(this.total));
            double giaSauGiam = this.total - SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
            
            if(giaSauGiam <= 0){
                lbSale.setText("0");
                giaSauGiam = this.total;
            }
            
            lbFinalTotal.setText(SeperatorConvert.doubleToThousandFormatted(giaSauGiam));
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnRedeemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRedeemActionPerformed
        int point = Integer.parseInt(txtPoint.getText());
        
        if(point == 0){
            JOptionPane.showMessageDialog(this, "Bạn chưa có điểm tích luỹ nào!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        spinnerPoint.setValue(point);
        dialogRedeem.setVisible(true);
        
    }//GEN-LAST:event_btnRedeemActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        int redeemQty = (int) spinnerPoint.getValue();
        
        if(redeemQty > Integer.parseInt(txtPoint.getText())){
            JOptionPane.showMessageDialog(dialogRedeem, "Không đủ số lượng điểm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        if(redeemQty * 1000 > this.total){
            JOptionPane.showMessageDialog(dialogRedeem, "Khuyến mại vượt quá giá trị đơn hàng", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            return ;
        }else{
            lbSale.setText(SeperatorConvert.doubleToThousandFormatted(redeemQty * 1000));
            lbFinalTotal.setText(SeperatorConvert.doubleToThousandFormatted(total - (redeemQty * 1000)));
            JOptionPane.showMessageDialog(dialogRedeem, "Đổi điểm thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            dialogRedeem.setVisible(false);
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
         String address = txtAddress.getText().trim();
         if(address.isEmpty()){
             JOptionPane.showMessageDialog(this, "Chưa nhập địa chỉ");
             return;
         }
        String orderCode = txtInvoiceCode.getText();
        int customerID = Integer.parseInt(txtCustomerCode.getText().substring(2));
        LocalDateTime thoiGianTao = LocalDateTime.now();
        double finalTotal = SeperatorConvert.thousandFormattedToDouble(lbFinalTotal.getText());
        double discount = SeperatorConvert.thousandFormattedToDouble(lbSale.getText());
        int usedPoint = (int) discount / 1000;
        
        int orderState = 1; //cho xac nhan
        
        Order order = new Order(-1, customerID,orderCode, address, thoiGianTao, total, 0, discount, finalTotal, orderState);
        OrderDAO orderDAO = new OrderDAO();
        orderDAO.addOrder(order);
        
        int orderID = Integer.parseInt(orderCode.substring(2));
        OrderDetailDAO odtDAO = new OrderDetailDAO();
        
        for(int i=0; i<tbCart.getRowCount(); i++){
            int prodID = Integer.valueOf(tbCart.getValueAt(i, 0).toString().substring(2));
            int qty = Integer.valueOf(tbCart.getValueAt(i, 3).toString());
            double unitPrice = Double.parseDouble(tbCart.getValueAt(i, 4).toString());
             
            OrderDetail orderDetail = new OrderDetail(orderID, prodID, qty, unitPrice, unitPrice * qty);
            odtDAO.addOrderDetail(orderDetail);
            
        }
        
        
        JOptionPane.showMessageDialog(this, "Dat hang thanh cong");
        clearUI();
    }//GEN-LAST:event_btnOrderActionPerformed

    public void applyFilter(){
        String orderBy = String.valueOf(cbbOrderBy.getSelectedItem());
        int categoryID = ((Category)cbbCategory.getSelectedItem()).getId();
            switch (orderBy) {
                case "Giá giảm dần":
                    filterData(categoryID, "DESC");
                    break;
                case "Giá tăng dần":
                    filterData(categoryID, "ASC");
                    break;
                case "Mặc định":
                    filterData(categoryID, null);
                    break;
                default:
                    throw new AssertionError();
            }
    }
    public void clearUI(){
        tbCartModel.setRowCount(0);
        total = 0;
        lbFinalTotal.setText("0");
        lbSale.setText("0");
        lbTotal.setText("0");
        txtAddress.setText("");
        initOrderInfo();
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnCancelModify;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnRedeem;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Category> cbbCategory;
    private javax.swing.JComboBox<String> cbbOrderBy;
    private javax.swing.JDialog dialogModify;
    private javax.swing.JDialog dialogRedeem;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton7;
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
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
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbFinalTotal;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JSpinner spinnerModify;
    private javax.swing.JSpinner spinnerPoint;
    private javax.swing.JSpinner spinnerQty;
    private javax.swing.JTable tbCart;
    private javax.swing.JTable tbProduct;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCustomerCode;
    private javax.swing.JTextField txtInvoiceCode;
    private javax.swing.JButton txtModify;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPoint;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
