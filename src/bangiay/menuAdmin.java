package bangiay;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
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
        jLabel14 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton10 = new javax.swing.JButton();
        pnlKH = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        bt_addHH1 = new javax.swing.JButton();
        bt_suaHH1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        pnlHD = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        pnlNV = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        bt_addHH2 = new javax.swing.JButton();
        bt_suaHH2 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton13 = new javax.swing.JButton();
        pnlDT = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        pnl_DT_Center = new javax.swing.JPanel();
        pnl_DT_NV = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        pnl_DT_Month = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        DT_NV = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        DT_KH = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jButton8 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        DT_Thang = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jButton9 = new javax.swing.JButton();
        jPanel24 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BANH GIAY");
        setLocation(new java.awt.Point(100, 50));
        setPreferredSize(new java.awt.Dimension(800, 500));
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

        jButton1.setText("Doi mat khau");
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

        jLabel14.setText("Ma mat hang");

        jButton10.setText("Tim kiem");

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
                        .addComponent(jButton10))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(675, Short.MAX_VALUE))
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
                    .addComponent(jButton10))
                .addContainerGap())
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

        jLabel15.setText("Ten khach hang");

        jButton11.setText("Tim kiem");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton11))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addContainerGap(663, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11))
                .addContainerGap())
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

        jLabel16.setText("Ngay tao");

        jButton12.setText("Tim kiem");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton12)))
                .addContainerGap(566, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12))
                .addContainerGap())
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

        jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 0, new java.awt.Color(102, 102, 255)));
        jPanel10.setPreferredSize(new java.awt.Dimension(630, 65));
        jPanel10.setLayout(new java.awt.GridLayout(1, 0));

        bt_addHH2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_addHH2.setText("Add NV");
        bt_addHH2.setPreferredSize(new java.awt.Dimension(80, 30));
        jPanel10.add(bt_addHH2);

        bt_suaHH2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        bt_suaHH2.setText("Edit NV");
        bt_suaHH2.setPreferredSize(new java.awt.Dimension(80, 30));
        bt_suaHH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_suaHH2ActionPerformed(evt);
            }
        });
        jPanel10.add(bt_suaHH2);

        pnlNV.add(jPanel10, java.awt.BorderLayout.PAGE_END);

        jScrollPane4.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane4.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(630, 380));

        jTable4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable4.setModel(new javax.swing.table.DefaultTableModel(
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
        jLabel7.setText("So Nhan Vien");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("20");

        jLabel17.setText("Ma nhan vien");

        jButton13.setText("Tim kiem");

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
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addContainerGap(675, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Xem Doanh Thu Theo >>");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addContainerGap(419, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addComponent(jLabel12)
                .addGap(0, 15, Short.MAX_VALUE))
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

        pnl_DT_NV.setBackground(new java.awt.Color(204, 204, 255));
        pnl_DT_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_DT_NVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_DT_NVMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Nhan Vien");

        jButton6.setText("Chi Tiet");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DT_NVLayout = new javax.swing.GroupLayout(pnl_DT_NV);
        pnl_DT_NV.setLayout(pnl_DT_NVLayout);
        pnl_DT_NVLayout.setHorizontalGroup(
            pnl_DT_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_NVLayout.createSequentialGroup()
                .addGroup(pnl_DT_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DT_NVLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel9))
                    .addGroup(pnl_DT_NVLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton6)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        pnl_DT_NVLayout.setVerticalGroup(
            pnl_DT_NVLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_NVLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(51, 51, 51))
        );

        pnl_DT_Center.add(pnl_DT_NV);

        pnl_DT_Month.setBackground(new java.awt.Color(204, 204, 255));
        pnl_DT_Month.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnl_DT_MonthMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnl_DT_MonthMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Thang");

        jButton4.setText("Chi Tiet");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_DT_MonthLayout = new javax.swing.GroupLayout(pnl_DT_Month);
        pnl_DT_Month.setLayout(pnl_DT_MonthLayout);
        pnl_DT_MonthLayout.setHorizontalGroup(
            pnl_DT_MonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_MonthLayout.createSequentialGroup()
                .addGroup(pnl_DT_MonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_DT_MonthLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel11))
                    .addGroup(pnl_DT_MonthLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jButton4)))
                .addContainerGap(316, Short.MAX_VALUE))
        );
        pnl_DT_MonthLayout.setVerticalGroup(
            pnl_DT_MonthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DT_MonthLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 299, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(51, 51, 51))
        );

        pnl_DT_Center.add(pnl_DT_Month);

        pnlDT.add(pnl_DT_Center, java.awt.BorderLayout.CENTER);

        pnlCenter.add(pnlDT, "cardDT");

        DT_NV.setBackground(new java.awt.Color(255, 255, 255));
        DT_NV.setPreferredSize(new java.awt.Dimension(630, 500));
        DT_NV.setLayout(new java.awt.BorderLayout());

        jPanel16.setBackground(new java.awt.Color(153, 153, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(672, 40));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DT_NV.add(jPanel16, java.awt.BorderLayout.PAGE_START);

        jPanel17.setBackground(new java.awt.Color(153, 153, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(672, 50));

        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(37, 37, 37))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addContainerGap())
        );

        DT_NV.add(jPanel17, java.awt.BorderLayout.PAGE_END);

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        DT_NV.add(jPanel20, java.awt.BorderLayout.CENTER);

        pnlCenter.add(DT_NV, "DT_NV");

        DT_KH.setBackground(new java.awt.Color(255, 255, 255));
        DT_KH.setPreferredSize(new java.awt.Dimension(630, 500));
        DT_KH.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(153, 153, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(672, 40));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DT_KH.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jPanel19.setBackground(new java.awt.Color(153, 153, 255));
        jPanel19.setPreferredSize(new java.awt.Dimension(672, 50));

        jButton8.setText("Back");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addGap(37, 37, 37))
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel19Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton8)
                .addContainerGap())
        );

        DT_KH.add(jPanel19, java.awt.BorderLayout.PAGE_END);

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        DT_KH.add(jPanel21, java.awt.BorderLayout.CENTER);

        pnlCenter.add(DT_KH, "DT_KH");

        DT_Thang.setBackground(new java.awt.Color(255, 255, 255));
        DT_Thang.setPreferredSize(new java.awt.Dimension(630, 500));
        DT_Thang.setLayout(new java.awt.BorderLayout());

        jPanel22.setBackground(new java.awt.Color(153, 153, 255));
        jPanel22.setPreferredSize(new java.awt.Dimension(672, 40));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        DT_Thang.add(jPanel22, java.awt.BorderLayout.PAGE_START);

        jPanel23.setBackground(new java.awt.Color(153, 153, 255));
        jPanel23.setPreferredSize(new java.awt.Dimension(672, 50));

        jButton9.setText("Back");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(534, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(37, 37, 37))
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel23Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addContainerGap())
        );

        DT_Thang.add(jPanel23, java.awt.BorderLayout.PAGE_END);

        jPanel24.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 630, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        DT_Thang.add(jPanel24, java.awt.BorderLayout.CENTER);

        pnlCenter.add(DT_Thang, "DT_Thang");

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

    private void pnl_DT_NVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_NVMouseEntered
        pn_setcolor(pnl_DT_NV);
    }//GEN-LAST:event_pnl_DT_NVMouseEntered

    private void pnl_DT_MonthMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_MonthMouseEntered
        pn_setcolor(pnl_DT_Month);
    }//GEN-LAST:event_pnl_DT_MonthMouseEntered

    private void pnl_DT_NVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_NVMouseExited
        pn_resetcolor(pnl_DT_NV);
    }//GEN-LAST:event_pnl_DT_NVMouseExited

    private void pnl_DT_MonthMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnl_DT_MonthMouseExited
        pn_resetcolor(pnl_DT_Month);
    }//GEN-LAST:event_pnl_DT_MonthMouseExited

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        cards.show(pnlCenter, "DT_NV");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void bt_addHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addHHActionPerformed
        // TODO add your handling code here:
        new addHH().show();
    }//GEN-LAST:event_bt_addHHActionPerformed

    private void bt_suaHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaHHActionPerformed
        new editHH().show();
    }//GEN-LAST:event_bt_suaHHActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cards.show(pnlCenter, "DT_Thang");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        cards.show(pnlCenter, "cardDT");
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cards.show(pnlCenter, "cardDT");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        cards.show(pnlCenter, "cardDT");        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void bt_suaHH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaHH2ActionPerformed
      new editNV().show();
    }//GEN-LAST:event_bt_suaHH2ActionPerformed
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
    private javax.swing.JPanel DT_KH;
    private javax.swing.JPanel DT_NV;
    private javax.swing.JPanel DT_Thang;
    private javax.swing.JButton bt_addHH;
    private javax.swing.JButton bt_addHH1;
    private javax.swing.JButton bt_addHH2;
    private javax.swing.JButton bt_doanhthu;
    private javax.swing.JButton bt_hang;
    private javax.swing.JButton bt_hoadon;
    private javax.swing.JButton bt_khach;
    private javax.swing.JButton bt_nvien;
    private javax.swing.JButton bt_suaHH;
    private javax.swing.JButton bt_suaHH1;
    private javax.swing.JButton bt_suaHH2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlDT;
    private javax.swing.JPanel pnlHD;
    private javax.swing.JPanel pnlHH;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JPanel pnlNV;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnl_DT_Center;
    private javax.swing.JPanel pnl_DT_Month;
    private javax.swing.JPanel pnl_DT_NV;
    // End of variables declaration//GEN-END:variables
}
