package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _07_soru extends PARENT {
    @Test
    public void test7() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.println(rsmd.getColumnName(i) + "\t");

        System.out.println();

        while (rs.next()) {
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.println(rs.getString(i));

            System.out.println();
        }
        JDBCClose();
    }

    @Test
    public void test77() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();
        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i)+"\t");
        System.out.println();

        rs.last();
        int sonSatir = rs.getRow();
        for (int i = 1; i <= sonSatir; i++) {
            rs.absolute(i);

            for (int j = 1; j <= rsmd.getColumnCount(); j++)
                System.out.print(rs.getString(j));
            System.out.println();
        }
        JDBCClose();
    }
}
