package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import java.io.*;


public class _06_soru {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/resource/WriteInTheExcelFile.xlsx";
        FileInputStream input = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(input);
        Sheet sheet = workbook.getSheetAt(0);

        int enSonSatir = sheet.getPhysicalNumberOfRows();
        Row yeniSatir = sheet.createRow(enSonSatir);
        Cell yeniHucre = yeniSatir.createCell(0);

        yeniHucre.setCellValue("MERHABA HOCAM");
        input.close();

        FileOutputStream output = new FileOutputStream(path);
        workbook.write(output);
        workbook.close();
        output.close();

        System.out.println("kayit yapildi "  );
    }
}
