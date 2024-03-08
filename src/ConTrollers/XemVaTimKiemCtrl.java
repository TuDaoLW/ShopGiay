package ConTrollers;

import static UI.menuAdmin.jTable4;
import static UI.menuAdmin.tbHH;
import static UI.menuAdmin.soNV;
import static UI.menuAdmin.lbsoHH;
import entity.DBconnector;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;
import javax.swing.table.TableModel;

public class XemVaTimKiemCtrl {

    public static void updatetableNV() {// cap nhat bang nhan vien
        NvienCtrl.numberofnv = DisplayData(jTable4, "select * from dbo.NhanVien ");
        soNV.setText("" + NvienCtrl.numberofnv);
    }

    public static void updatetableHH() {// cap nhat bang hang hoa
        HangHoaCtrl.numberofHH = DisplayData(tbHH, "select * from dbo.Giay ");
        lbsoHH.setText("" + HangHoaCtrl.numberofHH);
    }

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

    public static void timHang(JTextField hang, JTextField size, JTextField mau) {
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
            DisplayData(tbHH, "select * from dbo.Giay where " + el[3]);

        } else {
            DisplayData(tbHH, "select * from dbo.Giay");
        }
        hang.setText("");
        size.setText("");
        mau.setText("");
    }
}
