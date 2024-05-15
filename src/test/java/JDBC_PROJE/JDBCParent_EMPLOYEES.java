package JDBC_PROJE;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCParent_EMPLOYEES {
    public static Connection baglanti;
    public static Statement sorguEkrani;

    public static void DBopen_employ() {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/employees";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
            baglanti = DriverManager.getConnection(url, username, password);
            sorguEkrani = baglanti.createStatement();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void DBclos_employ() {
        try {
            baglanti.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }
}
