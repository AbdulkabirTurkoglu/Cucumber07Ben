package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class _05_soru {
    public static void main(String[] args) throws IOException {
        String path = "src/test/java/ApachePOI/~$ApacheExcel2.xlsx";
        FileInputStream input = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(input);
        Sheet sheet = workbook.getSheetAt(0);
        
        String aranan = "username";
        String bulunan = "";
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(aranan)){
                for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    bulunan += sheet.getRow(i).getCell(j)+" ";
                }
            }
            
        }
        System.out.println("bulunan = " + bulunan);


    }
}