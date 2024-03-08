package ConTrollers;

import entity.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class HangHoaCtrl {

    public static int numberofHH;
    public static String[] suaHH = {"", "", "", "", "", "", "", "", "", ""};

    public static void themHH(
            JTextField tensp, JTextField hang,
            JTextField size, JTextField mausac,
            JTextField soluong, JTextField giaban,
            JTextField gianhap, JFrame f) {
        String err = "";
        if (DBconnector.kiemtratrunglap("select * from dbo.Giay "
                + "where TenSP ='" + tensp.getText() + "' "
                + "and Hang ='" + hang.getText() + "' "
                + "and Size ='" + size.getText() + "' "
                + "and MauSac ='" + mausac.getText() + "' ")) {
            // xem sp đã có hay chưa 
            JOptionPane.showMessageDialog(f, "Sản phẩm đã tồn tại");
            return;
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
            return;
        }

        DBconnector.getKeyID("INSERT INTO dbo.Giay (TenSp, Hang, Size, MauSac, SoLuong, GiaBan, GiaNhap) \n"
                + "	VALUES ('" + tensp.getText() + "',"
                + " '" + hang.getText() + "', "
                + " " + Integer.valueOf(size.getText()) + ","
                + " '" + mausac.getText() + "',"
                + " " + Integer.valueOf(soluong.getText()) + ","
                + " " + Integer.valueOf(giaban.getText()) + ","
                + " " + Integer.valueOf(gianhap.getText()) + ") \n");
        XemVaTimKiemCtrl.updatetableHH();
        JOptionPane.showMessageDialog(f, "Thêm hàng thành công");
    }

    public static void suaHHf(
            JTextField tensp, JTextField hang,
            JTextField size, JTextField mausac,
            JTextField soluong, JTextField giaban,
            JTextField gianhap, JFrame f) {
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
            return;
        }
        DBconnector.getKeyID(
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

        XemVaTimKiemCtrl.updatetableHH();
        JOptionPane.showMessageDialog(f, "Cập nhật thành công");
        f.dispose();
    }

}
