package ConTrollers;

import UI.addHD;
import UI.menuAdmin;
import UI.menuNhanvien;
import entity.Item;
import entity.DBconnector;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class HoaDonCtrl {

    public static int numberofHD = 0, maxsl = -1, tong, loinhuan, maHD;
    public static String XemHD;
    public static LocalDate date = LocalDate.now();
    public static LocalTime time;

    public static boolean ChonHang(JDialog jd, JLabel hang, JSpinner spn) {
        JTable tb = menuAdmin.tbHH;
        if (!NvienCtrl.currentusr[6].equals("1")) {
            tb = menuNhanvien.tbHHnv;
        } //chon bang
        if (!HangHoaCtrl.laythongtinHH(tb)) {
            JOptionPane.showMessageDialog(jd, "Hãy chọn mặt hàng từ bảng");
            return false;
        }
        // chon hang tu bang HH xong
        if (Item.containItem(HangHoaCtrl.suaHH[0])) {
            JOptionPane.showMessageDialog(jd, " Đã tồn tại mặt hàng này trong hóa đơn");
            return false;
        }//ktra trung lap
        try {
            maxsl = Integer.parseInt(HangHoaCtrl.suaHH[5]);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi parse số lượng");
            return false;
        }
        if (maxsl == 0) {
            JOptionPane.showMessageDialog(jd, "Hết hàng, vui lòng chọn hàng khác");
            return false;
        }
        // khi chon hang thanh cong:
        hang.setText("SP: " + HangHoaCtrl.suaHH[1] + " - "
                + HangHoaCtrl.suaHH[2] + " - "
                + " Size " + HangHoaCtrl.suaHH[3] + " - "
                + HangHoaCtrl.suaHH[4]);// hien thi mat hang dang duoc chon
        spn.setModel(new javax.swing.SpinnerNumberModel(1, 1, maxsl, 1));
        return true;
    }

    public static void ThemHang(JDialog jd, JSpinner spn, JLabel lbtong) {
        int vl = (int) spn.getValue();
        if (vl > maxsl) {
            JOptionPane.showMessageDialog(jd, " Lỗi số lượng");
            return;
        }
        if (Item.containItem(HangHoaCtrl.suaHH[0])) {
            JOptionPane.showMessageDialog(jd, " Đã tồn tại mặt hàng này trong hóa đơn");
            return;
        }//ktra trung lap
        Item tmp = new Item(
                HangHoaCtrl.suaHH[0],
                vl,
                Integer.parseInt(HangHoaCtrl.suaHH[6]),
                Integer.parseInt(HangHoaCtrl.suaHH[7])
        );
        Item.dsmuaH.add(tmp);
        tong += vl * tmp.sell;
        loinhuan += vl * tmp.sell - vl * tmp.buy;
        System.out.println("loi " + loinhuan);// log loi nhuan
        lbtong.setText(tong + " vnd");
        // in len bang
        DefaultTableModel model = (DefaultTableModel) addHD.tbHD.getModel();
        model.addRow(new Object[]{"" + HangHoaCtrl.suaHH[0],
            HangHoaCtrl.suaHH[1] + "-" + HangHoaCtrl.suaHH[2],
            "Size " + HangHoaCtrl.suaHH[3] + "-" + HangHoaCtrl.suaHH[4],
            "" + vl,
            HangHoaCtrl.suaHH[6]});
    }

    public static void xoahang(JLabel sum) {
        int row = addHD.tbHD.getSelectedRow();
        Item del = Item.dsmuaH.get(row);
        System.out.println("xoa vat pham: " + del.ID + " " + del.SL);
        tong -= del.SL * del.sell;
        loinhuan = loinhuan + del.SL * del.buy - del.SL * del.sell;
        Item.dsmuaH.remove(row);
        sum.setText(tong + "");
        System.out.println("loi nhuan sau khi xoa " + loinhuan);
        DefaultTableModel model = (DefaultTableModel) addHD.tbHD.getModel();
        model.removeRow(row);
    }

    public static boolean layHangCanXoa() {
        int row = addHD.tbHD.getSelectedRow();
        return !(row < 0 || addHD.tbHD.getValueAt(row, 1).equals(""));
    }

    public static void khoitaoHD(JLabel lbtime, JLabel usr, JLabel lbmaHD) {
        date = LocalDate.now();// khoi tao cac tham so cho hoa don
        time = LocalTime.now();
        System.out.println(date);
        System.out.println(time);
        lbtime.setText(date + " " + time.getHour() + ":" + time.getMinute());
        usr.setText(NvienCtrl.currentusr[2]);
        maHD = DBconnector.pushData("insert into dbo.HoaDon(TenKH) values('empty')");
        lbmaHD.setText(maHD + "");
        //tao hoa don rong, tra ve ma hoa don
        Item.dsmuaH.clear();
        tong = 0;
        loinhuan = 0;
    }

    public static void huyHD(JLabel maHD) {// xoa hoa don vua duoc tao o database
        DBconnector.pushData("delete from dbo.HoaDon where MaHD ='" + maHD.getText() + "' ");
    }

    public static void xacnhanthem(JTextField tfKH) {
        // ghi hoa don vao database
        DBconnector.pushData("update dbo.HoaDon\n"
                + "set\n"
                + "SDT='" + NvienCtrl.currentusr[0] + "',\n"
                + "TenKh='" + tfKH.getText() + "',\n"
                + "TongTien='" + tong + "',\n"
                + "LoiNhuan='" + loinhuan + "',\n"
                + "ThoiGian='" + date + " " + time.getHour() + ":" + time.getMinute() + "'\n"
                + "where MaHD='" + maHD + "' ");
        //ghi chitiet HD vao DB
        for (Item it : Item.dsmuaH) {
            DBconnector.pushData("insert into dbo.ChiTietHD(MaHD,MaHH,SoLuong,GiaBan) "
                    + "values("
                    + "'" + maHD + "',"
                    + "'" + it.ID + "',"
                    + "'" + it.SL + "',"
                    + "'" + it.sell + "'"
                    + ")"
            );
        }
    }

    public static boolean laythongtinHD(JTable tbhd) {
        int row = tbhd.getSelectedRow();
        if (row < 0 || tbhd.getValueAt(row, 0).equals("")) {
            return false;
        }
        HoaDonCtrl.XemHD = (String) tbhd.getValueAt(row, 0);
        System.out.println("HD so: " + XemHD);
        return true;
    }
}
