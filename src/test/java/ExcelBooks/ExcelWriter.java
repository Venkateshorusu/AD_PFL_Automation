package ExcelBooks;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelWriter {
	 public static void main(String[] args) {
	        // Sample data (replace this with your actual 2D list)
	        List<List<String>> data = ReadTextFile.readtxtFile("./src/test/java/ExcelBooks/sample.txt");
	        // Initialize the list to hold 4 rows at a time
	        List<List<String>> currentRows = new ArrayList<>();

	        // Iterate through the rows
	        for (List<String> row : data) {
	            // Add the current row to the list
	            currentRows.add(row);

	            // If we have collected 4 rows, create a new Excel workbook
	            if (currentRows.size() == 20) {
	                createExcelWorkbook(currentRows);
	                currentRows.clear();
	            }
	        }

	        // Check if there are any remaining rows
	        if (!currentRows.isEmpty()) {
	            createExcelWorkbook(currentRows);
	        }
	    }

	    private static void createExcelWorkbook(List<List<String>> rows) {
	        Workbook workbook = new XSSFWorkbook();
	        Sheet sheet = workbook.createSheet("Sheet1");

	        // Create rows and cells in the Excel sheet
	        int rowNum = 0;
	        for (List<String> rowData : rows) {
	            Row row = sheet.createRow(rowNum++);
	            int cellNum = 0;
	            for (String cellValue : rowData) {
	                Cell cell = row.createCell(cellNum++);
	                cell.setCellValue(cellValue);
	            }
	        }

	        // Save the Excel workbook to a file
	        try (FileOutputStream outputStream = new FileOutputStream("./src/test/java/ExcelBooks/output.xlsx")) {
	            workbook.write(outputStream);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    // Replace this method with your actual method to retrieve the 2D list
	    private static List<List<String>> getYour2DListData() {
	        List<List<String>> data = new ArrayList<>();

	        // Populate data with your 2D list

	        return data;
	    }
	}

