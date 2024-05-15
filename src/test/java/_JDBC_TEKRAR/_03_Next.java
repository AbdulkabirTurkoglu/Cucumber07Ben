package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_Next extends PARENT{
    @Test
    public void  test03() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select film_id, title, description from film");

        rs.next();
        System.out.println(rs.getString(2));

        rs.absolute(50);
        System.out.println(rs.getString(2));

        rs.relative(1);
        System.out.println(rs.getString(2));

        rs.last();
        System.out.println(rs.getString(2));

        rs.first();
        System.out.println(rs.getString(2));




        JDBCClose();
    }
}
