package _JDBC_TEKRAR;

import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class _08_soru extends PARENT {
    @Test
    public void test08() {
        String sorgu = "";
        List<List<String>> doneneTablo = getListData(sorgu);
        for (List<String> satir : doneneTablo) {
            for (String kolon : satir)
                System.out.println(kolon + "\t");
            System.out.println();
        }
    }

    public List<List<String>> getListData(String sorgu) {
        List<List<String>> tablo = new ArrayList<>();

        try {
            JDBCOpen();
            ResultSet rs = soraEkran.executeQuery(sorgu);
            ResultSetMetaData rsmd = rs.getMetaData();

            ArrayList<String> satirdakiKolon = new ArrayList<>();
            for (int i = 1; i <= rsmd.getColumnCount(); i++)
                satirdakiKolon.add(rsmd.getColumnName(i));
            tablo.add(satirdakiKolon);

            while (rs.next()) {
                ArrayList<String> satir = new ArrayList<>();
                for (int i = 0; i <= rsmd.getColumnCount(); i++)
                    satir.add(rs.getString(i));

                tablo.add(satir);
            }

        } catch (Exception ex) {System.out.println(ex.getMessage());}
        finally {JDBCClose();}
        return tablo;

    }
}


