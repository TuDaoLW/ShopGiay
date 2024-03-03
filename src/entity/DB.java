package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import javax.swing.table.TableModel;

public class DB {

    static String dblink = "jdbc:sqlserver://localhost:1433;databaseName=shopgiay;user=sa;password=tudao;encrypt=true;trustServerCertificate=true";

    public static ResultSet getData(String stm) {

        ResultSet resultSet = null;
        try {
            Connection connection = DriverManager.getConnection(dblink);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(stm);
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString(1) + " " + resultSet.getString(2));
//            }

        } catch (SQLException e) {
        }
        return resultSet;
    }

    public static ResultSet pushData(String stm) {
        //"insert into dbo.test (name) values('saoiet')"
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(dblink); PreparedStatement prepsInsertProduct = connection.prepareStatement(stm, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
        } catch (Exception e) {
        }
        return resultSet;
    }

    public static int DisplayData(javax.swing.JTable a, String stm, int column) {
        int i = 0;
        try {
            TableModel model = a.getModel();
            for (int j = 0; j < model.getRowCount(); j++) {
                for (int k = 0; k < column; k++) {
                    model.setValueAt("", j, k);
                }
            }

            ResultSet rs = DB.getData(stm);
            while (rs.next()) {
                for (int j = 0; j < column; j++) {
                    model.setValueAt(rs.getString(j + 1), i, j);
                }
                i++;
            }
        } catch (SQLException ex) {
        }
        return i;
    }

}
