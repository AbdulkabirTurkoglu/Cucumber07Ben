package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_soru extends PARENT{
    @Test
    public void test5() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select city from city");

        rs.last();
        int sonSatir = rs.getRow();

        for (int i = 1; i <=sonSatir ; i++) {
            rs.absolute(i);
            System.out.println(i+". satir : " + rs.getString(1));

        }

        JDBCClose();
    }


    @Test
    public void test55() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select city from city");

        rs.last();
        int sonSatir=rs.getRow();

        rs.first();
        for (int i = 1; i <=sonSatir ; i++) {
            rs.relative(1);
            System.out.println((i+1)+" . satir : "+ rs.getString(1));
        }


        JDBCClose();

    }
}
