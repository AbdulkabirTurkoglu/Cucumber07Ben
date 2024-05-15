package Utilities;

import java.sql.*;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtitity_Tekrar {
    public static Connection baglanti;
    public static Statement sorguEkrani;

    public static List<List<String>> GetListData(String sorgu){
        List<List<String>> tablo = new ArrayList<>();
        try {
            JDBCOpen();
            ResultSet rs = sorguEkrani.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();

            ArrayList<String> satir = new ArrayList<>();
            while (rs.next()){
                for (int i = 1; i < rsmd.getColumnCount() ; i++)
                    satir.add(rs.getString(i));
                tablo.add(satir);
            }
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
        JDBClose();
        return tablo;
    }

    public static void  JDBCOpen(){
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String userName = "root";
        String password = "'\"-LhCB'.%k[4S]z";
        try {
             baglanti = DriverManager.getConnection(url, userName, password);
             sorguEkrani=baglanti.createStatement();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void JDBClose(){
        try {
            baglanti.close();
        }catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

