/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qlsieuthi_nmcnpm.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Admin
 */
public class frmNhanVien extends javax.swing.JFrame {
    private final List<JButton> sidebarTab;
    private final Color hoverBtn = new Color(83, 101, 122);
    private final Color inactiveBtn = new Color(61, 74, 89);
    private final  Color activeBtn = new Color(56, 201, 187);
    private String isActive ;
    
    public frmNhanVien() {
        initComponents();
        this.setLocationRelativeTo(null);
        sidebarTab = new ArrayList<>();
        sidebarTab.add(btnChoXN); sidebarTab.add(btnBanHang);
        initMouseEvt();
    }

    public void initMouseEvt(){
        for(JButton btn : sidebarTab){
            btn.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e){
                    if( isActive == null || !btn.getText().equals(isActive)){
                        btn.setBackground(hoverBtn);
                    }
                }
                
                @Override
                public void mouseExited(MouseEvent e){
                    if(isActive == null || !btn.getText().equals(isActive)){
                        btn.setBackground(inactiveBtn);
                    }
                }
            });
        }
    }
    
    public void resetColor(){
        for(JButton btn : sidebarTab){
            if(btn.getText().equals(isActive))
            {
                btn.setBackground(inactiveBtn);
                return;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        btnChoXN = new javax.swing.JButton();
        btnBanHang = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1394, 746));

        jPanel1.setBackground(new Color(61, 74, 89));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 746));

        jPanel2.setBackground(new Color(61, 74, 89));
        jPanel2.setLayout(new java.awt.BorderLayout());
        jPanel2.add(lblLogo, java.awt.BorderLayout.CENTER);
        ImageIcon logo = new ImageIcon("images/logo.png");
        Image scaledLogo = logo.getImage().getScaledInstance(150, 128, Image.SCALE_SMOOTH);
        lblLogo.setIcon(new ImageIcon(scaledLogo));
        lblLogo.setPreferredSize(new Dimension(150, 128));
        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        btnChoXN.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnChoXN.setForeground(new java.awt.Color(255, 255, 255));
        btnChoXN.setText("Đơn chờ xác nhận");
        btnChoXN.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnChoXN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoXNActionPerformed(evt);
            }
        });

        btnBanHang.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBanHang.setForeground(new java.awt.Color(255, 255, 255));
        btnBanHang.setText("Bán Hàng");
        btnBanHang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnBanHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBanHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnChoXN, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
            .addComponent(btnBanHang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnChoXN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnBanHang, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 398, Short.MAX_VALUE))
        );

        btnChoXN.setBorderPainted(false);
        btnChoXN.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnChoXN.setBackground(this.inactiveBtn);
        btnBanHang.setBorderPainted(false);
        btnBanHang.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        btnBanHang.setBackground(this.inactiveBtn);

        getContentPane().add(jPanel1, java.awt.BorderLayout.LINE_START);

        jLabel1.setText("DAY LA TRANG CHO NHAN VIEN");

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGap(383, 383, 383)
                .addComponent(jLabel1)
                .addContainerGap(657, Short.MAX_VALUE))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1)
                .addContainerGap(493, Short.MAX_VALUE))
        );

        getContentPane().add(pnMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnChoXNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoXNActionPerformed
        resetColor();
        btnChoXN.setBackground(activeBtn);
        this.isActive = btnChoXN.getText();
    }//GEN-LAST:event_btnChoXNActionPerformed

    private void btnBanHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBanHangActionPerformed
        resetColor();
        btnBanHang.setBackground(activeBtn);
        this.isActive = btnBanHang.getText();
    }//GEN-LAST:event_btnBanHangActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBanHang;
    private javax.swing.JButton btnChoXN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
