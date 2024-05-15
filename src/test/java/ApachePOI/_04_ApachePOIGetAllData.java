package ApachePOI;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _04_ApachePOIGetAllData {

    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");

        //1.yol
        //zoo.length : kaç satır olduğunu
        int rowCount = sheet.getPhysicalNumberOfRows();
        System.out.println("rowCount = " + rowCount);

        for (int i = 0; i < rowCount; i++) {
            Row row = sheet.getRow(i);

            int cellCount = row.getPhysicalNumberOfCells();

            for (int j = 0; j < cellCount; j++) {
                System.out.println("row.getCell(j) = " + row.getCell(j));
            }
            System.out.println();

        }
        // 2.Yol
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { //zoo.length

            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {  //zoo[i].length
                System.out.print(sheet.getRow(i).getCell(j) + "\t");
            }

            System.out.println();

        }
    }
}
