package ExcelBooks;

import org.apache.poi.ss.usermodel.*;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class TextToExcel {
    public static void main(String[] args) {
        try {
            // Create a new Excel workbook
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Data");

            // Open and read the text file
            BufferedReader reader = new BufferedReader(new FileReader("./src/test/java/ExcelBooks/sample.txt"));
            String line;

            int rowNum = 0;

            while ((line = reader.readLine()) != null) {
                Row row = sheet.createRow(rowNum++);

                // Split the line into words using tab ('\t') as a delimiter
                String[] words = line.split("\t");

                int colNum = 0;
                for (String word : words) {
                    Cell cell = row.createCell(colNum++);
                    cell.setCellValue(word);
                }
            }

            reader.close();

            // Save the Excel workbook to a file
            FileOutputStream outputStream = new FileOutputStream("./src/test/java/ExcelBooks/output1.xlsx");
            workbook.write(outputStream);
           
            outputStream.close();

            System.out.println("Excel file created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

