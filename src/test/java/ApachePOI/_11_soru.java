package ApachePOI;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _11_soru {
    public static void main(String[] args) throws IOException {
        String path = "";
        String testSonucu = "Test Passed";

        writeToExcel(path, testSonucu);
        writeToExcel(path, testSonucu);
        writeToExcel(path, testSonucu);
        writeToExcel(path, testSonucu);
    }

    public static void writeToExcel(String path, String testSonucu) throws IOException {
        File dosya = new File(path);
        if (!dosya.exists())
        {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("senaryo");

            Row row = sheet.createRow(0);
            Cell cell = row.createCell(0);
            cell.setCellValue(testSonucu);

            try {
            FileOutputStream output = new FileOutputStream(path);
            workbook.write(output);
            workbook.close();
            output.close();
            }catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            System.out.println("Dosya yok ise bu bölüm çalıştı");
        }
        else // dosya var ise
        {
            FileInputStream input= null;
            Workbook workbook= null;
            Sheet sheet = null;

            try {
             input = new FileInputStream(path);
             workbook = WorkbookFactory.create(input);
             sheet = workbook.getSheetAt(0);
            }
            catch (Exception e)
            {
                System.out.println(e.getMessage());
            }
            int satirMiktari = sheet.getPhysicalNumberOfRows();
            Row newRow = sheet.createRow(satirMiktari);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(testSonucu);

            try {
            input.close();
            FileOutputStream output = new FileOutputStream(path);
            workbook.write(output);
            workbook.close();
            output.close();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            System.out.println("dosya var ise bu bolum calisti");
        }
    }
}
