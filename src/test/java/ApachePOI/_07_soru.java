package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_soru {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/Carpim.xlsx";
        FileInputStream input = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(input);
        Sheet sheet = workbook.getSheetAt(0);

        int yeniSatirIndexi = 0;

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
             //   System.out.println(i+"*"+j+"="+(i*j));
                Row satir = sheet.createRow(yeniSatirIndexi++);

                Cell hucre1 = satir.createCell(0); hucre1.setCellValue(i);
                Cell hucre2 = satir.createCell(2); hucre2.setCellValue("x");
                Cell hucre3 = satir.createCell(3); hucre3.setCellValue(j);
                Cell hucre4 = satir.createCell(4); hucre4.setCellValue("=");
                Cell hucre5 = satir.createCell(5); hucre5.setCellValue(i*j);
            }
            Row bosSatir = sheet.createRow(yeniSatirIndexi++);

        }

        input.close();
        FileOutputStream output = new FileOutputStream(path);
        workbook.write(output);
        workbook.close();
        output.close();
        System.out.println("kayit tamam");

    }
}
