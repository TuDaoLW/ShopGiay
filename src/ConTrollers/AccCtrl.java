package ConTrollers;

import entity.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class AccCtrl {

    public static void doimatkhau(JPasswordField pf1, JPasswordField pf2, JPasswordField pf3) {
        String tx1 = pf1.getText();
        String tx2 = pf2.getText();
        String tx3 = pf3.getText();
        //doi mat khau user hien tai
        ResultSet rs = DBconnector.getData("select Password from dbo.NhanVien where SoDienThoai = '" + NvienCtrl.currentusr[0] + "' ");
        try {
            while (rs.next()) {
                if (!tx1.equals(rs.getString(1))) {
                    JOptionPane.showMessageDialog(null, "Mật khẩu cũ không đúng");
                    return;
                }
            }
        } catch (SQLException e) {
            System.out.println("DB err");
        }catch (NullPointerException e) {
            System.out.println("usr name might have changed");
        }
        if (!tx2.equals(tx3)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu mới không trùng nhau");
            return;
        }
        if (tx1.equals(tx2)) {
            JOptionPane.showMessageDialog(null, "Mật khẩu mới giống mật khẩu cũ");
            return;
        }
        DBconnector.getKeyID("update dbo.NhanVien set Password = '" + tx2 + "' where SoDienThoai='" + NvienCtrl.currentusr[0] + "' ");
        JOptionPane.showMessageDialog(null, "Đổi mật khẩu thành công");
        resetpassfield(pf1, pf2, pf3);
    }

    public static void showUserData(
            JLabel lbsdt, JLabel lbten,
            JLabel lbsex, JLabel lbadd,
            JLabel lbluong, JLabel lbchucvu
    ) {
        //thong tin user hien tai
        lbsdt.setText(NvienCtrl.currentusr[0]);
        lbten.setText(NvienCtrl.currentusr[2]);
        if (NvienCtrl.currentusr[3].equals("1")) {
            lbsex.setText("Nam");
        } else {
            lbsex.setText("Nữ");
        }
        lbadd.setText(NvienCtrl.currentusr[4]);
        lbluong.setText(NvienCtrl.currentusr[5]);
        if (NvienCtrl.currentusr[7].equals("1")) {
            lbchucvu.setText("Admin");
        } else {
            lbchucvu.setText("Nhân viên");
        }
    }

    public static void resetpassfield(JPasswordField pf1, JPasswordField pf2, JPasswordField pf3) {
        pf1.setText("");
        pf2.setText("");
        pf3.setText("");
    }
}
