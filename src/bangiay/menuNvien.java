package bangiay;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;

public class menuNvien extends javax.swing.JFrame {

    public menuNvien() {
        initComponents();
        cards = (CardLayout) pnlCenter.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        bt_hang = new javax.swing.JButton();
        bt_khach = new javax.swing.JButton();
        bt_hoadon = new javax.swing.JButton();
        bt_nvien = new javax.swing.JButton();
        bt_doanhthu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
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
        pnlKH = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bt_addHH1 = new javax.swing.JButton();
        bt_suaHH1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlHD = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        pnlNV = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BANH GIAY");
        setLocation(new java.awt.Point(100, 50));
        getContentPane().setLayout(new java.awt.BorderLayout(2, 0));

        pnlSide.setBackground(new java.awt.Color(102, 102, 255));
        pnlSide.setPreferredSize(new java.awt.Dimension(170, 500));
        pnlSide.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 4));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        pnlSide.add(jPanel1);

        bt_hang.setBackground(new java.awt.Color(102, 51, 255));
        bt_hang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_hang.setForeground(new java.awt.Color(255, 255, 255));
        bt_hang.setText("HANG HOA");
        bt_hang.setBorder(null);
        bt_hang.setFocusPainted(false);
        bt_hang.setPreferredSize(new java.awt.Dimension(150, 33));
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

        bt_khach.setBackground(new java.awt.Color(102, 51, 255));
        bt_khach.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_khach.setForeground(new java.awt.Color(255, 255, 255));
        bt_khach.setText("KHACH HANG");
        bt_khach.setBorder(null);
        bt_khach.setFocusPainted(false);
        bt_khach.setPreferredSize(new java.awt.Dimension(150, 33));
        bt_khach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_khachMousePressed(evt);
            }
        });
        bt_khach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_khachActionPerformed(evt);
            }
        });
        pnlSide.add(bt_khach);

        bt_hoadon.setBackground(new java.awt.Color(102, 51, 255));
        bt_hoadon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_hoadon.setForeground(new java.awt.Color(255, 255, 255));
        bt_hoadon.setText("HOA DON");
        bt_hoadon.setBorder(null);
        bt_hoadon.setFocusPainted(false);
        bt_hoadon.setPreferredSize(new java.awt.Dimension(150, 33));
        bt_hoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_hoadonMousePressed(evt);
            }
        });
        bt_hoadon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_hoadonActionPerformed(evt);
            }
        });
        pnlSide.add(bt_hoadon);

        bt_nvien.setBackground(new java.awt.Color(102, 51, 255));
        bt_nvien.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_nvien.setForeground(new java.awt.Color(255, 255, 255));
        bt_nvien.setText("NHAN VIEN");
        bt_nvien.setBorder(null);
        bt_nvien.setFocusPainted(false);
        bt_nvien.setPreferredSize(new java.awt.Dimension(150, 33));
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
        bt_doanhthu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_doanhthu.setForeground(new java.awt.Color(255, 255, 255));
        bt_doanhthu.setText("DOANH THU");
        bt_doanhthu.setBorder(null);
        bt_doanhthu.setFocusPainted(false);
        bt_doanhthu.setPreferredSize(new java.awt.Dimension(150, 33));
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

        jPanel2.setBackground(new java.awt.Color(102, 102, 255));

        jButton1.setText("Change pw");
        jButton1.setFocusPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jButton1MousePressed(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Logout");
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pnlSide.add(jPanel2);

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
        bt_addHH.setText("Add HH");
        bt_addHH.setPreferredSize(new java.awt.Dimension(80, 30));
        bt_addHH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_addHHActionPerformed(evt);
            }
        });
        jPanel3.add(bt_addHH);

        bt_suaHH.setBackground(new java.awt.Color(204, 204, 204));
        bt_suaHH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_suaHH.setText("Edit HH");
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
        jLabel1.setText("Tong So Mat Hang ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("20");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnlHH.add(jPanel8, java.awt.BorderLayout.PAGE_START);

        pnlCenter.add(pnlHH, "cardHH");

        pnlKH.setBackground(new java.awt.Color(255, 255, 255));
        pnlKH.setLayout(new java.awt.BorderLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel4.setPreferredSize(new java.awt.Dimension(630, 65));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        bt_addHH1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_addHH1.setText("Add KH");
        bt_addHH1.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel4.add(bt_addHH1);

        bt_suaHH1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_suaHH1.setText("Edit KH");
        bt_suaHH1.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel4.add(bt_suaHH1);

        pnlKH.add(jPanel4, java.awt.BorderLayout.PAGE_END);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(630, 340));
        jScrollPane2.setRequestFocusEnabled(false);

        jTable2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable2.setGridColor(new java.awt.Color(240, 240, 240));
        jTable2.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable2.setPreferredSize(new java.awt.Dimension(630, 435));
        jTable2.setRowHeight(30);
        jTable2.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable2.setShowGrid(true);
        jScrollPane2.setViewportView(jTable2);

        pnlKH.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jPanel9.setBackground(new java.awt.Color(204, 204, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(630, 110));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Tong So Khach Hang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("20");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(336, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnlKH.add(jPanel9, java.awt.BorderLayout.PAGE_START);

        pnlCenter.add(pnlKH, "cardKH");

        pnlHD.setBackground(new java.awt.Color(255, 255, 255));
        pnlHD.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlHD.setLayout(new java.awt.BorderLayout());

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(630, 110));
        jPanel5.setRequestFocusEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Doanh Thu Thang");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("20000000");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("1/2024");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13)
                .addGap(38, 38, 38)
                .addComponent(jLabel6)
                .addContainerGap(207, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnlHD.add(jPanel5, java.awt.BorderLayout.PAGE_START);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(654, 70));

        jButton3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jButton3.setText("TAO HOA DON");
        jButton3.setPreferredSize(new java.awt.Dimension(200, 60));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton3);

        pnlHD.add(jPanel6, java.awt.BorderLayout.PAGE_END);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane5.setPreferredSize(new java.awt.Dimension(630, 340));

        jTable5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable5.setGridColor(new java.awt.Color(240, 240, 240));
        jTable5.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTable5.setMaximumSize(new java.awt.Dimension(2147483647, 99999));
        jTable5.setPreferredSize(new java.awt.Dimension(630, 380));
        jTable5.setRowHeight(30);
        jTable5.setSelectionBackground(new java.awt.Color(204, 204, 255));
        jTable5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable5.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable5.setShowGrid(true);
        jScrollPane5.setViewportView(jTable5);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
        );

        pnlHD.add(jPanel7, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlHD, "cardHD");

        pnlNV.setBackground(new java.awt.Color(255, 255, 255));
        pnlNV.setPreferredSize(new java.awt.Dimension(630, 500));
        pnlNV.setLayout(new java.awt.BorderLayout());

        jPanel11.setBackground(new java.awt.Color(204, 204, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(630, 110));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Tai Khoan Cua Ban");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(385, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pnlNV.add(jPanel11, java.awt.BorderLayout.PAGE_START);

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9))
                .addContainerGap(537, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        pnlNV.add(jPanel14, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlNV, "cardNV");

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hangActionPerformed
        // TODO add your handling code here:
        cards.show(pnlCenter, "cardHH");
    }//GEN-LAST:event_bt_hangActionPerformed

    private void bt_hangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_hangMousePressed
        bt_resetColor();
        bt_setColor(bt_hang);
    }//GEN-LAST:event_bt_hangMousePressed

    private void bt_khachMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_khachMousePressed
        bt_resetColor();
        bt_setColor(bt_khach);
    }//GEN-LAST:event_bt_khachMousePressed

    private void bt_khachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_khachActionPerformed
        // TODO add your handling code here:
        cards.show(pnlCenter, "cardKH");
    }//GEN-LAST:event_bt_khachActionPerformed

    private void bt_hoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_hoadonMousePressed
        bt_resetColor();
        bt_setColor(bt_hoadon);
    }//GEN-LAST:event_bt_hoadonMousePressed

    private void bt_hoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hoadonActionPerformed
        // TODO add your handling code here
        cards.show(pnlCenter, "cardHD");
    }//GEN-LAST:event_bt_hoadonActionPerformed

    private void bt_nvienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_nvienActionPerformed
        // TODO add your handling code here:
        cards.show(pnlCenter, "cardNV");
    }//GEN-LAST:event_bt_nvienActionPerformed

    private void bt_doanhthuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_doanhthuMousePressed
        bt_resetColor();
        bt_setColor(bt_doanhthu);
    }//GEN-LAST:event_bt_doanhthuMousePressed

    private void bt_doanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doanhthuActionPerformed
        cards.show(pnlCenter, "cardDT");
    }//GEN-LAST:event_bt_doanhthuActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new doi_mat_khau().show();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MousePressed
        bt_resetColor();
    }//GEN-LAST:event_jButton1MousePressed

    private void bt_nvienMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_nvienMousePressed
        bt_resetColor();
        bt_setColor(bt_nvien);
    }//GEN-LAST:event_bt_nvienMousePressed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new LoginPane().show();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new addHD().show();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void bt_addHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addHHActionPerformed
        // TODO add your handling code here:
        new addHH().show();
    }//GEN-LAST:event_bt_addHHActionPerformed

    private void bt_suaHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaHHActionPerformed
        new editHH().show();
    }//GEN-LAST:event_bt_suaHHActionPerformed
    void bt_setColor(JButton bt) {
        bt.setBackground(new Color(0, 153, 153));
    }

    void bt_resetColor() {
        bt_hang.setBackground(new Color(102, 51, 255));
        bt_khach.setBackground(new Color(102, 51, 255));
        bt_hoadon.setBackground(new Color(102, 51, 255));
        bt_doanhthu.setBackground(new Color(102, 51, 255));
        bt_nvien.setBackground(new Color(102, 51, 255));
    }

    void pn_setcolor(JPanel pn) {
        pn.setBackground(new Color(102, 102, 255));
    }

    void pn_resetcolor(JPanel pn) {
        pn.setBackground(new Color(204, 204, 255));
    }

    CardLayout cards;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_addHH;
    private javax.swing.JButton bt_addHH1;
    private javax.swing.JButton bt_doanhthu;
    private javax.swing.JButton bt_hang;
    private javax.swing.JButton bt_hoadon;
    private javax.swing.JButton bt_khach;
    private javax.swing.JButton bt_nvien;
    private javax.swing.JButton bt_suaHH;
    private javax.swing.JButton bt_suaHH1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable5;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlHD;
    private javax.swing.JPanel pnlHH;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables
}
