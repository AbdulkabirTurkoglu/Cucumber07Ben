package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _07_soru extends JDBCParent {
    @Test
    public void test07() throws SQLException {
        DBConnectionOpen();

        ResultSet rr = sorguEkrani.executeQuery("select * from language");
        ResultSetMetaData rsmd = rr.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i) + "\t");

        System.out.println();
        while (rr.next()) {// bundan sonra yine satir var oldugu kadar al/

            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                System.out.print(rr.getString(i) + "\t");
            System.out.println();
        }
        DBConnectionClose();

    }
//            (2.) yontem
    @Test
    public void test7() throws SQLException {
        DBConnectionOpen();
        ResultSet rs = sorguEkrani.executeQuery("select * from language");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= rsmd.getColumnCount(); i++)
            System.out.print(rsmd.getColumnName(i));
        System.out.println();

        rs.last();
        int sonSatir = rs.getRow();
        for (int i = 1; i <= sonSatir; i++) {
            rs.absolute(i);
            // bulundugi satirdaki butun kolonlari yazdirmak icin.
            for (int j = 1; j <= rsmd.getColumnCount(); j++)
                System.out.print(rs.getString(j) + "\t");

            System.out.println();
        }

        DBConnectionClose();

    }
}
