package UI;

import ConTrollers.HoaDonCtrl;
import ConTrollers.XemVaTimKiemCtrl;
import java.awt.Point;

public class ChiTietHD extends javax.swing.JDialog {

    public ChiTietHD(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        Point a = parent.getLocation();
        a.x += 170;
        a.y += 90;
        this.setLocation(a);
        initComponents();
        XemVaTimKiemCtrl.DisplayData(tbChiTiet, "select b.TenSP,b.Hang,b.Size,b.MauSac,a.SoLuong,a.GiaBan \n"
                + "from shopgiay.dbo.ChiTietHD a join shopgiay.dbo.Giay b on a.MaHH=b.ID\n"
                + "where a.MaHD='" + HoaDonCtrl.XemHD + "'");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbChiTiet = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(630, 340));

        tbChiTiet.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbChiTiet.setModel(new javax.swing.table.DefaultTableModel(
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
                "Tên sản phẩm", "Hãng", "Size", "Màu sắc", "Số lượng", "Giá bán"
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
        tbChiTiet.setGridColor(new java.awt.Color(240, 240, 240));
        tbChiTiet.setIntercellSpacing(new java.awt.Dimension(2, 2));
        tbChiTiet.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        tbChiTiet.setPreferredSize(new java.awt.Dimension(630, 380));
        tbChiTiet.setRowHeight(30);
        tbChiTiet.setSelectionBackground(new java.awt.Color(204, 204, 255));
        tbChiTiet.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbChiTiet.setShowGrid(true);
        tbChiTiet.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tbChiTiet);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbChiTiet;
    // End of variables declaration//GEN-END:variables
}
