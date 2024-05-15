package _JDBC_TEKRAR;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PARENT {
    public static Connection baglanti;
    public static Statement soraEkran;
    public static void JDBCOpen(){
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        try {
            baglanti= DriverManager.getConnection(url,username,password);
            soraEkran=baglanti.createStatement();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void JDBCClose(){
        try {
            baglanti.close();
        }catch (SQLException ee) {
            System.out.println(ee.getMessage());
        }
    }
}
