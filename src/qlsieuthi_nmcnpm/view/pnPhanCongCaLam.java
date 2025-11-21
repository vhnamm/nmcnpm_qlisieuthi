
package qlsieuthi_nmcnpm.view;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import qlsieuthi_nmcnpm.DAO.CaLamDAO;
import qlsieuthi_nmcnpm.DAO.NhanVienDAO;
import qlsieuthi_nmcnpm.DAO.PhieuPhanCongDAO;
import qlsieuthi_nmcnpm.models.CaLam;
import qlsieuthi_nmcnpm.models.NhanVien;
import qlsieuthi_nmcnpm.models.PhieuPhanCong;


public class pnPhanCongCaLam extends javax.swing.JPanel {
    DefaultTableModel tbPhieuModel = null;
    
    public pnPhanCongCaLam() {
        initComponents();
        reloadData();
    }

   public void reloadData(){
       DefaultTableModel tbModel = (DefaultTableModel) tbNV.getModel();
       tbModel.setRowCount(0);
       NhanVienDAO nvDAO = new NhanVienDAO();
       
       for(NhanVien nv : nvDAO.getAllNhanVien()){
           
           tbModel.addRow(new Object[]{
               nv.getMaNV(),
               nv.getHoTen(),
               nv.getTel(),
               nv.getSalary(),
               "Đang làm"
           });
       }
       tbNV.setModel(tbModel);
   }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        dtShift = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNV = new javax.swing.JTable();
        btnTaoLich = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPhieu = new javax.swing.JTable();
        btnTaoPhieu = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbbShifts = new javax.swing.JComboBox<CaLam>();

        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");
        add(jLabel1);
        jLabel1.setBounds(1205, 6, 55, 25);

        dtShift.setDateFormatString("dd/MM/yyyy");
        dtShift.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        add(dtShift);
        dtShift.setBounds(340, 80, 173, 31);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Chọn ngày");
        add(jLabel2);
        jLabel2.setBounds(240, 80, 80, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Chọn ca");
        add(jLabel3);
        jLabel3.setBounds(580, 80, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("Phân công ca làm trong tuần");
        add(jLabel4);
        jLabel4.setBounds(447, 6, 309, 32);

        tbNV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "SĐT", "Lương cơ bản", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbNV.setRowHeight(30);
        jScrollPane1.setViewportView(tbNV);

        btnTaoLich.setText("Tạo lịch");
        btnTaoLich.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoLichActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 602, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnTaoLich, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTaoLich, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        add(jPanel1);
        jPanel1.setBounds(0, 161, 602, 590);

        tblPhieu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã NV", "Tên nhân viên", "Số điện thoại", "Ngày", "Ca", "Mã ca", "Dự kiến nhận"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblPhieu.setRowHeight(30);
        jScrollPane2.setViewportView(tblPhieu);

        btnTaoPhieu.setBackground(new java.awt.Color(0, 172, 64));
        btnTaoPhieu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnTaoPhieu.setForeground(new java.awt.Color(255, 255, 255));
        btnTaoPhieu.setText("Tạo phiếu phân công");
        btnTaoPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoPhieuActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(255, 64, 66));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDelete)
                .addGap(31, 31, 31)
                .addComponent(btnTaoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1))
                    .addComponent(btnTaoPhieu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(624, 161, 570, 590);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Ca làm đã phân công");
        add(jLabel5);
        jLabel5.setBounds(630, 140, 190, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Danh sách nhân viên");
        add(jLabel6);
        jLabel6.setBounds(10, 140, 150, 20);
        add(cbbShifts);
        cbbShifts.setBounds(680, 80, 180, 30);
        DefaultComboBoxModel<CaLam> model = new DefaultComboBoxModel<>();
        CaLamDAO clDAO = new CaLamDAO();
        for(CaLam x : clDAO.getAllShifts()){
            model.addElement(x);
        }
        cbbShifts.setModel(model);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTaoLichActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoLichActionPerformed
        try {
            int selectedRow = tbNV.getSelectedRow();
            if(selectedRow == -1){
                JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            Date selectedDate = dtShift.getDate();
            //Convert Date to LocalDate
            LocalDate lcSelectedDate = LocalDate.ofInstant(selectedDate.toInstant(), ZoneId.systemDefault());
            String tenCa = ((CaLam)cbbShifts.getSelectedItem()).getTenCa();
            int maCa = ((CaLam) cbbShifts.getSelectedItem()).getId();
            String maNV = tbNV.getValueAt(selectedRow, 0).toString();
            String name =  tbNV.getValueAt(selectedRow, 1).toString();
            String tel = tbNV.getValueAt(selectedRow, 2).toString();
            double duKienNhan = Double.parseDouble(tbNV.getValueAt(selectedRow, 3).toString()) * 5;
            
            tbPhieuModel = (DefaultTableModel) tblPhieu.getModel();
            
            for(int row = 0; row < tbPhieuModel.getRowCount(); row++){
                if(tenCa.equals(tbPhieuModel.getValueAt(row, 4).toString()) && maNV.equals(tbPhieuModel.getValueAt(row, 0).toString()) && lcSelectedDate.equals(tbPhieuModel.getValueAt(row, 3))){
                    JOptionPane.showMessageDialog(this, "Bạn đã thêm ca làm này cho nhân viên " + name + " rồi!", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            
            tbPhieuModel.addRow(new Object[]{
                maNV,
                name,
                tel,
                lcSelectedDate,
                tenCa,
                maCa,
                duKienNhan
            });
            tblPhieu.setModel(tbPhieuModel);
        } catch (NullPointerException nfe) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ngày", "Hệ thống", JOptionPane.WARNING_MESSAGE);
        }
       
    }//GEN-LAST:event_btnTaoLichActionPerformed

    private void btnTaoPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoPhieuActionPerformed
        if(tblPhieu.getRowCount() == 0){
            JOptionPane.showMessageDialog(this, "Chua co ca lam nao duoc them", "He thong",  JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        int choice = JOptionPane.showConfirmDialog(this, "Tạo ca làm cho những nhân viên này?", "Hệ thống", JOptionPane.YES_NO_OPTION);
        if(choice == JOptionPane.YES_OPTION){
                
                int shiftID = -1;
                LocalDate ngayLam;
                double duKienNhan;
                PhieuPhanCongDAO phieuDAO = new PhieuPhanCongDAO();
                
                for(int row = 0; row < tbPhieuModel.getRowCount(); row++){
                    int empID = Integer.parseInt(tbPhieuModel.getValueAt(row, 0).toString().substring(2));
                    shiftID = Integer.parseInt(tbPhieuModel.getValueAt(row, 5).toString());
                    ngayLam = (LocalDate) tbPhieuModel.getValueAt(row, 3);
                    duKienNhan = Double.parseDouble(tbPhieuModel.getValueAt(row, 6).toString());
                    
                    PhieuPhanCong phieu = new PhieuPhanCong(ngayLam, empID, shiftID, duKienNhan);
                    

                    boolean ok = phieuDAO.addAssignment(phieu);
                    if(!ok){
                        JOptionPane.showMessageDialog(this, "Không thể thêm ca " + shiftID + " ngày " + ngayLam + " cho nhân viên id: " + empID + " do trùng lặp", "Hệ thống", JOptionPane.WARNING_MESSAGE );                
                    }
                  }
            
                JOptionPane.showMessageDialog(this, "Tạo phiếu phân công thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                tbPhieuModel.setRowCount(0);
                tblPhieu.setModel(tbPhieuModel);
            }
        
    }//GEN-LAST:event_btnTaoPhieuActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedRow = tblPhieu.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn ca cần xoá", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else{
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc xoá ca làm này?", "Hệ thống", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                tbPhieuModel.removeRow(selectedRow);
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnTaoLich;
    private javax.swing.JButton btnTaoPhieu;
    private javax.swing.JComboBox<CaLam> cbbShifts;
    private com.toedter.calendar.JDateChooser dtShift;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbNV;
    private javax.swing.JTable tblPhieu;
    // End of variables declaration//GEN-END:variables
}
