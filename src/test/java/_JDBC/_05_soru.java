package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _05_soru extends JDBCParent{
    @Test
    public void test05() throws SQLException {
        DBConnectionOpen();

        ResultSet rr = sorguEkrani.executeQuery("select city from city");
        rr.last();
        int sonSatirNo = rr.getRow();

        for (int i=1; i<=sonSatirNo; i ++){
            rr.absolute(i);
            System.out.println(i+". satir : "+ rr.getString(1));
        }

        DBConnectionClose();
    }


   @Test
  public void test55() throws SQLException {
      DBConnectionOpen();

      ResultSet rr = sorguEkrani.executeQuery("select city from city" );
      rr.last();
      int sonSatirNo = rr.getRow();

      rr.first();
      for (int i = 1; i <=sonSatirNo ; i++) {
          rr.relative(1);
          System.out.println((i+1)+". satir : "+ rr.getString(1));

      }

      DBConnectionClose();
  }

   @Test
   public void test11() throws SQLException {
       DBConnectionOpen();
       ResultSet rs = sorguEkrani.executeQuery("select city from city");

       while (rs.next()) {
        //   String city = rs.getString("city");
           System.out.println(rs.getString(1));
       }

       DBConnectionClose();


   }
}
