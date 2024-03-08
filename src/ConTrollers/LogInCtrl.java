package ConTrollers;

import UI.menuAdmin;
import UI.menuNhanvien;
import entity.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class LogInCtrl {

    // array[0] la trang thai tai khoan, arr[1] la chuc vu cua nguoi dung
    public static void login(JLabel lb_info, JTextField tfsdt,
            JPasswordField tf_passwd, JFrame f) {
        int[] array = {-1, -1};
        ResultSet resultSet = DBconnector.getData("select * from dbo.NhanVien where SoDienThoai = '" + tfsdt.getText() + "' and Password = '" + tf_passwd.getText() + "' ");
        try {
            while (resultSet.next()) {
                for (int i = 0; i < 8; i++) {
                    NvienCtrl.currentusr[i] = resultSet.getString(i + 1);
                }
                array[0] = resultSet.getInt(8);
                array[1] = resultSet.getInt(7);
            }
        } catch (SQLException ex) {
            System.out.println("DB err");
        } catch (NullPointerException e) {
            System.out.println("No acc found");
        }
        System.out.println(array[0] + " " + array[1]); // log thong tin dang nhap
        switch (array[0]) {
            case 0 ->
                lb_info.setText("tài khoản đã bị vô hiệu hóa");
            case 1 -> {
                //luu ten nguoi dang nhap hien tai
                if (array[1] == 1) {
                    new menuAdmin().setVisible(true);
                } else {
                    new menuNhanvien().setVisible(true);
                }
                f.dispose();
            }
            default ->
                lb_info.setText("Sai thông tin đăng nhập");
        }
    }

}
