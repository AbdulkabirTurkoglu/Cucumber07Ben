package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _04_FirstLastGetRowGetType extends JDBCParent{
    @Test
    public void test04() throws SQLException {
        DBConnectionOpen();

        ResultSet rr = sorguEkrani.executeQuery("select city from city");

        rr.last();
        System.out.println("son satir"+ rr.getString(1));

        rr.first();
        System.out.println("ilk satir"+ rr.getString(1));

        rr.last(); // son satıra gittim
        int kacinciSatirdayim= rr.getRow(); // şu anda kaçıncı satırda olduğunun bilgisini verir
        System.out.println("kacinciSatirdayim = " + kacinciSatirdayim);



        DBConnectionClose();
    }
}
