
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

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

        btnAdd.setText("Thêm");
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbProducts;
    private javax.swing.JTextField txtFind;
    // End of variables declaration//GEN-END:variables
}
