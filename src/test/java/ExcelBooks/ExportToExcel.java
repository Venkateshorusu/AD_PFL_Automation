package ExcelBooks;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExportToExcel {
    public static void main(String[] args) {
        String filePath = "./src/test/java/ExcelBooks/sample.txt";
        List<List<String>> wordList = new ArrayList<>();
        
        // Read the text file and populate the wordList as shown in the previous code

        // Create a new Excel workbook
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Sheet 1");

        int rowNumber = 0;
        int fileNumber = 1;

        for (List<String> wordLine : wordList) {
            Row row = sheet.createRow(rowNumber);
            int cellNumber = 0;

            for (String word : wordLine) {
                Cell cell = row.createCell(cellNumber++);
                cell.setCellValue(word);
            }

            rowNumber++;

            // If we've processed 10 rows, create a new Excel file
            if (rowNumber % 10 == 0) {
                String excelFileName = "output" + fileNumber + ".xlsx";
                try (FileOutputStream fos = new FileOutputStream(excelFileName)) {
                    workbook.write(fos);
                    fos.close();
                    System.out.println("Created Excel file: " + excelFileName);
                    fileNumber++;
                    
                    // Create a new workbook for the next batch of rows
                    workbook = new XSSFWorkbook();
                    sheet = workbook.createSheet("Sheet 1");
                    rowNumber = 0;
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        // Save the remaining rows to an Excel file
        String excelFileName = "output" + fileNumber + ".xlsx";
        try (FileOutputStream fos = new FileOutputStream(excelFileName)) {
            workbook.write(fos);
            fos.close();
            System.out.println("Created Excel file: " + excelFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

