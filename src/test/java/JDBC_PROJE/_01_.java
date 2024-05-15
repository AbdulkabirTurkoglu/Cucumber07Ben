package JDBC_PROJE;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _01_ extends JDBCParent_EMPLOYEES {
    @Test
    public void test_01() throws SQLException {
        DBopen_employ();
        ResultSet rs = sorguEkrani.executeQuery("select * from titles");

        while (rs.next() )
        System.out.println(rs.getString(2));



        DBclos_employ();
    }
}
