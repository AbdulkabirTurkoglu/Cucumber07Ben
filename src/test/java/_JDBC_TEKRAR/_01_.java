package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_ extends PARENT{
    @Test
    public void test01() throws SQLException {
        JDBCOpen();
        ResultSet rr = soraEkran.executeQuery("select * from customer");

        rr.next();
        String ad= rr.getString("first_name");
        String soyad= rr.getString("last_name");
        System.out.println("1. Satır ad ve soyad " + ad+ " "+ soyad);

        JDBCClose();
    }
}
