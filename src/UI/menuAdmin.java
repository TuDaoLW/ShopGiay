package UI;

import entity.DB;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class menuAdmin extends javax.swing.JFrame {

    public menuAdmin() {
        initComponents();
        cards = (CardLayout) pnlCenter.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        bt_hang = new javax.swing.JButton();
        bt_taohoadon = new javax.swing.JButton();
        bt_nvien = new javax.swing.JButton();
        bt_doanhthu = new javax.swing.JButton();
        bt_taikhoan = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlHH = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt_addHH = new javax.swing.JButton();
        bt_suaHH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        bt_timhang = new javax.swing.JButton();
        pnlTHD = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        addHDhead = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        addHDCenter = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField5 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        pnlNV = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        bt_addNV = new javax.swing.JButton();
        bt_suaNV = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        soNV = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        timnv = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        pnlDT = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        pnl_DT_Center = new javax.swing.JPanel();
        pnl_DT_DSHD = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btXemDSHD = new javax.swing.JButton();
        pnl_DT_ThongKe = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        btXemDoanhSo = new javax.swing.JButton();
        pnlTK = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        dshd = new javax.swing.JPanel();
        doanhso = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BANH GIAY");
        setLocation(new java.awt.Point(100, 50));
        getContentPane().setLayout(new java.awt.BorderLayout(2, 0));

        pnlSide.setBackground(new java.awt.Color(102, 102, 255));
        pnlSide.setPreferredSize(new java.awt.Dimension(170, 500));
        pnlSide.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 4));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel19.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pnlSide.add(jPanel1);

        bt_hang.setBackground(new java.awt.Color(102, 51, 255));
        bt_hang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_hang.setForeground(new java.awt.Color(255, 255, 255));
        bt_hang.setText("HÀNG HÓA");
        bt_hang.setBorder(null);
        bt_hang.setFocusPainted(false);
        bt_hang.setPreferredSize(new java.awt.Dimension(150, 45));
        bt_hang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_hangMousePressed(evt);
            }
        });
        bt_hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hangActionPerformed(evt);
            }
        });
        pnlSide.add(bt_hang);

        bt_taohoadon.setBackground(new java.awt.Color(102, 51, 255));
        bt_taohoadon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_taohoadon.setForeground(new java.awt.Color(255, 255, 255));
        bt_taohoadon.setText("TẠO HÓA ĐƠN");
        bt_taohoadon.setBorder(null);
        bt_taohoadon.setFocusPainted(false);
        bt_taohoadon.setPreferredSize(new java.awt.Dimension(150, 45));
        bt_taohoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_taohoadonMousePressed(evt);
            }
        });
        bt_taohoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_taohoadonActionPerformed(evt);
            }
        });
        pnlSide.add(bt_taohoadon);

        bt_nvien.setBackground(new java.awt.Color(102, 51, 255));
        bt_nvien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_nvien.setForeground(new java.awt.Color(255, 255, 255));
        bt_nvien.setText("NHÂN VIÊN");
        bt_nvien.setBorder(null);
        bt_nvien.setFocusPainted(false);
        bt_nvien.setPreferredSize(new java.awt.Dimension(150, 45));
        bt_nvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_nvienMousePressed(evt);
            }
        });
        bt_nvien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_nvienActionPerformed(evt);
            }
        });
        pnlSide.add(bt_nvien);

        bt_doanhthu.setBackground(new java.awt.Color(102, 51, 255));
        bt_doanhthu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_doanhthu.setForeground(new java.awt.Color(255, 255, 255));
        bt_doanhthu.setText("DOANH THU");
        bt_doanhthu.setBorder(null);
        bt_doanhthu.setFocusPainted(false);
        bt_doanhthu.setPreferredSize(new java.awt.Dimension(150, 45));
        bt_doanhthu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_doanhthuMousePressed(evt);
            }
        });
        bt_doanhthu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_doanhthuActionPerformed(evt);
            }
        });
        pnlSide.add(bt_doanhthu);

        bt_taikhoan.setBackground(new java.awt.Color(102, 51, 255));
        bt_taikhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bt_taikhoan.setForeground(new java.awt.Color(255, 255, 255));
        bt_taikhoan.setText("TÀI KHOẢN");
        bt_taikhoan.setBorder(null);
        bt_taikhoan.setFocusPainted(false);
        bt_taikhoan.setPreferredSize(new java.awt.Dimension(150, 45));
        bt_taikhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_taikhoanMousePressed(evt);
            }
        });
        bt_taikhoan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_taikhoanActionPerformed(evt);
            }
        });
        pnlSide.add(bt_taikhoan);

        getContentPane().add(pnlSide, java.awt.BorderLayout.WEST);

        pnlCenter.setBackground(new java.awt.Color(204, 204, 255));
        pnlCenter.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlCenter.setLayout(new java.awt.CardLayout());

        pnlHH.setBackground(new java.awt.Color(255, 255, 255));
        pnlHH.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlHH.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 65));
        jPanel3.setLayout(new java.awt.GridLayout(1, 0));

        bt_addHH.setBackground(new java.awt.Color(204, 204, 204));
        bt_addHH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_addHH.setText("Thêm Hàng Hóa");
        bt_addHH.setPreferredSize(new java.awt.Dimension(80, 30));
        bt_addHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addHHActionPerformed(evt);
            }
        });
        jPanel3.add(bt_addHH);

        bt_suaHH.setBackground(new java.awt.Color(204, 204, 204));
        bt_suaHH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_suaHH.setText("Sửa Đổi");
        bt_suaHH.setPreferredSize(new java.awt.Dimension(80, 30));
        bt_suaHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaHHActionPerformed(evt);
            }
        });
        jPanel3.add(bt_suaHH);

        pnlHH.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(630, 340));

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setGridColor(new java.awt.Color(240, 240, 240));
        jTable1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable1.setPreferredSize(new java.awt.Dimension(630, 380));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.setShowGrid(true);
        jScrollPane1.setViewportView(jTable1);

        pnlHH.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(630, 110));
        jPanel8.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TỔNG SỐ MẶT HÀNG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("20");

        jLabel14.setText("Mã mặt hàng");

        bt_timhang.setText("Tìm Kiếm");
        bt_timhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timhangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bt_timhang))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_timhang))
                .addContainerGap())
        );

        pnlHH.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        pnlCenter.add(pnlHH, "cardHH");

        pnlTHD.setBackground(new java.awt.Color(255, 255, 255));
        pnlTHD.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlTHD.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        addHDhead.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        addHDhead.setPreferredSize(new java.awt.Dimension(440, 80));

        jLabel3.setText("Người tạo:");

        jLabel4.setText("Khách hàng:");

        jLabel5.setText("SĐT:");

        jTextField2.setText("unknown");

        jTextField3.setText("unknown");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Thời gian:");

        jLabel12.setText("24/01/2024");

        javax.swing.GroupLayout addHDheadLayout = new javax.swing.GroupLayout(addHDhead);
        addHDhead.setLayout(addHDheadLayout);
        addHDheadLayout.setHorizontalGroup(
            addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addHDheadLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(addHDheadLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addGroup(addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(80, 80, 80))
        );
        addHDheadLayout.setVerticalGroup(
            addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addHDheadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addHDheadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.add(addHDhead, java.awt.BorderLayout.PAGE_START);

        addHDCenter.setLayout(new java.awt.BorderLayout());

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));
        jPanel7.setPreferredSize(new java.awt.Dimension(440, 65));
        jPanel7.setRequestFocusEnabled(false);

        jLabel6.setText("Chọn mặt hàng");

        jLabel13.setText("Số lượng");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField5.setText("1");
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });

        jButton1.setText("Thêm Vào Giỏ");

        jLabel15.setText("Size");

        jTextField6.setText("42");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(35, 35, 35)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(40, 40, 40))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 15, Short.MAX_VALUE))
        );

        addHDCenter.add(jPanel7, java.awt.BorderLayout.PAGE_START);

        jPanel9.setPreferredSize(new java.awt.Dimension(440, 60));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Tổng Cộng:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("9999");

        jButton2.setText("Xác Nhận");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Xóa");
        jButton3.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Hủy Bỏ");
        jButton4.setPreferredSize(new java.awt.Dimension(80, 25));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("vnđ");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addGap(50, 50, 50)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel16)
                        .addComponent(jLabel18)
                        .addComponent(jLabel20))
                    .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addHDCenter.add(jPanel9, java.awt.BorderLayout.PAGE_END);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(410, 257));

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setPreferredSize(new java.awt.Dimension(440, 435));

        jTable3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sản phẩm", "Tên sản phẩm", "Số lượng", "Đơn giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable3.setGridColor(new java.awt.Color(240, 240, 240));
        jTable3.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable3.setPreferredSize(new java.awt.Dimension(440, 435));
        jTable3.setRowHeight(20);
        jTable3.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable3.setShowGrid(true);
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        addHDCenter.add(jPanel14, java.awt.BorderLayout.CENTER);

        jPanel2.add(addHDCenter, java.awt.BorderLayout.CENTER);

        pnlTHD.add(jPanel2, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlTHD, "cardTHD");

        pnlNV.setBackground(new java.awt.Color(255, 255, 255));
        pnlNV.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlNV.setLayout(new java.awt.BorderLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel10.setPreferredSize(new java.awt.Dimension(630, 65));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        bt_addNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_addNV.setText("Thêm Nhân Viên");
        bt_addNV.setPreferredSize(new java.awt.Dimension(80, 30));
        bt_addNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addNVActionPerformed(evt);
            }
        });
        jPanel10.add(bt_addNV);

        bt_suaNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_suaNV.setText("Sửa Đổi");
        bt_suaNV.setPreferredSize(new java.awt.Dimension(80, 30));
        bt_suaNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaNVActionPerformed(evt);
            }
        });
        jPanel10.add(bt_suaNV);

        pnlNV.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(630, 380));

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8", "Title 9"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable4.setGridColor(new java.awt.Color(240, 240, 240));
        jTable4.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable4.setPreferredSize(new java.awt.Dimension(630, 380));
        jTable4.setRowHeight(30);
        jTable4.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable4.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable4.setShowGrid(true);
        jScrollPane4.setViewportView(jTable4);

        pnlNV.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(630, 110));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("SỐ NHÂN VIÊN");

        soNV.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        soNV.setText("20");

        jLabel17.setText("Tên nhân viên");

        jButton13.setText("Tìm Kiếm");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(timnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(soNV)))
                .addContainerGap(314, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(soNV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(timnv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addContainerGap())
        );

        pnlNV.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        pnlCenter.add(pnlNV, "cardNV");

        pnlDT.setBackground(new java.awt.Color(255, 255, 255));
        pnlDT.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlDT.setLayout(new java.awt.BorderLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setPreferredSize(new java.awt.Dimension(630, 40));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlDT.add(jPanel12, java.awt.BorderLayout.PAGE_START);

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(630, 40));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        pnlDT.add(jPanel13, java.awt.BorderLayout.PAGE_END);

        pnl_DT_Center.setBackground(new java.awt.Color(255, 255, 255));
        pnl_DT_Center.setLayout(new java.awt.GridLayout(1, 0, 3, 3));

        pnl_DT_DSHD.setBackground(new java.awt.Color(204, 204, 255));
        pnl_DT_DSHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_DT_DSHDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_DT_DSHDMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("DANH SÁCH HÓA ĐƠN");

        btXemDSHD.setText("Chi Tiết");
        btXemDSHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemDSHDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DT_DSHDLayout = new javax.swing.GroupLayout(pnl_DT_DSHD);
        pnl_DT_DSHD.setLayout(pnl_DT_DSHDLayout);
        pnl_DT_DSHDLayout.setHorizontalGroup(
            pnl_DT_DSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_DSHDLayout.createSequentialGroup()
                .addGroup(pnl_DT_DSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DT_DSHDLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(pnl_DT_DSHDLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btXemDSHD)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        pnl_DT_DSHDLayout.setVerticalGroup(
            pnl_DT_DSHDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_DSHDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(btXemDSHD)
                .addGap(51, 51, 51))
        );

        pnl_DT_Center.add(pnl_DT_DSHD);

        pnl_DT_ThongKe.setBackground(new java.awt.Color(204, 204, 255));
        pnl_DT_ThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_DT_ThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_DT_ThongKeMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("THỐNG KÊ DOANH SỐ");

        btXemDoanhSo.setText("Chi Tiết");
        btXemDoanhSo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btXemDoanhSoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DT_ThongKeLayout = new javax.swing.GroupLayout(pnl_DT_ThongKe);
        pnl_DT_ThongKe.setLayout(pnl_DT_ThongKeLayout);
        pnl_DT_ThongKeLayout.setHorizontalGroup(
            pnl_DT_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_ThongKeLayout.createSequentialGroup()
                .addGroup(pnl_DT_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DT_ThongKeLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(pnl_DT_ThongKeLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btXemDoanhSo)))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        pnl_DT_ThongKeLayout.setVerticalGroup(
            pnl_DT_ThongKeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_ThongKeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(btXemDoanhSo)
                .addGap(51, 51, 51))
        );

        pnl_DT_Center.add(pnl_DT_ThongKe);

        pnlDT.add(pnl_DT_Center, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlDT, "cardDT");

        pnlTK.setBackground(new java.awt.Color(255, 255, 255));
        pnlTK.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlTK.setLayout(new java.awt.BorderLayout());

        jPanel4.setMaximumSize(new java.awt.Dimension(700, 500));
        jPanel4.setPreferredSize(new java.awt.Dimension(570, 440));
        jPanel4.setLayout(new java.awt.BorderLayout());

        jPanel17.setMaximumSize(new java.awt.Dimension(32767, 130));
        jPanel17.setPreferredSize(new java.awt.Dimension(570, 45));

        jLabel35.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel35.setText("THÔNG TIN TÀI KHOẢN");

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel35)
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addContainerGap())
        );

        jPanel4.add(jPanel17, java.awt.BorderLayout.NORTH);

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("jLabel21");

        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("jLabel21");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("jLabel21");

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("jLabel21");

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("jLabel21");

        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("jLabel21");

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("jLabel21");

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("jLabel21");

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("jLabel21");

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("jLabel21");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("jLabel21");

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("jLabel21");

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("jLabel21");

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("jLabel21");

        jButton5.setText("Đăng Xuất");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Đổi Mật Khẩu");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel28)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27)
                            .addComponent(jLabel24)
                            .addComponent(jLabel23)
                            .addComponent(jLabel21))
                        .addGap(144, 144, 144)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel32)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30)
                            .addComponent(jLabel29)
                            .addComponent(jLabel22)))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(33, 33, 33)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel34))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)))
                .addGap(33, 33, 33)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel18, java.awt.BorderLayout.CENTER);

        pnlTK.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(630, 30));
        jPanel5.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlTK.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(630, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        pnlTK.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(30, 370));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        pnlTK.add(jPanel15, java.awt.BorderLayout.LINE_END);

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(30, 370));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );

        pnlTK.add(jPanel16, java.awt.BorderLayout.LINE_START);

        pnlCenter.add(pnlTK, "cardTK");

        dshd.setPreferredSize(new java.awt.Dimension(630, 500));

        javax.swing.GroupLayout dshdLayout = new javax.swing.GroupLayout(dshd);
        dshd.setLayout(dshdLayout);
        dshdLayout.setHorizontalGroup(
            dshdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        dshdLayout.setVerticalGroup(
            dshdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlCenter.add(dshd, "cardHD");

        doanhso.setPreferredSize(new java.awt.Dimension(630, 500));

        javax.swing.GroupLayout doanhsoLayout = new javax.swing.GroupLayout(doanhso);
        doanhso.setLayout(doanhsoLayout);
        doanhsoLayout.setHorizontalGroup(
            doanhsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        doanhsoLayout.setVerticalGroup(
            doanhsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlCenter.add(doanhso, "cardDS");

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hangActionPerformed
        cards.show(pnlCenter, "cardHH");
        DB.getData("select * from");
    }//GEN-LAST:event_bt_hangActionPerformed

    private void bt_hangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_hangMousePressed
        bt_resetColor();
        bt_setColor(bt_hang);
    }//GEN-LAST:event_bt_hangMousePressed

    private void bt_taohoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_taohoadonMousePressed
        bt_resetColor();
        bt_setColor(bt_taohoadon);
    }//GEN-LAST:event_bt_taohoadonMousePressed

    private void bt_taohoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taohoadonActionPerformed
        cards.show(pnlCenter, "cardTHD");
    }//GEN-LAST:event_bt_taohoadonActionPerformed

    private void bt_nvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nvienActionPerformed
        cards.show(pnlCenter, "cardNV");
        updatetableNV();
    }//GEN-LAST:event_bt_nvienActionPerformed

    private void bt_doanhthuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_doanhthuMousePressed
        bt_resetColor();
        bt_setColor(bt_doanhthu);
    }//GEN-LAST:event_bt_doanhthuMousePressed

    private void bt_doanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doanhthuActionPerformed
        cards.show(pnlCenter, "cardDT");
    }//GEN-LAST:event_bt_doanhthuActionPerformed

    private void bt_nvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_nvienMousePressed
        bt_resetColor();
        bt_setColor(bt_nvien);
    }//GEN-LAST:event_bt_nvienMousePressed

    private void pnl_DT_DSHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_DSHDMouseEntered
        pn_setcolor(pnl_DT_DSHD);
    }//GEN-LAST:event_pnl_DT_DSHDMouseEntered

    private void pnl_DT_ThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_ThongKeMouseEntered
        pn_setcolor(pnl_DT_ThongKe);
    }//GEN-LAST:event_pnl_DT_ThongKeMouseEntered

    private void pnl_DT_DSHDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_DSHDMouseExited
        pn_resetcolor(pnl_DT_DSHD);
    }//GEN-LAST:event_pnl_DT_DSHDMouseExited

    private void pnl_DT_ThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_ThongKeMouseExited
        pn_resetcolor(pnl_DT_ThongKe);
    }//GEN-LAST:event_pnl_DT_ThongKeMouseExited

    private void btXemDSHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemDSHDActionPerformed
        cards.show(pnlCenter, "cardHD");
    }//GEN-LAST:event_btXemDSHDActionPerformed

    private void bt_addHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addHHActionPerformed
        new addHH().show();
    }//GEN-LAST:event_bt_addHHActionPerformed

    private void bt_suaHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaHHActionPerformed
        new editHH().show();
    }//GEN-LAST:event_bt_suaHHActionPerformed

    private void btXemDoanhSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemDoanhSoActionPerformed
        cards.show(pnlCenter, "cardDS");
    }//GEN-LAST:event_btXemDoanhSoActionPerformed

    private void bt_suaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaNVActionPerformed
        if (suaNV() == -1) {
            return;
        }
        new editNV().show();
    }//GEN-LAST:event_bt_suaNVActionPerformed

    private void bt_taikhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_taikhoanMousePressed
        bt_resetColor();
        bt_setColor(bt_taikhoan);
    }//GEN-LAST:event_bt_taikhoanMousePressed

    private void bt_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taikhoanActionPerformed
        cards.show(pnlCenter, "cardTK");
    }//GEN-LAST:event_bt_taikhoanActionPerformed

    private void bt_timhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timhangActionPerformed
        // Tim kiem theo ma mat hang
    }//GEN-LAST:event_bt_timhangActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(rootPane, "ok");// TODO add your handling code here

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

    }//GEN-LAST:event_jButton4ActionPerformed

    private void bt_addNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addNVActionPerformed
        new addNV().show();
    }//GEN-LAST:event_bt_addNVActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new LoginPane().show();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new doi_mat_khau().show();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // tim nhan vien
        DB.DisplayData(jTable4, "select * from dbo.NhanVien where Username like '%" + timnv.getText() + "%' ", 9);
    }//GEN-LAST:event_jButton13ActionPerformed
    //additional funtions
    void bt_setColor(JButton bt) {
        bt.setBackground(new Color(0, 153, 153));
    }

    void bt_resetColor() {
        bt_hang.setBackground(new Color(102, 51, 255));
        bt_taohoadon.setBackground(new Color(102, 51, 255));
        bt_doanhthu.setBackground(new Color(102, 51, 255));
        bt_nvien.setBackground(new Color(102, 51, 255));
        bt_taikhoan.setBackground(new Color(102, 51, 255));
    }

    void pn_setcolor(JPanel pn) {
        pn.setBackground(new Color(102, 102, 255));
    }

    void pn_resetcolor(JPanel pn) {
        pn.setBackground(new Color(204, 204, 255));
    }

    public static void updatetableNV() {
        ShopGiayMain.sonv = DB.DisplayData(jTable4, "select * from dbo.NhanVien ", 9);
        soNV.setText("" + ShopGiayMain.sonv);
    }

    public static int suaNV() {
        int row = jTable4.getSelectedRow();
        if (row < 0||jTable4.getValueAt(row, 0).equals("")) {
            JOptionPane.showMessageDialog(jTable4, "Hãy chọn đối tượng cần sửa");
            return -1;
        }
        for (int i = 0; i < 9; i++) {
            ShopGiayMain.suaNV[i] = (String) jTable4.getValueAt(row, i);
            System.out.println(ShopGiayMain.suaNV[i]);
        }
        return 0;
    }

    private CardLayout cards;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addHDCenter;
    private javax.swing.JPanel addHDhead;
    private javax.swing.JButton btXemDSHD;
    private javax.swing.JButton btXemDoanhSo;
    private javax.swing.JButton bt_addHH;
    private javax.swing.JButton bt_addNV;
    private javax.swing.JButton bt_doanhthu;
    private javax.swing.JButton bt_hang;
    private javax.swing.JButton bt_nvien;
    private javax.swing.JButton bt_suaHH;
    private javax.swing.JButton bt_suaNV;
    private javax.swing.JButton bt_taikhoan;
    private javax.swing.JButton bt_taohoadon;
    private javax.swing.JButton bt_timhang;
    private javax.swing.JPanel doanhso;
    private javax.swing.JPanel dshd;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable3;
    public static javax.swing.JTable jTable4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDT;
    private javax.swing.JPanel pnlHH;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTHD;
    private javax.swing.JPanel pnlTK;
    private javax.swing.JPanel pnl_DT_Center;
    private javax.swing.JPanel pnl_DT_DSHD;
    private javax.swing.JPanel pnl_DT_ThongKe;
    public static javax.swing.JLabel soNV;
    private javax.swing.JTextField timnv;
    // End of variables declaration//GEN-END:variables
}
