package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class _06_getAll extends  PARENT{
    @Test
    public void test06() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select city_id, city, country_id from city");


        rs.next();
        System.out.println("id : "+ rs.getString(1));
        System.out.println("id : "+ rs.getString("ciry_id"));

        int intID = rs.getInt("city_id");
        System.out.println("intID = " + intID);

        JDBCClose();

    }
    @Test
    public void test66() throws SQLException {
        JDBCOpen();
        ResultSet rs = soraEkran.executeQuery("select * from city");
        ResultSetMetaData rsmd = rs.getMetaData();

        int colonSayisi = rsmd.getColumnCount();
        System.out.println("colonSayisi = " + colonSayisi);

        for (int i = 1; i <=colonSayisi ; i++) {
            System.out.println(rsmd.getColumnName(i));
        }

        System.out.println("********************************");
        rs.next();
        System.out.println("1. kolon = "+ rs.getString(1));
        System.out.println("2. kolon = "+ rs.getString(2));
        System.out.println("3. kolon = "+ rs.getString(3));

        System.out.println("####################################");

        for (int i = 1; i <=colonSayisi ; i++) {
            System.out.println(i+" . colon : "+ rs.getString(i));

        }




        JDBCClose();
    }
}
