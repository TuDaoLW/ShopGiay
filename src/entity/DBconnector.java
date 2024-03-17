package entity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class DBconnector {

    static String dblink = "jdbc:sqlserver://localhost:1433;databaseName=shopgiay;user=sa;password=tudao;encrypt=true;trustServerCertificate=true";

    // link ket noi toi database
    public static ResultSet getData(String stm) {
        ResultSet resultSet = null;// dung lay du lieu tu DB 
        try {
            Connection connection = DriverManager.getConnection(dblink);
            Statement statement = connection.createStatement();
            resultSet = statement.executeQuery(stm);
        } catch (SQLException e) {
        }
        return resultSet; //kq 
    }

    public static int getKeyID(String stm) {// dung de ghi du lieu len DB, tra ve ID cua doi tuong
        ResultSet resultSet;
        try (Connection connection = DriverManager.getConnection(dblink); PreparedStatement prepsInsertProduct = connection.prepareStatement(stm, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("genarated"+resultSet.getInt(1));
                return resultSet.getInt(1);
            }
        } catch (Exception e) {
        }
        return -1;
    }

    public static boolean kiemtratrunglap(String stm) {
        boolean records = false;// =0 la khong trung
        try {
            ResultSet rs = DBconnector.getData(stm);
            while (rs.next()) {
                records = true;
            }
        } catch (SQLException ex) {
            System.out.println("DB error");
        } catch (NullPointerException e) {
            System.out.println("No data found");
        }
        return records; // so ban ghi thoa man truy van
    }
}
  /*
    public static ResultSet pushData(String stm) {
        //"insert into dbo.test (name) values('saoiet')"
        ResultSet resultSet = null;
        try (Connection connection = DriverManager.getConnection(dblink); PreparedStatement prepsInsertProduct = connection.prepareStatement(stm, Statement.RETURN_GENERATED_KEYS);) {
            prepsInsertProduct.execute();
            resultSet = prepsInsertProduct.getGeneratedKeys();
            while (resultSet.next()) {
                System.out.println("push " + resultSet.getInt(1));
            }
        } catch (SQLException e) {
        }

        return resultSet;// id duoc tao boi database
    }
     */
