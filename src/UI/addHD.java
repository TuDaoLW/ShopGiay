package UI;

import ConTrollers.HoaDonCtrl;
import java.awt.Point;
import javax.swing.JOptionPane;

public class addHD extends javax.swing.JDialog {

    public addHD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        Point a = parent.getLocation();
        a.x += 785;
        this.setLocation(a);
        initComponents();
        resizetbHD();
        HoaDonCtrl.khoitaoHD(lbtime, lbusrname, lbmahd);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbtime = new javax.swing.JLabel();
        tfKH = new javax.swing.JTextField();
        lbusrname = new javax.swing.JLabel();
        chonHang = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        lbmahd = new javax.swing.JLabel();
        ThemHangbt = new javax.swing.JButton();
        lbhang = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        chonSL = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        huy = new javax.swing.JButton();
        xacnhan = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        sum = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHD = new javax.swing.JTable();

        setDefaultCloseOperation(xacnhan.getComponentCount());
        setTitle("Tạo hóa đơn");
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 540));
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(51, 51, 51)));
        jPanel1.setPreferredSize(new java.awt.Dimension(420, 165));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Thu ngân:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Khách hàng:");

        lbtime.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbtime.setText("...");

        tfKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfKH.setMaximumSize(new java.awt.Dimension(120, 22));

        lbusrname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbusrname.setText("...");

        chonHang.setText("Chọn");
        chonHang.setToolTipText("");
        chonHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chonHangActionPerformed(evt);
            }
        });

        xoa.setText("Xóa");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Mã HD:");

        lbmahd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbmahd.setText("...");

        ThemHangbt.setText("Thêm");
        ThemHangbt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ThemHangbtActionPerformed(evt);
            }
        });

        lbhang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbhang.setText("SP : ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Số lượng");

        chonSL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbhang, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbmahd, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbusrname, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chonSL, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(chonHang)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ThemHangbt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(xoa))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbtime, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tfKH, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lbmahd, lbusrname});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {chonSL, jLabel10});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbmahd)
                        .addComponent(lbtime)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbusrname, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(tfKH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(chonSL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(xoa)
                            .addComponent(chonHang)
                            .addComponent(ThemHangbt))
                        .addGap(1, 1, 1)))
                .addComponent(lbhang)
                .addGap(18, 18, 18))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(420, 50));

        huy.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        huy.setText("Hủy Bỏ");
        huy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyActionPerformed(evt);
            }
        });

        xacnhan.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        xacnhan.setText("Xác Nhận");
        xacnhan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xacnhanActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Tổng cộng:");

        sum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sum.setText("...");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(huy, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(xacnhan)
                .addGap(34, 34, 34)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(huy)
                    .addComponent(xacnhan)
                    .addComponent(jLabel7)
                    .addComponent(sum))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 0, 2, new java.awt.Color(0, 0, 0)));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setPreferredSize(new java.awt.Dimension(420, 330));

        tbHD.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        tbHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên sản phẩm", "Chi tiết", "Số lượng", "Giá bán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbHD.setGridColor(new java.awt.Color(240, 240, 240));
        tbHD.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbHD.setPreferredSize(new java.awt.Dimension(420, 330));
        tbHD.setRowHeight(24);
        tbHD.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbHD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHD.setShowGrid(true);
        tbHD.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbHD);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void huyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyActionPerformed
        this.dispose();
        HoaDonCtrl.huyHD(lbmahd);
        HoaDonCtrl.numberofHD--;
    }//GEN-LAST:event_huyActionPerformed

    private void chonHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chonHangActionPerformed
        if (HoaDonCtrl.ChonHang(this, lbhang, chonSL))
            ThemHangbt.setEnabled(true);
    }//GEN-LAST:event_chonHangActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        // xoa hang
        if (!HoaDonCtrl.layHangCanXoa()) {
            JOptionPane.showMessageDialog(this, "Chọn hàng cần xóa");
            return;
        }// check xem chon hang chua
        HoaDonCtrl.xoahang(sum);
    }//GEN-LAST:event_xoaActionPerformed

    private void ThemHangbtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ThemHangbtActionPerformed
        // them hang
        HoaDonCtrl.ThemHang(this, chonSL, sum);
        ThemHangbt.setEnabled(false);
    }//GEN-LAST:event_ThemHangbtActionPerformed

    private void xacnhanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xacnhanActionPerformed
        this.dispose();
        HoaDonCtrl.xacnhanthem(tfKH);
        HoaDonCtrl.numberofHD--;
    }//GEN-LAST:event_xacnhanActionPerformed
    private void resizetbHD() {
        tbHD.getColumnModel().getColumn(0).setPreferredWidth(30);
        tbHD.getColumnModel().getColumn(1).setPreferredWidth(140);
        tbHD.getColumnModel().getColumn(2).setPreferredWidth(110);
        tbHD.getColumnModel().getColumn(3).setPreferredWidth(40);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ThemHangbt;
    private javax.swing.JButton chonHang;
    private javax.swing.JSpinner chonSL;
    private javax.swing.JButton huy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbhang;
    private javax.swing.JLabel lbmahd;
    private javax.swing.JLabel lbtime;
    private javax.swing.JLabel lbusrname;
    private javax.swing.JLabel sum;
    public static javax.swing.JTable tbHD;
    private javax.swing.JTextField tfKH;
    private javax.swing.JButton xacnhan;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
