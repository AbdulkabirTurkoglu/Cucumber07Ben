package _JDBC;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_tekrar {
    @Test
    public void test011() throws SQLException {
        String url="jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com/sakila";
        String username="root";
        String password="'\"-LhCB'.%k[4S]z";
        Connection baglanti = DriverManager.getConnection(url, username, password);
        Statement sorguEkrani = baglanti.createStatement();
        ResultSet sonuc = sorguEkrani.executeQuery("select * from customer");

        sonuc.next();
        String ad = sonuc.getString("first_name");
        String soyad = sonuc.getString("last_name");
        System.out.println("ad ve soyad = " + ad + " "+soyad);


        baglanti.close();
    }

}
