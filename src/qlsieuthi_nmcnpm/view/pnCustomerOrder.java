
package qlsieuthi_nmcnpm.view;

import java.awt.event.ItemEvent;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import qlsieuthi_nmcnpm.DAO.CategoryDAO;
import qlsieuthi_nmcnpm.DAO.ProductDAO;
import qlsieuthi_nmcnpm.helper.ImageConvert;
import qlsieuthi_nmcnpm.helper.ThousandSeperator;
import qlsieuthi_nmcnpm.models.Category;
import qlsieuthi_nmcnpm.models.Product;


public class pnCustomerOrder extends javax.swing.JPanel {
    private DefaultTableModel tbProductModel;
    private DefaultComboBoxModel<Category> cbbModel;
    
    private List<Product> prods;
    private boolean triggerChangeTableData = true;
    public pnCustomerOrder() {
        initComponents();
        
    }
    
    
    public void loadData(){
        ProductDAO productDAO = new ProductDAO();
        prods = productDAO.getAllProducts();
        tbProductModel = (DefaultTableModel) tbProduct.getModel();
        tbProductModel.setRowCount(0);
        
        for(Product x : prods){
            tbProductModel.addRow(new Object[]{
                x.getCodes(),
                x.getName(),
                x.getUnit(),
                x.getSellPrice(),
                ImageConvert.getByteToImageIcon(x.getImg(), 70, 70)
            });
        }
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
    public void filterData(int categoryID){
        tbProductModel.setRowCount(0);
        for(Product x : prods){
            if(x.getCategoryID() == categoryID){
                tbProductModel.addRow(new Object[]{
                    x.getCodes(),
                    x.getName(),
                    x.getUnit(),
                    x.getSellPrice(),
                    ImageConvert.getByteToImageIcon(x.getImg(), 70, 70)
                });
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        rdCOD = new javax.swing.JRadioButton();
        rdQR = new javax.swing.JRadioButton();
        jSeparator2 = new javax.swing.JSeparator();
        spinnerQty = new javax.swing.JSpinner();
        btnAddToCart = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbbCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();

        tbProduct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        txtName.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel1.add(txtName);
        txtName.setBounds(130, 90, 190, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("SĐT");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(350, 90, 26, 20);

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTel.setPreferredSize(new java.awt.Dimension(64, 27));
        jPanel1.add(txtTel);
        txtTel.setBounds(410, 90, 190, 27);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Mã KH");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(350, 50, 45, 20);

        txtCustomerCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
        txtInvoiceCode.setPreferredSize(new java.awt.Dimension(64, 24));
        jPanel1.add(txtInvoiceCode);
        txtInvoiceCode.setBounds(130, 40, 190, 30);

        tbCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
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
        tbCart.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tbCart);

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
        jPanel1.add(btnDelete);
        btnDelete.setBounds(20, 560, 78, 38);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Điểm");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(350, 140, 35, 20);

        txtPoint.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtPoint);
        txtPoint.setBounds(410, 140, 85, 26);

        btnRedeem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnRedeem.setText("Đổi điểm");
        jPanel1.add(btnRedeem);
        btnRedeem.setBounds(510, 140, 90, 40);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel22.setText("TỔNG TIỀN");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(22, 615, 108, 27);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel23.setText("CHIẾT KHẤU");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(22, 661, 118, 27);

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel24.setText("THÀNH TIỀN");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(22, 714, 123, 27);

        lbTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbTotal.setText("0");
        jPanel1.add(lbTotal);
        lbTotal.setBounds(178, 613, 13, 30);

        lbSale.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbSale.setText("0");
        jPanel1.add(lbSale);
        lbSale.setBounds(178, 659, 13, 30);

        lbFinalTotal.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lbFinalTotal.setForeground(new java.awt.Color(255, 0, 0));
        lbFinalTotal.setText("0");
        jPanel1.add(lbFinalTotal);
        lbFinalTotal.setBounds(180, 710, 13, 30);

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton6.setText("Thanh toán");
        jPanel1.add(jButton6);
        jButton6.setBounds(330, 780, 207, 44);

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton7.setText("Huỷ");
        jPanel1.add(jButton7);
        jButton7.setBounds(90, 780, 126, 44);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setText("đ");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(354, 621, 8, 20);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel16.setText("đ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(354, 667, 8, 20);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("đ");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(354, 715, 8, 20);

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel18.setText("Phương thức thanh toán");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(410, 610, 160, 20);

        buttonGroup1.add(rdCOD);
        rdCOD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdCOD.setText("Thanh toán khi nhận hàng");
        jPanel1.add(rdCOD);
        rdCOD.setBounds(410, 650, 190, 25);

        buttonGroup1.add(rdQR);
        rdQR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdQR.setText("Chuyển khoản");
        jPanel1.add(rdQR);
        rdQR.setBounds(410, 690, 112, 25);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2);
        jSeparator2.setBounds(400, 610, 12, 130);

        spinnerQty.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        spinnerQty.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        btnAddToCart.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAddToCart.setText("Thêm vào giỏ hàng");

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

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mặc định", "Giá tăng dần", "Giá giảm dần" }));

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
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            int categoryID =((Category) evt.getItem()).getId();
            if(categoryID != 0)
                filterData(categoryID);
            else
                loadData();
        }
    }//GEN-LAST:event_cbbCategoryItemStateChanged
    
    
    private void txtModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModifyActionPerformed
        cbbCategory.setSelectedIndex(0);
    }//GEN-LAST:event_txtModifyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddToCart;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRedeem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Category> cbbCategory;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbFinalTotal;
    private javax.swing.JLabel lbSale;
    private javax.swing.JLabel lbTotal;
    private javax.swing.JRadioButton rdCOD;
    private javax.swing.JRadioButton rdQR;
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
