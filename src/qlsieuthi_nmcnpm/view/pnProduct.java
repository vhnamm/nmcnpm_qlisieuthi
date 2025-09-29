
package qlsieuthi_nmcnpm.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class pnProduct extends javax.swing.JPanel {

  
    public pnProduct() {
        initComponents();
        
        customizeTableHeader();
        dialogProduct.setLocationRelativeTo(null);
    }

    private void customizeTableHeader() {
        JTableHeader header = tbProducts.getTableHeader();
        header.setOpaque(false);

        // Tạo custom renderer cho header
        header.setDefaultRenderer(new DefaultTableCellRenderer() {
            @Override
            public Component getTableCellRendererComponent(JTable table, Object value,
                    boolean isSelected, boolean hasFocus, int row, int column) {
                Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
                c.setBackground(new Color(243, 154, 71));  // màu nền
                c.setForeground(Color.WHITE);              // màu chữ
                c.setFont(c.getFont().deriveFont(Font.BOLD));
                return c;
            }
        });

        header.repaint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogProduct = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtImportAvrg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        radioOn = new javax.swing.JRadioButton();
        radioOff = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();

        dialogProduct.setMinimumSize(new java.awt.Dimension(1187, 719));
        dialogProduct.setModal(true);
        dialogProduct.getContentPane().setLayout(null);

        jPanel2.setBackground(new Color(61, 74, 89));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(463, 463, 463)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        dialogProduct.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1146, 67);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(61, 74, 89)
        );
        jLabel2.setText("Tên sản phẩm");
        dialogProduct.getContentPane().add(jLabel2);
        jLabel2.setBounds(169, 96, 108, 20);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtName);
        txtName.setBounds(295, 92, 219, 31);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new Color(61, 74, 89)
        );
        jLabel3.setText("Loại mặt hàng");
        dialogProduct.getContentPane().add(jLabel3);
        jLabel3.setBounds(169, 156, 108, 20);

        txtCate.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtCate);
        txtCate.setBounds(295, 152, 167, 31);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new Color(61, 74, 89)
        );
        jLabel4.setText("Đơn vị tính");
        dialogProduct.getContentPane().add(jLabel4);
        jLabel4.setBounds(169, 221, 88, 20);

        txtUnit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtUnit);
        txtUnit.setBounds(295, 220, 157, 24);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new Color(61, 74, 89)
        );
        jLabel5.setText("Giá nhập trung bình");
        dialogProduct.getContentPane().add(jLabel5);
        jLabel5.setBounds(169, 287, 140, 20);

        txtImportAvrg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtImportAvrg.setText("0");
        txtImportAvrg.setEnabled(false);
        dialogProduct.getContentPane().add(txtImportAvrg);
        txtImportAvrg.setBounds(322, 286, 137, 24);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("vnđ");
        dialogProduct.getContentPane().add(jLabel6);
        jLabel6.setBounds(471, 289, 30, 18);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new Color(61, 74, 89)
        );
        jLabel7.setText("Giá bán");
        dialogProduct.getContentPane().add(jLabel7);
        jLabel7.setBounds(169, 340, 51, 20);

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtPrice);
        txtPrice.setBounds(258, 339, 175, 24);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("vnđ");
        dialogProduct.getContentPane().add(jLabel8);
        jLabel8.setBounds(471, 342, 30, 18);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new Color(61, 74, 89)
        );
        jLabel9.setText("Số lượng tồn");
        dialogProduct.getContentPane().add(jLabel9);
        jLabel9.setBounds(169, 436, 100, 20);

        jTextField6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jTextField6.setText("0");
        jTextField6.setEnabled(false);
        dialogProduct.getContentPane().add(jTextField6);
        jTextField6.setBounds(274, 435, 106, 24);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new Color(61, 74, 89)
        );
        jLabel10.setText("Tình trạng");
        dialogProduct.getContentPane().add(jLabel10);
        jLabel10.setBounds(416, 409, 80, 20);

        buttonGroup1.add(radioOn);
        radioOn.setText("Đang kinh doanh");
        dialogProduct.getContentPane().add(radioOn);
        radioOn.setBounds(416, 437, 125, 21);

        buttonGroup1.add(radioOff);
        radioOff.setText("Đã ngừng bán");
        dialogProduct.getContentPane().add(radioOff);
        radioOff.setBounds(547, 437, 110, 21);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new Color(61, 74, 89)
        );
        jLabel11.setText("Mô tả sản phẩm");
        dialogProduct.getContentPane().add(jLabel11);
        jLabel11.setBounds(169, 512, 108, 20);

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDesc);

        dialogProduct.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(169, 538, 273, 75);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("Chọn ảnh");
        dialogProduct.getContentPane().add(jButton1);
        jButton1.setBounds(870, 500, 121, 42);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lbImage.setText("jLabel12");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(lbImage)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(lbImage)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        dialogProduct.getContentPane().add(jPanel3);
        jPanel3.setBounds(810, 200, 240, 260);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);
        btnAdd.setBounds(10, 10, 110, 40);

        btnModify.setText("Sửa");
        jPanel1.add(btnModify);
        btnModify.setBounds(150, 10, 110, 40);

        btnDelete.setText("Xoá");
        jPanel1.add(btnDelete);
        btnDelete.setBounds(290, 10, 120, 40);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(450, 10, 10, 50);

        txtFind.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(txtFind);
        txtFind.setBounds(750, 10, 290, 40);

        btnFind.setText("Tìm Kiếm");
        jPanel1.add(btnFind);
        btnFind.setBounds(1050, 10, 100, 40);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(610, 10, 130, 40);

        tbProducts.setAutoCreateRowSorter(true);
        tbProducts.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã SP", "Tên sản phẩm", "Mô tả", "Loại", "Đơn vị", "Số lượng tồn", "Giá nhập trung bình", "Giá bán", "Tình trạng"
            }
        ));
        tbProducts.setGridColor(new java.awt.Color(255, 255, 255));
        tbProducts.setRowHeight(24);
        tbProducts.setSelectionBackground(new java.awt.Color(46, 155, 112));
        tbProducts.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tbProducts);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dialogProduct.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JDialog dialogProduct;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel lbImage;
    private javax.swing.JRadioButton radioOff;
    private javax.swing.JRadioButton radioOn;
    private javax.swing.JTable tbProducts;
    private javax.swing.JTextField txtCate;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtImportAvrg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
