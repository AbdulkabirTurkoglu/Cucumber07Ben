package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_ extends PARENT{
    @Test
    public void test1() throws SQLException {
        JDBCOpen();
        ResultSet resultSet = soraEkran.executeQuery("select * from city");

        while (resultSet.next())
            System.out.println(resultSet.getString("city"));

        JDBCClose();
    }
}
