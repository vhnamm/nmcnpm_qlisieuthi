
package qlsieuthi_nmcnpm.view;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.io.File;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import qlsieuthi_nmcnpm.DAO.CategoryDAO;
import qlsieuthi_nmcnpm.DAO.ProductDAO;
import qlsieuthi_nmcnpm.helper.ImageConvert;
import qlsieuthi_nmcnpm.helper.ThousandSeperator;
import qlsieuthi_nmcnpm.models.Category;
import qlsieuthi_nmcnpm.models.Product;

public class pnProduct extends javax.swing.JPanel {
    private DefaultTableModel tbModel;
    private Map<String, byte[]> map = new HashMap<>();
    private boolean isEdit = false;
    private DefaultComboBoxModel<Category> cbbCateModel;
    public pnProduct() {
        initComponents();
        
        customizeTableHeader();
        dialogProduct.setLocationRelativeTo(null);
        dialogProduct.addWindowListener(new java.awt.event.WindowAdapter() {
        @Override
        public void windowClosing(java.awt.event.WindowEvent e) {
           resetForm();
        }
    });
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
        lbTitle = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUnit = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtImportAvrg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtQuan = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        radioOn = new javax.swing.JRadioButton();
        radioOff = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDesc = new javax.swing.JTextArea();
        btnChoseImg = new javax.swing.JButton();
        pnImage = new javax.swing.JPanel();
        lbImage = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        cbbCate = new javax.swing.JComboBox<>();
        btnAddCate = new javax.swing.JButton();
        radioGroup = new javax.swing.ButtonGroup();
        dialogAddCate = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCategory = new javax.swing.JTextField();
        btnCancelCate = new javax.swing.JButton();
        btnSaveCate = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnModify = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        txtFind = new javax.swing.JTextField();
        btnFind = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbProducts = new javax.swing.JTable();

        dialogProduct.setMinimumSize(new java.awt.Dimension(1187, 719));
        dialogProduct.setModal(true);
        dialogProduct.getContentPane().setLayout(null);

        jPanel2.setBackground(new Color(61, 74, 89));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(255, 255, 255));
        lbTitle.setText("Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(524, 524, 524)
                .addComponent(lbTitle)
                .addContainerGap(564, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lbTitle)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        dialogProduct.getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 1200, 67);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new Color(61, 74, 89)
        );
        jLabel2.setText("Tên sản phẩm");
        dialogProduct.getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 110, 108, 20);

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtName);
        txtName.setBounds(310, 100, 220, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new Color(61, 74, 89)
        );
        jLabel3.setText("Loại mặt hàng");
        dialogProduct.getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 170, 108, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new Color(61, 74, 89)
        );
        jLabel4.setText("Đơn vị tính");
        dialogProduct.getContentPane().add(jLabel4);
        jLabel4.setBounds(180, 230, 88, 20);

        txtUnit.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtUnit);
        txtUnit.setBounds(300, 220, 157, 30);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new Color(61, 74, 89)
        );
        jLabel5.setText("Giá nhập trung bình");
        dialogProduct.getContentPane().add(jLabel5);
        jLabel5.setBounds(180, 300, 140, 20);

        txtImportAvrg.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtImportAvrg.setText("0");
        txtImportAvrg.setEnabled(false);
        dialogProduct.getContentPane().add(txtImportAvrg);
        txtImportAvrg.setBounds(340, 300, 137, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setText("vnđ");
        dialogProduct.getContentPane().add(jLabel6);
        jLabel6.setBounds(480, 310, 30, 18);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new Color(61, 74, 89)
        );
        jLabel7.setText("Giá bán");
        dialogProduct.getContentPane().add(jLabel7);
        jLabel7.setBounds(180, 360, 51, 20);

        txtPrice.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        dialogProduct.getContentPane().add(txtPrice);
        txtPrice.setBounds(260, 350, 175, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setText("vnđ");
        dialogProduct.getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 360, 30, 18);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new Color(61, 74, 89)
        );
        jLabel9.setText("Số lượng tồn");
        dialogProduct.getContentPane().add(jLabel9);
        jLabel9.setBounds(180, 430, 100, 20);

        txtQuan.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtQuan.setText("0");
        txtQuan.setEnabled(false);
        dialogProduct.getContentPane().add(txtQuan);
        txtQuan.setBounds(280, 430, 106, 24);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new Color(61, 74, 89)
        );
        jLabel10.setText("Tình trạng");
        dialogProduct.getContentPane().add(jLabel10);
        jLabel10.setBounds(570, 400, 80, 20);

        radioGroup.add(radioOn);
        radioOn.setText("Đang kinh doanh");
        dialogProduct.getContentPane().add(radioOn);
        radioOn.setBounds(420, 430, 125, 21);

        radioGroup.add(radioOff);
        radioOff.setText("Đã ngừng bán");
        dialogProduct.getContentPane().add(radioOff);
        radioOff.setBounds(550, 430, 110, 21);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new Color(61, 74, 89)
        );
        jLabel11.setText("Mô tả sản phẩm");
        dialogProduct.getContentPane().add(jLabel11);
        jLabel11.setBounds(180, 500, 107, 20);

        txtDesc.setColumns(20);
        txtDesc.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        txtDesc.setLineWrap(true);
        txtDesc.setRows(5);
        txtDesc.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txtDesc);

        dialogProduct.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(180, 530, 273, 75);

        btnChoseImg.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnChoseImg.setText("Chọn ảnh");
        btnChoseImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChoseImgActionPerformed(evt);
            }
        });
        dialogProduct.getContentPane().add(btnChoseImg);
        btnChoseImg.setBounds(890, 410, 121, 42);

        pnImage.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnImageLayout = new javax.swing.GroupLayout(pnImage);
        pnImage.setLayout(pnImageLayout);
        pnImageLayout.setHorizontalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
        );
        pnImageLayout.setVerticalGroup(
            pnImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbImage, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
        );

        lbImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbImage.setVerticalAlignment(javax.swing.SwingConstants.CENTER);

        dialogProduct.getContentPane().add(pnImage);
        pnImage.setBounds(830, 120, 240, 260);

        btnSave.setText("Thêm sản phẩm");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        dialogProduct.getContentPane().add(btnSave);
        btnSave.setBounds(980, 580, 120, 40);
        btnSave.addActionListener((evt) -> {
            if(!isEdit){
                btnSaveNewActionPerformed(evt);
            }
            else{
                btnSaveModifyActionPerformed(evt);
            }
        });

        btnCancel.setText("Huỷ");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        dialogProduct.getContentPane().add(btnCancel);
        btnCancel.setBounds(840, 580, 100, 40);
        dialogProduct.getContentPane().add(cbbCate);
        cbbCate.setBounds(310, 160, 180, 30);

        btnAddCate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnAddCate.setText("Thêm loại");
        btnAddCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCateActionPerformed(evt);
            }
        });
        dialogProduct.getContentPane().add(btnAddCate);
        btnAddCate.setBounds(520, 160, 90, 30);

        dialogProduct.setLocationRelativeTo(null);

        dialogAddCate.setMinimumSize(new java.awt.Dimension(432, 308));
        dialogAddCate.setModal(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Thêm danh mục");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("Tên danh mục");

        txtCategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnCancelCate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnCancelCate.setText("Huỷ");
        btnCancelCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelCateActionPerformed(evt);
            }
        });

        btnSaveCate.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSaveCate.setText("Lưu");
        btnSaveCate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveCateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dialogAddCateLayout = new javax.swing.GroupLayout(dialogAddCate.getContentPane());
        dialogAddCate.getContentPane().setLayout(dialogAddCateLayout);
        dialogAddCateLayout.setHorizontalGroup(
            dialogAddCateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddCateLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(dialogAddCateLayout.createSequentialGroup()
                .addGroup(dialogAddCateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dialogAddCateLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(btnCancelCate, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnSaveCate, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(dialogAddCateLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        dialogAddCateLayout.setVerticalGroup(
            dialogAddCateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogAddCateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(66, 66, 66)
                .addGroup(dialogAddCateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addGroup(dialogAddCateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnCancelCate, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addComponent(btnSaveCate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(55, 55, 55))
        );

        dialogAddCate.setLocationRelativeTo(dialogProduct);

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
        btnModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModifyActionPerformed(evt);
            }
        });
        jPanel1.add(btnModify);
        btnModify.setBounds(150, 10, 110, 40);

        btnDelete.setText("Xoá");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
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

        tbProducts.setAutoCreateRowSorter(true);
        tbProducts.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProducts.setGridColor(new java.awt.Color(255, 255, 255));
        tbProducts.setRowHeight(30);
        tbProducts.setSelectionBackground(new java.awt.Color(46, 155, 112));
        tbProducts.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tbProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 647, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        isEdit = false;
        radioOn.setEnabled(false);
        radioOn.setSelected(true);
        radioOff.setEnabled(false);
        lbTitle.setText("Thêm mới sản phẩm");
        dialogProduct.setVisible(true);

    }//GEN-LAST:event_btnAddActionPerformed

    private void btnChoseImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChoseImgActionPerformed
        JFileChooser fileChooser = new JFileChooser("E:\\NMCNPM_btl\\nmcnpm_qlisieuthi\\images");
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter(".jpg, .png", "jpg", "png");
        fileChooser.setFileFilter(imgFilter);
        fileChooser.setMultiSelectionEnabled(false);
        
        int choice = fileChooser.showDialog(dialogProduct, "Chọn ảnh sản phẩm");
        if (choice == JFileChooser.APPROVE_OPTION){
            File f = fileChooser.getSelectedFile();
            ImageIcon img = new ImageIcon(f.getAbsolutePath());
            int imageWidth = pnImage.getWidth();
            int imageHeight = pnImage.getHeight();
            Image scaled = img.getImage().getScaledInstance(imageWidth, imageHeight, Image.SCALE_SMOOTH);
            lbImage.setIcon(new ImageIcon(scaled));
        }
    }//GEN-LAST:event_btnChoseImgActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        resetForm();
    }//GEN-LAST:event_btnCancelActionPerformed
    private void btnSaveModifyActionPerformed(java.awt.event.ActionEvent evt){
        try {
            String name = txtName.getText().trim();
            String desc = txtDesc.getText().trim();
            String unit = txtUnit.getText().trim();
           
            int state = radioOn.isSelected() ? 2 : 1;
            
            double sellPrice = Double.parseDouble(txtPrice.getText());
            if(sellPrice <= 0) throw new NumberFormatException();
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(dialogProduct, "Vui lòng nhập tên sản phẩm", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                return;
            }else if(unit.isEmpty()){
                JOptionPane.showMessageDialog(dialogProduct, "Vui lòng nhập đơn vị tính", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            ImageIcon prodImgIcon = (ImageIcon) lbImage.getIcon();
            if(prodImgIcon == null){
                JOptionPane.showMessageDialog(dialogProduct, "Vui lòng chọn ảnh sản phẩm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            //chuyen Image sang byte[] de luu vao database
            byte[] prodImgBytes = ImageConvert.getImageToByte(prodImgIcon);
            int categoryID = ((Category) cbbCate.getSelectedItem()).getId();
            String categoryName = ((Category) cbbCate.getSelectedItem()).getCategoryName();
            
            Product prod = new Product(name, unit, categoryID, desc, 0 ,0 , sellPrice, state, prodImgBytes);

            
            //Khi bật 1 Jdialog lên thì SelectedRow mà chúng ta chọn khi bấm Sửa vẫn sẽ luu
            
            int rowSelected = tbProducts.getSelectedRow();
            String codes = tbProducts.getValueAt(rowSelected, 0).toString();
            prod.setCodes(codes);
            ProductDAO prodDAO = new ProductDAO();
            prodDAO.updateProduct(prod);
            
            //cap nhat lai view
            tbProducts.setValueAt(name, rowSelected, 1);
            tbProducts.setValueAt(desc, rowSelected, 2);
            tbProducts.setValueAt(categoryName, rowSelected, 3);
            tbProducts.setValueAt(unit, rowSelected, 4);
            tbProducts.setValueAt(sellPrice, rowSelected, 7);
            String trangThai = state == 2 ? "Đang kinh doanh": "Đã ngừng bán";
            
            tbProducts.setValueAt(trangThai, rowSelected, 8);
            map.forEach((code, imgBytes) -> {
                if(code.equals(codes)){
                    map.replace(code, prodImgBytes);
                }
            });
            JOptionPane.showMessageDialog(dialogProduct, "Đã lưu thay đổi!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
            resetForm();
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(dialogProduct, "Giá bán không hợp lệ", "Hệ thống", JOptionPane.WARNING_MESSAGE);
        }
    }
    private void btnSaveNewActionPerformed(java.awt.event.ActionEvent evt){
        try {
            String name = txtName.getText().trim();
            String desc = txtDesc.getText().trim();
            String unit = txtUnit.getText().trim();
           
            
            double sellPrice = Double.parseDouble(txtPrice.getText());
            if(sellPrice <= 0) throw new NumberFormatException();
            if(name.isEmpty()){
                JOptionPane.showMessageDialog(dialogProduct, "Vui lòng nhập tên sản phẩm", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                return;
            }else if(unit.isEmpty()){
                JOptionPane.showMessageDialog(dialogProduct, "Vui lòng nhập đơn vị tính", "Hệ thống", JOptionPane.WARNING_MESSAGE);
                return;
            }
            
            
            ImageIcon prodImgIcon = (ImageIcon) lbImage.getIcon();
            //chuyen Image sang byte[] de luu vao database
            
            if(prodImgIcon == null){
                JOptionPane.showMessageDialog(dialogProduct, "Vui lòng chọn ảnh sản phẩm", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
            byte[] prodImgBytes = ImageConvert.getImageToByte(prodImgIcon);
            int categoryID = ((Category)cbbCate.getSelectedItem()).getId();
            Product prod = new Product(name, unit, categoryID, desc, 0, 0, sellPrice, 2, prodImgBytes); // sửa thành lấy data từ Combobox Category
            ProductDAO prodDAO = new ProductDAO();
            boolean ok = prodDAO.addProduct(prod);
            
            if(!ok){
                JOptionPane.showMessageDialog(dialogProduct, "Da ton tai san pham", "He thong", JOptionPane.WARNING_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(dialogProduct, "Thêm sản phẩm thành công!", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                resetForm();
                reloadData();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(dialogProduct, "Giá bán không hợp lệ", "Hệ thống", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    private void btnModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModifyActionPerformed
        int row = tbProducts.getSelectedRow();
        isEdit = true;
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sản phẩm cần sửa", "Hệ thống", JOptionPane.WARNING_MESSAGE);
        }else{
            String name = tbProducts.getValueAt(row, 1).toString();
            String codes = tbProducts.getValueAt(row, 0).toString();
            String des = tbProducts.getValueAt(row, 2).toString();
            String cate = tbProducts.getValueAt(row, 3).toString();
            String unit = tbProducts.getValueAt(row, 4).toString();
            String quan = tbProducts.getValueAt(row, 5).toString();
            String importPrice = tbProducts.getValueAt(row, 6).toString();
            double sell = Double.parseDouble(tbProducts.getValueAt(row, 7).toString()) ;
            String state = tbProducts.getValueAt(row, 8).toString();
            
            lbTitle.setText("Sửa sản phẩm");
            btnSave.setText("Lưu");
            txtName.setText(name);
            txtDesc.setText(des);
            
            for(int i=0; i<cbbCate.getItemCount(); i++){
                Category cat = cbbCate.getItemAt(i);
                
                if(cat.getCategoryName().equals(cate)){
                    cbbCate.setSelectedIndex(i);
                    break;
                }
            }
            txtImportAvrg.setText(importPrice);
            txtPrice.setText(String.format("%.0f", sell));
            txtQuan.setText(quan);
            txtUnit.setText(unit);
            radioOn.setEnabled(true);
            radioOff.setEnabled(true);
            
            
            if (state.equals("Đang kinh doanh")) {
                radioOn.setSelected(true);
            }else if(state.equals("Đã ngừng bán")){
                radioOff.setSelected(true);
            }
            
            
            map.forEach((code, imgBytes) -> {
                if(code.equals(codes)){
                    ImageIcon imgIcon = new ImageIcon(imgBytes);
                    lbImage.setIcon(imgIcon);
                }
            });
            
            dialogProduct.setVisible(true);
        }
    }//GEN-LAST:event_btnModifyActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

        int row = tbProducts.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(this, "Vui lòng chọn nhân viên cần xoá", "Hệ thống", JOptionPane.WARNING_MESSAGE);
            
        }else{
            int choice = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn xoá sản phẩm này?", "Hệ thống", JOptionPane.YES_NO_OPTION);
            if(choice == JOptionPane.YES_OPTION){
                String codes = tbProducts.getValueAt(row, 0).toString();
                Product prod = new Product();
                prod.setCodes(codes);
                ProductDAO prodDAO = new ProductDAO();
                prodDAO.deleteProduct(prod);
                
                // xoá ở view
                tbModel.removeRow(row);
                for(Map.Entry<String, byte[]> entry : map.entrySet()){
                    if(codes.equals(entry.getKey())){
                        map.remove(entry.getKey());
                        break;
                    }
                }
                JOptionPane.showMessageDialog(this, "Xoá sản phẩm thành công", "Hệ thống", JOptionPane.INFORMATION_MESSAGE);
                
            }
            
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCateActionPerformed
        dialogAddCate.setVisible(true);
    }//GEN-LAST:event_btnAddCateActionPerformed

    private void btnCancelCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelCateActionPerformed
        dialogAddCate.setVisible(false);
        txtCategory.setText("");
    }//GEN-LAST:event_btnCancelCateActionPerformed

    private void btnSaveCateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveCateActionPerformed
        String cateName = txtCategory.getText().trim();
        if(cateName.isEmpty()){
            JOptionPane.showMessageDialog(dialogAddCate, "Ten danh muc khong duoc trong");
            return;
        }
        Category cate = new Category(cateName);
        CategoryDAO categoryDAO = new CategoryDAO();
        categoryDAO.addCategory(cate);
        initCategory();
        JOptionPane.showMessageDialog(dialogAddCate, "Them danh muc thanh cong!");
        dialogAddCate.setVisible(false);
        txtCategory.setText("");
    }//GEN-LAST:event_btnSaveCateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSaveActionPerformed
    
    public void reloadData(){
        tbModel = (DefaultTableModel)tbProducts.getModel();
        ProductDAO productDAO = new ProductDAO();
        List<Product> list = productDAO.getAllProducts();
        tbModel.setRowCount(0);
        map.clear();
        
        for(Product prod : list){
            String state = prod.getState() == 2 ? "Đang kinh doanh" : "Đã ngừng bán";
            
            tbModel.addRow(new Object[]{
                prod.getCodes(),
                prod.getName(),
                prod.getDesc(),
                prod.getCategoryName(),
                prod.getUnit(),
                prod.getStoreQuantity(),
                prod.getImportAvrg(),
                prod.getSellPrice(),
                state
            });
            
            map.put( prod.getCodes(), prod.getImg());
        }
        
        tbProducts.setModel(tbModel);
        tbProducts.getColumnModel().getColumn(7).setCellRenderer(new ThousandSeperator());
        tbProducts.getColumnModel().getColumn(6).setCellRenderer(new ThousandSeperator());
    }
    
    public void initCategory(){
        cbbCateModel  = (DefaultComboBoxModel) cbbCate.getModel();
        cbbCateModel.removeAllElements();
        CategoryDAO cateDAO = new CategoryDAO();
        
        for(Category category: cateDAO.getAllCategories()){
            cbbCateModel.addElement(category);
        }
    }
    public void resetForm(){
        txtName.setText("");
        
        txtDesc.setText("");
        txtPrice.setText("");
        txtUnit.setText("");
        txtImportAvrg.setText("0");
        txtQuan.setText("0");
        radioOff.setSelected(false);
        radioOn.setSelected(false);
        radioOn.setEnabled(false);
        radioOff.setEnabled(false);
        dialogProduct.setVisible(false);
        lbImage.setIcon(null);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAddCate;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCancelCate;
    private javax.swing.JButton btnChoseImg;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnModify;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveCate;
    private javax.swing.JComboBox<Category> cbbCate;
    private javax.swing.JDialog dialogAddCate;
    private javax.swing.JDialog dialogProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbImage;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel pnImage;
    private javax.swing.ButtonGroup radioGroup;
    private javax.swing.JRadioButton radioOff;
    private javax.swing.JRadioButton radioOn;
    private javax.swing.JTable tbProducts;
    private javax.swing.JTextField txtCategory;
    private javax.swing.JTextArea txtDesc;
    private javax.swing.JTextField txtFind;
    private javax.swing.JTextField txtImportAvrg;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtQuan;
    private javax.swing.JTextField txtUnit;
    // End of variables declaration//GEN-END:variables
}
