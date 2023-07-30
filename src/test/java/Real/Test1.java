import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

    private static final String FILE_PATH = "path/to/your/excel/file.xlsx";
    private static final String SHEET_NAME = "Sheet1";

    public static void main(String[] args) {
        // Example usage
        String data = readDataFromExcel(1, 0);
        writeDataToExcel(1, 1, data);
    }

    public static String readDataFromExcel(int rowNumber, int columnNumber) {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheet(SHEET_NAME);
            Row row = sheet.getRow(rowNumber);
            if (row != null) {
                Cell cell = row.getCell(columnNumber);
                if (cell != null) {
                    return cell.getStringCellValue();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void writeDataToExcel(int rowNumber, int columnNumber, String data) {
        try (FileInputStream fileInputStream = new FileInputStream(FILE_PATH);
             Workbook workbook = new XSSFWorkbook(fileInputStream)) {

            Sheet sheet = workbook.getSheet(SHEET_NAME);
            Row row = sheet.getRow(rowNumber);
            if (row == null) {
                row = sheet.createRow(rowNumber);
            }

            Cell cell = row.createCell(columnNumber);
            cell.setCellValue(data);

            try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_PATH)) {
                workbook.write(fileOutputStream);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
