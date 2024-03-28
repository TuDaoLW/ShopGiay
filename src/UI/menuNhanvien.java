package UI;

import ConTrollers.XemVaTimKiemCtrl;
import ConTrollers.AccCtrl;
import ConTrollers.HoaDonCtrl;
import ConTrollers.HangHoaCtrl;
import ConTrollers.NvienCtrl;
import java.awt.CardLayout;
import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class menuNhanvien extends javax.swing.JFrame {

    public menuNhanvien() {
        initComponents();
        cards = (CardLayout) pnlCenter.getLayout();
        usname.setText(NvienCtrl.currentusr[2]);
        resizetbHH();
        resizetbHD();
        XemVaTimKiemCtrl.showtableHH(tbHHnv, lbsoHHnv);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlSide = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        usname = new javax.swing.JLabel();
        bt_hang = new javax.swing.JButton();
        bt_taohoadon = new javax.swing.JButton();
        bt_doanhthu = new javax.swing.JButton();
        bt_taikhoan = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlHH = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        bt_addHH = new javax.swing.JButton();
        bt_suaHH = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHHnv = new javax.swing.JTable();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbsoHHnv = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hangHH = new javax.swing.JTextField();
        bt_timhang = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        sizeHH = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        mauHH = new javax.swing.JTextField();
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
        doanhso = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btDTthang = new javax.swing.JButton();
        lbthangDT = new javax.swing.JLabel();
        yearspn = new javax.swing.JSpinner();
        monthspn = new javax.swing.JSpinner();
        lbSum = new javax.swing.JLabel();
        btDTthang1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbHDnv = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Shop giày");
        setLocation(new java.awt.Point(50, 50));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(2, 0));

        pnlSide.setBackground(new java.awt.Color(102, 102, 255));
        pnlSide.setPreferredSize(new java.awt.Dimension(170, 500));
        pnlSide.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 1, 4));

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 80));

        usname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        usname.setForeground(new java.awt.Color(255, 255, 255));
        usname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        usname.setText("NV");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usname, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(usname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        tbHHnv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHHnv.setModel(new javax.swing.table.DefaultTableModel(
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
        tbHHnv.setGridColor(new java.awt.Color(240, 240, 240));
        tbHHnv.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbHHnv.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tbHHnv.setPreferredSize(new java.awt.Dimension(630, 380));
        tbHHnv.setRowHeight(30);
        tbHHnv.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbHHnv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHHnv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHHnv.setShowGrid(true);
        tbHHnv.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbHHnv);

        pnlHH.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jPanel8.setBackground(new java.awt.Color(204, 204, 255));
        jPanel8.setPreferredSize(new java.awt.Dimension(630, 110));
        jPanel8.setRequestFocusEnabled(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("TỔNG SỐ MẶT HÀNG");

        lbsoHHnv.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbsoHHnv.setText("...");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setText("Hãng");

        hangHH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        bt_timhang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt_timhang.setText("Tìm Kiếm");
        bt_timhang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_timhangActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Size");

        sizeHH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Màu");

        mauHH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                        .addComponent(lbsoHHnv))
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
                .addGap(48, 48, 48))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lbsoHHnv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
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

        name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name.setText("Username");

        ten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ten.setText("Họ và tên");

        sex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sex.setText("Giới tính");

        chucvu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        chucvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chucvu.setText("Chức vụ");

        address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        address.setText("Địa chỉ");

        luong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        luong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        luong.setText("Lương");

        lbname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbname.setText("...                    ");

        lbten.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbten.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbten.setText("...                    ");

        lbsex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbsex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbsex.setText("...                    ");

        lbadd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbadd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbadd.setText("...                    ");

        lbluong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbluong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbluong.setText("...                    ");

        lbchucvu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbchucvu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbchucvu.setText("...                    ");

        jButton5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton5.setText("Đăng Xuất");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
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
                .addContainerGap(151, Short.MAX_VALUE)
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
                .addGap(156, 156, 156))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(49, 49, 49)
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
                .addContainerGap(99, Short.MAX_VALUE))
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

        doanhso.setBackground(new java.awt.Color(255, 255, 255));
        doanhso.setPreferredSize(new java.awt.Dimension(630, 500));
        doanhso.setLayout(new java.awt.BorderLayout());

        jPanel18.setBackground(new java.awt.Color(204, 204, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(630, 110));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("DOANH THU THÁNG");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel20.setText("Tháng:");

        btDTthang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btDTthang.setText("Xác Nhận");
        btDTthang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDTthangActionPerformed(evt);
            }
        });

        lbthangDT.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbthangDT.setText(".");

        yearspn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        yearspn.setModel(new javax.swing.SpinnerNumberModel(dt.getYear(), 2010, 3000, 1));

        monthspn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        monthspn.setModel(new javax.swing.SpinnerNumberModel(dt.getMonthValue(), 1, 12, 1));

        lbSum.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbSum.setText(".");

        btDTthang1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btDTthang1.setText("Xem Hóa Đơn");
        btDTthang1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDTthang1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(monthspn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yearspn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btDTthang)
                        .addGap(109, 109, 109)
                        .addComponent(btDTthang1))
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbthangDT, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbSum, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(533, Short.MAX_VALUE))
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {monthspn, yearspn});

        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbSum)
                    .addComponent(lbthangDT))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(btDTthang)
                    .addComponent(yearspn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthspn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btDTthang1))
                .addContainerGap())
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel10)
                .addGap(65, 65, 65))
        );

        jPanel18Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btDTthang, jLabel20, monthspn, yearspn});

        doanhso.add(jPanel18, java.awt.BorderLayout.PAGE_START);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(630, 340));

        tbHDnv.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHDnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã HD", "Nhân Viên", "Khách hàng", "Tổng", "Lợi Nhuận", "Thời Gian"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHDnv.setGridColor(new java.awt.Color(240, 240, 240));
        tbHDnv.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbHDnv.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tbHDnv.setPreferredSize(new java.awt.Dimension(630, 380));
        tbHDnv.setRowHeight(30);
        tbHDnv.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbHDnv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHDnv.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHDnv.setShowGrid(true);
        tbHDnv.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbHDnv);

        doanhso.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnlCenter.add(doanhso, "cardDT");

        getContentPane().add(pnlCenter, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleName("menuad");
        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_hangMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_hangMousePressed
        bt_resetColor();
        bt_setColor(bt_hang);
    }//GEN-LAST:event_bt_hangMousePressed

    private void bt_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_hangActionPerformed
        cards.show(pnlCenter, "cardHH");
        enableBtt();
    }//GEN-LAST:event_bt_hangActionPerformed
    public void enableBtt() {
        bt_addHH.setEnabled(true);
        bt_suaHH.setEnabled(true);
    }
    private void bt_taohoadonMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_taohoadonMousePressed
        bt_resetColor();
        bt_setColor(bt_taohoadon);
    }//GEN-LAST:event_bt_taohoadonMousePressed

    private void bt_taohoadonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taohoadonActionPerformed
        if (HoaDonCtrl.numberofHD == 0) {
            cards.show(pnlCenter, "cardHH");
            new addHD(this, false).setVisible(true);
            bt_addHH.setEnabled(false);
            bt_suaHH.setEnabled(false);
            HoaDonCtrl.numberofHD++;
        } else {
            JOptionPane.showMessageDialog(rootPane, "Chỉ tạo 1 hóa đơn cùng lúc");
        }
    }//GEN-LAST:event_bt_taohoadonActionPerformed

    private void bt_doanhthuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_doanhthuMousePressed
        bt_resetColor();
        bt_setColor(bt_doanhthu);
    }//GEN-LAST:event_bt_doanhthuMousePressed

    private void bt_doanhthuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_doanhthuActionPerformed
        XemVaTimKiemCtrl.xemdoanhso(tbHDnv, HoaDonCtrl.date.getMonthValue(), HoaDonCtrl.date.getYear(), lbSum);
        cards.show(pnlCenter, "cardDT");
    }//GEN-LAST:event_bt_doanhthuActionPerformed

    private void bt_taikhoanMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_taikhoanMousePressed
        bt_resetColor();
        bt_setColor(bt_taikhoan);
    }//GEN-LAST:event_bt_taikhoanMousePressed

    private void bt_taikhoanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_taikhoanActionPerformed
        AccCtrl.HienThiThongTinUser(lbname, lbten, lbsex, lbadd, lbluong, lbchucvu);
        cards.show(pnlCenter, "cardTK");
    }//GEN-LAST:event_bt_taikhoanActionPerformed

    private void bt_addHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_addHHActionPerformed
        new addHH(this, true).setVisible(true);
    }//GEN-LAST:event_bt_addHHActionPerformed

    private void bt_suaHHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_suaHHActionPerformed
        if (!HangHoaCtrl.laythongtinHH(tbHHnv)) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn mặt hàng cần sửa");
            return;
        }
        new editHH(this, true).setVisible(true);
    }//GEN-LAST:event_bt_suaHHActionPerformed

    private void bt_timhangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_timhangActionPerformed
        XemVaTimKiemCtrl.timHang(hangHH, sizeHH, mauHH, tbHHnv);
    }//GEN-LAST:event_bt_timhangActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.dispose();
        new LoginPane().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new doi_mat_khau(this, true).setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btDTthangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDTthangActionPerformed
        XemVaTimKiemCtrl.xemdoanhso(tbHDnv, (int) monthspn.getValue(), (int) yearspn.getValue(), lbSum);
    }//GEN-LAST:event_btDTthangActionPerformed

    private void btDTthang1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDTthang1ActionPerformed
        // TODO add your handling code here:
        if (!HoaDonCtrl.laythongtinHD(tbHDnv)) {
            JOptionPane.showMessageDialog(rootPane, "Hãy chọn hóa đơn cần xem");
            return;
        }
        new ChiTietHD(this, true).setVisible(true);

    }//GEN-LAST:event_btDTthang1ActionPerformed
    //additional funtions
    void bt_setColor(JButton bt) {
        bt.setBackground(new Color(0, 153, 153));
    }

    void bt_resetColor() {
        bt_hang.setBackground(new Color(102, 51, 255));
        bt_taohoadon.setBackground(new Color(102, 51, 255));
        bt_doanhthu.setBackground(new Color(102, 51, 255));
        bt_taikhoan.setBackground(new Color(102, 51, 255));
    }

    private void resizetbHH() {
        tbHHnv.getColumnModel().getColumn(0).setPreferredWidth(35);
        tbHHnv.getColumnModel().getColumn(1).setPreferredWidth(220);
        tbHHnv.getColumnModel().getColumn(2).setPreferredWidth(110);
        tbHHnv.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

    private void resizetbHD() {
        tbHDnv.getColumnModel().getColumn(0).setPreferredWidth(40);
        tbHDnv.getColumnModel().getColumn(5).setPreferredWidth(180);
    }
    LocalDate dt = HoaDonCtrl.date;
    private final CardLayout cards;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JLabel address;
    private javax.swing.JButton btDTthang;
    private javax.swing.JButton btDTthang1;
    private javax.swing.JButton bt_addHH;
    private javax.swing.JButton bt_doanhthu;
    private javax.swing.JButton bt_hang;
    private javax.swing.JButton bt_suaHH;
    private javax.swing.JButton bt_taikhoan;
    private javax.swing.JButton bt_taohoadon;
    private javax.swing.JButton bt_timhang;
    private javax.swing.JLabel chucvu;
    private javax.swing.JPanel doanhso;
    private javax.swing.JTextField hangHH;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbSum;
    private javax.swing.JLabel lbadd;
    private javax.swing.JLabel lbchucvu;
    private javax.swing.JLabel lbluong;
    private javax.swing.JLabel lbname;
    private javax.swing.JLabel lbsex;
    public static javax.swing.JLabel lbsoHHnv;
    private javax.swing.JLabel lbten;
    private javax.swing.JLabel lbthangDT;
    private javax.swing.JLabel luong;
    private javax.swing.JTextField mauHH;
    private javax.swing.JSpinner monthspn;
    private javax.swing.JLabel name;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlHH;
    private javax.swing.JPanel pnlSide;
    private javax.swing.JPanel pnlTK;
    private javax.swing.JLabel sex;
    private javax.swing.JTextField sizeHH;
    public static javax.swing.JTable tbHDnv;
    public static javax.swing.JTable tbHHnv;
    private javax.swing.JLabel ten;
    private javax.swing.JLabel usname;
    private javax.swing.JSpinner yearspn;
    // End of variables declaration//GEN-END:variables
}
