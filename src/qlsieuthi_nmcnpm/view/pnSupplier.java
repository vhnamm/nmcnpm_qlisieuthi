
package qlsieuthi_nmcnpm.view;

import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicPanelUI;
import javax.swing.table.DefaultTableModel;
import qlsieuthi_nmcnpm.DAO.SupplierDAO;
import qlsieuthi_nmcnpm.models.Supplier;


public class pnSupplier extends javax.swing.JPanel {
    private DefaultTableModel tbModel;

    public pnSupplier() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogEditSupp = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtName = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnCancel = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNCC = new javax.swing.JTable();
        pnTool = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        dialogEditSupp.setMinimumSize(new java.awt.Dimension(746, 473));
        dialogEditSupp.setModal(true);

        jPanel2.setBackground(new Color(61, 74, 89));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Thông tin nhà cung cấp");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(221, 221, 221))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel4.setText("Mã nhà cung cấp");

        txtCode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtName.setColumns(20);
        txtName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtName.setLineWrap(true);
        txtName.setRows(5);
        txtName.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtName);

        jLabel5.setText("Tên nhà cung cấp");

        txtTel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel6.setText("Số điện thoại");

        jLabel7.setText("Địa chỉ");

        txtAddress.setColumns(20);
        txtAddress.setLineWrap(true);
        txtAddress.setRows(5);
        txtAddress.setWrapStyleWord(true);
        jScrollPane3.setViewportView(txtAddress);

        btnCancel.setBackground(new java.awt.Color(255, 64, 66));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Huỷ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(0, 172, 64));
        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogEditSuppLayout = new javax.swing.GroupLayout(dialogEditSupp.getContentPane());
        dialogEditSupp.getContentPane().setLayout(dialogEditSuppLayout);
        dialogEditSuppLayout.setHorizontalGroup(
            dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEditSuppLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(dialogEditSuppLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(53, 53, 53))
        );
        dialogEditSuppLayout.setVerticalGroup(
            dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogEditSuppLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogEditSuppLayout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jLabel7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dialogEditSuppLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(dialogEditSuppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        dialogEditSupp.setLocationRelativeTo(null);

        tbNCC.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã NCC", "Tên nhà cung cấp", "Số điện thoại", "Địa chỉ"
            }
        ));
        tbNCC.setRowHeight(30);
        jScrollPane1.setViewportView(tbNCC);

        pnTool.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        pnTool.setLayout(null);

        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnTool.add(btnAdd);
        btnAdd.setBounds(30, 10, 90, 40);

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnTool.add(btnDelete);
        btnDelete.setBounds(150, 10, 90, 40);

        btnModify.setText("Sửa");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        pnTool.add(btnModify);
        btnModify.setBounds(270, 10, 90, 40);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(27, 19, 305, 22);

        btnFind.setText("Tìm kiếm");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });
        jPanel1.add(btnFind);
        btnFind.setBounds(361, 19, 79, 23);

        jLabel1.setText("Chức năng");

        jLabel2.setText("Tìm kiếm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 511, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(pnTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(515, 515, 515))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
                    .addComponent(pnTool, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        dialogEditSupp.setVisible(true);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        dialogEditSupp.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        String codes = txtCode.getText().trim();
        String name = txtName.getText().trim();
        String tel = txtTel.getText().trim();
        String address = txtAddress.getText().trim();
        
        if(name.isEmpty()){
            JOptionPane.showMessageDialog(dialogEditSupp, "Vui lòng điền tên NCC", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(tel.isEmpty()){
            JOptionPane.showMessageDialog(dialogEditSupp, "Vui lòng điền SĐT", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else if(codes.isEmpty()){
            JOptionPane.showMessageDialog(dialogEditSupp, "Vui lòng điền tên viết tắt", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            return;
        }          
        else if(address.isEmpty()){
            JOptionPane.showMessageDialog(dialogEditSupp, "Vui lòng điền địa chỉ", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        SupplierDAO suppDAO = new SupplierDAO();
        Supplier supp =  new Supplier(codes.toUpperCase(), name, tel, address);
        
        boolean ok = suppDAO.addSupplier(supp);
        if(!ok){
            JOptionPane.showMessageDialog(this, "Đã tồn tại nhà cung cấp này", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            return;
        }
        txtCode.setText("");
        txtName.setText("");
        txtTel.setText("");
        txtAddress.setText("");
        dialogEditSupp.setVisible(false);
        JOptionPane.showMessageDialog(this, "Thêm thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        reloadData();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFindActionPerformed

    public void reloadData(){
        tbModel = (DefaultTableModel) tbNCC.getModel();
        tbModel.setRowCount(0);
        SupplierDAO suppDAO = new SupplierDAO();
        List<Supplier> list = suppDAO.getAllSuppliers();
        
        for(Supplier supp : list){
            tbModel.addRow(new Object[]{
                supp.getCodes(),
                supp.getName(),
                supp.getTel(),
                supp.getAddress()
            });
        }
        tbNCC.setModel(tbModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JDialog dialogEditSupp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel pnTool;
    private javax.swing.JTable tbNCC;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextArea txtName;
    private javax.swing.JTextField txtTel;
    // End of variables declaration//GEN-END:variables
}
