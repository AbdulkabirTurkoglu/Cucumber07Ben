package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_soru_2 extends JDBCParent{
    @Test
    public void test22() throws SQLException {
        DBConnectionOpen();
        ResultSet sonuc =sorguEkrani.executeQuery("select * from city");

        while (sonuc.next())
            System.out.println(sonuc.getString("city"));

        DBConnectionClose();

    }

    @Test
    public void test2() throws SQLException {
        DBConnectionOpen();
        ResultSet sonuc =sorguEkrani.executeQuery("select * from city");

        while (sonuc.next())
            System.out.println(sonuc.getString(2));

        DBConnectionClose();

    }
}
