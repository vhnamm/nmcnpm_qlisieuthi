/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package qlsieuthi_nmcnpm.view;

import javax.swing.JOptionPane;
import qlsieuthi_nmcnpm.DAO.TaiKhoanDAO;
import qlsieuthi_nmcnpm.helper.Session;
import qlsieuthi_nmcnpm.models.TaiKhoan;

public class frmLogin extends javax.swing.JFrame {

    public frmLogin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnRegis = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Đăng Nhập");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên đăng nhập (SDT)");

        txtUsername.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsername.setPreferredSize(new java.awt.Dimension(64, 29));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Mật khẩu:");

        txtPassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPassword.setPreferredSize(new java.awt.Dimension(64, 29));

        btnLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogin.setText("Đăng nhập");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Chưa có tài khoản?");

        btnRegis.setText("Đăng ký");
        btnRegis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(txtUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(btnRegis, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtUsername.getText().trim();
        String password = String.valueOf(txtPassword.getPassword()).trim();
        
        if(username.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Tên đăng nhập không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            return;
        }
        else if(password.isEmpty()){
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không được để trống", "Lỗi", JOptionPane.ERROR_MESSAGE);           
            return;
        }
        
        TaiKhoanDAO tkDAO = new TaiKhoanDAO();
        TaiKhoan tk = tkDAO.getAccountByTk(username, password);
        
        if(tk == null || !tk.isIsActive()){
            JOptionPane.showMessageDialog(rootPane, "Sai tài khoản hoặc mật khẩu", "", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Session.setCurrentTk(tk);
        
        System.out.println(tk.getMatKhau());
        switch (tk.getQuyen()) {
            case "quanly":
                frmQuanLy frmQL = new frmQuanLy();
                frmQL.setVisible(true);
                JOptionPane.showMessageDialog(frmQL, "Đăng nhập thành công!", "Hệ thống",  JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                
                break;
            case "nhanvien":
                frmNhanVien frmNV = new frmNhanVien();
                frmNV.setVisible(true);
                JOptionPane.showMessageDialog(frmNV, "Đăng nhập thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                break;
            case "khach":
                frmCustomer frmKH = new frmCustomer();
                this.dispose();
                frmKH.setVisible(true);
                JOptionPane.showMessageDialog(frmKH, "Đăng nhập thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisActionPerformed
       this.dispose();
       frmRegis regiter = new frmRegis();
       regiter.setVisible(true);
    }//GEN-LAST:event_btnRegisActionPerformed

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
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
