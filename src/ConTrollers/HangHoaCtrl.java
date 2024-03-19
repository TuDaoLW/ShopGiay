package ConTrollers;

import UI.menuAdmin;
import UI.menuNhanvien;
import entity.DBconnector;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class HangHoaCtrl {

    public static int numberofHH;
    public static String[] suaHH = {"", "", "", "", "", "", "", "", "", ""};

    public static boolean themHH(
            JTextField tensp, JTextField hang,
            JTextField size, JTextField mausac,
            JTextField soluong, JTextField giaban,
            JTextField gianhap, JDialog f) {
        String err = "";
        if (DBconnector.kiemtratrunglap("select * from dbo.Giay "
                + "where TenSP ='" + tensp.getText() + "' "
                + "and Hang ='" + hang.getText() + "' "
                + "and Size ='" + size.getText() + "' "
                + "and MauSac ='" + mausac.getText() + "' ")) {
            // xem sp đã có hay chưa 
            JOptionPane.showMessageDialog(f, "Sản phẩm đã tồn tại");
            return false;
        }
        try {
            err = "size";
            Integer.parseInt(size.getText());
            err = "số lượng";
            Integer.parseInt(soluong.getText());
            err = "giá bán";
            Integer.parseInt(giaban.getText());
            err = "giá nhập";
            Integer.parseInt(gianhap.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Nhập số cho " + err);
            return false;
        }

        DBconnector.updateData("INSERT INTO dbo.Giay (TenSp, Hang, Size, MauSac, SoLuong, GiaBan, GiaNhap) \n"
                + "	VALUES ('" + tensp.getText() + "',"
                + " '" + hang.getText() + "', "
                + " " + Integer.valueOf(size.getText()) + ","
                + " '" + mausac.getText() + "',"
                + " " + Integer.valueOf(soluong.getText()) + ","
                + " " + Integer.valueOf(giaban.getText()) + ","
                + " " + Integer.valueOf(gianhap.getText()) + ") \n");
        if (NvienCtrl.currentusr[6].equals("1")) {
            XemVaTimKiemCtrl.showtableHH(menuAdmin.tbHH, menuAdmin.lbsoHH);
        } else {
            XemVaTimKiemCtrl.showtableHH(menuNhanvien.tbHHnv, menuNhanvien.lbsoHHnv);
        }
        JOptionPane.showMessageDialog(f, "Thêm hàng thành công");
        return true;
    }

    public static boolean suaHHf(
            JTextField tensp, JTextField hang,
            JTextField size, JTextField mausac,
            JTextField soluong, JTextField giaban,
            JTextField gianhap, JDialog f) {
        String err = "";

        try {
            err = "size";
            Integer.parseInt(size.getText());
            err = "số lượng";
            Integer.parseInt(soluong.getText());
            err = "giá bán";
            Integer.parseInt(giaban.getText());
            err = "giá nhập";
            Integer.parseInt(gianhap.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(f, "Nhập số cho " + err);
            return false;
        }
        DBconnector.updateData(
                "update dbo.Giay\n"
                + "set\n"
                + "TenSP = '" + tensp.getText() + "',\n"
                + "Hang = '" + hang.getText() + "',\n"
                + "Size = '" + Integer.valueOf(size.getText()) + "',\n"
                + "MauSac = '" + mausac.getText() + "',\n"
                + "SoLuong = '" + Integer.valueOf(soluong.getText()) + "',\n"
                + "GiaBan ='" + Integer.valueOf(giaban.getText()) + "',\n"
                + "GiaNhap ='" + Integer.valueOf(gianhap.getText()) + "' \n"
                + "where ID = '" + Integer.valueOf(suaHH[0]) + "'\n ");

        if (NvienCtrl.currentusr[6].equals("1")) {
            XemVaTimKiemCtrl.showtableHH(menuAdmin.tbHH, menuAdmin.lbsoHH);
        } else {
            XemVaTimKiemCtrl.showtableHH(menuNhanvien.tbHHnv, menuNhanvien.lbsoHHnv);
        }
        JOptionPane.showMessageDialog(f, "Cập nhật thành công");
        f.dispose();
        return true;
    }

    public static boolean laythongtinHH(JTable tb) {
        int row = tb.getSelectedRow();
        if (row < 0 || tb.getValueAt(row, 0).equals("")) {
            return false;
        }
        for (int i = 0; i < tb.getColumnCount(); i++) {
            HangHoaCtrl.suaHH[i] = (String) tb.getValueAt(row, i);
        }
        return true;
    }
}
