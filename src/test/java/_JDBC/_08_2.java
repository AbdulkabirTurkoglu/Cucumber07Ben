package _JDBC;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;

public class _08_2 extends JDBCParent {
    @Test
    // bir metoda sorguyu("select * from language") gönderiniz,
    // metod size sorgunun datasını bir ArrayList olarak döndürsün
    public void test08() {
        String sorgu = "select * from language";
        List<List<String>> donenTablo = getListData(sorgu);
        for (List<String> satir : donenTablo){
            for (String kolon : satir)
                System.out.print(kolon+"\t");
            System.out.println();
        }
    }

    public List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();

        try {
            DBConnectionOpen();
            ResultSet rs = sorguEkrani.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();

            ArrayList<String> kolonSatir = new ArrayList<>();
            for (int i = 1; i <=rsmd.getColumnCount() ; i++) {
                kolonSatir.add(rsmd.getColumnName(i));
                tablo.add(kolonSatir);

            }

            while (rs.next()) {
                ArrayList<String> satir = new ArrayList<>();
                for (int i = 1; i <= rsmd.getColumnCount(); i++)
                    satir.add(rs.getString(i));

                tablo.add(satir);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            DBConnectionClose();
        }

        return tablo;

    }
}
