package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_MetaData extends JDBCParent{
    @Test
    public void test06() throws SQLException {
        DBConnectionOpen();
        ResultSet rr = sorguEkrani.executeQuery("select city_id, city, country_id from city");

        rr.next();
        System.out.println("id : "+ rr.getString(1));
        System.out.println("id : "+ rr.getString("city_id"));
        
        int intID = rr.getInt("city_id");
        System.out.println("intID = " + intID);
        DBConnectionClose();
    }
    @Test
    public void test066() throws SQLException {
        DBConnectionOpen();
        ResultSet rr = sorguEkrani.executeQuery("select * from city");

        ResultSetMetaData rsmd = rr.getMetaData();

        int kolonSayisi = rsmd.getColumnCount();
        System.out.println("kolonSayisi = " + kolonSayisi);

        for (int i = 1; i <kolonSayisi ; i++) {
            System.out.println( rsmd.getColumnName(i));
        }
        rr.next();
        System.out.println("1. kolon = "+ rr.getString(1));
        System.out.println("2. kolon = "+ rr.getString(2));
        System.out.println("3. kolon = "+ rr.getString(3));

        System.out.println("*********************");

        for (int i = 1; i < kolonSayisi; i++) {
            System.out.println(i+". kolon : "+ rr.getString(i));
        }


        DBConnectionClose();
    }
}
