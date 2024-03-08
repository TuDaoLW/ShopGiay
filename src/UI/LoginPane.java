package UI;
//check
import java.awt.Color;
import javax.swing.JButton;
import ConTrollers.LogInCtrl;

public class LoginPane extends javax.swing.JFrame {

    public LoginPane() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlW = new javax.swing.JPanel();
        tfsdt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bt_cancel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bt_login = new javax.swing.JButton();
        lb_info = new javax.swing.JLabel();
        tf_passwd = new javax.swing.JPasswordField();
        pnlC = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("BAN GIAY");
        setLocation(new java.awt.Point(150, 100));
        setResizable(false);

        pnlW.setBackground(new java.awt.Color(102, 102, 255));
        pnlW.setPreferredSize(new java.awt.Dimension(300, 400));

        tfsdt.setBackground(new java.awt.Color(153, 153, 255));
        tfsdt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tfsdt.setForeground(new java.awt.Color(255, 255, 255));
        tfsdt.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("WELCOME");

        bt_cancel.setBackground(new java.awt.Color(153, 153, 255));
        bt_cancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_cancel.setForeground(new java.awt.Color(255, 255, 255));
        bt_cancel.setText("Exit");
        bt_cancel.setBorder(null);
        bt_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_cancel.setFocusPainted(false);
        bt_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_cancelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_cancelMouseReleased(evt);
            }
        });
        bt_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_cancelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên đăng nhập");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu");

        bt_login.setBackground(new java.awt.Color(153, 153, 255));
        bt_login.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bt_login.setForeground(new java.awt.Color(255, 255, 255));
        bt_login.setText("Log In");
        bt_login.setBorder(null);
        bt_login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt_login.setFocusPainted(false);
        bt_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bt_loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                bt_loginMouseReleased(evt);
            }
        });
        bt_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_loginActionPerformed(evt);
            }
        });

        lb_info.setForeground(new java.awt.Color(255, 255, 255));
        lb_info.setText("...");
        lb_info.setPreferredSize(new java.awt.Dimension(200, 20));

        tf_passwd.setBackground(new java.awt.Color(153, 153, 255));
        tf_passwd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tf_passwd.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout pnlWLayout = new javax.swing.GroupLayout(pnlW);
        pnlW.setLayout(pnlWLayout);
        pnlWLayout.setHorizontalGroup(
            pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWLayout.createSequentialGroup()
                .addGroup(pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tf_passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(pnlWLayout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(tfsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(pnlWLayout.createSequentialGroup()
                                    .addGroup(pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(lb_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(8, 8, 8))))
                        .addGroup(pnlWLayout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel1))
                        .addGroup(pnlWLayout.createSequentialGroup()
                            .addGap(63, 63, 63)
                            .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(34, 34, 34)
                            .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        pnlWLayout.setVerticalGroup(
            pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlWLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfsdt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_passwd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lb_info, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlWLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt_login, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        getContentPane().add(pnlW, java.awt.BorderLayout.WEST);

        pnlC.setBackground(new java.awt.Color(255, 255, 255));
        pnlC.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/shoe1.png"))); // NOI18N
        jLabel4.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout pnlCLayout = new javax.swing.GroupLayout(pnlC);
        pnlC.setLayout(pnlCLayout);
        pnlCLayout.setHorizontalGroup(
            pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlCLayout.setVerticalGroup(
            pnlCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        getContentPane().add(pnlC, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bt_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_cancelActionPerformed
        System.exit(0);// thoat app
    }//GEN-LAST:event_bt_cancelActionPerformed

    private void bt_cancelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelMousePressed
        bt_setColorPressed(bt_cancel);
    }//GEN-LAST:event_bt_cancelMousePressed

    private void bt_cancelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_cancelMouseReleased
        bt_setColorReleased(bt_cancel);
    }//GEN-LAST:event_bt_cancelMouseReleased

    private void bt_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMousePressed
        bt_setColorPressed(bt_login);
    }//GEN-LAST:event_bt_loginMousePressed

    private void bt_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt_loginMouseReleased
        bt_setColorReleased(bt_login);
    }//GEN-LAST:event_bt_loginMouseReleased

    private void bt_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_loginActionPerformed
        LogInCtrl.login(lb_info, tfsdt, tf_passwd, this);
    }//GEN-LAST:event_bt_loginActionPerformed
    void bt_setColorPressed(JButton bt) {
        bt.setBackground(new Color(102, 102, 255));
    }

    void bt_setColorReleased(JButton bt) {
        bt.setBackground(new Color(153, 153, 255));
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_cancel;
    private javax.swing.JButton bt_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lb_info;
    private javax.swing.JPanel pnlC;
    private javax.swing.JPanel pnlW;
    private javax.swing.JPasswordField tf_passwd;
    private javax.swing.JTextField tfsdt;
    // End of variables declaration//GEN-END:variables
}
