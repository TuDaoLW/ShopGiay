package ConTrollers;

import entity.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NvienCtrl {

    public static int numberofnv; //tong so nhan vien
    public static String[] suaNV = {"", "", "", "", "", "", "", ""};// luu thong tin nguoi dung can sua doi
    public static String[] currentusr = {"", "", "", "", "", "", "", ""}; // luu thong tin nguoi dung hien tai

    public static void themNV(
            JTextField sdt, JTextField password,
            JTextField name, int gioitinh,
            JTextField address, JTextField rate,
            JComboBox cboxchucvu, JFrame f) {
        //them nhan vien moi
        if (sdt.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "SDT hoặc password trống");
            return;
        }
        if (DBconnector.kiemtratrunglap("select * from dbo.NhanVien where SoDienThoai ='" + sdt.getText() + "'")) {
            JOptionPane.showMessageDialog(f, "Tên đăng nhập đã tồn tại");
            return;
        }
        try {
            Integer.parseInt(rate.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Lương không hợp lệ");
        }
        DBconnector.getKeyID("INSERT INTO dbo.NhanVien (SoDienThoai, Password, HoTen, GioiTinh, DiaChi, Luong, ChucVu, TrangThaiTaiKhoan) \n"
                + "	VALUES ('" + sdt.getText() + "',"
                + " '" + password.getText() + "', "
                + "'" + name.getText() + "',"
                + " " + gioitinh + ","
                + " '" + address.getText() + "',"
                + " " + Integer.valueOf(rate.getText()) + ","
                + " " + cboxchucvu.getSelectedIndex() + ","
                + " " + 1 + ") \n");
        XemVaTimKiemCtrl.updatetableNV();
        JOptionPane.showMessageDialog(f, "Thêm thành công");
    }

    public static void suaNV(
            JTextField sdt, JTextField password,
            JTextField name, int gioitinh,
            JTextField address, JTextField rate,
            JComboBox cboxchucvu, JCheckBox jcbstate,
            JFrame f, JLabel lbuser
    ) {
        // sua thong tin nhan vien
        if (sdt.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Username hoặc password trống");
            return;
        }
        int trangthai = 1;
        if (jcbstate.isSelected()) {
            trangthai = 0;
        }
        try {
            Integer.parseInt(rate.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Lương không hợp lệ");
            return;
        }
        DBconnector.getKeyID("update dbo.NhanVien\n"
                + "set\n"
                + "SoDienThoai = '" + sdt.getText() + "',\n"
                + "Password = '" + password.getText() + "',\n"
                + "HoTen = '" + name.getText() + "',\n"
                + "GioiTinh =" + gioitinh + ",\n"
                + "DiaChi ='" + address.getText() + "',\n"
                + "Luong=" + rate.getText() + ",\n"
                + "ChucVu=" + cboxchucvu.getSelectedIndex() + ",\n"
                + "TrangThaiTaiKhoan=" + trangthai + "\n"
                + "where SoDienThoai like '%" + lbuser.getText() + "%'"
        );
        System.out.println(cboxchucvu.getSelectedIndex());
        XemVaTimKiemCtrl.updatetableNV();
        JOptionPane.showMessageDialog(f, "Cập nhật thành công");
        f.dispose();
    }

}
