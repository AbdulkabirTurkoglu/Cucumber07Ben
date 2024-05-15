package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class _08_newExcelWrite {
    public static void main(String[] args) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("sayfa 1");
        Row newRow = sheet.createRow(0);
        Cell newCell = newRow.createCell(0);
        newCell.setCellValue("merhaba hocam");

        String path = "src/test/java/ApachePOI/resource/tekrar.xlsx";
        FileOutputStream output = new FileOutputStream(path);
        workbook.write(output);
        workbook.close();
        output.close();
    }
}
