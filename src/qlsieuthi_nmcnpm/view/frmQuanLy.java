/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlsieuthi_nmcnpm.view;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.*;


public class frmQuanLy extends javax.swing.JFrame {
    private final List<JButton> sidebarTab;
    private final Color hoverBtn = new Color(83, 101, 122);
    private final Color inactiveBtn = new Color(61, 74, 89);
    private final  Color activeBtn = new Color(56, 201, 187);
    private String isActive ;
    private CardLayout cardLayout;
    
    
    public frmQuanLy() {
        super("Quản lý cửa hàng tiện lợi NUKE");
        initComponents();
        this.setLocationRelativeTo(null);
      
        sidebarTab = new ArrayList<>();
        sidebarTab.add(btnQLNV); sidebarTab.add(btnQLSP); sidebarTab.add(btnQLNhap); sidebarTab.add(btnQLNCC); sidebarTab.add(btnThongKe); sidebarTab.add(btnPhanQuyen);
        initMouseEve();
        
        cardLayout = new CardLayout();
        pnMain.setLayout(cardLayout);
        pnMain.add(new pnGreet(), "pnGreet"); pnMain.add(new pnQLNhanVien(), "qlnv");
    }
    
    public void resetColor(){
        for(JButton btn : sidebarTab){
            if(btn.getText().equals(isActive)){
                btn.setBackground(inactiveBtn);
                return;
            }
                
        }
    }
    
    public void initMouseEve(){
        for (JButton x : sidebarTab){
            x.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e){
                    if(isActive == null ||  !x.getText().equals(isActive))
                        x.setBackground(hoverBtn);
                }
                
                @Override
                public void mouseExited(MouseEvent e){
                    if(isActive == null ||  !x.getText().equals(isActive)){
                        x.setBackground(inactiveBtn);
                    }
                }
            });
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnQLNV = new javax.swing.JButton();
        btnQLSP = new javax.swing.JButton();
        btnQLNhap = new javax.swing.JButton();
        btnQLNCC = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnPhanQuyen = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(61, 74, 89));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 736));

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setLayout(new java.awt.BorderLayout());
        jPanel3.add(lblLogo, java.awt.BorderLayout.CENTER);
        ImageIcon logo = new ImageIcon("images/logo.png");
        Image scaledLogo = logo.getImage().getScaledInstance(150, 128, Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(scaledLogo));
        lblLogo.setPreferredSize(new Dimension(150, 128));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        btnQLNV.setBackground(new Color(61, 74, 89)
        );
        btnQLNV.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQLNV.setForeground(new java.awt.Color(255, 255, 255));
        btnQLNV.setText("Nhân Viên");
        btnQLNV.setBorder(null);
        btnQLNV.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNVActionPerformed(evt);
            }
        });

        btnQLSP.setBackground(new Color(61, 74, 89));
        btnQLSP.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQLSP.setForeground(new java.awt.Color(255, 255, 255));
        btnQLSP.setText("Sản Phẩm");
        btnQLSP.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLSPActionPerformed(evt);
            }
        });

        btnQLNhap.setBackground(new Color(61, 74, 89)
        );
        btnQLNhap.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQLNhap.setForeground(new java.awt.Color(255, 255, 255));
        btnQLNhap.setText("Nhập Hàng");
        btnQLNhap.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNhapActionPerformed(evt);
            }
        });

        btnQLNCC.setBackground(new Color(61, 74, 89)
        );
        btnQLNCC.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnQLNCC.setForeground(new java.awt.Color(255, 255, 255));
        btnQLNCC.setText("Nhà Cung Cấp");
        btnQLNCC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnQLNCC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNCCActionPerformed(evt);
            }
        });

        btnThongKe.setBackground(new Color(61, 74, 89)
        );
        btnThongKe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setText("Thống Kê");
        btnThongKe.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnPhanQuyen.setBackground(new Color(61, 74, 89)
        );
        btnPhanQuyen.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnPhanQuyen.setForeground(new java.awt.Color(255, 255, 255));
        btnPhanQuyen.setText("Phân Quyền");
        btnPhanQuyen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPhanQuyen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhanQuyenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQLNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQLSP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQLNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnQLNCC, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnPhanQuyen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnQLNV, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnQLSP, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnQLNCC, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnThongKe, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnPhanQuyen, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 130, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new Color(61, 74, 89));
        btnQLNV.setBorderPainted(false);
        btnQLNV.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnQLSP.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnQLSP.setContentAreaFilled(true);
        btnQLSP.setOpaque(true);
        btnQLSP.setBorderPainted(false);
        btnQLNhap.setFocusPainted(false);
        btnQLNhap.setBorderPainted(false);
        btnQLNhap.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnQLNCC.setBorderPainted(false);
        btnQLNCC.setOpaque(true);
        btnQLNCC.setFocusPainted(false);
        btnQLNCC.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnThongKe.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnThongKe.setBorderPainted(false);
        btnPhanQuyen.setBorderPainted(false);
        btnPhanQuyen.setUI(new javax.swing.plaf.basic.BasicButtonUI());

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        pnMain.setPreferredSize(new java.awt.Dimension(1194, 746));
        pnMain.setLayout(null);
        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQLNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNVActionPerformed
        cardLayout.show(pnMain, "qlnv");
        resetColor();
        btnQLNV.setBackground(activeBtn);
        isActive = btnQLNV.getText();
    }//GEN-LAST:event_btnQLNVActionPerformed

    private void btnQLSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLSPActionPerformed
        resetColor();
        btnQLSP.setBackground(activeBtn);
        isActive = btnQLSP.getText();
    }//GEN-LAST:event_btnQLSPActionPerformed

    private void btnQLNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNhapActionPerformed
        resetColor();
        btnQLNhap.setBackground(activeBtn);
        isActive = btnQLNhap.getText();
    }//GEN-LAST:event_btnQLNhapActionPerformed

    private void btnQLNCCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNCCActionPerformed
        resetColor();
        btnQLNCC.setBackground(activeBtn);
        isActive = btnQLNCC.getText();
    }//GEN-LAST:event_btnQLNCCActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        resetColor();
        btnThongKe.setBackground(activeBtn);
        isActive = btnThongKe.getText();
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void btnPhanQuyenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhanQuyenActionPerformed
        resetColor();
        btnPhanQuyen.setBackground(activeBtn);
        isActive = btnPhanQuyen.getText();
    }//GEN-LAST:event_btnPhanQuyenActionPerformed


    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLy().setVisible(true);
                Locale.setDefault(Locale.US);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhanQuyen;
    private javax.swing.JButton btnQLNCC;
    private javax.swing.JButton btnQLNV;
    private javax.swing.JButton btnQLNhap;
    private javax.swing.JButton btnQLSP;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
