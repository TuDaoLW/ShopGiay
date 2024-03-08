package UI;

import ConTrollers.NvienCtrl;
import ConTrollers.XemVaTimKiemCtrl;
import ConTrollers.AccCtrl;
import ConTrollers.HangHoaCtrl;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dialog;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class menuAdmin extends javax.swing.JFrame {

    public menuAdmin() {
        initComponents();
        cards = (CardLayout) pnlCenter.getLayout();
        XemVaTimKiemCtrl.updatetableHH();
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
        tbHH = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbsoHH = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hangHH = new javax.swing.JTextField();
        bt_timhang = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        sizeHH = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mauHH = new javax.swing.JTextField();
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
        add = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        sex = new javax.swing.JLabel();
        chucvu = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        luong = new javax.swing.JLabel();
        lbname = new javax.swing.JLabel();
        lbten = new javax.swing.JLabel();
        lbsex = new javax.swing.JLabel();
        lbadd = new javax.swing.JLabel();
        lbluong = new javax.swing.JLabel();
        lbchucvu = new javax.swing.JLabel();
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
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 80));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Admin");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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
        pnlCenter.setLayout(new java.awt.CardLayout());

        pnlHH.setBackground(new java.awt.Color(255, 255, 255));
        pnlHH.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlHH.setLayout(new java.awt.BorderLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel3.setPreferredSize(new java.awt.Dimension(630, 65));
        jPanel3.setLayout(new java.awt.GridLayout());

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

        tbHH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Tên sản phẩm", "Hãng", "Size", "Màu sắc", "Số lượng", "Giá bán", "Giá nhập"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHH.setGridColor(new java.awt.Color(240, 240, 240));
        tbHH.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbHH.setPreferredSize(new java.awt.Dimension(630, 380));
        tbHH.setRowHeight(30);
        tbHH.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbHH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHH.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHH.setShowGrid(true);
        jScrollPane1.setViewportView(tbHH);

        pnlHH.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(630, 110));
        jPanel8.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TỔNG SỐ MẶT HÀNG");

        lbsoHH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbsoHH.setText("...");

        jLabel14.setText("Hãng");

        bt_timhang.setText("Tìm Kiếm");
        bt_timhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timhangActionPerformed(evt);
            }
        });

        jLabel21.setText("Size");

        jLabel22.setText("Màu");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lbsoHH))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(hangHH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel21)
                        .addGap(18, 18, 18)
                        .addComponent(sizeHH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(mauHH, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(bt_timhang)))
                .addContainerGap(511, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbsoHH))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel22)
                        .addComponent(mauHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bt_timhang))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel21)
                        .addComponent(sizeHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(hangHH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pnlHH.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        pnlCenter.add(pnlHH, "cardHH");

        pnlNV.setBackground(new java.awt.Color(255, 255, 255));
        pnlNV.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlNV.setLayout(new java.awt.BorderLayout());

        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel10.setPreferredSize(new java.awt.Dimension(630, 65));
        jPanel10.setLayout(new java.awt.GridLayout());

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
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
        soNV.setText("...");

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
                        .addGap(18, 18, 18)
                        .addComponent(timnv, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(soNV)))
                .addGap(308, 308, 308))
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
            .addGap(0, 1072, Short.MAX_VALUE)
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
            .addGap(0, 1072, Short.MAX_VALUE)
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
                .addContainerGap(263, Short.MAX_VALUE))
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
                .addContainerGap(269, Short.MAX_VALUE))
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
                .addContainerGap(757, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel35)
                .addContainerGap())
        );

        jPanel4.add(jPanel17, java.awt.BorderLayout.NORTH);

        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Username");

        ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ten.setText("Họ và tên");

        sex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sex.setText("Giới tính");

        chucvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chucvu.setText("Chức vụ");

        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Địa chỉ");

        luong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luong.setText("Lương");

        lbname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbname.setText("...                    ");

        lbten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbten.setText("...                    ");

        lbsex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbsex.setText("...                    ");

        lbadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbadd.setText("...                    ");

        lbluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluong.setText("...                    ");

        lbchucvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbchucvu.setText("...                    ");

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

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addContainerGap(376, Short.MAX_VALUE)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ten, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sex, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(luong, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(chucvu, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(77, 77, 77)
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbsex)
                            .addComponent(lbname)
                            .addComponent(lbten)
                            .addComponent(lbadd)
                            .addComponent(lbluong)
                            .addComponent(lbchucvu)))
                    .addGroup(addLayout.createSequentialGroup()
                        .addComponent(jButton5)
                        .addGap(45, 45, 45)
                        .addComponent(jButton6)))
                .addContainerGap(393, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addLayout.createSequentialGroup()
                        .addComponent(lbname)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbsex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbadd)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbluong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbchucvu))
                    .addGroup(addLayout.createSequentialGroup()
                        .addComponent(name)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ten)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sex)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(address)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(luong)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chucvu)))
                .addGap(33, 33, 33)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(91, Short.MAX_VALUE))
        );

        jPanel4.add(add, java.awt.BorderLayout.CENTER);

        pnlTK.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(630, 30));
        jPanel5.setRequestFocusEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
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
            .addGap(0, 1072, Short.MAX_VALUE)
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
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        dshdLayout.setVerticalGroup(
            dshdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pnlCenter.add(dshd, "cardHD");

        doanhso.setPreferredSize(new java.awt.Dimension(630, 500));

        javax.swing.GroupLayout doanhsoLayout = new javax.swing.GroupLayout(doanhso);
        doanhso.setLayout(doanhsoLayout);
        doanhsoLayout.setHorizontalGroup(
            doanhsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1072, Short.MAX_VALUE)
        );
        doanhsoLayout.setVerticalGroup(
            doanhsoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pnlCenter.add(doanhso, "cardDS");

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_hangMousePressed
        bt_resetColor();
        bt_setColor(bt_hang);
    }//GEN-LAST:event_bt_hangMousePressed

    private void bt_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hangActionPerformed
        cards.show(pnlCenter, "cardHH");
        XemVaTimKiemCtrl.updatetableHH();
    }//GEN-LAST:event_bt_hangActionPerformed

    private void bt_taohoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_taohoadonMousePressed
        bt_resetColor();
        bt_setColor(bt_taohoadon);
    }//GEN-LAST:event_bt_taohoadonMousePressed

    private void bt_taohoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taohoadonActionPerformed
        //cards.show(pnlCenter, "cardHH");
        new HoaDon(this,true).setVisible(true);//rootPaneCheckingEnabled
        //new HD().setvisible();
    }//GEN-LAST:event_bt_taohoadonActionPerformed

    private void bt_nvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_nvienMousePressed
        bt_resetColor();
        bt_setColor(bt_nvien);
    }//GEN-LAST:event_bt_nvienMousePressed

    private void bt_nvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nvienActionPerformed
        cards.show(pnlCenter, "cardNV");
        XemVaTimKiemCtrl.updatetableNV();
    }//GEN-LAST:event_bt_nvienActionPerformed

    private void bt_doanhthuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_doanhthuMousePressed
        bt_resetColor();
        bt_setColor(bt_doanhthu);
    }//GEN-LAST:event_bt_doanhthuMousePressed

    private void bt_doanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doanhthuActionPerformed
        cards.show(pnlCenter, "cardDT");
    }//GEN-LAST:event_bt_doanhthuActionPerformed

    private void bt_taikhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_taikhoanMousePressed
        bt_resetColor();
        bt_setColor(bt_taikhoan);
    }//GEN-LAST:event_bt_taikhoanMousePressed

    private void bt_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taikhoanActionPerformed
        AccCtrl.showUserData(lbname, lbten, lbsex, lbadd, lbluong, lbchucvu);
        cards.show(pnlCenter, "cardTK");
    }//GEN-LAST:event_bt_taikhoanActionPerformed

    private void bt_addHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addHHActionPerformed
        new addHH().setVisible(true);
    }//GEN-LAST:event_bt_addHHActionPerformed

    private void bt_suaHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaHHActionPerformed
        if (laythongtinHHcansua() == -1) {
            return;
        }
        new editHH().setVisible(true);
    }//GEN-LAST:event_bt_suaHHActionPerformed

    private void bt_timhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timhangActionPerformed
        // Tim kiem theo ma mat hang
        //        XemVaTimKiemCtrl.DisplayData(tbHH, "select * from dbo.Giay where Username like '%" + hangHH.getText() + "%' ");
        //        if (hangHH.getText().equals(""))
        //            System.out.println("none");
        XemVaTimKiemCtrl.timHang(hangHH, sizeHH, mauHH);
    }//GEN-LAST:event_bt_timhangActionPerformed

    private void bt_addNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addNVActionPerformed
        new addNV().setVisible(true);
    }//GEN-LAST:event_bt_addNVActionPerformed

    private void bt_suaNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaNVActionPerformed
        if (laythongtinNVcansua() == -1) {
            return;
        }
        new editNV().setVisible(true);
    }//GEN-LAST:event_bt_suaNVActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // tim nhan vien
        XemVaTimKiemCtrl.DisplayData(jTable4, "select * from dbo.NhanVien where HoTen like '%" + timnv.getText() + "%' ");
        timnv.setText("");
    }//GEN-LAST:event_jButton13ActionPerformed

    private void btXemDSHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemDSHDActionPerformed
        cards.show(pnlCenter, "cardHD");
    }//GEN-LAST:event_btXemDSHDActionPerformed

    private void pnl_DT_DSHDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_DSHDMouseEntered
        pn_setcolor(pnl_DT_DSHD);
    }//GEN-LAST:event_pnl_DT_DSHDMouseEntered

    private void pnl_DT_DSHDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_DSHDMouseExited
        pn_resetcolor(pnl_DT_DSHD);
    }//GEN-LAST:event_pnl_DT_DSHDMouseExited

    private void btXemDoanhSoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btXemDoanhSoActionPerformed
        cards.show(pnlCenter, "cardDS");
    }//GEN-LAST:event_btXemDoanhSoActionPerformed

    private void pnl_DT_ThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_ThongKeMouseEntered
        pn_setcolor(pnl_DT_ThongKe);
    }//GEN-LAST:event_pnl_DT_ThongKeMouseEntered

    private void pnl_DT_ThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_ThongKeMouseExited
        pn_resetcolor(pnl_DT_ThongKe);
    }//GEN-LAST:event_pnl_DT_ThongKeMouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new LoginPane().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new doi_mat_khau().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

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

    public static int laythongtinNVcansua() {
        int row = jTable4.getSelectedRow();
        if (row < 0 || jTable4.getValueAt(row, 0).equals("")) {
            //System.out.println(jTable4.getValueAt(row, 0));
            JOptionPane.showMessageDialog(jTable4, "Hãy chọn đối tượng cần sửa");
            return -1;
        }
        for (int i = 0; i < jTable4.getColumnCount(); i++) {
            NvienCtrl.suaNV[i] = (String) jTable4.getValueAt(row, i);
            //System.out.println(jTable4.getValueAt(row, i));
        }
        return 0;
    }

    public static int laythongtinHHcansua() {
        int row = tbHH.getSelectedRow();
        if (row < 0 || tbHH.getValueAt(row, 0).equals("")) {
            JOptionPane.showMessageDialog(tbHH, "Hãy chọn đối tượng cần sửa");
            return -1;
        }
        for (int i = 0; i < tbHH.getColumnCount(); i++) {
            HangHoaCtrl.suaHH[i] = (String) tbHH.getValueAt(row, i);
        }
        return 0;
    }

    private final CardLayout cards;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel address;
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
    private javax.swing.JLabel chucvu;
    private javax.swing.JPanel doanhso;
    private javax.swing.JPanel dshd;
    private javax.swing.JTextField hangHH;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable jTable4;
    private javax.swing.JLabel lbadd;
    private javax.swing.JLabel lbchucvu;
    private javax.swing.JLabel lbluong;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbsex;
    public static javax.swing.JLabel lbsoHH;
    private javax.swing.JLabel lbten;
    private javax.swing.JLabel luong;
    private javax.swing.JTextField mauHH;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDT;
    private javax.swing.JPanel pnlHH;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTK;
    private javax.swing.JPanel pnl_DT_Center;
    private javax.swing.JPanel pnl_DT_DSHD;
    private javax.swing.JPanel pnl_DT_ThongKe;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField sizeHH;
    public static javax.swing.JLabel soNV;
    public static javax.swing.JTable tbHH;
    private javax.swing.JLabel ten;
    private javax.swing.JTextField timnv;
    // End of variables declaration//GEN-END:variables
}
