package ConTrollers;

import static UI.menuAdmin.tbNV;
import entity.DBconnector;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class NvienCtrl {

    public static int numberofnv; //tong so nhan vien
    public static String[] suaNV = {"", "", "", "", "", "", "", ""};// luu thong tin nguoi dung can sua doi
    public static String[] currentusr = {"", "", "", "", "", "", "cv", "tt"}; // luu thong tin nguoi dung hien tai

    public static boolean themNV(
            JTextField sdt, JTextField password,
            JTextField name, int gioitinh,
            JTextField address, JTextField rate,
            JComboBox cboxchucvu, JDialog f) {
        //them nhan vien moi
        if (sdt.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "SDT hoặc password trống");
            return false;
        }
        if (DBconnector.kiemtratrunglap("select * from dbo.NhanVien where SoDienThoai ='" + sdt.getText() + "'")) {
            JOptionPane.showMessageDialog(f, "Tên đăng nhập đã tồn tại");
            return false;
        }
        try {
            Integer.parseInt(rate.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Lương không hợp lệ");
        }
        DBconnector.updateData("INSERT INTO dbo.NhanVien (SoDienThoai, Password, HoTen, GioiTinh, DiaChi, Luong, ChucVu, TrangThaiTaiKhoan) \n"
                + "	VALUES ('" + sdt.getText() + "',"
                + " '" + password.getText() + "', "
                + "'" + name.getText() + "',"
                + " " + gioitinh + ","
                + " '" + address.getText() + "',"
                + " " + Integer.valueOf(rate.getText()) + ","
                + " " + cboxchucvu.getSelectedIndex() + ","
                + " " + 1 + ") \n");
        XemVaTimKiemCtrl.showtableNV();
        JOptionPane.showMessageDialog(f, "Thêm thành công");
        return true;
    }

    public static boolean suaNV(
            JTextField sdt, JTextField password,
            JTextField name, int gioitinh,
            JTextField address, JTextField rate,
            JComboBox cboxchucvu, JCheckBox jcbstate,
            JDialog f, JLabel lbuser
    ) {
        // sua thong tin nhan vien
        if (sdt.getText().equals("") || password.getText().equals("")) {
            JOptionPane.showMessageDialog(f, "Username hoặc password trống");
            return false;
        }
        int trangthai = 1;
        if (jcbstate.isSelected()) {
            trangthai = 0;
        }
        try {
            Integer.parseInt(rate.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Lương không hợp lệ");
            return false;
        }
        DBconnector.updateData("update dbo.NhanVien\n"
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
        XemVaTimKiemCtrl.showtableNV();
        JOptionPane.showMessageDialog(f, "Cập nhật thành công");
        f.dispose();
        return true;
    }

    public static boolean laythongtinNV() {
        int row = tbNV.getSelectedRow();
        if (row < 0 || tbNV.getValueAt(row, 0).equals("")) {
            return false;
        }
        for (int i = 0; i < tbNV.getColumnCount(); i++) {
            NvienCtrl.suaNV[i] = (String) tbNV.getValueAt(row, i);
        }
        return true;
    }

}
