package ConTrollers;

import UI.menuAdmin;
import entity.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class XemVaTimKiemCtrl {

    public static int DisplayData(javax.swing.JTable a, String stm) {
        // bang, cau lenh sql // hien thi thong tin len bang
        int records = 0, column = a.getColumnCount();
        try {
            TableModel model = a.getModel();
            for (int j = 0; j < model.getRowCount(); j++) {
                for (int k = 0; k < column; k++) {
                    model.setValueAt("", j, k);
                }
            }// lam moi bang
            ResultSet rs = DBconnector.getData(stm);
            while (rs.next()) {
                for (int j = 0; j < column; j++) {
                    model.setValueAt(rs.getString(j + 1), records, j);
                }
                records++;
            }// cap nhat thong tin len bang
        } catch (SQLException ex) {
            System.out.println("DB error");
        } catch (NullPointerException e) {
            System.out.println("No data found");
        }
        return records; // so ban ghi thoa man truy van
    }

    public static void showtableNV() {// cap nhat bang nhan vien
        NvienCtrl.numberofnv = DisplayData(menuAdmin.tbNV, "select * from dbo.NhanVien ");
        menuAdmin.soNV.setText("" + NvienCtrl.numberofnv);
    }

    public static void showtableHH(JTable tbhh, JLabel lbsohh) {// cap nhat bang hang hoa
        HangHoaCtrl.numberofHH = DisplayData(tbhh, "select * from dbo.Giay ");
        lbsohh.setText("" + HangHoaCtrl.numberofHH);
    }

    public static void XemHoaDon(JTable tb) {
        DisplayData(tb, "select * from shopgiay.dbo.HoaDon order by ThoiGian DESC ");
    }

    public static void xemdoanhso(JTable tb, int m, int y, JLabel lbkq) {// cap nhat bang doanh so
        String stm1 = "select SDT, count(*), sum(TongTien), sum(LoiNhuan)\n"
                + "from shopgiay.dbo.HoaDon\n"
                + "where month(Thoigian)='" + m + "' and year(ThoiGian)='" + y + "'\n"
                + "group by SDT\n"
                + "order by sum(LoiNhuan) DESC, sum(TongTien) DESC";
        String stm2 = "select sum(TongTien), sum(LoiNhuan)\n"
                + "from shopgiay.dbo.HoaDon\n"
                + "where month(Thoigian)='" + m + "' and year(ThoiGian)='" + y + "' ";
        if (!NvienCtrl.currentusr[6].equals("1")) {
            stm1 = "select * from shopgiay.dbo.HoaDon \n"
                    + "where month(Thoigian)='" + m
                    + "' and year(ThoiGian)='" + y
                    + "' and SDT='" + NvienCtrl.currentusr[0] + "'\n"
                    + "order by ThoiGian DESC ";
            stm2 = "select sum(TongTien), sum(LoiNhuan)\n"
                    + "from shopgiay.dbo.HoaDon\n"
                    + "where month(Thoigian)='" + m + "' and year(ThoiGian)='" + y + "' and SDT='" + NvienCtrl.currentusr[0] + "' ";
        }
        DisplayData(tb, stm1);
        int sum = 0, pro = 0;
        ResultSet rs = DBconnector.getData(stm2);
        try {
            while (rs.next()) {
                sum = rs.getInt(1);
                pro = rs.getInt(2);
                System.out.println(sum + ":" + pro);
            }
        } catch (SQLException ex) {
            System.out.println("No record in HD");
        }
        lbkq.setText(sum + "/" + pro);
    }

    public static void timHang(JTextField hang, JTextField size, JTextField mau, JTable tb) {
        String[] el = {hang.getText(), size.getText(), mau.getText(), ""};
        //el[3] la cau querry DB
        if (!el[0].equals("")) {
            el[3] += " Hang like '%" + el[0] + "%' ";
        }
        if (!el[1].equals("")) {
            if (!el[3].equals("")) {
                el[3] += "and";
            }
            el[3] += " Size ='" + el[1] + "' ";
        }
        if (!el[2].equals("")) {
            if (!el[3].equals("")) {
                el[3] += "and";
            }
            el[3] += " MauSac like '%" + el[2] + "%' ";
        }
        if (!el[3].equals("")) {
            DisplayData(tb, "select * from dbo.Giay where " + el[3]);

        } else {
            DisplayData(tb, "select * from dbo.Giay");
        }
        hang.setText("");
        size.setText("");
        mau.setText("");
    }

    public static void timNhanVien(JTable tb, JTextField lb) {
        DisplayData(tb, "select * from dbo.NhanVien where HoTen like '%" + lb.getText() + "%' ");
    }
}
