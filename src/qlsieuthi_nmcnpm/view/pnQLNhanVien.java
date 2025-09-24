
package qlsieuthi_nmcnpm.view;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import qlsieuthi_nmcnpm.DAO.NguoiDungDAO;
import qlsieuthi_nmcnpm.DAO.NhanVienDAO;
import qlsieuthi_nmcnpm.DAO.TaiKhoanDAO;
import qlsieuthi_nmcnpm.DTO.NhanVienFullDTO;

import qlsieuthi_nmcnpm.models.NhanVien;
import qlsieuthi_nmcnpm.models.TaiKhoan;


public class pnQLNhanVien extends javax.swing.JPanel {
    private List<NhanVienFullDTO> arr;
    private DefaultTableModel tbModel;
    private int currentUserID;
    
    public pnQLNhanVien() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        mainTabbedPane = new javax.swing.JTabbedPane();
        pnTabbedQLNV = new javax.swing.JPanel();
        pnTool = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        txtFind = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtDOB = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        rdioM = new javax.swing.JRadioButton();
        rdioF = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtaAddress = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        txtSalary = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        cbbState = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();

        mainTabbedPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                mainTabbedPaneStateChanged(evt);
            }
        });

        pnTabbedQLNV.setLayout(new java.awt.BorderLayout());

        pnTool.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        pnTool.setPreferredSize(new java.awt.Dimension(1193, 60));
        pnTool.setLayout(null);

        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnTool.add(btnAdd);
        btnAdd.setBounds(40, 10, 110, 40);

        btnModify.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnModify.setText("Sửa");
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        pnTool.add(btnModify);
        btnModify.setBounds(280, 10, 100, 40);

        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnTool.add(btnDelete);
        btnDelete.setBounds(170, 10, 90, 40);

        btnSave.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSave.setText("Lưu");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        pnTool.add(btnSave);
        btnSave.setBounds(400, 10, 90, 40);

        btnFind.setText("Tìm kiếm");
        pnTool.add(btnFind);
        btnFind.setBounds(990, 10, 100, 30);
        pnTool.add(txtFind);
        txtFind.setBounds(730, 10, 250, 30);

        pnTabbedQLNV.add(pnTool, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(null);

        tblNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Họ Tên", "Ngày Sinh", "Giới Tính", "SĐT", "Địa Chỉ", "Tài Khoản", "Tình Trạng", "Lương/h", "userID"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(30);
        jScrollPane1.setViewportView(tblNhanVien);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 223, 1187, 447);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel1.setText("Họ và Tên");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(114, 32, 67, 18);
        jPanel1.add(txtName);
        txtName.setBounds(208, 22, 152, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel2.setText("Ngày sinh");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(114, 78, 67, 18);
        jPanel1.add(txtDOB);
        txtDOB.setBounds(208, 68, 117, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setText("Giới tính");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(110, 130, 53, 18);

        buttonGroup1.add(rdioM);
        rdioM.setText("Nam");
        jPanel1.add(rdioM);
        rdioM.setBounds(210, 130, 49, 21);

        buttonGroup1.add(rdioF);
        rdioF.setText("Nữ");
        jPanel1.add(rdioF);
        rdioF.setBounds(270, 130, 50, 21);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setText("Số điện thoại");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 30, 83, 18);
        jPanel1.add(txtTel);
        txtTel.setBounds(550, 22, 150, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setText("Địa chỉ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(450, 140, 46, 18);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Danh sách nhân viên");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(33, 191, 150, 20);

        txtaAddress.setColumns(20);
        txtaAddress.setLineWrap(true);
        txtaAddress.setRows(5);
        txtaAddress.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtaAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(550, 140, 234, 40);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel7.setText("Lương cơ bản");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(450, 90, 83, 18);
        jPanel1.add(txtSalary);
        txtSalary.setBounds(550, 82, 127, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("vnđ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(690, 90, 21, 18);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Lọc");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(950, 180, 43, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setText("Trạng thái");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(810, 30, 70, 18);

        cbbState.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cbbState.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Đang làm", "Đã nghỉ việc" }));
        jPanel1.add(cbbState);
        cbbState.setBounds(890, 20, 160, 30);
        cbbState.setEnabled(false);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả nhân viên", "Đã nghỉ làm", "Đang làm" }));
        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(1010, 180, 140, 30);

        jLabel9.setText("Mã NV");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(810, 80, 37, 16);

        txtMa.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtMa.setEnabled(false);
        jPanel1.add(txtMa);
        txtMa.setBounds(890, 80, 100, 24);

        pnTabbedQLNV.add(jPanel1, java.awt.BorderLayout.CENTER);

        mainTabbedPane.addTab("Quản lý Nhân Viên", pnTabbedQLNV);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainTabbedPane)
        );

        pnPhanCongCaLam pnPhanCong = new pnPhanCongCaLam();
        mainTabbedPane.addTab("Phân công", pnPhanCong);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        try {
            String name = txtName.getText().trim();
            String tel = txtTel.getText().trim();
            String dob = txtDOB.getText().trim();
            LocalDate ngaySinh = null;
            Double salary = Double.valueOf(txtSalary.getText().trim());
            String addr = txtaAddress.getText().trim();
            String gender = rdioF.isSelected() ? "Nữ" : rdioM.isSelected() ? "Nam" : "";

            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền tên nhân viên", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if(tel.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền SĐT", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if(gender.equals("")){
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }          
            else if(addr.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền địa chỉ", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                try {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                                                .withResolverStyle(ResolverStyle.STRICT);
                    ngaySinh = LocalDate.parse(dob, fmt);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ, dùng định dạng dd/mm/yyyy", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    
                }
            }
            
            //Bdau gọi DAO và thêm vào db
            TaiKhoanDAO tkDAO = new TaiKhoanDAO();
            if(!tkDAO.checkExist(tel)){
                JOptionPane.showMessageDialog(this, "Đã tồn tại tài khoản với số điện thoại này", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            NhanVien nv = new NhanVien(name, tel, addr, gender ,ngaySinh, salary);
            NguoiDungDAO ndDAO = new NguoiDungDAO();
            nv.chuanHoa(name);
            
            int userID = ndDAO.addNguoiDung(nv);
            
            nv.setUserID(userID);
            
            NhanVienDAO nvDAO = new NhanVienDAO();
            nvDAO.addNhanVien(nv);
            
            TaiKhoan tk = new TaiKhoan(tel, nv.getMaNV().toLowerCase(), "nhanvien", true, nv);
            
            tkDAO.createAccount(tk);
            
            txtName.setText("");
            txtDOB.setText("");
            txtTel.setText("");
            txtSalary.setText("");
            txtaAddress.setText("");
            rdioF.setSelected(false);
            rdioM.setSelected(false);
            
            JOptionPane.showMessageDialog(this, "Thêm nhân viên thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            reloadDataNVTab();
            
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "Lương không hợp lệ", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private void mainTabbedPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_mainTabbedPaneStateChanged
        int index = mainTabbedPane.getSelectedIndex();
        switch(index){
            case 0:
                reloadDataNVTab();
                break;
            case 1:
                ((pnPhanCongCaLam) mainTabbedPane.getComponent(1)).reloadPhanCongData();
                break;
        }
    }//GEN-LAST:event_mainTabbedPaneStateChanged

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int selectedNV = tblNhanVien.getSelectedRow();
        if(selectedNV == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần xoá", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            
        }
        else{
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá nhân viên này không?", "Hệ thống", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                String maNV = String.valueOf(tblNhanVien.getValueAt(selectedNV, 0));
                String tenDangNhap = String.valueOf(tblNhanVien.getValueAt(selectedNV, 6));
                NhanVien nv = new NhanVien();
                nv.setMaNV(maNV);
                TaiKhoan tk = new TaiKhoan();
                tk.setTenDangNhap(tenDangNhap);

                NhanVienDAO nvDAO = new NhanVienDAO();
                nvDAO.deleteNhanVien(nv);
                TaiKhoanDAO tkDAO = new TaiKhoanDAO();
                tkDAO.disableAccount(tk);
                
                JOptionPane.showMessageDialog(this, "Xoá thành công", "Hệ thống",  JOptionPane.INFORMATION_MESSAGE);
                reloadDataNVTab();
            }
            
        }
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int selectedRow = tblNhanVien.getSelectedRow();
        if(selectedRow == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần sửa", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
        }else{
            String name = tblNhanVien.getValueAt(selectedRow, 1).toString();
            String ngaySinh = tblNhanVien.getValueAt(selectedRow, 2).toString();
            String tel = tblNhanVien.getValueAt(selectedRow, 4).toString();
            Double salary = Double.valueOf(tblNhanVien.getValueAt(selectedRow, 8).toString());
            String gender = tblNhanVien.getValueAt(selectedRow, 3).toString();
            String address = tblNhanVien.getValueAt(selectedRow, 5).toString();
            String state = tblNhanVien.getValueAt(selectedRow, 7).toString();
            String maNV = tblNhanVien.getValueAt(selectedRow, 0).toString();
            this.currentUserID = (int) tblNhanVien.getValueAt(selectedRow, 9);
            LocalDate dateISO = LocalDate.parse(ngaySinh);
            String ngaySinhFmt = dateISO.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            
            txtName.setText(name);
            txtDOB.setText(ngaySinhFmt);
            txtSalary.setText(salary.toString());
            txtTel.setText(tel);
            txtaAddress.setText(address);
            txtMa.setText(maNV);
            
            if(gender.equals("Nam")) rdioM.setSelected(true);
            else if(gender.equals("Nữ")) rdioF.setSelected(true);
            
            if(state.equals("Đang làm")) cbbState.setSelectedIndex(0);
            else if(state.equals("Đã nghỉ việc")) cbbState.setSelectedIndex(1);
            cbbState.setEnabled(true);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String maNV = txtMa.getText();
            String name = txtName.getText().trim();
            String tel = txtTel.getText().trim();
            String dob = txtDOB.getText().trim();
            LocalDate ngaySinh = null;
            Double salary = Double.valueOf(txtSalary.getText().trim());
            String addr = txtaAddress.getText().trim();
            String gender = rdioF.isSelected() ? "Nữ" : rdioM.isSelected() ? "Nam" : "";
            int active = cbbState.getSelectedIndex() == 0 ? 3 : 2; // đang làm hoặc đình chỉ
                    
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền tên nhân viên", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if(tel.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền SĐT", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else if(gender.equals("")){
                JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }          
            else if(addr.isEmpty()){
                JOptionPane.showMessageDialog(this, "Vui lòng điền địa chỉ", "NUKE", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else{
                try {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/uuuu")
                                                .withResolverStyle(ResolverStyle.STRICT);
                    ngaySinh = LocalDate.parse(dob, fmt);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(this, "Ngày sinh không hợp lệ, dùng định dạng dd/mm/yyyy", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }          
            
            NhanVienDAO nvDAO = new NhanVienDAO();
            NhanVien nv = new NhanVien(name, tel, addr, gender, ngaySinh, salary);
            nv.setTrangThai(active);
            nv.setMaNV(maNV);
            nv.setUserID(this.currentUserID);
            
            nvDAO.updateNhanVien(nv);
            
            NguoiDungDAO ndDAO = new NguoiDungDAO();
            ndDAO.updateNguoiDung(nv);
            
            TaiKhoan tk = new TaiKhoan();
            tk.setTenDangNhap(tel);
            boolean tkActive = active == 3;
            tk.setIsActive(tkActive);
            tk.setNguoiDung(nv);
            TaiKhoanDAO tkDAO = new TaiKhoanDAO();
            tkDAO.updateAccount(tk);
            
            JOptionPane.showMessageDialog(this, "Lưu thay đổi thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            reloadDataNVTab();
            cbbState.setEnabled(false);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Lương không hợp lệ", "Cảnh báo", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    public void reloadDataNVTab(){
        NhanVienDAO nvDAO = new NhanVienDAO();
        this.arr = nvDAO.getAllNhanVien_full();
        this.tbModel = (DefaultTableModel) tblNhanVien.getModel();
        //reset table, add tbmodel moi cho bang nhan vien
        tbModel.setRowCount(0);
        
        for(NhanVienFullDTO nvfull : arr){
            String conLam = nvfull.getNv().getTrangThai() == 3 ? "Đang làm" : nvfull.getNv().getTrangThai() == 2 ? "Đã nghỉ việc" : "";
            
            tbModel.addRow( new Object[] {
                nvfull.getNv().getMaNV(),
                nvfull.getNv().getHoTen(),
                nvfull.getNv().getNgaySinh(),
                nvfull.getNv().getGender(),
                nvfull.getNv().getTel(),
                nvfull.getNv().getAddress(),
                nvfull.getTk().getTenDangNhap(),
                conLam,
                nvfull.getNv().getSalary(),
                nvfull.getNv().getUserID()
            });
        }
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(tbModel);

    // Nếu muốn sort cột Lương (index = 8) theo số:
    sorter.setComparator(8, Comparator.comparingDouble(Double::doubleValue));
    

    tblNhanVien.setRowSorter(sorter);
    tblNhanVien.getColumnModel().getColumn(9).setMinWidth(0);
    tblNhanVien.getColumnModel().getColumn(9).setMaxWidth(0);
    tblNhanVien.getColumnModel().getColumn(9).setWidth(0);
        tblNhanVien.setModel(tbModel);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbbState;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane mainTabbedPane;
    private javax.swing.JPanel pnTabbedQLNV;
    private javax.swing.JPanel pnTool;
    private javax.swing.JRadioButton rdioF;
    private javax.swing.JRadioButton rdioM;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextArea txtaAddress;
    // End of variables declaration//GEN-END:variables
}
