package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _03_NextPrevAbsRel extends  JDBCParent{
    @Test
    public void test03() throws SQLException {
        DBConnectionOpen();
        ResultSet rs = sorguEkrani.executeQuery("select * from language");

        rs.next(); // bir adim ileri
        System.out.println("1. satir "+ rs.getString(2));

        rs.next();
        System.out.println("2. satir "+ rs.getString(2));

        rs.previous(); // bir adim geriye
        System.out.println("1. satir "+ rs.getString(2));



        DBConnectionClose();
    }

    @Test
    public void test02() throws SQLException {
        DBConnectionOpen();
        ResultSet rr = sorguEkrani.executeQuery("select * from film");

        rr.absolute(10);
        System.out.println("10. satir "+ rr.getString("title"));

        rr.absolute(5);
        System.out.println("5. satir "+ rr.getString("title"));

        rr.relative(5);
        System.out.println("10. satir "+ rr.getString("title"));

        rr.next();
        System.out.println("11. satir "+ rr.getString("title"));




        DBConnectionClose();
    }
}
