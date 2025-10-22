
package qlsieuthi_nmcnpm.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class frmCustomer extends javax.swing.JFrame {
    private final List<JButton> sidebarTab ;
    private final Color hoverBtn = new Color(83, 101, 122);
    private final Color inactiveBtn = new Color(61, 74, 89);
    private final  Color activeBtn = new Color(56, 201, 187);
    private CardLayout cardLayout;
    private String currentActiveBtn;
    
    
    public frmCustomer() {
        initComponents();
        this.setLocationRelativeTo(null);
        sidebarTab = new ArrayList<>();
        sidebarTab.add(btnOrder); sidebarTab.add(btnHistory);
        initMouseEvent();
        
        cardLayout = new CardLayout();
        pnMain.setLayout(cardLayout);
        pnMain.add(new pnGreet(), "pnGreet");
        pnMain.add(new pnCustomerOrder(), "pnOrder");
        pnMain.add(new pnCustomerHistory(), "pnHistory");
        
        
    }
    public void initMouseEvent(){
        for(JButton x : sidebarTab){
            x.addMouseListener(new MouseAdapter(){
                @Override
                public void mouseEntered(MouseEvent e){
                    if(currentActiveBtn == null || !x.getText().equals(currentActiveBtn) ){
                        x.setBackground(hoverBtn);
                    }
                }
                
                @Override
                public void mouseExited(MouseEvent e){
                    if(currentActiveBtn == null || !x.getText().equals(currentActiveBtn)){
                        x.setBackground(inactiveBtn);
                    }
                }
            });
        }
    }
    
    public void resetColor(){
        for(JButton x : sidebarTab){
            if(x.getText().equals(currentActiveBtn)){
                x.setBackground(inactiveBtn);
                break;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JButton();
        btnHistory = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(61, 74, 89));

        jPanel2.setBackground(new Color(61, 74, 89));

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel1)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        btnOrder.setBackground(new Color(61, 74, 89));
        btnOrder.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setText("Đặt hàng");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnHistory.setBackground(new Color(61, 74, 89));
        btnHistory.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHistory.setForeground(new java.awt.Color(255, 255, 255));
        btnHistory.setText("Lịch sử");
        btnHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistoryActionPerformed(evt);
            }
        });

        btnLogout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLogout.setText("Đăng xuất");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
            .addComponent(btnHistory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnLogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        // Code adding the component to the parent container - not shown here
        btnOrder.setBorderPainted(false);
        btnOrder.setUI(new javax.swing.plaf.basic.BasicButtonUI());
        // Code adding the component to the parent container - not shown here
        btnHistory.setBorderPainted(false);
        btnHistory.setUI(new javax.swing.plaf.basic.BasicButtonUI());

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1296, Short.MAX_VALUE)
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        
        ((pnCustomerOrder) pnMain.getComponent(1)).loadData();
        ((pnCustomerOrder) pnMain.getComponent(1)).initOrderInfo();
        cardLayout.show(pnMain, "pnOrder");
        resetColor();
        btnOrder.setBackground(activeBtn);
        this.currentActiveBtn = btnOrder.getText();
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistoryActionPerformed
        cardLayout.show(pnMain, "pnHistory");
        resetColor();
        btnHistory.setBackground(activeBtn);
        this.currentActiveBtn = btnHistory.getText();
    }//GEN-LAST:event_btnHistoryActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn đăng xuất?", "Hệ thống", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
            this.dispose();
            frmLogin login = new frmLogin();
            login.setVisible(true);
        }
        
    }//GEN-LAST:event_btnLogoutActionPerformed


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
            java.util.logging.Logger.getLogger(frmCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHistory;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnMain;
    // End of variables declaration//GEN-END:variables
}
